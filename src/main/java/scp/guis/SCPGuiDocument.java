package scp.guis;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import scp.containerslots.SCPContainerDocument;

public class SCPGuiDocument extends GuiContainer
{
    public SCPGuiDocument(InventoryPlayer inventoryplayer, World world, int i, int j, int k)
    {
        super(new SCPContainerDocument(inventoryplayer, world, i, j, k));
    }

    protected void drawGuiContainerForegroundLayer()
    {
        fontRenderer.drawString("", 62, 6, 0x404040);
        fontRenderer.drawString("Inventory", 8, (ySize - 96) + 2, 0x404040);
    }

    protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
    {
        i = mc.renderEngine.getTexture("/SCPCraft/textures/guis/DocumentGUI.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture("/SCPCraft/textures/guis/DocumentGUI.png");
        j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        drawTexturedModalRect(j, k, 0, 0, xSize, ySize);
    }
}
