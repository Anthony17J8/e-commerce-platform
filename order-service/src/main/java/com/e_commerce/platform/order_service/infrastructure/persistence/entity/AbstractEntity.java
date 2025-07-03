package com.e_commerce.platform.order_service.infrastructure.persistence.entity;

import jakarta.persistence.PostLoad;
import jakarta.persistence.PostPersist;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;

public abstract class AbstractEntity<ID> implements Persistable<ID> {

    @Transient
    private boolean isNew = true;

    @Override
    public boolean isNew() {
        return isNew;
    }

    @PostPersist
    @PostLoad
    void markToNew() {
        this.isNew = false;
    }
}
