package com.testes.config;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

public final class ModuloShardingTableAlgorithm implements PreciseShardingAlgorithm<Long>{

    @Override
    public String doSharding(final Collection<String> tableNames,
            final PreciseShardingValue<Long> shardingValue) {
        for (String each : tableNames) {
            if(each.endsWith(String.valueOf(shardingValue.getValue() % 8))){
                return each;
            }
        }
        throw new UnsupportedOperationException(); 
    }

}
