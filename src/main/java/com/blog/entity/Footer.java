package com.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 底部栏目表
 * </p>
 *
 * @author Beian27
 * @since 2021-04-25
 */
public class Footer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id递增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 底部about
     */
    private String about;

    /**
     * 底部备案号
     */
    private String number;

    /**
     * 资讯著作权
     */
    private String copyright;

    /**
     * 技术支持
     */
    private String powerby;

    /**
     * 博客的超链接
     */
    private String byurl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getPowerby() {
        return powerby;
    }

    public void setPowerby(String powerby) {
        this.powerby = powerby;
    }

    public String getByurl() {
        return byurl;
    }

    public void setByurl(String byurl) {
        this.byurl = byurl;
    }

    @Override
    public String toString() {
        return "Footer{" +
        "id=" + id +
        ", about=" + about +
        ", number=" + number +
        ", copyright=" + copyright +
        ", powerby=" + powerby +
        ", byurl=" + byurl +
        "}";
    }
}
