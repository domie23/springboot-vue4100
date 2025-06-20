package com.dao;

import com.entity.YouzhianliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouzhianliVO;
import com.entity.view.YouzhianliView;


/**
 * 优质案例
 * 
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
public interface YouzhianliDao extends BaseMapper<YouzhianliEntity> {
	
	List<YouzhianliVO> selectListVO(@Param("ew") Wrapper<YouzhianliEntity> wrapper);
	
	YouzhianliVO selectVO(@Param("ew") Wrapper<YouzhianliEntity> wrapper);
	
	List<YouzhianliView> selectListView(@Param("ew") Wrapper<YouzhianliEntity> wrapper);

	List<YouzhianliView> selectListView(Pagination page,@Param("ew") Wrapper<YouzhianliEntity> wrapper);
	
	YouzhianliView selectView(@Param("ew") Wrapper<YouzhianliEntity> wrapper);
	

}
