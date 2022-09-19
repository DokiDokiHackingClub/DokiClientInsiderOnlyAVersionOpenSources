package dev.client;

import dev.client.tenacity.DokiClient;
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
