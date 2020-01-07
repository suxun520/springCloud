package cn.ncu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.ncu.entity.Dept;
import cn.ncu.service.DeptService;

@RestController
public class DeptController {
   @Autowired
   private  DeptService  deptService;
	
	
	@PostMapping("/dept/add")
	public   Boolean  addDept(@RequestBody Dept  dept) {
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
	
	//服务发现接口   用来查询服务的相关信息
	@Autowired
	private  DiscoveryClient  discoveryClient;
    
	
	@GetMapping("/dept/discovery")
	public    Object   serviceDiscovery() {
		List<String> services = discoveryClient.getServices();
		List<ServiceInstance> instances = discoveryClient.getInstances(services.get(0));
		for (ServiceInstance serviceInstance : instances) {
			System.err.println(serviceInstance.getServiceId()+"\t"+serviceInstance.getHost()+"\t"+serviceInstance.getPort()+"\t"+serviceInstance.getUri());
		}
		
		return     this.discoveryClient;
	}	
	
}
