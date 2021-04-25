package com.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 个人表述表
 * </p>
 *
 * @author Beian27
 * @since 2021-04-25
 */
public class Description implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id递增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 昵称
     */
    private String name;

    /**
     * 星座
     */
    private String constellation;

    /**
     * 教育经历
     */
    private String experience;

    /**
     * 最喜欢的一句话
     */
    private String sentence;

    /**
     * 偶像
     */
    private String idol;

    /**
     * 性格
     */
    private String character1;

    /**
     * 联系方式
     */
    private String contact;

    /**
     * 个人详细介绍
     */
    private String information;

    /**
     * 开发语言介绍,及工作
     */
    private String language;


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

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getIdol() {
        return idol;
    }

    public void setIdol(String idol) {
        this.idol = idol;
    }

    public String getCharacter1() {
        return character1;
    }

    public void setCharacter1(String character1) {
        this.character1 = character1;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Description{" +
        "id=" + id +
        ", name=" + name +
        ", constellation=" + constellation +
        ", experience=" + experience +
        ", sentence=" + sentence +
        ", idol=" + idol +
        ", character1=" + character1 +
        ", contact=" + contact +
        ", information=" + information +
        ", language=" + language +
        "}";
    }
}
