package com.javatechie.multiple.ds.api.model.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 24, 2021 8:05:48 PM
 * @version:2.x
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER_TB")
public class User {
    @Id
    private int id;
    private String userName;
}
