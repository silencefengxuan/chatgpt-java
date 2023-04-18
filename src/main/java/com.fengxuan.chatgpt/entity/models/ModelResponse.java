package com.fengxuan.chatgpt.entity.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 描述：
 *
 * @author https:www.fengxuan.com
 *  2023-02-15
 */
@Data
public class ModelResponse implements Serializable {
    private String object;
    private List<Model> data;
}
