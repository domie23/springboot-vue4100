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


import com.dao.LingyuleixingDao;
import com.entity.LingyuleixingEntity;
import com.service.LingyuleixingService;
import com.entity.vo.LingyuleixingVO;
import com.entity.view.LingyuleixingView;

@Service("lingyuleixingService")
public class LingyuleixingServiceImpl extends ServiceImpl<LingyuleixingDao, LingyuleixingEntity> implements LingyuleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingyuleixingEntity> page = this.selectPage(
                new Query<LingyuleixingEntity>(params).getPage(),
                new EntityWrapper<LingyuleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingyuleixingEntity> wrapper) {
		  Page<LingyuleixingView> page =new Query<LingyuleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LingyuleixingVO> selectListVO(Wrapper<LingyuleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LingyuleixingVO selectVO(Wrapper<LingyuleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LingyuleixingView> selectListView(Wrapper<LingyuleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingyuleixingView selectView(Wrapper<LingyuleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
