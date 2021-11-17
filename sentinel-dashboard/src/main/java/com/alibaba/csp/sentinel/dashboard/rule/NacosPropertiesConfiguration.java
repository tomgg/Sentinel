package com.alibaba.csp.sentinel.dashboard.rule;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yunyi
 * @version 1.0.0
 * @ClassName NacosPropertiesConfiguration.java
 * @Description TODO
 * @createTime 2021年11月15日 16:46:00
 */
@ConfigurationProperties(prefix = "sentinel.nacos")
public class NacosPropertiesConfiguration {
    private String serverAddr;
    private String dataId;
    private String groupId = "SENTINEL_GROUP"; // 默认分组
    private String namespace;

    public String getServerAddr() {
        return serverAddr;
    }

    public void setServerAddr(String serverAddr) {
        this.serverAddr = serverAddr;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}
