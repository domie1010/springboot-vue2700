package com.entity.model;

import com.entity.XiaofangjianchaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 消防检查
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiaofangjianchaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 检查人
     */
    private Integer yonghuId;


    /**
     * 是否正常
     */
    private Integer xiaofangjianchaTypes;


    /**
     * 检查备注
     */
    private String xiaofangjianchaContent;


    /**
     * 检查时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：检查人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：检查人
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：是否正常
	 */
    public Integer getXiaofangjianchaTypes() {
        return xiaofangjianchaTypes;
    }


    /**
	 * 设置：是否正常
	 */
    public void setXiaofangjianchaTypes(Integer xiaofangjianchaTypes) {
        this.xiaofangjianchaTypes = xiaofangjianchaTypes;
    }
    /**
	 * 获取：检查备注
	 */
    public String getXiaofangjianchaContent() {
        return xiaofangjianchaContent;
    }


    /**
	 * 设置：检查备注
	 */
    public void setXiaofangjianchaContent(String xiaofangjianchaContent) {
        this.xiaofangjianchaContent = xiaofangjianchaContent;
    }
    /**
	 * 获取：检查时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：检查时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
