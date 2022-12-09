package com.pengo.redis.search.mapper;

import com.pengo.redis.search.entity.Country;
import com.redis.om.spring.repository.RedisDocumentRepository;

import java.util.Set;

public interface CountryRepository extends RedisDocumentRepository<Country, String> {

    Iterable<Country> findByProvince_ProName(String name);

    Iterable<Country> findByFlag(Set<String> flag);
}
