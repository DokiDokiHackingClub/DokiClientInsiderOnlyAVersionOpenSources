package dev.client.tenacity.module.impl.player;

import dev.client.tenacity.module.Category;
import dev.client.tenacity.module.Module;
import dev.event.EventListener;
import dev.event.impl.game.KeyPressEvent;
import dev.event.impl.network.PacketSendEvent;
import dev.event.impl.player.MotionEvent;
import dev.settings.impl.ModeSetting;
import dev.settings.impl.NumberSetting;
import dev.utils.network.PacketUtils;
import net.minecraft.network.play.client.C03PacketPlayer;
import org.lwjgl.input.Keyboard;

import java.util.Random;

import static just.monika.MonikaIQBoost.LMessages;
import static org.lwjgl.input.Keyboard.KEY_P;

public final class IQBoost extends Module {

    private final EventListener<KeyPressEvent> motionEventEventListener = event -> {
        if (Keyboard.isKeyDown(KEY_P)) {
            Random r = new Random();
            mc.thePlayer.sendChatMessage(LMessages[r.nextInt(LMessages.length)]);
        }
    };

    public IQBoost() {
        super("IQBoost", Category.PLAYER, "press P to L");
        this.addSettings(new NumberSetting("IQ", 120, Integer.MAX_VALUE, 0, 10));
    }
}
