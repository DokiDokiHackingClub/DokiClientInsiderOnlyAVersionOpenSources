package dev.client.tenacity.module.impl.combat;

import dev.client.tenacity.module.Category;
import dev.client.tenacity.module.Module;
import dev.client.tenacity.utils.Wrapper;
import dev.event.EventListener;
import dev.event.impl.player.MotionEvent;
import dev.settings.impl.ModeSetting;
import dev.settings.impl.NumberSetting;
import dev.utils.network.PacketUtils;
import net.minecraft.item.ItemBanner;
import net.minecraft.item.ItemBow;
import net.minecraft.network.play.client.C03PacketPlayer;
import org.lwjgl.input.Mouse;


public final class Reach extends Module {
    private final NumberSetting reach = new NumberSetting("Reach", 4, 6, 1, 0.1);
    public static double dbReach;
    
    public Reach() {
        super("Reach", Category.COMBAT, "reach");
    }
    
    private final EventListener<MotionEvent> motionEventEventListener = event -> {
    	dbReach = this.reach.getValue();
    };
}
