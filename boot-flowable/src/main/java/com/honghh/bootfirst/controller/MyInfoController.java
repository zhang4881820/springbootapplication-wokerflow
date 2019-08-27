package com.honghh.bootfirst.controller;

import com.honghh.bootfirst.entity.MyInfo;
import com.honghh.bootfirst.service.MyInfoService;
import com.honghh.bootfirst.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * ClassName: MyInfoController
 * Description:
 *
 * @author honghh
 * @date 2019/02/19 17:20
 */
@RestController
public class MyInfoController {
    @Resource
    MyInfoService myInfoService;

    @GetMapping("myInfo")
    public R myInfo(@RequestParam Integer id) {
        MyInfo myInfo = myInfoService.getById(id);
        return R.ok().put("myInfo",myInfo);
    }
}
