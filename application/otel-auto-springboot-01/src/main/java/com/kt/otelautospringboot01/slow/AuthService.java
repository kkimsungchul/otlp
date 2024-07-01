package com.kt.otelautospringboot01.slow;


import io.opentelemetry.instrumentation.annotations.WithSpan;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    @WithSpan
    public void checkAuth() throws Exception{
        Thread.sleep(2000);
    }
}
