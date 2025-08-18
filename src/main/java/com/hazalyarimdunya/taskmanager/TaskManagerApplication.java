package com.hazalyarimdunya.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//Projeyi ayaga kaldiran class
@EntityScan(basePackages = "com.hazalyarimdunya.taskmanager") //User entity sinifini uygulamaya tanitmak gerek.
@SpringBootApplication
public class TaskManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskManagerApplication.class, args);
    }

}
