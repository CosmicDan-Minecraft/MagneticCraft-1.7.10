// Date: 23/01/2015 18:17:08
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.cout970.magneticraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelReactorRod extends ModelBase {
    //fields
    ModelRenderer Shape1;

    public ModelReactorRod() {
        textureWidth = 16;
        textureHeight = 18;

        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(-2F, -7F, -2F, 4, 14, 4);
        Shape1.setRotationPoint(0F, 16F, 0F);
        Shape1.setTextureSize(16, 18);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        Shape1.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void renderStatic(float f5) {
        Shape1.render(f5);
    }
}
