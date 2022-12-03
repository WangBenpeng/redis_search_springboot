package com.pengo.redis.search.mapper;

import com.pengo.redis.search.entity.School;
import com.redis.om.spring.repository.RedisDocumentRepository;

/**
 * @author benpeng
 * @date 2022/12/3 11:10
 */
public interface SchoolRepository extends RedisDocumentRepository<School, String> {

//    Iterable<School> findBy

}
