package io.heynow.poc.router;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@Slf4j
@EnableBinding(Sink.class)
public abstract class Router {

    @Autowired
    Sink channels;

    @org.springframework.integration.annotation.Router(inputChannel = Sink.INPUT)
    public final String route(NoteMessage message) {
        process(message.getNote());
        if (message.getPath().isEmpty()) {
            throw new IncorectRoutingException("Unexpected end of routing.");
        }
        return message.getPath().remove(0);
    }

    protected abstract Note process(Note input);
}
