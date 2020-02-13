//package com.testes.restController;
//
//import org.elasticsearch.index.query.QueryBuilders;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.alibaba.fastjson.JSON;
//import com.testes.entity.EsShakespeareEntity;
//import com.testes.service.EsShakespeareRepository;
//
//@RestController
//@RequestMapping("esShakespeare")
//public class EsShakespeareController {
//    
//    @Autowired
//    EsShakespeareRepository esShakespeareRepository;
//    
//    /**
//     * 测试查询
//     * http://127.0.0.1:1216/testes/esShakespeare/list
//     */
//    @GetMapping("list")
//    public JSON list(){
//        // 构建查询条件
//        NativeSearchQueryBuilder queryBuilder = new NativeSearchQueryBuilder();
//        // 添加基本分词查询
//        queryBuilder.withQuery(QueryBuilders.termQuery("text_entry", "all"));
//        // 搜索，获取结果
//        Page<EsShakespeareEntity> items = esShakespeareRepository.search(queryBuilder.build());
//        // 总条数
//        long total = items.getTotalElements();
//        System.out.println("total = " + total);
//        for (EsShakespeareEntity item : items) {
//            System.out.println(item);
//        }
//        return null;
//    }
//}
