package com.pengo.redis.search.entity;

import com.redis.om.spring.annotations.Indexed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author benpeng
 * @date 2022/12/3 10:50
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    @Indexed
    private String name;

    @Indexed
    private Integer age;

}
