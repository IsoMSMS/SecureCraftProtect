package scp.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.MathHelper;

public class SCPModel682 extends ModelBase
{
	//fields
	ModelRenderer leg34;
	ModelRenderer spike1;
	ModelRenderer spike2;
	ModelRenderer spike3;
	ModelRenderer spike4;
	ModelRenderer spike5;
	ModelRenderer spike6;
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer tail;
	ModelRenderer tailpiece;
	ModelRenderer tailend;
	ModelRenderer jaw;
	ModelRenderer backspike;
	ModelRenderer mouth;
	ModelRenderer knee2;
	ModelRenderer knee1;
	ModelRenderer finger2;
	ModelRenderer finger21;
	ModelRenderer finger22;
	ModelRenderer finger23;
	ModelRenderer finger1;
	ModelRenderer finger11;
	ModelRenderer finger12;
	ModelRenderer finger13;
	ModelRenderer leg41;
	ModelRenderer leg42;
	ModelRenderer leg31;
	ModelRenderer leg32;
	ModelRenderer leg33;
	ModelRenderer leg43;
	ModelRenderer leg44;
	ModelRenderer spine;
	ModelRenderer tailspike;
	ModelRenderer backtailspike;
	ModelRenderer endspike;
	ModelRenderer sidebody;
	ModelRenderer sidebody2;
	ModelRenderer sidebody3;
	ModelRenderer sidebody4;
	ModelRenderer arm;
    private float partialTicks;

