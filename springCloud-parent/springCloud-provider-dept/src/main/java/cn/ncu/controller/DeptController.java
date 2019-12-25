package cn.ncu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.ncu.entity.Dept;
import cn.ncu.service.DeptService;

@RestController
public class DeptController {
   @Autowired
   private  DeptService  deptService;
	
	
	@PostMapping("/dept/add")
	public   Boolean  addDept(Dept  dept) {
		return  deptService.addDept(dept);
	}
	
	
	@GetMapping("/dept/find/{id}")
	public   Dept    findById(@PathVariable   Long   id) {
		return   deptService.findById(id);
	}
	
	
	@GetMapping("/dept/list")
	public   List<Dept>   findAll(){
		return  deptService.findAll();
	}
	
	
}
