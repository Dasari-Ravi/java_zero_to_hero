package com.java.core.oops.basic.account.book;

public class Book {
	private String lessons;
	private String topics;
	private int pages;
	private int cost;

	public String getLessons() {
		return lessons;
	}

	public void setLessons(String lessons) {
		this.lessons = lessons;
	}

	public String getTopics() {
		return topics;
	}

	public void setTopics(String topics) {// <setter>return type should be always void
		this.topics = topics;// contains argumental method
		// setter always takes values
	}

	public int getPages() {// <getter>return type should not be void .
		return pages;// no argumetal method
		// getter always gives value
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
