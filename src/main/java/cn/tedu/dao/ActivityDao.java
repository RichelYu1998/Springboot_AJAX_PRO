package cn.tedu.dao;

import cn.tedu.pojo.Activity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ActivityDao {
    /*
    * 查询所有信息
    * */
    @Select("select * from tb_activity")
    List<Activity> findActivity();
}
