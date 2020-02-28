package com.fleawu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 描述:
 *
 * <p>
 *
 * @author tiaozao
 * @date 2020-02-16 16:36
 */
@Data
@Accessors(chain = true)
public class Book {

    private String name;

    private Integer price;

    private Integer code;

}
