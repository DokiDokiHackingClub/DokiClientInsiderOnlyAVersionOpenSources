package just.monika.主播你有反编译我代码的时间还不如自己写一个端子.module.impl.player;

import just.monika.主播你有反编译我代码的时间还不如自己写一个端子.module.Category;
import just.monika.主播你有反编译我代码的时间还不如自己写一个端子.module.Module;
import dev.event.EventListener;
import dev.event.impl.game.KeyPressEvent;
import dev.settings.impl.NumberSetting;
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
