package com.hazalyarimdunya.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//Projeyi ayaga kaldiran class
@SpringBootApplication
@EntityScan(basePackages = {"com.hazalyarimdunya.taskmanager"})//entity sinifini uygulamaya tanitmak gerek.
//@ComponentScan(basePackages ={"com.hazalyarimdunya.taskmanager"} ) //Controller-Service-Repository siniflarini uygulamaya tanitmak gerek.
@EnableJpaRepositories(basePackages = {"com.hazalyarimdunya.taskmanager"}) //JPA reposunu aktiflestirir.

public class TaskManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskManagerApplication.class, args);
    }

}
