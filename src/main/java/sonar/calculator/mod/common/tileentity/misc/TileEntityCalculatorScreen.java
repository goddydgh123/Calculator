package sonar.calculator.mod.common.tileentity.misc;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import sonar.calculator.mod.Calculator;
import sonar.calculator.mod.network.packets.PacketCalculatorScreen;
import sonar.core.api.SonarAPI;
import sonar.core.api.energy.EnergyHandler;
import sonar.core.api.energy.StoredEnergyStack;
import sonar.core.common.tileentity.TileEntitySonar;
import sonar.core.helpers.NBTHelper.SyncType;
import sonar.core.helpers.SonarHelper;

public class TileEntityCalculatorScreen extends TileEntitySonar {

	public long latestMax, latestEnergy;
	public long lastMax, lastEnergy;

	public void update() {

		if (this.worldObj != null && !this.worldObj.isRemote) {
			EnumFacing front = EnumFacing.getFront(this.getBlockMetadata()).getOpposite();
			TileEntity target = SonarHelper.getAdjacentTileEntity(this, front);
			if (target == null) {
				return;
			} else {
				EnergyHandler handler = SonarAPI.getEnergyHelper().canTransferEnergy(target, front);
				if(handler!=null){
					StoredEnergyStack stack = new StoredEnergyStack(handler.getProvidedType());
					handler.getEnergy(stack, target, front);
					long max = stack.capacity;
					long current = stack.stored;

					if (max != this.lastMax) {
						this.sendMax(max);
					}
					if (current != this.lastEnergy) {
						this.sendEnergy(current);
						markBlockForUpdate();
					}
				}
			}

		}
	}

	public void sendMax(long max) {
		markDirty();
		this.lastMax = this.latestMax;
		this.latestMax = max;
		if (!this.worldObj.isRemote)
			Calculator.network.sendToAllAround(new PacketCalculatorScreen(pos, 0, max), new TargetPoint(this.worldObj.provider.getDimension(), pos.getX(), pos.getY(), pos.getZ(), 64));

	}

	public void sendEnergy(long energy) {
		markDirty();
		this.lastEnergy = this.latestEnergy;
		this.latestEnergy = energy;
		if (!this.worldObj.isRemote)
			Calculator.network.sendToAllAround(new PacketCalculatorScreen(pos, 1, energy), new TargetPoint(this.worldObj.provider.getDimension(), pos.getX(), pos.getY(), pos.getZ(), 64));
	}

	public void readData(NBTTagCompound nbt, SyncType type) {
		if (type.isType(SyncType.DEFAULT_SYNC, SyncType.SAVE)) {
			this.latestMax = nbt.getLong("latestMax");
			this.latestEnergy = nbt.getLong("latestEnergy");
			this.lastMax = nbt.getLong("lastMax");
			this.lastEnergy = nbt.getLong("lastEnergy");
		}

	}

	public NBTTagCompound writeData(NBTTagCompound nbt, SyncType type) {
		if (type.isType(SyncType.DEFAULT_SYNC, SyncType.SAVE)) {
			nbt.setLong("latestMax", this.latestMax);
			nbt.setLong("latestEnergy", this.latestEnergy);
			nbt.setLong("lastMax", this.lastMax);
			nbt.setLong("lastEnergy", this.lastEnergy);
		}
		return nbt;
	}

	@SideOnly(Side.CLIENT)
	public double getMaxRenderDistanceSquared() {
		return 65536.0D;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getRenderBoundingBox() {
		return INFINITE_EXTENT_AABB;
	}
}
