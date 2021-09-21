package com.murali.springboot.model;

import lombok.Data;
import lombok.ToString;

/**
 * @author:Sanapala Muralidharan
 * @date:Sep 17, 2021 6:29:55 PM
 * @version:2.x
 */
@Data
@ToString
public class Employee {

    //@JsonProperty("full_name")
    private String name;
    //@JsonIgnore
    private Long age;
    private String location;
    private String email;
    private String department;

}
