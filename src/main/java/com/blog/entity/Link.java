package com.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 友情链接表
 * </p>
 *
 * @author Beian27
 * @since 2021-04-25
 */
public class Link implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id递增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 友链图片
     */
    private String hphoto;

    /**
     * 友情链接，写网址时提示必须填写的是https: 不加www.的网址
     */
    private String url;

    /**
     * 友链名称
     */
    private String name;

    /**
     * 友链介绍
     */
    private String introduce;

    /**
     * 添加时间
     */
    private LocalDateTime createTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHphoto() {
        return hphoto;
    }

    public void setHphoto(String hphoto) {
        this.hphoto = hphoto;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Link{" +
        "id=" + id +
        ", hphoto=" + hphoto +
        ", url=" + url +
        ", name=" + name +
        ", introduce=" + introduce +
        ", createTime=" + createTime +
        "}";
    }
}
