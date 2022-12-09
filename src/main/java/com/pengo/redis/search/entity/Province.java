package com.pengo.redis.search.entity;

import com.redis.om.spring.annotations.Indexed;
import lombok.Data;

@Data
public class Province {

    @Indexed
    private String proName;

    @Indexed
    private Integer area;

}
