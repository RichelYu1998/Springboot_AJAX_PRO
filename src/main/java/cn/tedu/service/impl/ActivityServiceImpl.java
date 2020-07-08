package cn.tedu.service.impl;

import cn.tedu.dao.ActivityDao;
import cn.tedu.pojo.Activity;
import cn.tedu.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityDao activityDao;
    /*
    * 查询所有信息
    * */
    @Override
    public List<Activity> findActivity() {
        return activityDao.findActivity();
    }

    @Override
    public int doDeleteById(Long id) {
        return activityDao.doDeleteById(id);
    }
}
