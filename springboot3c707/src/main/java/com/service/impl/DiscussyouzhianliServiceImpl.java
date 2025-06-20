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


import com.dao.DiscussyouzhianliDao;
import com.entity.DiscussyouzhianliEntity;
import com.service.DiscussyouzhianliService;
import com.entity.vo.DiscussyouzhianliVO;
import com.entity.view.DiscussyouzhianliView;

@Service("discussyouzhianliService")
public class DiscussyouzhianliServiceImpl extends ServiceImpl<DiscussyouzhianliDao, DiscussyouzhianliEntity> implements DiscussyouzhianliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyouzhianliEntity> page = this.selectPage(
                new Query<DiscussyouzhianliEntity>(params).getPage(),
                new EntityWrapper<DiscussyouzhianliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyouzhianliEntity> wrapper) {
		  Page<DiscussyouzhianliView> page =new Query<DiscussyouzhianliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyouzhianliVO> selectListVO(Wrapper<DiscussyouzhianliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyouzhianliVO selectVO(Wrapper<DiscussyouzhianliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyouzhianliView> selectListView(Wrapper<DiscussyouzhianliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyouzhianliView selectView(Wrapper<DiscussyouzhianliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
