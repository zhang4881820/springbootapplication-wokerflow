package com.honghh.bootfirst.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * ClassName: MyInfo
 * Description:
 *
 * @author honghh
 * @date 2019/02/19 16:24
 */
@Data
@TableName(value = "my_info")
public class MyInfo {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer age;
}
