package com.hayblog.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hayblog.domain.ResponseResult;
import com.hayblog.domain.entity.Article;
import com.hayblog.mapper.ArticleMapper;
import com.hayblog.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

    @Override
    public ResponseResult hotArticleList() {
        //查询热门文章
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        //必须是正式文章
        //按照浏览量进行排序
        //最多只查询十条
        queryWrapper.eq(Article::getStatus, 0);
        queryWrapper.orderByAsc(Article::getViewCount);
        Page<Article> page = new Page<>(1, 10);
        page(page, queryWrapper);
        List<Article> articles = page.getRecords();
        return ResponseResult.okResult(articles);
    }
}
