package com.prog;

import com.prog.entities.Master;
import com.prog.entities.MasterImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// дергаем бин "SqlSessionFactory", тянем "Master"
@Configuration
@ComponentScan
public class AppConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
//        configApplicationContext.register(SessionFactoryConfig.class);
        configApplicationContext.refresh();                                                              // рефрешим контекст
        SqlSessionFactory sessionFactory = configApplicationContext.getBean(SqlSessionFactory.class);    // дергаем бин "SqlSessionFactory"
        SqlSession session = sessionFactory.openSession();                                               // открываем сессию
        MasterImpl master = session.getMapper(Master.class).getMasterByName("коля");                     // дергаем сущность из БД
    }
}
