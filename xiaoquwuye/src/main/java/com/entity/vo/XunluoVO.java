package com.entity.vo;

import com.entity.XunluoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 巡逻
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xunluo")
public class XunluoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 保安
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 巡逻区域
     */

    @TableField(value = "xunluo_name")
    private String xunluoName;


    /**
     * 巡逻时间
     */

    @TableField(value = "xunluo_time")
    private String xunluoTime;


    /**
     * 是否正常
     */

    @TableField(value = "xunluo_types")
    private Integer xunluoTypes;


    /**
     * 备注
     */

    @TableField(value = "xunluo_content")
    private String xunluoContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：保安
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：保安
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：巡逻区域
	 */
    public String getXunluoName() {
        return xunluoName;
    }


    /**
	 * 获取：巡逻区域
	 */

    public void setXunluoName(String xunluoName) {
        this.xunluoName = xunluoName;
    }
    /**
	 * 设置：巡逻时间
	 */
    public String getXunluoTime() {
        return xunluoTime;
    }


    /**
	 * 获取：巡逻时间
	 */

    public void setXunluoTime(String xunluoTime) {
        this.xunluoTime = xunluoTime;
    }
    /**
	 * 设置：是否正常
	 */
    public Integer getXunluoTypes() {
        return xunluoTypes;
    }


    /**
	 * 获取：是否正常
	 */

    public void setXunluoTypes(Integer xunluoTypes) {
        this.xunluoTypes = xunluoTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getXunluoContent() {
        return xunluoContent;
    }


    /**
	 * 获取：备注
	 */

    public void setXunluoContent(String xunluoContent) {
        this.xunluoContent = xunluoContent;
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

}
