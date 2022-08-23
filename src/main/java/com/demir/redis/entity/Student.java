package com.demir.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Student")
public class Student implements Serializable {

    @Id
    private String id = UUID.randomUUID().toString();
    private String tcNo;
    private String name;
    private String surname;
    private float vize;
    private float finall;


}
