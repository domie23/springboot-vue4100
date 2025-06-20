package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxuqiutonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxuqiutonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxuqiutonggaoView;


/**
 * 需求通告评论表
 *
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
public interface DiscussxuqiutonggaoService extends IService<DiscussxuqiutonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuqiutonggaoVO> selectListVO(Wrapper<DiscussxuqiutonggaoEntity> wrapper);
   	
   	DiscussxuqiutonggaoVO selectVO(@Param("ew") Wrapper<DiscussxuqiutonggaoEntity> wrapper);
   	
   	List<DiscussxuqiutonggaoView> selectListView(Wrapper<DiscussxuqiutonggaoEntity> wrapper);
   	
   	DiscussxuqiutonggaoView selectView(@Param("ew") Wrapper<DiscussxuqiutonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuqiutonggaoEntity> wrapper);
   	

}

