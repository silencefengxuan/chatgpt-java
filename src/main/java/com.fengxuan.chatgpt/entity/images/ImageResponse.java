package com.fengxuan.chatgpt.entity.images;

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
public class ImageResponse implements Serializable {
    private long created;
    private List<Item> data;
}
