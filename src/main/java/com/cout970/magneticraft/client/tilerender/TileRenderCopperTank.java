package com.cout970.magneticraft.client.tilerender;

import com.cout970.magneticraft.tileentity.TileCopperTank;
import com.cout970.magneticraft.util.CubeRenderer_Util;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import org.lwjgl.opengl.GL11;

public class TileRenderCopperTank extends TileEntitySpecialRenderer {

    public float k = 0.002f;

    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
        if (te.getBlockMetadata() < 2) {
            GL11.glPushMatrix();
            GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
            GL11.glEnable(GL11.GL_CULL_FACE);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            renderFluid((TileCopperTank) te);
            GL11.glPopAttrib();
            GL11.glPopMatrix();
        }
    }

    private void renderFluid(TileCopperTank te) {
        if (te.getTank() == null || te.getTank().getFluid() == null) return;

        IIcon i = te.getTank().getFluid().getFluid().getIcon();
        if (i == null) return;
        float h = ((float) te.getTank().getFluidAmount()) / ((float) te.getTank().getCapacity());
        GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
        bindTexture(TextureMap.locationBlocksTexture);

        if (h > 0) {
            if (h <= 0.01f) h = 0.02f;
            if (h >= 1) h = 0.99f;
            GL11.glTranslatef(-0.5F, -1.5F, -0.5F);
            GL11.glTranslatef(k, 0.01f, k);
            if (te.cubeRenderer == null) {
                te.cubeRenderer = new CubeRenderer_Util();
            }
            te.cubeRenderer.renderBox(i, 1f - k * 2, h - 0.01f, 1f - k * 2);
        }
    }
}
