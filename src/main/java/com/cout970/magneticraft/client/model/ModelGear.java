// Date: 14/11/2014 16:54:37
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.cout970.magneticraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGear extends ModelBase {
    //fields
    ModelRenderer main;
    ModelRenderer dent1;
    ModelRenderer dent2;
    ModelRenderer dent3;
    ModelRenderer dent4;

    public ModelGear() {
        textureWidth = 16;
        textureHeight = 16;

        main = new ModelRenderer(this, 0, 0);
        main.addBox(0F, -2F, -2F, 1, 4, 4);
        main.setRotationPoint(0F, 16F, 0F);
        main.setTextureSize(16, 16);
        main.mirror = true;
        setRotation(main, 0F, 0F, 0F);
        dent1 = new ModelRenderer(this, 0, 0);
        dent1.addBox(0F, -3F, -0.5F, 1, 6, 1);
        dent1.setRotationPoint(0F, 16F, 0F);
        dent1.setTextureSize(16, 16);
        dent1.mirror = true;
        setRotation(dent1, 0F, 0F, 0F);
        dent2 = new ModelRenderer(this, 0, 0);
        dent2.addBox(0F, -3F, -0.5F, 1, 6, 1);
        dent2.setRotationPoint(0F, 16F, 0F);
        dent2.setTextureSize(16, 16);
        dent2.mirror = true;
        setRotation(dent2, 1.570796F, 0F, 0F);
        dent3 = new ModelRenderer(this, 0, 0);
        dent3.addBox(0F, -3F, -0.5F, 1, 6, 1);
        dent3.setRotationPoint(0F, 16F, 0F);
        dent3.setTextureSize(16, 16);
        dent3.mirror = true;
        setRotation(dent3, 0.7853982F, 0F, 0F);
        dent4 = new ModelRenderer(this, 0, 0);
        dent4.addBox(0F, -3F, -0.5F, 1, 6, 1);
        dent4.setRotationPoint(0F, 16F, 0F);
        dent4.setTextureSize(16, 16);
        dent4.mirror = true;
        setRotation(dent4, 2.356194F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        main.render(f5);
        dent1.render(f5);
        dent2.render(f5);
        dent3.render(f5);
        dent4.render(f5);
    }

    public void renderDynamic(float f5, float rot) {
        main.rotateAngleX = rot;
        dent1.rotateAngleX = rot;
        dent2.rotateAngleX = (float) (rot + Math.PI / 2);
        dent3.rotateAngleX = (float) (rot + Math.PI / 4);
        dent4.rotateAngleX = (float) (rot - Math.PI / 4);

        main.render(f5);
        dent1.render(f5);
        dent2.render(f5);
        dent3.render(f5);
        dent4.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
