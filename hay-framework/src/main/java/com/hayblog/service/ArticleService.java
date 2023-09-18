package com.hayblog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hayblog.domain.ResponseResult;
import com.hayblog.domain.entity.Article;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();
}
