package com.entity.view;

import com.entity.YouzhianliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 优质案例
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
@TableName("youzhianli")
public class YouzhianliView  extends YouzhianliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouzhianliView(){
	}
 
 	public YouzhianliView(YouzhianliEntity youzhianliEntity){
 	try {
			BeanUtils.copyProperties(this, youzhianliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
