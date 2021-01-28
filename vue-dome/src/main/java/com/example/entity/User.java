package com.example.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author astupidcoder
 * @since 2021-01-28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("user")
public class User extends Model {

    private static final long serialVersionUID = 1L;

    @TableId(value="user_id",type= IdType.ID_WORKER)
    private Long user_id;

    @TableField(value="name")
    private String name;

    @TableField(value="age")
    private Integer age;

    @TableLogic(value="0",delval="1")
    @TableField(value ="is_delete")
    private Integer is_delete;

    @TableField(value ="insert_time",fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    private Date insertTime;

    @TableField(value ="update_time",fill = FieldFill.UPDATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    private Date updateTime;

    @TableField(value ="insert_by",fill = FieldFill.INSERT_UPDATE)
    private Long insertBy;

    @TableField(value ="update_by",fill = FieldFill.INSERT_UPDATE)
    private Long updateBy;
}
