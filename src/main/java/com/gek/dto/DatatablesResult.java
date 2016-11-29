package com.gek.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Created by KAY on 2016/11/29.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatatablesResult<T> {
    /**
     *
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
