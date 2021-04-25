package com.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 博客文章表
 * </p>
 *
 * @author Beian27
 * @since 2021-04-25
 */
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id递增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章封面图路径
     */
    private String photo;

    /**
     * 文章浏览量
     */
    private Integer view;

    /**
     * 博客标签，多个标签使用，分割开
     */
    private String tags;

    /**
     * 博客所属目录
     */
    private String catalog;

    /**
     * 上传时间(按照时间顺序取出博客)
     */
    @TableField("uploadTime")
    private LocalDateTime uploadTime;

    /**
     * 文章内容路径
     */
    private String content;

    /**
     * 最后更改时间
     */
    @TableField("updateTime")
    private LocalDateTime updateTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public LocalDateTime getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(LocalDateTime uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Blog{" +
        "id=" + id +
        ", title=" + title +
        ", photo=" + photo +
        ", view=" + view +
        ", tags=" + tags +
        ", catalog=" + catalog +
        ", uploadTime=" + uploadTime +
        ", content=" + content +
        ", updateTime=" + updateTime +
        "}";
    }
}
