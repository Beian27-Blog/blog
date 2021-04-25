package com.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 评论表
 * </p>
 *
 * @author Beian27
 * @since 2021-04-25
 */
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id主键递增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 是否开启评论管理
     */
    private String flag;

    /**
     * 如果开启填写APP ID AppID 是该项目的唯一标识符。此 ID 不可变更
     */
    @TableField("appId")
    private String appId;

    /**
     * 如果开启请填写APP Key  AppKey 是公开的访问密钥，适用于在公开的客户端中使用。使用 AppKey 进行的访问受到 ACL 的限制
     */
    @TableField("appKey")
    private String appKey;

    /**
     * 提示评论什么
     */
    private String placeholder;

    /**
     * 占位图片的链接
     */
    @TableField("placePhoto")
    private String placePhoto;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public String getPlacePhoto() {
        return placePhoto;
    }

    public void setPlacePhoto(String placePhoto) {
        this.placePhoto = placePhoto;
    }

    @Override
    public String toString() {
        return "Comment{" +
        "id=" + id +
        ", flag=" + flag +
        ", appId=" + appId +
        ", appKey=" + appKey +
        ", placeholder=" + placeholder +
        ", placePhoto=" + placePhoto +
        "}";
    }
}
