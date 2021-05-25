package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Date;

@Mapper
public interface DMapper {
/*全件取得*/
	public List<Date> find();
/*新規登録*/
	public void insertOne(Date d);
/*削除*/
	public void deleteOne(Date d);
}
