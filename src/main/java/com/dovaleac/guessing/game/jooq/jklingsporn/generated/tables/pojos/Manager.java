/*
 * This file is generated by jOOQ.
 */
package com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos;


import com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.interfaces.IManager;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.OffsetDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Manager implements VertxPojo, IManager {

    private static final long serialVersionUID = 1699006618;

    private Integer        id;
    private String         code;
    private String         name;
    private String         surname;
    private String         type;
    private String         userCreated;
    private String         userUpdated;
    private String         userDeleted;
    private OffsetDateTime creationDate;
    private OffsetDateTime updateDate;
    private OffsetDateTime deletionDate;

    public Manager() {}

    public Manager(IManager value) {
        this.id = value.getId();
        this.code = value.getCode();
        this.name = value.getName();
        this.surname = value.getSurname();
        this.type = value.getType();
        this.userCreated = value.getUserCreated();
        this.userUpdated = value.getUserUpdated();
        this.userDeleted = value.getUserDeleted();
        this.creationDate = value.getCreationDate();
        this.updateDate = value.getUpdateDate();
        this.deletionDate = value.getDeletionDate();
    }

    public Manager(
        Integer        id,
        String         code,
        String         name,
        String         surname,
        String         type,
        String         userCreated,
        String         userUpdated,
        String         userDeleted,
        OffsetDateTime creationDate,
        OffsetDateTime updateDate,
        OffsetDateTime deletionDate
    ) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.surname = surname;
        this.type = type;
        this.userCreated = userCreated;
        this.userUpdated = userUpdated;
        this.userDeleted = userDeleted;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.deletionDate = deletionDate;
    }

    public Manager(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public Manager setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public Manager setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Manager setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public Manager setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public Manager setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String getUserCreated() {
        return this.userCreated;
    }

    @Override
    public Manager setUserCreated(String userCreated) {
        this.userCreated = userCreated;
        return this;
    }

    @Override
    public String getUserUpdated() {
        return this.userUpdated;
    }

    @Override
    public Manager setUserUpdated(String userUpdated) {
        this.userUpdated = userUpdated;
        return this;
    }

    @Override
    public String getUserDeleted() {
        return this.userDeleted;
    }

    @Override
    public Manager setUserDeleted(String userDeleted) {
        this.userDeleted = userDeleted;
        return this;
    }

    @Override
    public OffsetDateTime getCreationDate() {
        return this.creationDate;
    }

    @Override
    public Manager setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    @Override
    public OffsetDateTime getUpdateDate() {
        return this.updateDate;
    }

    @Override
    public Manager setUpdateDate(OffsetDateTime updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    @Override
    public OffsetDateTime getDeletionDate() {
        return this.deletionDate;
    }

    @Override
    public Manager setDeletionDate(OffsetDateTime deletionDate) {
        this.deletionDate = deletionDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Manager (");

        sb.append(id);
        sb.append(", ").append(code);
        sb.append(", ").append(name);
        sb.append(", ").append(surname);
        sb.append(", ").append(type);
        sb.append(", ").append(userCreated);
        sb.append(", ").append(userUpdated);
        sb.append(", ").append(userDeleted);
        sb.append(", ").append(creationDate);
        sb.append(", ").append(updateDate);
        sb.append(", ").append(deletionDate);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IManager from) {
        setId(from.getId());
        setCode(from.getCode());
        setName(from.getName());
        setSurname(from.getSurname());
        setType(from.getType());
        setUserCreated(from.getUserCreated());
        setUserUpdated(from.getUserUpdated());
        setUserDeleted(from.getUserDeleted());
        setCreationDate(from.getCreationDate());
        setUpdateDate(from.getUpdateDate());
        setDeletionDate(from.getDeletionDate());
    }

    @Override
    public <E extends IManager> E into(E into) {
        into.from(this);
        return into;
    }
}