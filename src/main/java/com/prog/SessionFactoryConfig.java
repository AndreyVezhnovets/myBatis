package com.prog;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Reader;

@Component
public class SessionFactoryConfig {

    @Bean
    public Reader reader() throws IOException {
        return Resources.getResourceAsReader("mybatis-config.xml");
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(Reader reader) throws Exception {
       return new SqlSessionFactoryBuilder().build(reader);
    }
}
