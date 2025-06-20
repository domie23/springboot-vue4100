package com.dao;

import com.entity.DiscussxuqiutonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuqiutonggaoVO;
import com.entity.view.DiscussxuqiutonggaoView;


/**
 * 需求通告评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
public interface DiscussxuqiutonggaoDao extends BaseMapper<DiscussxuqiutonggaoEntity> {
	
	List<DiscussxuqiutonggaoVO> selectListVO(@Param("ew") Wrapper<DiscussxuqiutonggaoEntity> wrapper);
	
	DiscussxuqiutonggaoVO selectVO(@Param("ew") Wrapper<DiscussxuqiutonggaoEntity> wrapper);
	
	List<DiscussxuqiutonggaoView> selectListView(@Param("ew") Wrapper<DiscussxuqiutonggaoEntity> wrapper);

	List<DiscussxuqiutonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuqiutonggaoEntity> wrapper);
	
	DiscussxuqiutonggaoView selectView(@Param("ew") Wrapper<DiscussxuqiutonggaoEntity> wrapper);
	

}
