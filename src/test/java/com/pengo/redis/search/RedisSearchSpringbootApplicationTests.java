package com.pengo.redis.search;

import com.pengo.redis.search.entity.*;
import com.pengo.redis.search.mapper.CountryRepository;
import com.pengo.redis.search.service.CountryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

@SpringBootTest
class RedisSearchSpringbootApplicationTests {

    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private CountryService countryService;

    @Test
    void initCountry() {
        countryRepository.deleteAll();

        Country c1 = new Country();
        Province p1 = new Province();
        p1.setProName("shanghai");
        p1.setArea(100);
        c1.setName("china");
        c1.setProvince(p1);
        c1.setFlag(Set.of("a", "b", "c"));

        Country c2 = new Country();
        Province p2 = new Province();
        p2.setProName("beijing");
        p2.setArea(200);
        c2.setName("china2");
        c2.setProvince(p2);
        c2.setFlag(Set.of("d", "e", "f"));

        countryRepository.saveAll(List.of(c1, c2));
    }

    @Test
    void testCountry() {
        Iterable<Country> shanghai = countryRepository.findByProvince_ProName("shanghai");
        System.out.println(shanghai);
        System.out.println("------");
        Iterable<Country> a = countryRepository.findByFlag(Set.of("a"));
        System.out.println(a);
        System.out.println("------");
        Iterable<Country> allCountry = countryService.findAllCountry();
        System.out.println(allCountry);
        System.out.println("------");
        Iterable<Country> china = countryService.findByName("china");
        System.out.println(china);
    }
}
