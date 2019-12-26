package cn.ncu.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.ncu.entity.Dept;

@RestController
public class DeptConsumerController {
   
	
	
	private  static  final   String PROVIDER_URL_PREFIX="http://localhost:8001/";
	
	@Autowired
	private   RestTemplate  restTemplate;
	
	
	@RequestMapping("/consumer/dept/add")
	public   Boolean   add(Dept  dept) {
	return 	  restTemplate.postForObject(PROVIDER_URL_PREFIX+"dept/add", dept, Boolean.class);
	}
	
	@RequestMapping("/consumer/dept/find/{id}")
	public   Dept   get(@PathVariable Long  id) {
		return  restTemplate.getForObject(PROVIDER_URL_PREFIX+"dept/find/"+id, Dept.class);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/consumer/dept/list")
	public   List<Dept>   list() {
		return  restTemplate.getForObject(PROVIDER_URL_PREFIX+"dept/list", List.class);
	}
}
