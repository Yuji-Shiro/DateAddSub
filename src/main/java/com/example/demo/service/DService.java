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
/*1件取得*/
	public Date getOne(int no) {
		return mapper.getOne(no);
	}
/*新規登録*/
	public void insertOne(Date d) {
		mapper.insertOne(d);
	}
/*詳細変更*/
	public void updateOne(int no, String dateId, String dateName, int yearCalc, int monthCalc, int dayCalc) {
		mapper.updateOne(no, dateId, dateName, yearCalc, monthCalc, dayCalc);
	}
/*削除*/
	public void deleteOne(Date d) {
		mapper.deleteOne(d);
	}
}
