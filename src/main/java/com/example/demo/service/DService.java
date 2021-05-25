package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Date;
import com.example.demo.repository.DMapper;

@Service
public class DService {
	@Autowired
	private DMapper mapper;
/*全件取得*/
	public List<Date> getList() {
		return mapper.find();
	}
/*新規登録*/
	public void insertOne(Date d) {
		mapper.insertOne(d);
	}
/*削除*/
	public void deleteOne(Date d) {
		mapper.deleteOne(d);
	}
}
