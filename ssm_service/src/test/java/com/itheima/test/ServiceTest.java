package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.service.ItemsService;
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
public class ServiceTest {

    @Test
    public void testService(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsService itemsService = app.getBean(ItemsService.class);
        System.out.println(itemsService.findAll());
    }
}
