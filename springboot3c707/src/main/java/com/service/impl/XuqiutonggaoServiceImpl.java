package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XuqiutonggaoDao;
import com.entity.XuqiutonggaoEntity;
import com.service.XuqiutonggaoService;
import com.entity.vo.XuqiutonggaoVO;
import com.entity.view.XuqiutonggaoView;

@Service("xuqiutonggaoService")
public class XuqiutonggaoServiceImpl extends ServiceImpl<XuqiutonggaoDao, XuqiutonggaoEntity> implements XuqiutonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuqiutonggaoEntity> page = this.selectPage(
                new Query<XuqiutonggaoEntity>(params).getPage(),
                new EntityWrapper<XuqiutonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuqiutonggaoEntity> wrapper) {
		  Page<XuqiutonggaoView> page =new Query<XuqiutonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuqiutonggaoVO> selectListVO(Wrapper<XuqiutonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuqiutonggaoVO selectVO(Wrapper<XuqiutonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuqiutonggaoView> selectListView(Wrapper<XuqiutonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuqiutonggaoView selectView(Wrapper<XuqiutonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
