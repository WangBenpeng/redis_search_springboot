package com.pengo.redis.search;

import com.pengo.redis.search.entity.School;
import com.pengo.redis.search.entity.Student;
import com.pengo.redis.search.mapper.SchoolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

@SpringBootTest
class RedisSearchSpringbootApplicationTests {

    @Autowired
    private SchoolRepository schoolRepository;

    @Test
    void initData() {
        schoolRepository.deleteAll();

        Student zhangsan = new Student("张三", 18);
        School qdScience = new School("1001", "青岛科技大学", 50, "青岛市", zhangsan, Set.of("机械", "化工"));

        Student lisi = new Student("lisi", 20);
        School sdCollege = new School("1002", "山东大学", 60, "济南市", lisi, Set.of("音乐", "美术"));

        Student wangwu = new Student("wangwu", 22);
        School ytCollege = new School("1003", "烟台大学", 70, "烟台市", wangwu, Set.of("跳高", "跳远"));

        Student zhaoliu = new Student("zhaoliu", 24);
        School rzCollege = new School("1004", "日照大学", 80, "日照市", zhaoliu, Set.of("语文", "数学"));

        Student xiaoming = new Student("xiaoming", 26);
        School hzCollege = new School("1005", "菏泽大学", 90, "菏泽市", xiaoming, Set.of("政治", "英语"));


        schoolRepository.saveAll(List.of(qdScience, sdCollege, ytCollege, rzCollege, hzCollege));
    }
}
