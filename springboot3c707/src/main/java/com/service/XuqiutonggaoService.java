package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuqiutonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuqiutonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuqiutonggaoView;


/**
 * 需求通告
 *
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
public interface XuqiutonggaoService extends IService<XuqiutonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuqiutonggaoVO> selectListVO(Wrapper<XuqiutonggaoEntity> wrapper);
   	
   	XuqiutonggaoVO selectVO(@Param("ew") Wrapper<XuqiutonggaoEntity> wrapper);
   	
   	List<XuqiutonggaoView> selectListView(Wrapper<XuqiutonggaoEntity> wrapper);
   	
   	XuqiutonggaoView selectView(@Param("ew") Wrapper<XuqiutonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuqiutonggaoEntity> wrapper);
   	

}

