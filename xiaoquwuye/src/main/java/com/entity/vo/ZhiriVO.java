package com.entity.vo;

import com.entity.ZhiriEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 值日
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhiri")
public class ZhiriVO implements Serializable {
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
     * 值日日期
     */

    @TableField(value = "zhiri_time")
    private String zhiriTime;


    /**
     * 备注
     */

    @TableField(value = "zhiri_content")
    private String zhiriContent;


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
	 * 设置：值日日期
	 */
    public String getZhiriTime() {
        return zhiriTime;
    }


    /**
	 * 获取：值日日期
	 */

    public void setZhiriTime(String zhiriTime) {
        this.zhiriTime = zhiriTime;
    }
    /**
	 * 设置：备注
	 */
    public String getZhiriContent() {
        return zhiriContent;
    }


    /**
	 * 获取：备注
	 */

    public void setZhiriContent(String zhiriContent) {
        this.zhiriContent = zhiriContent;
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
