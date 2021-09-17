package com.murali.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:Sanapala Muralidharan
 * @date:Sep 17, 2021 1:07:22 PM @param <T>
 * @version:2.x
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIResponse<T> {

    int recordCount;
    T response;
}
