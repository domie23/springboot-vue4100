package com.dao;

import com.entity.DiscussyouzhianliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyouzhianliVO;
import com.entity.view.DiscussyouzhianliView;


/**
 * 优质案例评论表
 * 
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
public interface DiscussyouzhianliDao extends BaseMapper<DiscussyouzhianliEntity> {
	
	List<DiscussyouzhianliVO> selectListVO(@Param("ew") Wrapper<DiscussyouzhianliEntity> wrapper);
	
	DiscussyouzhianliVO selectVO(@Param("ew") Wrapper<DiscussyouzhianliEntity> wrapper);
	
	List<DiscussyouzhianliView> selectListView(@Param("ew") Wrapper<DiscussyouzhianliEntity> wrapper);

	List<DiscussyouzhianliView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyouzhianliEntity> wrapper);
	
	DiscussyouzhianliView selectView(@Param("ew") Wrapper<DiscussyouzhianliEntity> wrapper);
	

}
