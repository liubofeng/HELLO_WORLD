package com.example.learnmybatis.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import com.example.learnmybatis.entity.User;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface UserMapper {

    User Sel(int id);
}