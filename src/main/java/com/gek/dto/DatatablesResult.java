package com.gek.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

/**
 * Created by KAY on 2016/11/29.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatatablesResult<T> {
    /**
     * 数据查询的状态
     */
    private Map<String,Boolean> status;
    /**
     *是否重新绘制table表格
     */
    private String draw;
    /**
     * 传入的封装数据
     */
    private List<T> data;
    /**
     * 全部数据(未过滤)
     */
    private Long recordsTotal;
    /**
     * 过滤后的数据
     */
    private Long recordsFiltered;
}
