package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyouzhianliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyouzhianliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyouzhianliView;


/**
 * 优质案例评论表
 *
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
public interface DiscussyouzhianliService extends IService<DiscussyouzhianliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyouzhianliVO> selectListVO(Wrapper<DiscussyouzhianliEntity> wrapper);
   	
   	DiscussyouzhianliVO selectVO(@Param("ew") Wrapper<DiscussyouzhianliEntity> wrapper);
   	
   	List<DiscussyouzhianliView> selectListView(Wrapper<DiscussyouzhianliEntity> wrapper);
   	
   	DiscussyouzhianliView selectView(@Param("ew") Wrapper<DiscussyouzhianliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyouzhianliEntity> wrapper);
   	

}

