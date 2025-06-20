package com.dao;

import com.entity.XuqiutonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuqiutonggaoVO;
import com.entity.view.XuqiutonggaoView;


/**
 * 需求通告
 * 
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
public interface XuqiutonggaoDao extends BaseMapper<XuqiutonggaoEntity> {
	
	List<XuqiutonggaoVO> selectListVO(@Param("ew") Wrapper<XuqiutonggaoEntity> wrapper);
	
	XuqiutonggaoVO selectVO(@Param("ew") Wrapper<XuqiutonggaoEntity> wrapper);
	
	List<XuqiutonggaoView> selectListView(@Param("ew") Wrapper<XuqiutonggaoEntity> wrapper);

	List<XuqiutonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<XuqiutonggaoEntity> wrapper);
	
	XuqiutonggaoView selectView(@Param("ew") Wrapper<XuqiutonggaoEntity> wrapper);
	

}
