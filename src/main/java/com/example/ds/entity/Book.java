package com.example.ds.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName
public class Book extends BaseEntity {

    private String name;
    private String author;
    private Double price;
    private Integer count;
    private String code;
    private String image;

    public static void main(String[] args) {
        new Book();
        new Book();
        new Book();
        new Book();
        new Book();

    }


}
