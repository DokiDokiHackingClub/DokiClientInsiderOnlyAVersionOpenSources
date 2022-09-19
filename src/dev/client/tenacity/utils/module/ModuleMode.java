package dev.client.tenacity.utils.module;

import dev.client.tenacity.DokiClient;
import net.minecraft.client.Minecraft;

public interface ModuleMode {

    Minecraft mc = Minecraft.getMinecraft();

    default void onEnable() {
        DokiClient.INSTANCE.getEventProtocol().register(this);
    }

    default void onDisable() {
        DokiClient.INSTANCE.getEventProtocol().unregister(this);
    }

}
