package com.argusoft.medplat.rch.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * <p>
 * Define rch_asha_cs_morbidity_details entity and its fields.
 * </p>
 *
 * @author prateek
 * @since 26/08/20 11:00 AM
 */
@Entity
@Table(name = "rch_asha_cs_morbidity_details")
public class AshaCsMorbidityDetailsMaster implements Serializable {

    @EmbeddedId
    private MorbidityDetailsPKey morbidityDetailsPKey;
    @Column(name = "status", length = 1)
    private String status;
    @Column(name = "symptoms")
    private String symptoms;

    public AshaCsMorbidityDetailsMaster() {
    }

    public AshaCsMorbidityDetailsMaster(MorbidityDetailsPKey morbidityDetailsPKey, String status, String symptoms) {
        this.morbidityDetailsPKey = morbidityDetailsPKey;
        this.status = status;
        this.symptoms = symptoms;
    }

    public MorbidityDetailsPKey getMorbidityDetailsPKey() {
        return morbidityDetailsPKey;
    }

    public void setMorbidityDetailsPKey(MorbidityDetailsPKey morbidityDetailsPKey) {
        this.morbidityDetailsPKey = morbidityDetailsPKey;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
}
