package org.vincent.aop.cglib;

/**
 * @Package: org.vincent.aop.dynamicproxy <br/>
 * @Description： 业务实现类UserServiceImpl 该类 作为AOP中切点角色，切面定义的方法插入到切点的接口方法 执行前和执行后执行。 <br/>
 * @author: lenovo <br/>
 * @Company: PLCC <br/>
 * @Copyright: Copyright (c) 2019 <br/>
 * @Version: 1.0 <br/>
 * @Modified By: <br/>
 * @Created by lenovo on 2018/12/26 <br/>
 */
public class UserServiceImpl {
    public void saveUser(String username, String password) {
        System.out.println("Cglib  委托类 save user[username=" + username + ",password=" + password + "]");
    }
}
