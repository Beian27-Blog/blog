package com.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 目录表
 * </p>
 *
 * @author Beian27
 * @since 2021-04-25
 */
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id主键递增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 分类,采用,分割开显示出来
     */
    private String name;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Category{" +
        "id=" + id +
        ", name=" + name +
        ", createTime=" + createTime +
        "}";
    }
}
