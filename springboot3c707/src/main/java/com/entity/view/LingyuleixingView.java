package com.entity.view;

import com.entity.LingyuleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 领域类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
@TableName("lingyuleixing")
public class LingyuleixingView  extends LingyuleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LingyuleixingView(){
	}
 
 	public LingyuleixingView(LingyuleixingEntity lingyuleixingEntity){
 	try {
			BeanUtils.copyProperties(this, lingyuleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
