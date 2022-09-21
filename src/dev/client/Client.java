package dev.client;

import just.monika.主播你有反编译我代码的时间还不如自己写一个端子.DokiClient;
import dev.event.Event;

public class Client {

    public static ClientType client;

    public static void dispatchEvent(Event event) {
        if (client == null) return;
        switch (client) {
            case TENACITY:
                DokiClient.INSTANCE.getEventProtocol().dispatch(event);
                break;
            case ROSE:
                break;
        }
    }

}
