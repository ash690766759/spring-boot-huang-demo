package com.huang.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 实体类  嘉宾*/
@Entity
@Data @AllArgsConstructor@NoArgsConstructor
public class Guest implements Serializable {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String role;
}
