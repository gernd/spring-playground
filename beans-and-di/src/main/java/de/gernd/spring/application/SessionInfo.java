package de.gernd.spring.application;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

import static org.springframework.context.annotation.ScopedProxyMode.TARGET_CLASS;

@Component
@Scope(value = "request", proxyMode = TARGET_CLASS)
public class SessionInfo {

    private final OffsetDateTime startTime;

    public SessionInfo() {
        this.startTime = OffsetDateTime.now();
    }

    @Override
    public String toString() {
        return "Session starting at " + startTime;
    }
}
