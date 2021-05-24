package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Date;
import com.example.demo.repository.DMapper;

@Service
public class DService {
	@Autowired
	DMapper mapper;

	public List<Date> getList() {
		return mapper.find();
	}

}
