package com.entity.vo;

import com.entity.DiantijianchaEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 电梯监测
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("diantijiancha")
public class DiantijianchaVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 监测人
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 是否正常
     */

    @TableField(value = "diantijiancha_types")
    private Integer diantijianchaTypes;


    /**
     * 监测备注
     */

    @TableField(value = "diantijiancha_content")
    private String diantijianchaContent;


    /**
     * 监测时间
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
	 * 设置：监测人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：监测人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：是否正常
	 */
    public Integer getDiantijianchaTypes() {
        return diantijianchaTypes;
    }


    /**
	 * 获取：是否正常
	 */

    public void setDiantijianchaTypes(Integer diantijianchaTypes) {
        this.diantijianchaTypes = diantijianchaTypes;
    }
    /**
	 * 设置：监测备注
	 */
    public String getDiantijianchaContent() {
        return diantijianchaContent;
    }


    /**
	 * 获取：监测备注
	 */

    public void setDiantijianchaContent(String diantijianchaContent) {
        this.diantijianchaContent = diantijianchaContent;
    }
    /**
	 * 设置：监测时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：监测时间
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
