package com.pengo.redis.search.service;

import com.pengo.redis.search.entity.Country;
import com.pengo.redis.search.entity.Country$;
import com.redis.om.spring.search.stream.EntityStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class CountryService {
    @Autowired
    EntityStream entityStream;

    public Iterable<Country> findAllCountry() {
        return entityStream.of(Country.class)
                .limit(10)
                .collect(Collectors.toList());
    }

    public Iterable<Country> findByName(String name) {
        return entityStream.of(Country.class)
                .filter(Country$.NAME.eq(name))
                .limit(10)
                .collect(Collectors.toList());
    }
}
