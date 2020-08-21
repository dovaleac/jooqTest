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
public interface IContactPurpose extends VertxPojo, Serializable {

    /**
     * Setter for <code>dealers.contact_purpose.id</code>.
     */
    public IContactPurpose setId(Integer value);

    /**
     * Getter for <code>dealers.contact_purpose.id</code>.
     */
    public Integer getId();

    /**
     * Setter for <code>dealers.contact_purpose.contact_information_id</code>.
     */
    public IContactPurpose setContactInformationId(Integer value);

    /**
     * Getter for <code>dealers.contact_purpose.contact_information_id</code>.
     */
    public Integer getContactInformationId();

    /**
     * Setter for <code>dealers.contact_purpose.purpose_id</code>.
     */
    public IContactPurpose setPurposeId(Integer value);

    /**
     * Getter for <code>dealers.contact_purpose.purpose_id</code>.
     */
    public Integer getPurposeId();

    /**
     * Setter for <code>dealers.contact_purpose.user_created</code>.
     */
    public IContactPurpose setUserCreated(String value);

    /**
     * Getter for <code>dealers.contact_purpose.user_created</code>.
     */
    public String getUserCreated();

    /**
     * Setter for <code>dealers.contact_purpose.user_updated</code>.
     */
    public IContactPurpose setUserUpdated(String value);

    /**
     * Getter for <code>dealers.contact_purpose.user_updated</code>.
     */
    public String getUserUpdated();

    /**
     * Setter for <code>dealers.contact_purpose.user_deleted</code>.
     */
    public IContactPurpose setUserDeleted(String value);

    /**
     * Getter for <code>dealers.contact_purpose.user_deleted</code>.
     */
    public String getUserDeleted();

    /**
     * Setter for <code>dealers.contact_purpose.creation_date</code>.
     */
    public IContactPurpose setCreationDate(OffsetDateTime value);

    /**
     * Getter for <code>dealers.contact_purpose.creation_date</code>.
     */
    public OffsetDateTime getCreationDate();

    /**
     * Setter for <code>dealers.contact_purpose.update_date</code>.
     */
    public IContactPurpose setUpdateDate(OffsetDateTime value);

    /**
     * Getter for <code>dealers.contact_purpose.update_date</code>.
     */
    public OffsetDateTime getUpdateDate();

    /**
     * Setter for <code>dealers.contact_purpose.deletion_date</code>.
     */
    public IContactPurpose setDeletionDate(OffsetDateTime value);

    /**
     * Getter for <code>dealers.contact_purpose.deletion_date</code>.
     */
    public OffsetDateTime getDeletionDate();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IContactPurpose
     */
    public void from(IContactPurpose from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IContactPurpose
     */
    public <E extends IContactPurpose> E into(E into);

    @Override
    public default IContactPurpose fromJson(io.vertx.core.json.JsonObject json) {
        try {
            setId(json.getInteger("id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("id","java.lang.Integer",e);
        }
        try {
            setContactInformationId(json.getInteger("contact_information_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("contact_information_id","java.lang.Integer",e);
        }
        try {
            setPurposeId(json.getInteger("purpose_id"));
        } catch (java.lang.ClassCastException e) {
            throw new UnexpectedJsonValueType("purpose_id","java.lang.Integer",e);
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
        json.put("contact_information_id",getContactInformationId());
        json.put("purpose_id",getPurposeId());
        json.put("user_created",getUserCreated());
        json.put("user_updated",getUserUpdated());
        json.put("user_deleted",getUserDeleted());
        json.put("creation_date",getCreationDate()==null?null:getCreationDate().toString());
        json.put("update_date",getUpdateDate()==null?null:getUpdateDate().toString());
        json.put("deletion_date",getDeletionDate()==null?null:getDeletionDate().toString());
        return json;
    }

}
