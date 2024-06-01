package com.entities;

import java.sql.Date;

public class Todo 
{
	private String todotitle;
	private String todocontent;
	private Date tododate;
	
	
	
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Todo(String todotitle, String todocontent, Date tododate) {
		super();
		this.todotitle = todotitle;
		this.todocontent = todocontent;
		this.tododate = tododate;
	}

	public String getTodotitle() {
		return todotitle;
	}

	public void setTodotitle(String todotitle) {
		this.todotitle = todotitle;
	}

	public String getTodocontent() {
		return todocontent;
	}

	public void setTodocontent(String todocontent) {
		this.todocontent = todocontent;
	}

	public Date getTododate() {
		return tododate;
	}
	
	public void setTododate(Date tododate) {
		this.tododate = tododate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getTodotitle()+" : "+this.todocontent;
	}

	
	
	

}
