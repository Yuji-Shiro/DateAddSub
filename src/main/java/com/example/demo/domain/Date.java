package com.example.demo.domain;

import lombok.Data;

@Data
public class Date {
	private int no;
	private String dateId;
	private String dateName;
	private int yearCalc;
	private int monthCalc;
	private int dayCalc;
}
