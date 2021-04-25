package com.blog.service.impl;

import com.blog.entity.Information;
import com.blog.mapper.InformationMapper;
import com.blog.service.InformationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 个人信息表 服务实现类
 * </p>
 *
 * @author Beian27
 * @since 2021-04-25
 */
@Service
public class InformationServiceImpl extends ServiceImpl<InformationMapper, Information> implements InformationService {

}
