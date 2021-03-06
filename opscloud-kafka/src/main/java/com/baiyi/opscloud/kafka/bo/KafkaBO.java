package com.baiyi.opscloud.kafka.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author <a href="mailto:xiuyuan@xinc818.group">修远</a>
 * @Date 2021/1/15 10:33 上午
 * @Since 1.0
 */
public class KafkaBO {

    @Data
    @NoArgsConstructor
    @ApiModel
    public static class Topic {

        @ApiModelProperty(value = "Topic")
        private String topic;

        @ApiModelProperty(value = "分区数量")
        private Integer numPartitions;
    }

    @Data
    @NoArgsConstructor
    @ApiModel
    public static class Group {

        @ApiModelProperty(value = "consumerId")
        private String consumerId;

    }

}
