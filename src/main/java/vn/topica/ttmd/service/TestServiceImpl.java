package vn.topica.ttmd.service;

import org.springframework.stereotype.Service;
import vn.topica.ttmd.bo.Test;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
@Transactional
public class TestServiceImpl implements TestService {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Test doInsert(Test test) {
        try {
            test.setName("Test " + System.currentTimeMillis());
            entityManager.persist(test);
        } finally {
            return test;
        }
    }
}
