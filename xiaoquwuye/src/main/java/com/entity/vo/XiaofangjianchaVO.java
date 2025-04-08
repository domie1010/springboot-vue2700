package com.entity.vo;

import com.entity.XiaofangjianchaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 消防检查
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiaofangjiancha")
public class XiaofangjianchaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
