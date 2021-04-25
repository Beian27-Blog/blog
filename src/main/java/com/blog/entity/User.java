package com.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 个人信息表
 * </p>
 *
 * @author Beian27
 * @since 2021-04-25
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id递增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 登录后台管理账号一般只允许用邮箱注册
     */
    private String account;

    /**
     * 登录后台管理密码
     */
    private String password;

    /**
     * 密保问题
     */
    private String problem;

    /**
     * 密保答案
     */
    private String answer;

    /**
     * 用户创建时间,也就是博客创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 身份
     */
    private String identify;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", account=" + account +
        ", password=" + password +
        ", problem=" + problem +
        ", answer=" + answer +
        ", createTime=" + createTime +
        ", identify=" + identify +
        "}";
    }
}
