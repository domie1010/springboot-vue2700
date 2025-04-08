package com.entity.model;

import com.entity.XunluoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 巡逻
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XunluoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 保安
     */
    private Integer yonghuId;


    /**
     * 巡逻区域
     */
    private String xunluoName;


    /**
     * 巡逻时间
     */
    private String xunluoTime;


    /**
     * 是否正常
     */
    private Integer xunluoTypes;


    /**
     * 备注
     */
    private String xunluoContent;


    /**
     * 添加时间
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
	 * 获取：保安
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：保安
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：巡逻区域
	 */
    public String getXunluoName() {
        return xunluoName;
    }


    /**
	 * 设置：巡逻区域
	 */
    public void setXunluoName(String xunluoName) {
        this.xunluoName = xunluoName;
    }
    /**
	 * 获取：巡逻时间
	 */
    public String getXunluoTime() {
        return xunluoTime;
    }


    /**
	 * 设置：巡逻时间
	 */
    public void setXunluoTime(String xunluoTime) {
        this.xunluoTime = xunluoTime;
    }
    /**
	 * 获取：是否正常
	 */
    public Integer getXunluoTypes() {
        return xunluoTypes;
    }


    /**
	 * 设置：是否正常
	 */
    public void setXunluoTypes(Integer xunluoTypes) {
        this.xunluoTypes = xunluoTypes;
    }
    /**
	 * 获取：备注
	 */
    public String getXunluoContent() {
        return xunluoContent;
    }


    /**
	 * 设置：备注
	 */
    public void setXunluoContent(String xunluoContent) {
        this.xunluoContent = xunluoContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
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
