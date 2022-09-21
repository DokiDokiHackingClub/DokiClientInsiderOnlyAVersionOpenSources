package just.monika.主播你有反编译我代码的时间还不如自己写一个端子.module.impl.player;

import just.monika.主播你有反编译我代码的时间还不如自己写一个端子.module.Category;
import just.monika.主播你有反编译我代码的时间还不如自己写一个端子.module.Module;
import dev.event.EventListener;
import dev.event.impl.player.MotionEvent;
import dev.settings.impl.NumberSetting;

@SuppressWarnings("unused")
public final class Timer extends Module {

    private final NumberSetting amount = new NumberSetting("Amount", 1, 10, 0.1, 0.1);

    private final EventListener<MotionEvent> motionEventEventListener = event -> {
        mc.timer.timerSpeed = amount.getValue().floatValue();
    };

    public Timer() {
        super("Timer", Category.PLAYER, "changes game speed");
        this.addSettings(amount);
    }

}
