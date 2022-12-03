package com.pengo.redis.search.entity;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Indexed;
import com.redis.om.spring.annotations.Searchable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Set;

/**
 * @author benpeng
 * @date 2022/12/3 10:52
 */
@NoArgsConstructor
@AllArgsConstructor
@Document
@Data
public class School {

    @Id
    @Indexed
    private String id;

    @Searchable
    private String name;

    @Searchable
    private Integer history;

    @Searchable
    private String address;

    @Indexed
    private Student student;

    @Indexed
    private Set<String> subject;

}
