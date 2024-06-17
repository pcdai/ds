package com.example.ds.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseEntity {
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    @TableField(property = "createTime", fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    private String createBy;
    @TableField(property = "updateTime", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
    private String updateBy;
    private String remark;
}
