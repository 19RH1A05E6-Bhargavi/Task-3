package com.Transport.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Transport.dao.*;
import com.Transport.model.*;

@Service
public class Service implements IService {

	@Autowired
	public ITransportDao Dao;

	@Transactional
	public void add(Transport Passenger) {
		Dao.add(Passenger);
		
	}

	@Transactional
	public void delete(Transport Passenger) {
		Dao.delete(Passenger);
		
	}

	@Transactional
	public void update(Transport Passenger) {
		Dao.update(Passenger);
	}

	@Transactional
	public List<Transport> selection() {
		return Dao.selection();
	}
	
	
	
}