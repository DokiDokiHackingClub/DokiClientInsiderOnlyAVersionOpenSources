package dev.client.tenacity.module.impl.render;

import dev.client.tenacity.module.Category;
import dev.client.tenacity.module.Module;
import dev.event.EventListener;
import dev.event.impl.game.KeyPressEvent;
import dev.event.impl.game.TickEvent;
import just.monika.LInput;

public class FixInp extends Module {
    private final EventListener<TickEvent> tickEventEventListener = event -> {
        if(!mc.ingameGUI.getChatGUI().getChatOpen()){
            LInput.makeOff();
        }else{
            LInput.makeOn();
        }
    };
    public FixInp() {
        super("FixInput", Category.RENDER, "L");
    }
}
