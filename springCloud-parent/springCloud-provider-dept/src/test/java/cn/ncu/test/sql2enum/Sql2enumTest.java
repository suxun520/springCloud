package cn.ncu.test.sql2enum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import cn.ncu.entity.SqlToEnum;
import cn.ncu.entity.SqlToEnumEnum;
import cn.ncu.mapper.SqlToEnumMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class Sql2enumTest {
   
	
	
	@Autowired
	private  SqlToEnumMapper  sqlToEnumMapper;
	
	//测试   enum类型数据入数据库
	@Test
	public  void  test() {
		sqlToEnumMapper.add(new  SqlToEnum().setName("haha").setType(SqlToEnumEnum.ORG_TEACHER.getCode()));
	}
	
}
