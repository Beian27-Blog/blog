package com.blog.service.impl;

import com.blog.entity.Description;
import com.blog.mapper.DescriptionMapper;
import com.blog.service.DescriptionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 个人表述表 服务实现类
 * </p>
 *
 * @author Beian27
 * @since 2021-04-25
 */
@Service
public class DescriptionServiceImpl extends ServiceImpl<DescriptionMapper, Description> implements DescriptionService {

}
