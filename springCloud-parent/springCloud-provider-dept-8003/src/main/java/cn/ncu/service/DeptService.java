package cn.ncu.service;

import java.util.List;

import cn.ncu.entity.Dept;

public interface DeptService {
   
	
	Boolean  addDept(Dept   dept);
	
	
	Dept  findById(Long  id);
	
	List<Dept>   findAll();
	
	
}
