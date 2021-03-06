
package sonar.calculator.mod.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelConductorMast extends ModelBase
{
  //fields
    ModelRenderer Centre_Piece;
    ModelRenderer Rod1;
    ModelRenderer Rod2;
    ModelRenderer Rod3;
    ModelRenderer Rod4;
    ModelRenderer Rod5;
    ModelRenderer Rod6;
    ModelRenderer Top1;
    ModelRenderer Top2;
    ModelRenderer Top3;
    ModelRenderer Top4;
    ModelRenderer Top5;
    ModelRenderer Centre1;
    ModelRenderer Centre2;
    ModelRenderer Bottom1;
    ModelRenderer Rod7;
    ModelRenderer Rod8;
    ModelRenderer Rod9;
    ModelRenderer Rod10;
    ModelRenderer Centre3;
    ModelRenderer Centre4;
    ModelRenderer Centre5;
    ModelRenderer Centre6;
    ModelRenderer Centre7;
    ModelRenderer Centre8;
    ModelRenderer Centre9;
    ModelRenderer Power2;
    ModelRenderer Power1;
  
  public ModelConductorMast()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      Centre_Piece = new ModelRenderer(this, 64, 0);
      Centre_Piece.addBox(0F, 0F, 0F, 4, 58, 4);
      Centre_Piece.setRotationPoint(-2F, -36F, -2F);
      Centre_Piece.setTextureSize(256, 128);
      Centre_Piece.mirror = true;
      setRotation(Centre_Piece, 0F, 0F, 0F);
      Rod1 = new ModelRenderer(this, 0, 80);
      Rod1.addBox(0F, 0F, 0F, 2, 42, 2);
      Rod1.setRotationPoint(2F, -20F, 1F);
      Rod1.setTextureSize(256, 128);
      Rod1.mirror = true;
      setRotation(Rod1, 0F, 0F, 0F);
      Rod2 = new ModelRenderer(this, 0, 80);
      Rod2.addBox(0F, 0F, 0F, 2, 42, 2);
      Rod2.setRotationPoint(-4F, -20F, -3F);
      Rod2.setTextureSize(256, 128);
      Rod2.mirror = true;
      setRotation(Rod2, 0F, 0F, 0F);
      Rod3 = new ModelRenderer(this, 0, 80);
      Rod3.addBox(0F, 0F, 0F, 2, 42, 2);
      Rod3.setRotationPoint(2F, -20F, -3F);
      Rod3.setTextureSize(256, 128);
      Rod3.mirror = true;
      setRotation(Rod3, 0F, 0F, 0F);
      Rod4 = new ModelRenderer(this, 0, 80);
      Rod4.addBox(0F, 0F, 0F, 2, 42, 2);
      Rod4.setRotationPoint(-4F, -20F, 1F);
      Rod4.setTextureSize(256, 128);
      Rod4.mirror = true;
      setRotation(Rod4, 0F, 0F, 0F);
      Rod5 = new ModelRenderer(this, 0, 80);
      Rod5.addBox(0F, 0F, 0F, 2, 42, 2);
      Rod5.setRotationPoint(-1F, -20F, 2F);
      Rod5.setTextureSize(256, 128);
      Rod5.mirror = true;
      setRotation(Rod5, 0F, 0F, 0F);
      Rod6 = new ModelRenderer(this, 0, 80);
      Rod6.addBox(0F, 0F, 0F, 2, 42, 2);
      Rod6.setRotationPoint(-1F, -20F, -4F);
      Rod6.setTextureSize(256, 128);
      Rod6.mirror = true;
      setRotation(Rod6, 0F, 0F, 0F);
      Top1 = new ModelRenderer(this, 0, 0);
      Top1.addBox(0F, 0F, 0F, 1, 4, 1);
      Top1.setRotationPoint(0F, -40F, 0F);
      Top1.setTextureSize(256, 128);
      Top1.mirror = true;
      setRotation(Top1, 0F, 0F, 0F);
      Top2 = new ModelRenderer(this, 0, 0);
      Top2.addBox(0F, 0F, 0F, 1, 4, 1);
      Top2.setRotationPoint(-2F, -40F, 1F);
      Top2.setTextureSize(256, 128);
      Top2.mirror = true;
      setRotation(Top2, 0F, 0F, 0F);
      Top3 = new ModelRenderer(this, 0, 0);
      Top3.addBox(0F, 0F, 0F, 1, 4, 1);
      Top3.setRotationPoint(1F, -40F, -2F);
      Top3.setTextureSize(256, 128);
      Top3.mirror = true;
      setRotation(Top3, 0F, 0F, 0F);
      Top4 = new ModelRenderer(this, 0, 0);
      Top4.addBox(0F, 0F, 0F, 1, 2, 1);
      Top4.setRotationPoint(-2F, -38F, -1F);
      Top4.setTextureSize(256, 128);
      Top4.mirror = true;
      setRotation(Top4, 0F, 0F, 0F);
      Top5 = new ModelRenderer(this, 0, 0);
      Top5.addBox(0F, 0F, 0F, 1, 2, 1);
      Top5.setRotationPoint(1F, -38F, 1F);
      Top5.setTextureSize(256, 128);
      Top5.mirror = true;
      setRotation(Top5, 0F, 0F, 0F);
      Centre1 = new ModelRenderer(this, 0, 0);
      Centre1.addBox(0F, 0F, 0F, 8, 1, 8);
      Centre1.setRotationPoint(-4F, 0F, -4F);
      Centre1.setTextureSize(256, 128);
      Centre1.mirror = true;
      setRotation(Centre1, 0F, 0F, 0F);
      Centre2 = new ModelRenderer(this, 0, 0);
      Centre2.addBox(0F, 0F, 0F, 10, 1, 10);
      Centre2.setRotationPoint(-5F, 22F, -5F);
      Centre2.setTextureSize(256, 128);
      Centre2.mirror = true;
      setRotation(Centre2, 0F, 0F, 0F);
      Bottom1 = new ModelRenderer(this, 0, 50);
      Bottom1.addBox(0F, 0F, 0F, 16, 1, 16);
      Bottom1.setRotationPoint(-8F, 23F, -8F);
      Bottom1.setTextureSize(256, 128);
      Bottom1.mirror = true;
      setRotation(Bottom1, 0F, 0F, 0F);
      Rod7 = new ModelRenderer(this, 0, 20);
      Rod7.addBox(0F, 0F, 0F, 1, 15, 1);
      Rod7.setRotationPoint(6F, 8F, 6F);
      Rod7.setTextureSize(256, 128);
      Rod7.mirror = true;
      setRotation(Rod7, 0F, 0F, 0F);
      Rod8 = new ModelRenderer(this, 0, 20);
      Rod8.addBox(0F, 0F, 0F, 1, 15, 1);
      Rod8.setRotationPoint(6F, 8F, -6F);
      Rod8.setTextureSize(256, 128);
      Rod8.mirror = true;
      setRotation(Rod8, 0F, 0F, 0F);
      Rod9 = new ModelRenderer(this, 0, 20);
      Rod9.addBox(0F, 0F, 0F, 1, 15, 1);
      Rod9.setRotationPoint(-7F, 8F, -7F);
      Rod9.setTextureSize(256, 128);
      Rod9.mirror = true;
      setRotation(Rod9, 0F, 0F, 0F);
      Rod10 = new ModelRenderer(this, 0, 20);
      Rod10.addBox(0F, 0F, 0F, 1, 15, 1);
      Rod10.setRotationPoint(-7F, 8F, 6F);
      Rod10.setTextureSize(256, 128);
      Rod10.mirror = true;
      setRotation(Rod10, 0F, 0F, 0F);
      Centre3 = new ModelRenderer(this, 0, 0);
      Centre3.addBox(0F, 0F, 0F, 8, 1, 8);
      Centre3.setRotationPoint(-4F, -2F, -4F);
      Centre3.setTextureSize(256, 128);
      Centre3.mirror = true;
      setRotation(Centre3, 0F, 0F, 0F);
      Centre4 = new ModelRenderer(this, 0, 0);
      Centre4.addBox(0F, 0F, 0F, 10, 1, 10);
      Centre4.setRotationPoint(-5F, -4F, -5F);
      Centre4.setTextureSize(256, 128);
      Centre4.mirror = true;
      setRotation(Centre4, 0F, 0F, 0F);
      Centre5 = new ModelRenderer(this, 0, 0);
      Centre5.addBox(0F, 0F, 0F, 10, 1, 10);
      Centre5.setRotationPoint(-5F, -6F, -5F);
      Centre5.setTextureSize(256, 128);
      Centre5.mirror = true;
      setRotation(Centre5, 0F, 0F, 0F);
      Centre6 = new ModelRenderer(this, 0, 0);
      Centre6.addBox(0F, 0F, 0F, 12, 1, 12);
      Centre6.setRotationPoint(-6F, -8F, -6F);
      Centre6.setTextureSize(256, 128);
      Centre6.mirror = true;
      setRotation(Centre6, 0F, 0F, 0F);
      Centre7 = new ModelRenderer(this, 0, 0);
      Centre7.addBox(0F, 0F, 0F, 10, 1, 10);
      Centre7.setRotationPoint(-5F, -18F, -5F);
      Centre7.setTextureSize(256, 128);
      Centre7.mirror = true;
      setRotation(Centre7, 0F, 0F, 0F);
      Centre8 = new ModelRenderer(this, 0, 0);
      Centre8.addBox(0F, 0F, 0F, 6, 4, 6);
      Centre8.setRotationPoint(-3F, -30F, -3F);
      Centre8.setTextureSize(256, 128);
      Centre8.mirror = true;
      setRotation(Centre8, 0F, 0F, 0F);
      Centre9 = new ModelRenderer(this, 0, 0);
      Centre9.addBox(0F, 0F, 0F, 6, 1, 6);
      Centre9.setRotationPoint(-3F, -32F, -3F);
      Centre9.setTextureSize(256, 128);
      Centre9.mirror = true;
      setRotation(Centre9, 0F, 0F, 0F);
      Power2 = new ModelRenderer(this, 0, 0);
      Power2.addBox(0F, 0F, 0F, 4, 5, 3);
      Power2.setRotationPoint(-2F, 17F, -7F);
      Power2.setTextureSize(256, 128);
      Power2.mirror = true;
      setRotation(Power2, 0F, 0F, 0F);
      Power1 = new ModelRenderer(this, 100, 0);
      Power1.addBox(0F, 0F, 0F, 6, 6, 1);
      Power1.setRotationPoint(-3F, 16F, -8F);
      Power1.setTextureSize(256, 128);
      Power1.mirror = true;
      setRotation(Power1, 0F, 0F, 0F);
  }
  
  @Override
public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Centre_Piece.render(f5);
    Rod1.render(f5);
    Rod2.render(f5);
    Rod3.render(f5);
    Rod4.render(f5);
    Rod5.render(f5);
    Rod6.render(f5);
    Top1.render(f5);
    Top2.render(f5);
    Top3.render(f5);
    Top4.render(f5);
    Top5.render(f5);
    Centre1.render(f5);
    Centre2.render(f5);
    Bottom1.render(f5);
    Rod7.render(f5);
    Rod8.render(f5);
    Rod9.render(f5);
    Rod10.render(f5);
    Centre3.render(f5);
    Centre4.render(f5);
    Centre5.render(f5);
    Centre6.render(f5);
    Centre7.render(f5);
    Centre8.render(f5);
    Centre9.render(f5);
   // Power2.render(f5);
   // Power1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  

  @Override
public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) { 
	  super.setRotationAngles(f, f1, f2, f3, f4, f5, entity); }
  

}
