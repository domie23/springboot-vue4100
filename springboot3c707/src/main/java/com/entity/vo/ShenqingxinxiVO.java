package com.entity.vo;

import com.entity.ShenqingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 申请信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
public class ShenqingxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 博主姓名
	 */
	
	private String bozhuxingming;
		
	/**
	 * 所属领域
	 */
	
	private String suoshulingyu;
		
	/**
	 * 作品文件
	 */
	
	private String zuopinwenjian;
		
	/**
	 * 相关证书
	 */
	
	private String xiangguanzhengshu;
		
	/**
	 * 授权书
	 */
	
	private String shouquanshu;
		
	/**
	 * 作品描述
	 */
	
	private String zuopinmiaoshu;
		
	/**
	 * 申请时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingshijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：博主姓名
	 */
	 
	public void setBozhuxingming(String bozhuxingming) {
		this.bozhuxingming = bozhuxingming;
	}
	
	/**
	 * 获取：博主姓名
	 */
	public String getBozhuxingming() {
		return bozhuxingming;
	}
				
	
	/**
	 * 设置：所属领域
	 */
	 
	public void setSuoshulingyu(String suoshulingyu) {
		this.suoshulingyu = suoshulingyu;
	}
	
	/**
	 * 获取：所属领域
	 */
	public String getSuoshulingyu() {
		return suoshulingyu;
	}
				
	
	/**
	 * 设置：作品文件
	 */
	 
	public void setZuopinwenjian(String zuopinwenjian) {
		this.zuopinwenjian = zuopinwenjian;
	}
	
	/**
	 * 获取：作品文件
	 */
	public String getZuopinwenjian() {
		return zuopinwenjian;
	}
				
	
	/**
	 * 设置：相关证书
	 */
	 
	public void setXiangguanzhengshu(String xiangguanzhengshu) {
		this.xiangguanzhengshu = xiangguanzhengshu;
	}
	
	/**
	 * 获取：相关证书
	 */
	public String getXiangguanzhengshu() {
		return xiangguanzhengshu;
	}
				
	
	/**
	 * 设置：授权书
	 */
	 
	public void setShouquanshu(String shouquanshu) {
		this.shouquanshu = shouquanshu;
	}
	
	/**
	 * 获取：授权书
	 */
	public String getShouquanshu() {
		return shouquanshu;
	}
				
	
	/**
	 * 设置：作品描述
	 */
	 
	public void setZuopinmiaoshu(String zuopinmiaoshu) {
		this.zuopinmiaoshu = zuopinmiaoshu;
	}
	
	/**
	 * 获取：作品描述
	 */
	public String getZuopinmiaoshu() {
		return zuopinmiaoshu;
	}
				
	
	/**
	 * 设置：申请时间
	 */
	 
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
