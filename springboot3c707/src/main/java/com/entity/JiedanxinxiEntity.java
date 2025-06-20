package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 接单信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-25 20:58:58
 */
@TableName("jiedanxinxi")
public class JiedanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiedanxinxiEntity() {
		
	}
	
	public JiedanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 通告标题
	 */
					
	private String tonggaobiaoti;
	
	/**
	 * 所属领域
	 */
					
	private String suoshulingyu;
	
	/**
	 * 接单时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jiedanshijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 商家编号
	 */
					
	private String shangjiabianhao;
	
	/**
	 * 博主账号
	 */
					
	private String bozhuzhanghao;
	
	/**
	 * 博主姓名
	 */
					
	private String bozhuxingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
	/**
	 * 设置：通告标题
	 */
	public void setTonggaobiaoti(String tonggaobiaoti) {
		this.tonggaobiaoti = tonggaobiaoti;
	}
	/**
	 * 获取：通告标题
	 */
	public String getTonggaobiaoti() {
		return tonggaobiaoti;
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
	 * 设置：接单时间
	 */
	public void setJiedanshijian(Date jiedanshijian) {
		this.jiedanshijian = jiedanshijian;
	}
	/**
	 * 获取：接单时间
	 */
	public Date getJiedanshijian() {
		return jiedanshijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：商家编号
	 */
	public void setShangjiabianhao(String shangjiabianhao) {
		this.shangjiabianhao = shangjiabianhao;
	}
	/**
	 * 获取：商家编号
	 */
	public String getShangjiabianhao() {
		return shangjiabianhao;
	}
	/**
	 * 设置：博主账号
	 */
	public void setBozhuzhanghao(String bozhuzhanghao) {
		this.bozhuzhanghao = bozhuzhanghao;
	}
	/**
	 * 获取：博主账号
	 */
	public String getBozhuzhanghao() {
		return bozhuzhanghao;
	}
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
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
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
