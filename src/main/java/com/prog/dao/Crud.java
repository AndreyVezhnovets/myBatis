package com.prog.dao;


import com.prog.entities.MasterImpl;
import com.prog.entities.WorkerImpl;

import java.sql.SQLException;

public interface Crud {

    WorkerImpl getWorkerById(int id);

    MasterImpl getMasterByName(String name);

    void tryNativeSQL(String sqlScript) throws SQLException;

    void tryNativeSQLUpdqte(String sqlScript) throws SQLException;
}
