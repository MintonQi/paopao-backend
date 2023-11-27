package com.minton.paopao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.minton.paopao.model.domain.Tag;
import com.minton.paopao.mapper.TagMapper;
import com.minton.paopao.service.TagService;
import org.springframework.stereotype.Service;

/**
* @author 13693
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2023-11-27 10:58:36
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




