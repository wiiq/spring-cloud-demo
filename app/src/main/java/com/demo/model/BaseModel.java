package com.demo.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

/**
 * Created by weiq on 2017/12/8.
 */
@MappedSuperclass
public class BaseModel {

    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createTime;

    @UpdateTimestamp
    @Column(insertable = false)
    private Timestamp updateTime;

    private boolean isDeleted = false;

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString(){
        return JSON.toJSONString(this , SerializerFeature.WriteMapNullValue);
    }

}
