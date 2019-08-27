package com.honghh.bootfirst.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.honghh.bootfirst.dao.MyInfoMapper;
import com.honghh.bootfirst.entity.MyInfo;
import com.honghh.bootfirst.service.MyInfoService;
import org.springframework.stereotype.Service;


/**
 * ClassName: MyInfoService
 * Description:
 *
 * @author honghh
 * @date 2019/02/19 17:12
 */
@Service("myInfoService")
public class MyInfoServiceImpl extends ServiceImpl<MyInfoMapper,MyInfo> implements MyInfoService {
    @Override
    public MyInfo getById(int id) {
        return baseMapper.selectById(id);
    }
}
