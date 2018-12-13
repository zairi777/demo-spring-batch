package com.example.demospringbatch;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class HelloWorldTasklet implements Tasklet {

    @Override
    public RepeatStatus execute(final StepContribution arg0, final ChunkContext arg1) throws Exception {
        System.out.println("Hello World !");
        return RepeatStatus.FINISHED;
    }

}
