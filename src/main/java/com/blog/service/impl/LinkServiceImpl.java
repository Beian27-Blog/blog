package com.blog.service.impl;

import com.blog.entity.Link;
import com.blog.mapper.LinkMapper;
import com.blog.service.LinkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 友情链接表 服务实现类
 * </p>
 *
 * @author Beian27
 * @since 2021-04-25
 */
@Service
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements LinkService {

}
