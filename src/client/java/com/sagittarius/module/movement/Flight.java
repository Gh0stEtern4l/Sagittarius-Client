package com.sagittarius.module.movement;

import com.sagittarius.module.Mod;
import net.minecraft.client.network.ClientPlayerEntity;
import org.lwjgl.glfw.GLFW;

public class Flight extends Mod {
    public Flight() {
        super("Flight", "Allows the power of Flight!", Category.MOVEMENT);
        this.setKey(GLFW.GLFW_KEY_G);
    }

    ClientPlayerEntity player = mc.player;

    @Override
    public void onEnable() {
        player.getAbilities().allowFlying = true;
        mc.player.getAbilities().flying = true;
        super.onEnable();
    }



    @Override
    public void onDisable() {
        player.getAbilities().allowFlying = false;
        mc.player.getAbilities().flying = false;
        super.onDisable();
    }
}
