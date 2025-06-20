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

import com.entity.XuqiutonggaoEntity;
import com.entity.view.XuqiutonggaoView;

import com.service.XuqiutonggaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 需求通告
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
@RestController
@RequestMapping("/xuqiutonggao")
public class XuqiutonggaoController {
    @Autowired
    private XuqiutonggaoService xuqiutonggaoService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XuqiutonggaoEntity xuqiutonggao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			xuqiutonggao.setShangjiabianhao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XuqiutonggaoEntity> ew = new EntityWrapper<XuqiutonggaoEntity>();
		PageUtils page = xuqiutonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuqiutonggao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XuqiutonggaoEntity xuqiutonggao, 
		HttpServletRequest request){
        EntityWrapper<XuqiutonggaoEntity> ew = new EntityWrapper<XuqiutonggaoEntity>();
		PageUtils page = xuqiutonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuqiutonggao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XuqiutonggaoEntity xuqiutonggao){
       	EntityWrapper<XuqiutonggaoEntity> ew = new EntityWrapper<XuqiutonggaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xuqiutonggao, "xuqiutonggao")); 
        return R.ok().put("data", xuqiutonggaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XuqiutonggaoEntity xuqiutonggao){
        EntityWrapper< XuqiutonggaoEntity> ew = new EntityWrapper< XuqiutonggaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xuqiutonggao, "xuqiutonggao")); 
		XuqiutonggaoView xuqiutonggaoView =  xuqiutonggaoService.selectView(ew);
		return R.ok("查询需求通告成功").put("data", xuqiutonggaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XuqiutonggaoEntity xuqiutonggao = xuqiutonggaoService.selectById(id);
		xuqiutonggao.setClicknum(xuqiutonggao.getClicknum()+1);
		xuqiutonggao.setClicktime(new Date());
		xuqiutonggaoService.updateById(xuqiutonggao);
        return R.ok().put("data", xuqiutonggao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XuqiutonggaoEntity xuqiutonggao = xuqiutonggaoService.selectById(id);
		xuqiutonggao.setClicknum(xuqiutonggao.getClicknum()+1);
		xuqiutonggao.setClicktime(new Date());
		xuqiutonggaoService.updateById(xuqiutonggao);
        return R.ok().put("data", xuqiutonggao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XuqiutonggaoEntity xuqiutonggao, HttpServletRequest request){
    	xuqiutonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuqiutonggao);
        xuqiutonggaoService.insert(xuqiutonggao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XuqiutonggaoEntity xuqiutonggao, HttpServletRequest request){
    	xuqiutonggao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xuqiutonggao);
        xuqiutonggaoService.insert(xuqiutonggao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XuqiutonggaoEntity xuqiutonggao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xuqiutonggao);
        xuqiutonggaoService.updateById(xuqiutonggao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xuqiutonggaoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<XuqiutonggaoEntity> wrapper = new EntityWrapper<XuqiutonggaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			wrapper.eq("shangjiabianhao", (String)request.getSession().getAttribute("username"));
		}

		int count = xuqiutonggaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,XuqiutonggaoEntity xuqiutonggao, HttpServletRequest request,String pre){
        EntityWrapper<XuqiutonggaoEntity> ew = new EntityWrapper<XuqiutonggaoEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = xuqiutonggaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuqiutonggao), params), params));
        return R.ok().put("data", page);
    }







}
