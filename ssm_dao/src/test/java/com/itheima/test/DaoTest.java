package com.itheima.test;

import com.itheima.dao.ItemsDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *
 * </p>
 *
 * @author: Eric
 * @since: 2020/11/17
 */
public class DaoTest {

    @Test
    public void testdao(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-dao.xml");
        ItemsDao itemsDao = app.getBean(ItemsDao.class);
        System.out.println(itemsDao.findAll());
    }
}
