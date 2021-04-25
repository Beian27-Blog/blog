package com.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 站点信息表
 * </p>
 *
 * @author Beian27
 * @since 2021-04-25
 */
public class Site implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 站点名称
     */
    private String name;

    /**
     * id主键递增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 站点描述
     */
    private String description;

    /**
     * 站点Logo图片路径
     */
    private String logo;

    /**
     * 站点favico图片路径
     */
    private String favicon;

    /**
     * 站点公告
     */
    private String notice;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getFavicon() {
        return favicon;
    }

    public void setFavicon(String favicon) {
        this.favicon = favicon;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    @Override
    public String toString() {
        return "Site{" +
        "name=" + name +
        ", id=" + id +
        ", description=" + description +
        ", logo=" + logo +
        ", favicon=" + favicon +
        ", notice=" + notice +
        "}";
    }
}
