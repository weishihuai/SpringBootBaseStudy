package com.wsh;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by wsh on 2017/11/29.
 * Girl类
 */
@Entity
public class Girl {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 大小
     */
    private String cupSize;

    /**
     * 年龄
     */
    private Integer age;

    public Girl() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
