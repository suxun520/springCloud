package cn.ncu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.ncu.entity.Dept;

@Mapper
public interface DeptMapper {
   
	
	
	Boolean  addDept(Dept   dept);
	
	
	Dept  findById(Long  id);
	
	List<Dept>   findAll();
}
