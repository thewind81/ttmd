package vn.topica.ttmd.service;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.topica.ttmd.bo.Test;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Test doInsert(Test test) {
        try {
            sessionFactory.getCurrentSession().save(test);
        } catch (HibernateException e) {

        } finally {
            return test;
        }
    }
}
