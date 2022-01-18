package com.example.demo;

import javax.persistence.*;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

@MappedSuperclass
public class BaseEntity {


    @Id
    @Column(name = "id",updatable = false,nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Version
    @Column(name = "OPT_LOCK_VERSION", columnDefinition = "bigint DEFAULT 0", nullable = false)
    private long optlockVersion = 0L;

    @Column(name="creation_ts",insertable = true,updatable = false)
    private ZonedDateTime creation_ts = ZonedDateTime.now().withZoneSameInstant(ZoneOffset.UTC);

    @Column(name="update_ts",updatable = true)
    private ZonedDateTime update_ts;

    @PrePersist
    void prePersist()
    {
        creation_ts = ZonedDateTime.now().withZoneSameInstant(ZoneOffset.UTC);
    }

    @PreUpdate
    void preUpdate()
    {
        update_ts = ZonedDateTime.now().withZoneSameInstant(ZoneOffset.UTC);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getOptlockVersion() {
        return optlockVersion;
    }

    public void setOptlockVersion(long optlockVersion) {
        this.optlockVersion = optlockVersion;
    }

    public ZonedDateTime getCreation_ts() {
        return creation_ts;
    }

    public void setCreation_ts(ZonedDateTime creation_ts) {
        this.creation_ts = creation_ts;
    }

    public ZonedDateTime getUpdate_ts() {
        return update_ts;
    }

    public void setUpdate_ts(ZonedDateTime update_ts) {
        this.update_ts = update_ts;
    }
}
