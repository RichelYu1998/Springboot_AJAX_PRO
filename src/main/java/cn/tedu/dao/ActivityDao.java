package cn.tedu.dao;

import cn.tedu.pojo.Activity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface ActivityDao {
    /*
    * 查询所有信息
    * */
    @Select("select * from tb_activity order by createdTime desc")
    List<Activity> findActivity();
    /*
     * 删除信息
     * */
    @Delete("delete from tb_activity where id=#{id}")
    int doDeleteById(Long id);
    /*
    * 新增数据
    * */
    int insertObject(Activity entity);
}
