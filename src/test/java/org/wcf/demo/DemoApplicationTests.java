package org.wcf.demo;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.wcf.demo.utils.SqlSessionFactoryUtils;

import java.util.Properties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Value("${roncoo.secret}")
    private String recret;
    @Value("${roncoo.number}")
    private int number;
    @Value("${roncoo.bignumber}")
    private long bignumber;
    @Value("${roncoo.uuid}")
    private String uuid;
    @Value("${test}")
    private String  test;
    @Test
    public void contextLoads() {
        System.out.println(recret);
        System.out.println(number);
        System.out.println(bignumber);
        System.out.println(uuid);
        System.out.println(test);
        Properties p=System.getProperties();
        for(Object key:p.keySet()){
            System.out.println(key+":"+p.getProperty((String) key));
        }
    }
    @Test
    public void test(){
        SqlSession sqlSession=null;
        sqlSession=SqlSessionFactoryUtils.openSqlSession();
    }

}
