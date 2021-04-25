package com.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 个人信息表
 * </p>
 *
 * @author Beian27
 * @since 2021-04-25
 */
public class Information implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id主键递增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 个人头像
     */
    private String photo;

    /**
     * 姓名下的句子
     */
    private String sentence;

    /**
     * 个人邮箱
     */
    private String email;

    /**
     * github网址
     */
    private String github;

    /**
     * 姓名
     */
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Information{" +
        "id=" + id +
        ", photo=" + photo +
        ", sentence=" + sentence +
        ", email=" + email +
        ", github=" + github +
        ", name=" + name +
        "}";
    }
}
