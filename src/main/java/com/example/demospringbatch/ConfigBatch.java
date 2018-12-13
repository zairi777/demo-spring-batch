package com.example.demospringbatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:batch-config.xml")
@EnableBatchProcessing
public class ConfigBatch {

    public void name() {

    }
}
