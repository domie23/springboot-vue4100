package com.entity.view;

import com.entity.DiscussxuqiutonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 需求通告评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
@TableName("discussxuqiutonggao")
public class DiscussxuqiutonggaoView  extends DiscussxuqiutonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxuqiutonggaoView(){
	}
 
 	public DiscussxuqiutonggaoView(DiscussxuqiutonggaoEntity discussxuqiutonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, discussxuqiutonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
