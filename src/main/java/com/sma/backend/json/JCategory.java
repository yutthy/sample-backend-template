package com.sma.backend.json;

import java.io.Serializable;
import java.util.Map;

public class JCategory implements Serializable {

    /** Unique id for this Entity in the database */
    private Long id;
    
    /** Set by mardao to whom this entity was created by */
    private String createdBy;
    
    /** Milliseconds since 1970 when this Entity was created in the database */
    private Long createdDate;
    
    /** Possible states are DELETED (-1), PENDING (0), ACTIVE (1) and REDEEMED (2) */
    private Long state;
    
    /** Set by mardao to whom this entity was updated by last time */
    private String updatedBy;
    
    /** Milliseconds since 1970 when this Entity was last updated in the database */
    private Long updatedDate;
    
    /** a one-liner category name (default language) */
    private String              name;

    /** A longer description of this category (default language) */
    private String              description;

    /** key to the category asset generic field for each app specific*/
    private String              appArg0;

    /** Total child records. could be offers, brands .. */
    private Integer             totalChildRecords;

    /** key is langCode, value is localized name */
    private Map<String, String> localizedNames;

    /** If this is a sub-category, the id of its parent */
    private Long                parentId;
    
    /** logo Url */
    private String              logoUrl;
    
    /** type of Category, e.g. DBrand, DOffer , DStore */
    private String type;
    
    private Long levelOrder;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Map<String, String> getLocalizedNames() {
        return localizedNames;
    }

    public void setLocalizedNames(Map<String, String> localizedNames) {
        this.localizedNames = localizedNames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAppArg0() {
        return appArg0;
    }

    public void setAppArg0(String appArg0) {
        this.appArg0 = appArg0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    /**
     * @return the totalChildRecords
     */
    public Integer getTotalChildRecords() {
        return totalChildRecords;
    }

    /**
     * @param totalChildRecords
     *            the totalChildRecords to set
     */
    public void setTotalChildRecords(Integer totalChildRecords) {
        this.totalChildRecords = totalChildRecords;
    }

    public Long getLevelOrder() {
        return levelOrder;
    }

    public void setLevelOrder(Long levelOrder) {
        this.levelOrder = levelOrder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Long getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Long updatedDate) {
        this.updatedDate = updatedDate;
    }

}
