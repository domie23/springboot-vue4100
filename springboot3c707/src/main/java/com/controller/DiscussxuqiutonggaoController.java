package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussxuqiutonggaoEntity;
import com.entity.view.DiscussxuqiutonggaoView;

import com.service.DiscussxuqiutonggaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 需求通告评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
@RestController
@RequestMapping("/discussxuqiutonggao")
public class DiscussxuqiutonggaoController {
    @Autowired
    private DiscussxuqiutonggaoService discussxuqiutonggaoService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussxuqiutonggaoEntity discussxuqiutonggao,
		HttpServletRequest request){
        EntityWrapper<DiscussxuqiutonggaoEntity> ew = new EntityWrapper<DiscussxuqiutonggaoEntity>();
		PageUtils page = discussxuqiutonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussxuqiutonggao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussxuqiutonggaoEntity discussxuqiutonggao, 
		HttpServletRequest request){
        EntityWrapper<DiscussxuqiutonggaoEntity> ew = new EntityWrapper<DiscussxuqiutonggaoEntity>();
		PageUtils page = discussxuqiutonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussxuqiutonggao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussxuqiutonggaoEntity discussxuqiutonggao){
       	EntityWrapper<DiscussxuqiutonggaoEntity> ew = new EntityWrapper<DiscussxuqiutonggaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussxuqiutonggao, "discussxuqiutonggao")); 
        return R.ok().put("data", discussxuqiutonggaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussxuqiutonggaoEntity discussxuqiutonggao){
        EntityWrapper< DiscussxuqiutonggaoEntity> ew = new EntityWrapper< DiscussxuqiutonggaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussxuqiutonggao, "discussxuqiutonggao")); 
		DiscussxuqiutonggaoView discussxuqiutonggaoView =  discussxuqiutonggaoService.selectView(ew);
		return R.ok("查询需求通告评论表成功").put("data", discussxuqiutonggaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussxuqiutonggaoEntity discussxuqiutonggao = discussxuqiutonggaoService.selectById(id);
        return R.ok().put("data", discussxuqiutonggao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussxuqiutonggaoEntity discussxuqiutonggao = discussxuqiutonggaoService.selectById(id);
        return R.ok().put("data", discussxuqiutonggao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussxuqiutonggaoEntity discussxuqiutonggao, HttpServletRequest request){
    	discussxuqiutonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussxuqiutonggao);
        discussxuqiutonggaoService.insert(discussxuqiutonggao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussxuqiutonggaoEntity discussxuqiutonggao, HttpServletRequest request){
    	discussxuqiutonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussxuqiutonggao);
        discussxuqiutonggaoService.insert(discussxuqiutonggao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscussxuqiutonggaoEntity discussxuqiutonggao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussxuqiutonggao);
        discussxuqiutonggaoService.updateById(discussxuqiutonggao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussxuqiutonggaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussxuqiutonggaoEntity> wrapper = new EntityWrapper<DiscussxuqiutonggaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussxuqiutonggaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
