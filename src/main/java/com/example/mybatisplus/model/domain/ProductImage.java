package com.example.mybatisplus.model.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品图片表
 * </p>
 *
 * @author jxh
 * @since 2022-02-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("wcss_product_image")
@ApiModel(value="ProductImage对象", description="商品图片表")
public class ProductImage extends Model<ProductImage> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long productId;

            @ApiModelProperty(value = "图片名")
    @TableField("NAME")
    private String name;

            @ApiModelProperty(value = "图片路径")
    private String path;

            @ApiModelProperty(value = "是否删除")
    private Boolean isDeleted;

            @ApiModelProperty(value = "创建时间")
    private LocalDateTime gmtCreated;

            @ApiModelProperty(value = "更新时间")
    private LocalDateTime gmtModified;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
