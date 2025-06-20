package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingyuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingyuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingyuleixingView;


/**
 * 领域类型
 *
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
public interface LingyuleixingService extends IService<LingyuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingyuleixingVO> selectListVO(Wrapper<LingyuleixingEntity> wrapper);
   	
   	LingyuleixingVO selectVO(@Param("ew") Wrapper<LingyuleixingEntity> wrapper);
   	
   	List<LingyuleixingView> selectListView(Wrapper<LingyuleixingEntity> wrapper);
   	
   	LingyuleixingView selectView(@Param("ew") Wrapper<LingyuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingyuleixingEntity> wrapper);
   	

}

