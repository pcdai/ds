package com.example.ds.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

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

    public static void main(String[] args) throws Exception {
        try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\3de\\2.txt");
             FileInputStream fileInputStream = new FileInputStream("C:\\3de\\1.txt");) {
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buf)) > 0) {
                fileOutputStream.write(buf, 0, bytesRead);
            }
        }
    }
}
