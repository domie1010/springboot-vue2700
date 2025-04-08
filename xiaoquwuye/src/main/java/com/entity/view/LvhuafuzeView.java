package com.entity.view;

import com.entity.LvhuafuzeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 绿化负责
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("lvhuafuze")
public class LvhuafuzeView extends LvhuafuzeEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户照片
			*/
			private String yonghuPhoto;
			/**
			* 权限
			*/
			private Integer yonghuRoleTypes;
				/**
				* 权限的值
				*/
				private String yonghuRoleValue;

	public LvhuafuzeView() {

	}

	public LvhuafuzeView(LvhuafuzeEntity lvhuafuzeEntity) {
		try {
			BeanUtils.copyProperties(this, lvhuafuzeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}























				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 权限
					*/
					public Integer getYonghuRoleTypes() {
						return yonghuRoleTypes;
					}
					/**
					* 设置： 权限
					*/
					public void setYonghuRoleTypes(Integer yonghuRoleTypes) {
						this.yonghuRoleTypes = yonghuRoleTypes;
					}


						/**
						* 获取： 权限的值
						*/
						public String getYonghuRoleValue() {
							return yonghuRoleValue;
						}
						/**
						* 设置： 权限的值
						*/
						public void setYonghuRoleValue(String yonghuRoleValue) {
							this.yonghuRoleValue = yonghuRoleValue;
						}






}
