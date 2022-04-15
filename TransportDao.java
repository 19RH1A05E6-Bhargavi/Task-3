package com.Transport.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Transport.model.*;
@Repository
public class TransportDao implements ITransportDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(Transport Passenger) {
		sessionFactory.getCurrentSession().save(Passenger);
		
	}

	@Override
	public void delete(Transport Passenger) {
		sessionFactory.getCurrentSession().delete(Passenger);
		
	}

	@Override
	public void update(Transport Passenger) {
		sessionFactory.getCurrentSession().update(Passenger);
		
	}

	@Override
	public List<Transport> selection() {
		List<Transport> cr = (List<Transport>) sessionFactory.getCurrentSession()
                .createCriteria(Transport.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        return Passenger;
	}
	
	
	
}