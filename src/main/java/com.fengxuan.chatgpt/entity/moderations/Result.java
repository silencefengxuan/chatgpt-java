package com.fengxuan.chatgpt.entity.moderations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 描述：
 *
 * @author https:www.fengxuan.com
 *  2023-02-15
 */
@Data
public class Result implements Serializable {
    private Categories categories;
    @JsonProperty("category_scores")
    private CategoryScores categoryScores;
    private boolean flagged;
}
