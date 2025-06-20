package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouzhianliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouzhianliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouzhianliView;


/**
 * 优质案例
 *
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
public interface YouzhianliService extends IService<YouzhianliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouzhianliVO> selectListVO(Wrapper<YouzhianliEntity> wrapper);
   	
   	YouzhianliVO selectVO(@Param("ew") Wrapper<YouzhianliEntity> wrapper);
   	
   	List<YouzhianliView> selectListView(Wrapper<YouzhianliEntity> wrapper);
   	
   	YouzhianliView selectView(@Param("ew") Wrapper<YouzhianliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouzhianliEntity> wrapper);
   	

}

