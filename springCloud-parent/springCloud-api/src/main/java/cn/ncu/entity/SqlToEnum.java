package cn.ncu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**   
* <p>Title: SqlToEnum.java</p>   
* <p>Description:为了测试枚举类型的数据加入数据库    应用场景：数据库type  int类型  枚举值           业务封装时不应该setType(1)  而应该跟枚举挂钩 </p>   
* @author 经成  
* @date 2019年12月29日 下午12:08:32  
*/  
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SqlToEnum {
   
	
	
	private   Integer  id;
	
	private Integer   type;
	
	private  String  name;
}
