package me.yanrs.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Programmer {
    private List<String> cars;
    private Set<String> pats;
    private Map<String, String> infos;
    private Properties mysqlContentInfos;
    private String[] members;

    public List<String> getCars() {
        return cars;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    public Set<String> getPats() {
        return pats;
    }

    public void setPats(Set<String> pats) {
        this.pats = pats;
    }

    public Map<String, String> getInfos() {
        return infos;
    }

    public void setInfos(Map<String, String> infos) {
        this.infos = infos;
    }

    public Properties getMysqlContentInfos() {
        return mysqlContentInfos;
    }

    public void setMysqlContentInfos(Properties mysqlContentInfos) {
        this.mysqlContentInfos = mysqlContentInfos;
    }

    public String[] getMembers() {
        return members;
    }

    public void setMembers(String[] members) {
        this.members = members;
    }
}
