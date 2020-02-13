package com.testes.restController;

import java.util.ArrayList;
import java.util.List;

import org.elasticsearch.index.query.QueryBuilders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.testes.entity.EsItemEntity;
import com.testes.service.EsItemRepository;
import com.testes.utils.RenderResultUtil;

@RestController
@RequestMapping("esItem")
public class EsItemController {
    
    private Logger logger = LoggerFactory.getLogger(EsItemController.class);

    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    EsItemRepository esItemRepository;

//    @GetMapping("testCreateIndex")
//    public void testCreateIndex() {
//        elasticsearchTemplate.createIndex(EsItemEntity.class);
//    }

//    @GetMapping("testDeleteIndex")
//    public void testDeleteIndex() {
//        elasticsearchTemplate.deleteIndex(EsItemEntity.class);
//    }

    @GetMapping("insert")
    public void insert() {
        EsItemEntity item = new EsItemEntity(1L, "小米手机7", "手机", "小米", 3499.00,
                "http://image.baidu.com/13123.jpg");
        esItemRepository.save(item);
    }

    @GetMapping("insertList")
    public void insertList() {
        List<EsItemEntity> list = new ArrayList<>();
        list.add(new EsItemEntity(4L, "华为META30", " 手机", "华为", 6499.00,
                "http://image.baidu.com/13123.jpg"));
        list.add(new EsItemEntity(5L, "小米手机9", " 手机", "小米", 7499.00,
                "http://image.baidu.com/13123.jpg"));
        list.add(new EsItemEntity(6L, "华为P30", " 手机", "华为", 8499.00,
                "http://image.baidu.com/13123.jpg"));
        list.add(new EsItemEntity(7L, "华为手机META10", " 手机", "小米", 9499.00,
                "http://image.baidu.com/13123.jpg"));
        list.add(new EsItemEntity(8L, "VIVO3", " 手机", "VIVO", 1499.00,
                "http://image.baidu.com/13123.jpg"));
        list.add(new EsItemEntity(9L, "华为META10", " 手机", "魅族", 2499.00,
                "http://image.baidu.com/13123.jpg"));
        list.add(new EsItemEntity(10L, "苹果手机iphone4", " 手机", "苹果", 3399.00,
                "http://image.baidu.com/13123.jpg"));
        list.add(new EsItemEntity(11L, "苹果手机iphone5", " 手机", "苹果", 12099.00,
                "http://image.baidu.com/13123.jpg"));
        list.add(new EsItemEntity(12L, "苹果手机iphone6", " 手机", "苹果", 34299.00,
                "http://image.baidu.com/13123.jpg"));
        list.add(new EsItemEntity(13L, "苹果手机iphone7", " 手机", "苹果", 6699.00,
                "http://image.baidu.com/13123.jpg"));
        // 接收对象集合，实现批量新增
        esItemRepository.saveAll(list);
    }

    @GetMapping("testMatchQuery")
    public JSON testMatchQuery() {
        // 构建查询条件
        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
        // 添加基本分词查询
        queryBuilder.withQuery(QueryBuilders.matchQuery("title", "小米手机"));
        // 搜索，获取结果
        Page<EsItemEntity> items = esItemRepository.search(queryBuilder.build());
        logger.info("#items# : {}", JSON.toJSONString(items));
        List<EsItemEntity> returnList = items.getContent();
        // 总条数
        System.out.println("total = " + items.getTotalElements());
        for (EsItemEntity item : items) {
            System.out.println(JSON.toJSONString(item));
        }
        return RenderResultUtil.renderSuccess(returnList);
    }

}
