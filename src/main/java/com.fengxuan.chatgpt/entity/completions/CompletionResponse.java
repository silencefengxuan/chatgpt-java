package com.fengxuan.chatgpt.entity.completions;

import com.fengxuan.chatgpt.entity.common.OpenAiResponse;
import com.fengxuan.chatgpt.entity.common.Choice;
import com.fengxuan.chatgpt.entity.common.Usage;
import lombok.Data;

import java.io.Serializable;

/**
 * 描述： 答案类
 *
 * @author https:www.fengxuan.com
 *  2023-02-11
 */
@Data
public class CompletionResponse extends OpenAiResponse implements Serializable {
    private String id;
    private String object;
    private long created;
    private String model;
    private Choice[] choices;
    private Usage usage;
}
