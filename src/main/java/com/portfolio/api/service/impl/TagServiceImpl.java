package com.portfolio.api.service.impl;

import com.portfolio.api.domain.Tag;
import com.portfolio.api.repository.TagRepository;
import com.portfolio.api.service.TagService;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl extends CommonServiceImpl<Tag, TagRepository> implements TagService {
}
