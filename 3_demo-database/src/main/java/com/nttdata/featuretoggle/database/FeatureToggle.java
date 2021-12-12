package com.nttdata.featuretoggle.database;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FeatureToggles")
public class FeatureToggle {

    @Id
    private Long id;

    private String name;

    private boolean status;

    public FeatureToggle(Long id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public FeatureToggle() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
