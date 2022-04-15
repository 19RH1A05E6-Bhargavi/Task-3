package com.Transport.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.Transport.model.*;
@Repository
public interface ITransportDao {
	
	void add(Transport Passsenger);
	void delete(Transport Passenger);
	void update(Transport Passenger);
	List<Transport> selection();
}