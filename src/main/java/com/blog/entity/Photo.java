package com.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Beian27
 * @since 2021-04-25
 */
public class Photo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键递增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 友情链接页上面的图片
     */
    @TableField("linkPhoto")
    private String linkPhoto;

    /**
     * 关于页上面的图片
     */
    @TableField("aboutPhoto")
    private String aboutPhoto;

    /**
     * 标签页上面的图片
     */
    @TableField("tagPhoto")
    private String tagPhoto;

    /**
     * 首页上面的图片
     */
    @TableField("indexPhoto")
    private String indexPhoto;

    /**
     * 目录页上面的图片
     */
    @TableField("categoryPhoto")
    private String categoryPhoto;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLinkPhoto() {
        return linkPhoto;
    }

    public void setLinkPhoto(String linkPhoto) {
        this.linkPhoto = linkPhoto;
    }

    public String getAboutPhoto() {
        return aboutPhoto;
    }

    public void setAboutPhoto(String aboutPhoto) {
        this.aboutPhoto = aboutPhoto;
    }

    public String getTagPhoto() {
        return tagPhoto;
    }

    public void setTagPhoto(String tagPhoto) {
        this.tagPhoto = tagPhoto;
    }

    public String getIndexPhoto() {
        return indexPhoto;
    }

    public void setIndexPhoto(String indexPhoto) {
        this.indexPhoto = indexPhoto;
    }

    public String getCategoryPhoto() {
        return categoryPhoto;
    }

    public void setCategoryPhoto(String categoryPhoto) {
        this.categoryPhoto = categoryPhoto;
    }

    @Override
    public String toString() {
        return "Photo{" +
        "id=" + id +
        ", linkPhoto=" + linkPhoto +
        ", aboutPhoto=" + aboutPhoto +
        ", tagPhoto=" + tagPhoto +
        ", indexPhoto=" + indexPhoto +
        ", categoryPhoto=" + categoryPhoto +
        "}";
    }
}
