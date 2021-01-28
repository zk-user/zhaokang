package com.example.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDateTime;


/**
 * @author ASUS
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        LOGGER.info("start insert fill ....");
        //this.setFieldValByName("createTime", LocalDateTime.now(), metaObject);
        this.setInsertFieldValByName("insertTime", new Date(System.currentTimeMillis()), metaObject);
        this.setInsertFieldValByName("updateTime", new Date(System.currentTimeMillis()), metaObject);
        this.setInsertFieldValByName("insertBy", 123456L, metaObject);
        this.setInsertFieldValByName("updateBy", 123456L, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        LOGGER.info("start update fill ....");
        this.setUpdateFieldValByName("updateTime", new Date(System.currentTimeMillis()), metaObject);
        this.setInsertFieldValByName("updateBy", 123456L, metaObject);
    }

}
