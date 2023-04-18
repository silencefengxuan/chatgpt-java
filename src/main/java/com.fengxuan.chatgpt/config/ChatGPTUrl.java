package com.fengxuan.chatgpt.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 描述： api地址
 *
 * @author https:www.fengxuan.com
 *  2023-02-11
 */
@Getter
@AllArgsConstructor
public enum ChatGPTUrl {

    COMPLETIONS("https://api.openai.com/v1/completions"),
    ;

    private String url;

}
