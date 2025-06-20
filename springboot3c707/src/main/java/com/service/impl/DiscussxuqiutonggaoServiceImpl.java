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


import com.dao.DiscussxuqiutonggaoDao;
import com.entity.DiscussxuqiutonggaoEntity;
import com.service.DiscussxuqiutonggaoService;
import com.entity.vo.DiscussxuqiutonggaoVO;
import com.entity.view.DiscussxuqiutonggaoView;

@Service("discussxuqiutonggaoService")
public class DiscussxuqiutonggaoServiceImpl extends ServiceImpl<DiscussxuqiutonggaoDao, DiscussxuqiutonggaoEntity> implements DiscussxuqiutonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxuqiutonggaoEntity> page = this.selectPage(
                new Query<DiscussxuqiutonggaoEntity>(params).getPage(),
                new EntityWrapper<DiscussxuqiutonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxuqiutonggaoEntity> wrapper) {
		  Page<DiscussxuqiutonggaoView> page =new Query<DiscussxuqiutonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxuqiutonggaoVO> selectListVO(Wrapper<DiscussxuqiutonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxuqiutonggaoVO selectVO(Wrapper<DiscussxuqiutonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxuqiutonggaoView> selectListView(Wrapper<DiscussxuqiutonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxuqiutonggaoView selectView(Wrapper<DiscussxuqiutonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
