package com.grizzly.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.grizzly.model.AppInform;

@Repository("developerMapper")
@Mapper
public interface DeveloperMapper {
	public List<AppInform> allAppInform();
}
