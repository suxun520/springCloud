package cn.ncu.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.ncu.entity.SqlToEnum;
@Mapper
public interface SqlToEnumMapper {
   
	
	
	  void  add(SqlToEnum  sqlToEnum);
}
