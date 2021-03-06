package com.example.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 *  user
 * @author 大狼狗 2020-07-19
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * sex
     */
    private String sex;

    /**
     * old
     */
    private Integer old;

    public User() {
    }

}
