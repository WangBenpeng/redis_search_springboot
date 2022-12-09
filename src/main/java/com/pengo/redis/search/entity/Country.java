package com.pengo.redis.search.entity;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Indexed;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Set;

@Document
@Data
public class Country {

    @Id
    @Indexed
    private String id;

    @Indexed
    private String name;

    @Indexed
    private Province province;

    @Indexed
    private Set<String> flag;
}
