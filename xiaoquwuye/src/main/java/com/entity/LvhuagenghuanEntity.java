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
 * 绿化更换
 *
 * @author 
 * @email
 */
@TableName("lvhuagenghuan")
public class LvhuagenghuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LvhuagenghuanEntity() {

	}

	public LvhuagenghuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 负责人
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 绿化区域
     */
    @TableField(value = "lvhuagenghuan_name")

    private String lvhuagenghuanName;


    /**
     * 季节
     */
    @TableField(value = "lvhuagenghuan_jijie")

    private String lvhuagenghuanJijie;


    /**
     * 植被
     */
    @TableField(value = "lvhuagenghuan_zhibei")

    private String lvhuagenghuanZhibei;


    /**
     * 备注
     */
    @TableField(value = "lvhuagenghuan_content")

    private String lvhuagenghuanContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：负责人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：负责人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：绿化区域
	 */
    public String getLvhuagenghuanName() {
        return lvhuagenghuanName;
    }


    /**
	 * 获取：绿化区域
	 */

    public void setLvhuagenghuanName(String lvhuagenghuanName) {
        this.lvhuagenghuanName = lvhuagenghuanName;
    }
    /**
	 * 设置：季节
	 */
    public String getLvhuagenghuanJijie() {
        return lvhuagenghuanJijie;
    }


    /**
	 * 获取：季节
	 */

    public void setLvhuagenghuanJijie(String lvhuagenghuanJijie) {
        this.lvhuagenghuanJijie = lvhuagenghuanJijie;
    }
    /**
	 * 设置：植被
	 */
    public String getLvhuagenghuanZhibei() {
        return lvhuagenghuanZhibei;
    }


    /**
	 * 获取：植被
	 */

    public void setLvhuagenghuanZhibei(String lvhuagenghuanZhibei) {
        this.lvhuagenghuanZhibei = lvhuagenghuanZhibei;
    }
    /**
	 * 设置：备注
	 */
    public String getLvhuagenghuanContent() {
        return lvhuagenghuanContent;
    }


    /**
	 * 获取：备注
	 */

    public void setLvhuagenghuanContent(String lvhuagenghuanContent) {
        this.lvhuagenghuanContent = lvhuagenghuanContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Lvhuagenghuan{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", lvhuagenghuanName=" + lvhuagenghuanName +
            ", lvhuagenghuanJijie=" + lvhuagenghuanJijie +
            ", lvhuagenghuanZhibei=" + lvhuagenghuanZhibei +
            ", lvhuagenghuanContent=" + lvhuagenghuanContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
