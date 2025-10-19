package com.example.profiledemo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
class DevService implements MyService {
    public void showMessage() {
        System.out.println("Running in DEV environment");
    }
}

@Component
@Profile("test")
class TestService implements MyService {
    public void showMessage() {
        System.out.println("Running in TEST environment");
    }
}

@Component
@Profile("prod")
class ProdService implements MyService {
    public void showMessage() {
        System.out.println("Running in PROD environment");
    }
}

public interface MyService {
    void showMessage();
}