	public SCPModel682()
	{
		textureWidth = 128;
		textureHeight = 64;

		leg34 = new ModelRenderer(this, 42, 12);
		leg34.addBox(-1F, 7F, -5F, 1, 1, 3);
		leg34.setRotationPoint(-6F, 16F, -4F);
		leg34.setTextureSize(128, 64);
		leg34.mirror = true;
		setRotation(leg34, 0F, 0.1047198F, 0F);
		spike1 = new ModelRenderer(this, 34, 42);
		spike1.addBox(-5F, -7F, -5F, 2, 2, 3);
		spike1.setRotationPoint(-2F, 1F, 5F);
		spike1.setTextureSize(128, 64);
		spike1.mirror = true;
		setRotation(spike1, 1.64061F, 0F, -0.1919862F);
		spike2 = new ModelRenderer(this, 45, 42);
		spike2.addBox(7F, -7F, -5F, 2, 2, 4);
		spike2.setRotationPoint(-2F, 1F, 5F);
		spike2.setTextureSize(128, 64);
		spike2.mirror = true;
		setRotation(spike2, 1.64061F, 0F, 0.1919862F);
		spike3 = new ModelRenderer(this, 17, 42);
		spike3.addBox(8F, -3F, -4F, 1, 1, 3);
		spike3.setRotationPoint(-2F, 1F, 5F);
		spike3.setTextureSize(128, 64);
		spike3.mirror = true;
		setRotation(spike3, 1.64061F, 0F, 0.2617994F);
		spike4 = new ModelRenderer(this, 27, 42);
		spike4.addBox(-5F, -3F, -5F, 1, 1, 2);
		spike4.setRotationPoint(-2F, 1F, 5F);
		spike4.setTextureSize(128, 64);
		spike4.mirror = true;
		setRotation(spike4, 1.64061F, 0F, -0.2617994F);
		spike5 = new ModelRenderer(this, 17, 47);
		spike5.addBox(8F, 0F, -4F, 1, 1, 2);
		spike5.setRotationPoint(-2F, 1F, 5F);
		spike5.setTextureSize(128, 64);
		spike5.mirror = true;
		setRotation(spike5, 1.48353F, 0F, 0.2617994F);
		spike6 = new ModelRenderer(this, 17, 47);
		spike6.addBox(-5F, 1F, -5F, 1, 1, 2);
		spike6.setRotationPoint(-2F, 1F, 5F);
		spike6.setTextureSize(128, 64);
		spike6.mirror = true;
		setRotation(spike6, 1.413717F, 0F, -0.2617994F);
		head = new ModelRenderer(this, 0, 0);
		head.addBox(-4F, -4F, -8F, 12, 6, 8);
		head.setRotationPoint(-2F, 11F, -7F);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		body = new ModelRenderer(this, 18, 17);
		body.addBox(-5F, -10F, -7F, 13, 16, 8);
		body.setRotationPoint(-2F, 9F, 3F);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, 1.570796F, 0F, 0F);
		leg1 = new ModelRenderer(this, 64, 16);
		leg1.addBox(-2F, 0F, -2F, 5, 9, 4);
		leg1.setRotationPoint(-6F, 15F, 8F);
		leg1.setTextureSize(128, 64);
		leg1.mirror = true;
		setRotation(leg1, 0F, 0F, 0F);
		leg2 = new ModelRenderer(this, 64, 16);
		leg2.addBox(-3F, 0F, -2F, 5, 9, 4);
		leg2.setRotationPoint(6F, 15F, 8F);
		leg2.setTextureSize(128, 64);
		leg2.mirror = true;
		setRotation(leg2, 0F, 0F, 0F);
		leg3 = new ModelRenderer(this, 0, 31);
		leg3.addBox(-2F, 0F, -2F, 4, 8, 4);
		leg3.setRotationPoint(-6F, 16F, -4F);
		leg3.setTextureSize(128, 64);
		leg3.mirror = true;
		setRotation(leg3, 0F, 0F, 0F);
		leg4 = new ModelRenderer(this, 0, 31);
		leg4.addBox(-2F, 0F, -2F, 4, 8, 4);
		leg4.setRotationPoint(6F, 16F, -4F);
		leg4.setTextureSize(128, 64);
		leg4.mirror = true;
		setRotation(leg4, 0F, 0F, 0F);
		tail = new ModelRenderer(this, 84, 1);
		tail.addBox(-5F, -10F, -7F, 12, 7, 8);
		tail.setRotationPoint(-1F, 9F, 19F);
		tail.setTextureSize(128, 64);
		tail.mirror = true;
		setRotation(tail, 1.570796F, 0F, 0F);
		tailpiece = new ModelRenderer(this, 84, 17);
		tailpiece.addBox(-5F, -10F, -7F, 10, 7, 6);
		tailpiece.setRotationPoint(0F, 9F, 26F);
		tailpiece.setTextureSize(128, 64);
		tailpiece.mirror = true;
		setRotation(tailpiece, 1.570796F, 0F, 0F);
		tailend = new ModelRenderer(this, 64, 31);
		tailend.addBox(-5F, -10F, -7F, 8, 6, 5);
		tailend.setRotationPoint(1F, 9F, 33F);
		tailend.setTextureSize(128, 64);
		tailend.mirror = true;
		setRotation(tailend, 1.570796F, 0F, 0F);
		jaw = new ModelRenderer(this, 0, 53);
		jaw.addBox(-4F, -2F, -14F, 12, 4, 6);
		jaw.setRotationPoint(-2F, 11F, -7F);
		jaw.setTextureSize(128, 64);
		jaw.mirror = true;
		setRotation(jaw, 0F, 0F, 0F);
		backspike = new ModelRenderer(this, 42, 1);
		backspike.addBox(1F, 0F, -6F, 2, 2, 2);
		backspike.setRotationPoint(-2F, 1F, 5F);
		backspike.setTextureSize(128, 64);
		backspike.mirror = true;
		setRotation(backspike, 1.361357F, 0F, 0F);
		mouth = new ModelRenderer(this, 37, 49);
		mouth.addBox(-4F, 2F, -13F, 12, 1, 13);
		mouth.setRotationPoint(-2F, 11F, -7F);
		mouth.setTextureSize(128, 64);
		mouth.mirror = true;
		setRotation(mouth, 0.122173F, 0F, 0F);
		knee2 = new ModelRenderer(this, 1, 24);
		knee2.addBox(-2F, 0F, -3F, 3, 4, 1);
		knee2.setRotationPoint(6F, 16F, 8F);
		knee2.setTextureSize(128, 64);
		knee2.mirror = true;
		setRotation(knee2, 0F, 0F, 0F);
		knee1 = new ModelRenderer(this, 1, 24);
		knee1.addBox(-1F, 0F, -3F, 3, 4, 1);
		knee1.setRotationPoint(-6F, 16F, 8F);
		knee1.setTextureSize(128, 64);
		knee1.mirror = true;
		setRotation(knee1, 0F, 0F, 0F);
		finger2 = new ModelRenderer(this, 0, 16);
		finger2.addBox(-3F, 8F, -4F, 1, 1, 2);
		finger2.setRotationPoint(6F, 15F, 8F);
		finger2.setTextureSize(128, 64);
		finger2.mirror = true;
		setRotation(finger2, 0F, 0.1919862F, 0F);
		finger21 = new ModelRenderer(this, 42, 12);
		finger21.addBox(-1F, 8F, -5F, 1, 1, 3);
		finger21.setRotationPoint(6F, 15F, 8F);
		finger21.setTextureSize(128, 64);
		finger21.mirror = true;
		setRotation(finger21, 0F, -0.2094395F, 0F);
		finger22 = new ModelRenderer(this, 0, 16);
		finger22.addBox(0F, 8F, -4F, 1, 1, 2);
		finger22.setRotationPoint(6F, 15F, 8F);
		finger22.setTextureSize(128, 64);
		finger22.mirror = true;
		setRotation(finger22, 0F, -0.418879F, 0F);
		finger23 = new ModelRenderer(this, 42, 12);
		finger23.addBox(-2F, 8F, -5F, 1, 1, 3);
		finger23.setRotationPoint(6F, 15F, 8F);
		finger23.setTextureSize(128, 64);
		finger23.mirror = true;
		setRotation(finger23, 0F, 0.0523599F, 0F);
		finger1 = new ModelRenderer(this, 0, 16);
		finger1.addBox(-1F, 7F, -4F, 1, 1, 2);
		finger1.setRotationPoint(-6F, 16F, 8F);
		finger1.setTextureSize(128, 64);
		finger1.mirror = true;
		setRotation(finger1, 0F, 0.418879F, 0F);
		finger11 = new ModelRenderer(this, 42, 12);
		finger11.addBox(0F, 7F, -5F, 1, 1, 3);
		finger11.setRotationPoint(-6F, 16F, 8F);
		finger11.setTextureSize(128, 64);
		finger11.mirror = true;
		setRotation(finger11, 0F, 0.2268928F, 0F);
		finger12 = new ModelRenderer(this, 0, 16);
		finger12.addBox(1F, 7F, -4F, 1, 1, 2);
		finger12.setRotationPoint(-6F, 16F, 8F);
		finger12.setTextureSize(128, 64);
		finger12.mirror = true;
		setRotation(finger12, 0F, -0.2617994F, 0F);
		finger13 = new ModelRenderer(this, 42, 12);
		finger13.addBox(0F, 7F, -5F, 1, 1, 3);
		finger13.setRotationPoint(-6F, 16F, 8F);
		finger13.setTextureSize(128, 64);
		finger13.mirror = true;
		setRotation(finger13, 0F, -0.1745329F, 0F);
		leg41 = new ModelRenderer(this, 0, 16);
		leg41.addBox(-1F, 7F, -4F, 1, 1, 2);
		leg41.setRotationPoint(6F, 16F, -4F);
		leg41.setTextureSize(128, 64);
		leg41.mirror = true;
		setRotation(leg41, 0F, 0.4537856F, 0F);
		leg42 = new ModelRenderer(this, 0, 16);
		leg42.addBox(0F, 7F, -4F, 1, 1, 2);
		leg42.setRotationPoint(6F, 16F, -4F);
		leg42.setTextureSize(128, 64);
		leg42.mirror = true;
		setRotation(leg42, 0F, -0.3839724F, 0F);
		leg31 = new ModelRenderer(this, 0, 16);
		leg31.addBox(-1F, 7F, -4F, 1, 1, 2);
		leg31.setRotationPoint(-6F, 16F, -4F);
		leg31.setTextureSize(128, 64);
		leg31.mirror = true;
		setRotation(leg31, 0F, 0.4363323F, 0F);
		leg32 = new ModelRenderer(this, 0, 16);
		leg32.addBox(0F, 7F, -4F, 1, 1, 2);
		leg32.setRotationPoint(-6F, 16F, -4F);
		leg32.setTextureSize(128, 64);
		leg32.mirror = true;
		setRotation(leg32, 0F, -0.3839724F, 0F);
		leg33 = new ModelRenderer(this, 42, 12);
		leg33.addBox(-1F, 7F, -5F, 1, 1, 3);
		leg33.setRotationPoint(-6F, 16F, -4F);
		leg33.setTextureSize(128, 64);
		leg33.mirror = true;
		setRotation(leg33, 0F, -0.2792527F, 0F);
		leg43 = new ModelRenderer(this, 42, 12);
		leg43.addBox(0F, 7F, -5F, 1, 1, 3);
		leg43.setRotationPoint(6F, 16F, -4F);
		leg43.setTextureSize(128, 64);
		leg43.mirror = true;
		setRotation(leg43, 0F, -0.0349066F, 0F);
		leg44 = new ModelRenderer(this, 42, 12);
		leg44.addBox(-1F, 7F, -5F, 1, 1, 3);
		leg44.setRotationPoint(6F, 16F, -4F);
		leg44.setTextureSize(128, 64);
		leg44.mirror = true;
		setRotation(leg44, 0F, 0.0523599F, 0F);
		spine = new ModelRenderer(this, 52, 1);
		spine.addBox(-5F, -8F, -7F, 14, 12, 1);
		spine.setRotationPoint(-2F, 1F, 5F);
		spine.setTextureSize(128, 64);
		spine.mirror = true;
		setRotation(spine, 1.570796F, 0F, 0F);
		tailspike = new ModelRenderer(this, 42, 1);
		tailspike.addBox(1F, 8F, -6F, 2, 2, 2);
		tailspike.setRotationPoint(-2F, 1F, 5F);
		tailspike.setTextureSize(128, 64);
		tailspike.mirror = true;
		setRotation(tailspike, 1.361357F, 0F, 0F);
		backtailspike = new ModelRenderer(this, 42, 1);
		backtailspike.addBox(1F, 16F, -6F, 2, 2, 2);
		backtailspike.setRotationPoint(-2F, 1F, 5F);
		backtailspike.setTextureSize(128, 64);
		backtailspike.mirror = true;
		setRotation(backtailspike, 1.361357F, 0F, 0F);
		endspike = new ModelRenderer(this, 42, 1);
		endspike.addBox(1F, 22F, -6F, 2, 2, 2);
		endspike.setRotationPoint(-2F, 1F, 5F);
		endspike.setTextureSize(128, 64);
		endspike.mirror = true;
		setRotation(endspike, 1.361357F, 0F, 0F);
		sidebody = new ModelRenderer(this, 92, 31);
		sidebody.addBox(8F, -10F, -7F, 1, 7, 8);
		sidebody.setRotationPoint(-2F, 9F, 3F);
		sidebody.setTextureSize(128, 64);
		sidebody.mirror = true;
		setRotation(sidebody, 1.570796F, 0F, 0F);
		sidebody2 = new ModelRenderer(this, 88, 48);
		sidebody2.addBox(8F, -3F, -7F, 1, 9, 2);
		sidebody2.setRotationPoint(-2F, 9F, 3F);
		sidebody2.setTextureSize(128, 64);
		sidebody2.mirror = true;
		setRotation(sidebody2, 1.570796F, 0F, 0F);
		sidebody3 = new ModelRenderer(this, 10, 17);
		sidebody3.addBox(8F, -3F, -1F, 1, 9, 2);
		sidebody3.setRotationPoint(-2F, 9F, 3F);
		sidebody3.setTextureSize(128, 64);
		sidebody3.mirror = true;
		setRotation(sidebody3, 1.570796F, 0F, 0F);
		sidebody4 = new ModelRenderer(this, 3, 45);
		sidebody4.addBox(8F, 4F, -5F, 1, 2, 4);
		sidebody4.setRotationPoint(-2F, 9F, 3F);
		sidebody4.setTextureSize(128, 64);
		sidebody4.mirror = true;
		setRotation(sidebody4, 1.570796F, 0F, 0F);
		arm = new ModelRenderer(this, 59, 44);
		arm.addBox(8F, -1F, -3F, 6, 2, 2);
		arm.setRotationPoint(-2F, 9F, 3F);
		arm.setTextureSize(128, 64);
		arm.mirror = true;
		setRotation(arm, 1.570796F, -0.1745329F, 0.1570796F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		leg34.render(f5);
		spike1.render(f5);
		spike2.render(f5);
		spike3.render(f5);
		spike4.render(f5);
		spike5.render(f5);
		spike6.render(f5);
		head.render(f5);
		body.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
		tail.render(f5);
		tailpiece.render(f5);
		tailend.render(f5);
		jaw.render(f5);
		backspike.render(f5);
		mouth.render(f5);
		knee2.render(f5);
		knee1.render(f5);
		finger2.render(f5);
		finger21.render(f5);
		finger22.render(f5);
		finger23.render(f5);
		finger1.render(f5);
		finger11.render(f5);
		finger12.render(f5);
		finger13.render(f5);
		leg41.render(f5);
		leg42.render(f5);
		leg31.render(f5);
		leg32.render(f5);
		leg33.render(f5);
		leg43.render(f5);
		leg43.render(f5);
		spine.render(f5);
		tailspike.render(f5);
		backtailspike.render(f5);
		endspike.render(f5);
		sidebody.render(f5);
		sidebody2.render(f5);
		sidebody3.render(f5);
		sidebody4.render(f5);
		arm.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
    public void setLivingAnimations(EntityLiving par1EntityLiving, float par2, float par3, float par4)
    {
        this.partialTicks = par4;
    }

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		head.rotateAngleX = f4 / (180F / (float)Math.PI);
		head.rotateAngleY = f3 / (180F / (float)Math.PI);
		jaw.rotateAngleX = f4 / (180F / (float)Math.PI);
		jaw.rotateAngleY = f3 / (180F / (float)Math.PI);
		mouth.rotateAngleY = f3 / (180F / (float)Math.PI);
		mouth.rotateAngleX = f4 / (180F / (float)Math.PI);
		leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		knee1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		knee2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		knee1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		knee2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		finger1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		finger11.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		finger12.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		finger13.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		finger2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		finger21.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		finger22.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		finger23.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		leg33.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		leg31.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		leg32.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		leg34.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		leg41.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		leg42.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		leg43.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		leg44.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
	}
}