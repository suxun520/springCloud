package cn.ncu.entity;

import lombok.Getter;

@Getter
public enum SqlToEnumEnum {
  
		SUPER_ADMIN(1),           ORG_ADMIN(2),  ORG_TEACHER(3);
	
		private Integer code;
	
	private   SqlToEnumEnum(Integer  code) {
			this.code=code;
		}
	
	

	
	
	
    
    
	/*	public static void main(String[] args) {
		System.out.println(SqlToEnumEnum.ORG_ADMIN.getCode());
		}*/
	
	

	
	
	
	
	
	
	
}
