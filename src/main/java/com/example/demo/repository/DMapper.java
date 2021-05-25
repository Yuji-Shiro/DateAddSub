package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.domain.Date;

@Mapper
public interface DMapper {
/*全件取得*/
	public List<Date> find();
/*1件取得*/
	public Date getOne(int no);
/*新規登録*/
	public void insertOne(Date d);
/*詳細変更*/
	public void updateOne(@Param("no")int no,@Param("dateId")String dateId, @Param("dateName")String dateName, @Param("yearCalc")int yearCalc, @Param("monthCalc")int monthCalc, @Param("dayCalc")int dayCalc);
/*削除*/
	public void deleteOne(Date d);
}
