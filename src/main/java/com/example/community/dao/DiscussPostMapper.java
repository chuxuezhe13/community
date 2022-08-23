package com.example.community.dao;

import com.example.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DiscussPostMapper {
    /*分页查询，所有数据，不传递userId则为0*/
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);

    /*查询所有数据的个数，@Param给参数起别名
    * 如果只有一个参数，并且参数在<if>中（动态参数),必须加@Param否则会报错*/
    int selectDiscussPostRows(@Param("userId")int userId);


}
