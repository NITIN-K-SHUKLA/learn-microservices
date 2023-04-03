package com.microservices.user.service.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="micro_users")
public class User {

    @Id
    @Column(name="ID")
    private String userId;
    @Column(name="NAME")
    private String name;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "ABOUT")
    private String about;

    @Transient
    //we will get it from another microservice
    private List<Rating> ratings= new ArrayList<>();
}