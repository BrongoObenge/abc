package com;

import javax.annotation.Resource;

/**
 * Created by j on 1/16/17.
 */
public class EServiceImpl implements EService{
    @Resource
    ERepo repo;

    @Override
    public void save(E e) {
        repo.save(e);
    }
}
