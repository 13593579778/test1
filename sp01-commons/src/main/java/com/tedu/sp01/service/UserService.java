package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	/**
	 * 获取用户数据
	 * */
	User getUser(Integer id);
	/**
	 * 获取积分
	 * */
	void addScore(Integer id, Integer score);
}
