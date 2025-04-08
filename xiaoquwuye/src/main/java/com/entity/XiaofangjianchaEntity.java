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
 * 消防检查
 *
 * @author 
 * @email
 */
@TableName("xiaofangjiancha")
public class XiaofangjianchaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiaofangjianchaEntity() {

	}

	public XiaofangjianchaEntity(T t) {
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
     * 检查人
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 是否正常
     */
    @TableField(value = "xiaofangjiancha_types")

    private Integer xiaofangjianchaTypes;


    /**
     * 检查备注
     */
    @TableField(value = "xiaofangjiancha_content")

    private String xiaofangjianchaContent;


    /**
     * 检查时间
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
	 * 设置：检查人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：检查人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：是否正常
	 */
    public Integer getXiaofangjianchaTypes() {
        return xiaofangjianchaTypes;
    }


    /**
	 * 获取：是否正常
	 */

    public void setXiaofangjianchaTypes(Integer xiaofangjianchaTypes) {
        this.xiaofangjianchaTypes = xiaofangjianchaTypes;
    }
    /**
	 * 设置：检查备注
	 */
    public String getXiaofangjianchaContent() {
        return xiaofangjianchaContent;
    }


    /**
	 * 获取：检查备注
	 */

    public void setXiaofangjianchaContent(String xiaofangjianchaContent) {
        this.xiaofangjianchaContent = xiaofangjianchaContent;
    }
    /**
	 * 设置：检查时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：检查时间
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
        return "Xiaofangjiancha{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", xiaofangjianchaTypes=" + xiaofangjianchaTypes +
            ", xiaofangjianchaContent=" + xiaofangjianchaContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
