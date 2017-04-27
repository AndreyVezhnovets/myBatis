package com.prog.dao;

import com.prog.entities.Master;
import com.prog.entities.MasterImpl;
import com.prog.entities.Worker;
import com.prog.entities.WorkerImpl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class CrudImpl implements Crud {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    public WorkerImpl getWorkerById(int id) {

        return sqlSessionFactory.openSession().getMapper(Worker.class).getWorkerById(id);
    }

    public MasterImpl getMasterByName(String name) {
        return sqlSessionFactory.openSession().getMapper(Master.class).getMasterByName(name);
    }

    public void tryNativeSQL(String sqlScript) throws SQLException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.getConnection().createStatement().execute(sqlScript);
        sqlSession.close();
    }
    public void tryNativeSQLUpdqte(String sqlScript) throws SQLException {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.getConnection().createStatement().executeUpdate(sqlScript);
        sqlSession.close();
    }
}
