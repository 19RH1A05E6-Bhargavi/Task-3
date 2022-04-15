package com.Transport.Service;

import java.util.List;

import com.Transport.model.Transport;

public interface IService {
	void add(Transport Passenger);
	void delete(Transport Passenger);
	void update(Transport Passenger);
	List<Transport> selection();
}