package com.cdc;

import com.cdc.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Slf4j
public class MybatisTest {


    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 拿到xml配置初始化，
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 拿到defaultSqlSession, 并且开启一级缓存 执行器创建赋值
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<User> users = sqlSession.selectList("wukong.selectUser",11);
        log.info("用户数据：{}",users);

        Thread thread = new Thread();

        thread.start();
    }
}
