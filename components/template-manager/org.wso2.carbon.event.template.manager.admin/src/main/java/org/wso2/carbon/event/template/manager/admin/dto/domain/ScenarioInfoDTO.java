package org.wso2.carbon.event.template.manager.admin.dto.domain;

public class ScenarioInfoDTO {
    private String type;
    private String description;
    private DomainParameterDTO[] domainParameterDTOs;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DomainParameterDTO[] getDomainParameterDTOs() {
        return domainParameterDTOs;
    }

    public void setDomainParameterDTOs(DomainParameterDTO[] domainParameterDTOs) {
        this.domainParameterDTOs = domainParameterDTOs;
    }
}
