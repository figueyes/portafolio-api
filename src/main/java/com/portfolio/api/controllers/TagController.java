package com.portfolio.api.controllers;

import com.portfolio.api.domain.Tag;
import com.portfolio.api.service.TagService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tags", produces = MediaType.APPLICATION_JSON_VALUE)
public class TagController extends CommonController<Tag, TagService> {
}
