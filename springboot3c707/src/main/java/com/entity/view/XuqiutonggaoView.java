package com.entity.view;

import com.entity.XuqiutonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 需求通告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
@TableName("xuqiutonggao")
public class XuqiutonggaoView  extends XuqiutonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuqiutonggaoView(){
	}
 
 	public XuqiutonggaoView(XuqiutonggaoEntity xuqiutonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, xuqiutonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
