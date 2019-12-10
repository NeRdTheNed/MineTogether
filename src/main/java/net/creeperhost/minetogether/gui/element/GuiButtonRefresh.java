package net.creeperhost.minetogether.gui.element;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.ResourceLocation;

public class GuiButtonRefresh extends Button
{
    protected static final ResourceLocation BUTTON_TEXTURES = new ResourceLocation("creeperhost", "textures/gui.png");
    private final int index;

    public GuiButtonRefresh(int xPos, int yPos, int index, Button.IPressable onPress)
    {
        super(xPos, yPos, 20, 20, "", onPress);
        this.index = index;
    }

    public GuiButtonRefresh(int xPos, int yPos, Button.IPressable onPress)
    {
        this(xPos, yPos, 0, onPress);
    }

    @Override
    public void renderButton(int mouseX, int mouseY, float tick)
    {
        if (this.visible)
        {
            Minecraft.getInstance().getTextureManager().bindTexture(BUTTON_TEXTURES);
            GlStateManager.color4f(1.0F, 1.0F, 1.0F, 1.0F);

//            boolean over = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
//            this.drawTexturedModalRect(this.xPosition, this.yPosition, (index + 2)* 20, over ? this.height : 0, this.width, this.height);
        }
    }
}
