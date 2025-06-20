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


import com.dao.YouzhianliDao;
import com.entity.YouzhianliEntity;
import com.service.YouzhianliService;
import com.entity.vo.YouzhianliVO;
import com.entity.view.YouzhianliView;

@Service("youzhianliService")
public class YouzhianliServiceImpl extends ServiceImpl<YouzhianliDao, YouzhianliEntity> implements YouzhianliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouzhianliEntity> page = this.selectPage(
                new Query<YouzhianliEntity>(params).getPage(),
                new EntityWrapper<YouzhianliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouzhianliEntity> wrapper) {
		  Page<YouzhianliView> page =new Query<YouzhianliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouzhianliVO> selectListVO(Wrapper<YouzhianliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouzhianliVO selectVO(Wrapper<YouzhianliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouzhianliView> selectListView(Wrapper<YouzhianliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouzhianliView selectView(Wrapper<YouzhianliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
