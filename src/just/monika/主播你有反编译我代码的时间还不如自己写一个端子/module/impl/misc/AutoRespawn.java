package just.monika.主播你有反编译我代码的时间还不如自己写一个端子.module.impl.misc;

import just.monika.主播你有反编译我代码的时间还不如自己写一个端子.module.Category;
import just.monika.主播你有反编译我代码的时间还不如自己写一个端子.module.Module;
import dev.event.EventListener;
import dev.event.impl.game.TickEvent;
import dev.utils.network.PacketUtils;
import net.minecraft.network.play.client.C16PacketClientStatus;

public final class AutoRespawn extends Module {

    private final EventListener<TickEvent> tickEventEventListener = event -> {
        if(mc.thePlayer.isDead){
            PacketUtils.sendPacketNoEvent(new C16PacketClientStatus(C16PacketClientStatus.EnumState.PERFORM_RESPAWN));
        }
    };

    public AutoRespawn() {
        super("AutoRespawn", Category.MISC, "automatically respawn");
    }
}
