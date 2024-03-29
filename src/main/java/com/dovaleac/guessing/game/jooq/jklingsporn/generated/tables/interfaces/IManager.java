/*
 * This file is generated by jOOQ.
 */
package com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.UnexpectedJsonValueType;
import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.OffsetDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IManager extends VertxPojo, Serializable {

    /**
     * Setter for <code>dealers.manager.id</code>.
     */
    public IManager setId(Integer value);

    /**
     * Getter for <code>dealers.manager.id</code>.
     */
    public Integer getId();

    /**
     * Setter for <code>dealers.manager.code</code>.
     */
    public IManager setCode(String value);

    /**
     * Getter for <code>dealers.manager.code</code>.
     */
    public String getCode();

    /**
     * Setter for <code>dealers.manager.name</code>.
     */
    public IManager setName(String value);

    /**
     * Getter for <code>dealers.manager.name</code>.
     */
    public String getName();

    /**
     * Setter for <code>dealers.manager.surname</code>.
     */
    public IManager setSurname(String value);

    /**
     * Getter for <code>dealers.manager.surname</code>.
     */
    public String getSurname();

    /**
     * Setter for <code>dealers.manager.type</code>.
     */
    public IManager setType(String value);

    /**
     * Getter for <code>dealers.manager.type</code>.
     */
    public String getType();

    /**
     * Setter for <code>dealers.manager.user_created</code>.
     */
    public IManager setUserCreated(String value);

    /**
     * Getter for <code>dealers.manager.user_created</code>.
     */
    public String getUserCreated();

    /**
     * Setter for <code>dealers.manager.user_updated</code>.
     */
    public IManager setUserUpdated(String value);

    /**
     * Getter for <code>dealers.manager.user_updated</code>.
     */
    public String getUserUpdated();

    /**
     * Setter for <code>dealers.manager.user_deleted</code>.
     */
    public IManager setUserDeleted(String value);

    /**
     * Getter for <code>dealers.manager.user_deleted</code>.
     */
    public String getUserDeleted();

    /**
     * Setter for <code>dealers.manager.creation_date</code>.
     */
    public IManager setCreationDate(OffsetDateTime value);

    /**
     * Getter for <code>dealers.manager.creation_date</code>.
     */
    public OffsetDateTime getCreationDate();

    /**
     * Setter for <code>dealers.manager.update_date</code>.
     */
    public IManager setUpdateDate(OffsetDateTime value);

    /**
     * Getter for <code>dealers.manager.update_date</code>.
     */
    public OffsetDateTime getUpdateDate();

    /**
     * Setter for <code>dealers.manager.deletion_date</code>.
     */
    public IManager setDeletionDate(OffsetDateTime value);

    /**
     * Getter for <code>dealers.manager.deletion_date</code>.
     */
    public OffsetDateTime getDeletionDate();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IManager
     */
    public void from(IManager from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IManager
     */
    public <E extends IManager> E into(E into);

    @Override
    public default IManager fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getInteger("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.Integer",e);
        }
        try {
            setCode(json.getString("code"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("code","java.lang.String",e);
        }
        try {
            setName(json.getString("name"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("name","java.lang.String",e);
        }
        try {
            setSurname(json.getString("surname"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("surname","java.lang.String",e);
        }
        try {
            setType(json.getString("type"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("type","java.lang.String",e);
        }
        try {
            setUserCreated(json.getString("user_created"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("user_created","java.lang.String",e);
        }
        try {
            setUserUpdated(json.getString("user_updated"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("user_updated","java.lang.String",e);
        }
        try {
            setUserDeleted(json.getString("user_deleted"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("user_deleted","java.lang.String",e);
        }
        try {
            String creation_dateString = json.getString("creation_date");
            setCreationDate(creation_dateString == null?null:java.time.OffsetDateTime.parse(creation_dateString));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("creation_date","java.time.OffsetDateTime",e);
        }
        try {
            String update_dateString = json.getString("update_date");
            setUpdateDate(update_dateString == null?null:java.time.OffsetDateTime.parse(update_dateString));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("update_date","java.time.OffsetDateTime",e);
        }
        try {
            String deletion_dateString = json.getString("deletion_date");
            setDeletionDate(deletion_dateString == null?null:java.time.OffsetDateTime.parse(deletion_dateString));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("deletion_date","java.time.OffsetDateTime",e);
        }
        return this;
    }


    @Override
    public default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("id",getId());
        json.put("code",getCode());
        json.put("name",getName());
        json.put("surname",getSurname());
        json.put("type",getType());
        json.put("user_created",getUserCreated());
        json.put("user_updated",getUserUpdated());
        json.put("user_deleted",getUserDeleted());
        json.put("creation_date",getCreationDate()==null?null:getCreationDate().toString());
        json.put("update_date",getUpdateDate()==null?null:getUpdateDate().toString());
        json.put("deletion_date",getDeletionDate()==null?null:getDeletionDate().toString());
        return json;
    }

}
