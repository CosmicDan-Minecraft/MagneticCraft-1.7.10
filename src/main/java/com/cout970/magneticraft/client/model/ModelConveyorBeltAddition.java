// Date: 30/05/2015 0:24:48
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.cout970.magneticraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelConveyorBeltAddition extends ModelBase {
    //fields
    ModelRenderer Side1;
    ModelRenderer Side2;
    ModelRenderer Side3;

    public ModelConveyorBeltAddition() {
        textureWidth = 64;
        textureHeight = 64;

        Side1 = new ModelRenderer(this, 0, 0);
        Side1.addBox(0F, 0F, 0F, 1, 21, 16);
        Side1.setRotationPoint(-8F, 3F, -8F);
        Side1.setTextureSize(64, 64);
        Side1.mirror = true;
        setRotation(Side1, 0F, 0F, 0F);
        Side2 = new ModelRenderer(this, 0, 0);
        Side2.addBox(0F, 0F, 0F, 1, 21, 16);
        Side2.setRotationPoint(7F, 3F, -8F);
        Side2.setTextureSize(64, 64);
        Side2.mirror = true;
        setRotation(Side2, 0F, 0F, 0F);
        Side3 = new ModelRenderer(this, 34, 0);
        Side3.addBox(0F, 0F, 0F, 1, 16, 14);
        Side3.setRotationPoint(-7F, 8F, -7F);
        Side3.setTextureSize(64, 64);
        Side3.mirror = true;
        setRotation(Side3, 0F, 1.570796F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        //    setRotationAngles(f, f1, f2, f3, f4, f5);
        Side1.render(f5);
        Side2.render(f5);
        Side3.render(f5);
    }

    public void renderStatic(float f5) {
        Side1.render(f5);
        Side2.render(f5);
        Side3.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
