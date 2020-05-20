package com.dongz.learn_workflow;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableProcessApplication
@SpringBootApplication
public class LearnWorkflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnWorkflowApplication.class, args);
    }

}
