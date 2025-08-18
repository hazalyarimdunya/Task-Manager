package com.hazalyarimdunya.taskmanager.entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "Users") //Bu sınıfın bir JPA entity (veritabanı tablosuna karşılık gelen sınıf) olduğunu belirtir.
                        // Yani entity’nin JPA tarafındaki adıdır.

@Table(name = "users") //tablo ismi
public class User {

    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto inc
    @Column(name = "user_id") // colon ismi
    private Integer Id;

    @Column(name = "user_name", length = 20, columnDefinition = "varchar(255) default USER")
    private String name;

    @Column(name = "user_surname")
    private String surname;

    @Column(name = "user_email")
    private String email;

    @Timestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at; //Eğer @Column eklemezsen JPA/Hibernate varsayılan olarak field adını kolon adı olarak kullanır.
}
