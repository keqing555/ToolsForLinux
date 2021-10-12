package com.dubbo.service;

import com.dubbo.bean.Pool;

import java.util.List;

public interface PoolService {
    Pool getPool();

    List<Pool> getPools(int num);
}
