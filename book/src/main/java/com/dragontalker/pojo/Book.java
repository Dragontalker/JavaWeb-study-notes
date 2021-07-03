package com.dragontalker.pojo;

import java.math.BigDecimal;

public class Book {
	
	private Integer id;
	private String name;
	private String author;
	private BigDecimal price;
	private Integer sales;
	private Integer stock;
	private String imgPath = "static/img/default.jpg";

	public Book() {}

	public Book(Integer id, String name, String author, BigDecimal price, Integer sales, Integer stock,
			String imgPath) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.sales = sales;
		this.stock = stock;
		this.imgPath = imgPath;
	}
	
}
