package com.helloworld.apispring.model.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import com.helloworld.apispring.model.entity.historia;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class historiaRepositorio {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<historia> getRegistroSituaciones() {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(historia.class);
        return criteria.list();
    }

    public long crearEvento(historia registroEvento) {
        getSessionFactory().getCurrentSession().save(registroEvento);
        return registroEvento.getIdRegistroSituaciones();
    }

    public List<historia> eventosIdCiudadano(int id) {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(historia.class);
        criteria.add(Restrictions.eq("IdCiudadano", id));
        return criteria.list();
    
    }
    
}
