package com.dao;

import com.entity.LingyuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingyuleixingVO;
import com.entity.view.LingyuleixingView;


/**
 * 领域类型
 * 
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
public interface LingyuleixingDao extends BaseMapper<LingyuleixingEntity> {
	
	List<LingyuleixingVO> selectListVO(@Param("ew") Wrapper<LingyuleixingEntity> wrapper);
	
	LingyuleixingVO selectVO(@Param("ew") Wrapper<LingyuleixingEntity> wrapper);
	
	List<LingyuleixingView> selectListView(@Param("ew") Wrapper<LingyuleixingEntity> wrapper);

	List<LingyuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<LingyuleixingEntity> wrapper);
	
	LingyuleixingView selectView(@Param("ew") Wrapper<LingyuleixingEntity> wrapper);
	

}
