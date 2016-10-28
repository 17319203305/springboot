package com.springboot.test.bean;

/**测试实体类
 * Created by nanusl on 2016/10/27/027.
 */
public class Demo {
    private long id;//主键
    private String name;//测试名称

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
