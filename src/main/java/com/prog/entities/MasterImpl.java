package com.prog.entities;

import java.util.List;

public class MasterImpl {
    private String name;
    private int age;
    private List<WorkerImpl> workerImpls;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<WorkerImpl> getWorkerImpls() {
        return workerImpls;
    }

    public void setWorkerImpls(List<WorkerImpl> workerImpls) {
        this.workerImpls = workerImpls;
    }
}
