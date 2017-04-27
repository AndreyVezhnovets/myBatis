package com.prog.entities;

public class WorkerImpl {
    private int id;
    private String masterName;
    private String city;
    private MasterImpl master;

    public MasterImpl getMaster() {
        return master;
    }

    public void setMaster(MasterImpl master) {
        this.master = master;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
