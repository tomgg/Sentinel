package com.alibaba.csp.sentinel.dashboard.datasource.entity.rule;

import java.util.List;

import com.alibaba.csp.sentinel.slots.system.SystemRule;

/**
 * @author yunyi
 * @version 1.0.0
 * @ClassName SentinelRuleTemplate.java
 * @Description TODO
 * @createTime 2021年11月17日 22:52:00
 */
public class SentinelRuleTemplate {
    private boolean enable = false;
    private List<FlowRuleEntity> flowRules = null;
    private SystemRule systemRule = null;
    private long gmtModified = 0;
    private String json = null;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(long gmtModified) {
        this.gmtModified = gmtModified;
    }

    public List<FlowRuleEntity> getFlowRules() {
        return flowRules;
    }

    public void setFlowRules(List<FlowRuleEntity> flowRules) {
        this.flowRules = flowRules;
    }

    public SystemRule getSystemRule() {
        return systemRule;
    }

    public void setSystemRule(SystemRule systemRule) {
        this.systemRule = systemRule;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    /**
     * @return
     */
    public static SentinelRuleTemplate newBlank() {
        SentinelRuleTemplate tmp = new SentinelRuleTemplate();
        tmp.setEnable(false);
        tmp.setGmtModified(0);
        return tmp;
    }
}
