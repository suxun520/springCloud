package cn.ncu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ncu.entity.Dept;
import cn.ncu.mapper.DeptMapper;
import cn.ncu.service.DeptService;
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private  DeptMapper  deptMapper;
	
	
	@Override
	public Boolean addDept(Dept dept) {
		return deptMapper.addDept(dept);
	}

	@Override
	public Dept findById(Long id) {
		return deptMapper.findById(id);
	}

	@Override
	public List<Dept> findAll() {
		List<Dept> findAll = deptMapper.findAll();
		return findAll;
	}

}
