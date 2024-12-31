package com.xworkz.commonModule.entity;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class AbstractAuditEntity implements Serializable {
    private LocalDateTime createdOn=LocalDateTime.now();
    private String createdBy;
    private LocalDateTime updatedOn=LocalDateTime.now();
    private String updatedBy;
}
