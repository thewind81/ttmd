package vn.topica.ttmd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.topica.ttmd.bo.Test;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public Test doInsert(Test test) {
        try {
            test.setName("Test " + System.currentTimeMillis());
            entityManager.persist(test);
        } finally {
            return test;
        }
    }
}
