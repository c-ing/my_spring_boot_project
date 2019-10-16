package com.cdc;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class ThreadPoolExecutorsTest {

    public static void main(String[] args) {

        final ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(() -> log.info("submit:{}", executorService));
    }
}
