package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: cloud2020
 * @description
 * @author: LIYAN
 * @create: 2020-11-24 11:01
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment  implements Serializable {

    private Long id;
    private String serial;
}
