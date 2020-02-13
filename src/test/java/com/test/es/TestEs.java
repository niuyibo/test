//package com.test.es;
//
//import java.util.Iterator;
//import java.util.List;
//
//import org.elasticsearch.index.query.QueryBuilders;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import com.alibaba.fastjson.JSON;
//import com.testes.TestesProviderApp;
//import com.testes.entity.EsItemEntity;
//import com.testes.service.EsItemRepository;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = TestesProviderApp.class)
//@WebAppConfiguration
//public class TestEs {
//
//    @Autowired
//    ElasticsearchTemplate elasticsearchTemplate;
//
//    @Autowired
//    EsItemRepository esItemRepository;
//
//    @Before
//    public void beforeTest() {
//        System.out.println("-------------- start test ----------------");
//    }
//
//    /**
//     * 更新文档
//     */
//    @Ignore
//    @Test
//    public void testUpdate() {
//        EsItemEntity esItemEntity = new EsItemEntity(1L, "苹果XSMax", " 手机",
//                "小米", 3499.00, "http://image.baidu.com/13123.jpg");
//        esItemRepository.save(esItemEntity);
//    }
//
//    /**
//     * match查询
//     */
//    @Ignore
//    @Test
//    public void testMatchQuery() {
//        // 构建查询条件
//        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
//        // 添加基本分词查询
//        queryBuilder.withQuery(QueryBuilders.matchQuery("title", "小米手机"));
//        // 搜索，获取结果
//        Page<EsItemEntity> items = esItemRepository.search(queryBuilder.build());
//        List<EsItemEntity> returnList = items.getContent();
//        for (EsItemEntity item : items) {
//            System.out.println(JSON.toJSONString(item));
//        }
//        System.out.println("#returnList# : " + JSON.toJSONString(returnList));
//        System.out.println("#total# = " + items.getTotalElements());
//    }
//
//    /**
//     * 查询全部并排序
//     */
//    @Test
//    public void testQueryAll() {
//        Iterable<EsItemEntity> it = esItemRepository.findAll(Sort.by("price")
//                .descending());
//        System.out.println("#content# : " + JSON.toJSONString(it));
//        for (EsItemEntity esItemEntity : it) {
//            System.out.println(esItemEntity.getPrice());
//        }
//    }
//
//    @After
//    public void afterTest() {
//        System.out.println("--------------- end test -----------------");
//    }
//
//}
