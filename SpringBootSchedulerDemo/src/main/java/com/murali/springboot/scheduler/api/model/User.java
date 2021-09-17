package com.murali.springboot.scheduler.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 17, 2021 8:38:56 PM  
 * @version:2.x
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

}
