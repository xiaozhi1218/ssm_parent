package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author: Eric
 * @since: 2020/11/17
 */
public interface ItemsDao {

    List<Items> findAll();
}
