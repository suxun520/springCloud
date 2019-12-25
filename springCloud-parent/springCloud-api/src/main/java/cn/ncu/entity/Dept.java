package cn.ncu.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@SuppressWarnings("all")
@Data
@NoArgsConstructor
@Accessors(chain = true)   //链式赋值  见main方法
public class Dept  implements  Serializable{
   
	
	
	private   Long   deptno;  //主键
	
	private  String  dname;  //部门名称
	
	private   String   dbSource;  //对应哪个数据库  微服务可以一个服务对应一个数据库

	public Dept(String dname) {
		super();
		this.dname = dname;
	}
	
	/*	public static void main(String[] args) {
			Dept dept = new  Dept().setDeptno(1l).setDname("db01").setDb_source("db01");
			System.out.println(dept);
		}*/
	
}
