/*
 * This file is generated by jOOQ.
 */
package com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.records;


import com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.Subchannel;
import com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.interfaces.ISubchannel;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SubchannelRecord extends UpdatableRecordImpl<SubchannelRecord> implements VertxPojo, Record4<Integer, String, String, Integer>, ISubchannel {

    private static final long serialVersionUID = -2084797300;

    /**
     * Setter for <code>dealers.subchannel.id</code>.
     */
    @Override
    public SubchannelRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>dealers.subchannel.id</code>.
     */
    @Override
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>dealers.subchannel.code</code>.
     */
    @Override
    public SubchannelRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>dealers.subchannel.code</code>.
     */
    @Override
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dealers.subchannel.name</code>.
     */
    @Override
    public SubchannelRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>dealers.subchannel.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dealers.subchannel.main_channel_id</code>.
     */
    @Override
    public SubchannelRecord setMainChannelId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>dealers.subchannel.main_channel_id</code>.
     */
    @Override
    public Integer getMainChannelId() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Subchannel.SUBCHANNEL.ID;
    }

    @Override
    public Field<String> field2() {
        return Subchannel.SUBCHANNEL.CODE;
    }

    @Override
    public Field<String> field3() {
        return Subchannel.SUBCHANNEL.NAME;
    }

    @Override
    public Field<Integer> field4() {
        return Subchannel.SUBCHANNEL.MAIN_CHANNEL_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public Integer component4() {
        return getMainChannelId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public Integer value4() {
        return getMainChannelId();
    }

    @Override
    public SubchannelRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public SubchannelRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public SubchannelRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public SubchannelRecord value4(Integer value) {
        setMainChannelId(value);
        return this;
    }

    @Override
    public SubchannelRecord values(Integer value1, String value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ISubchannel from) {
        setId(from.getId());
        setCode(from.getCode());
        setName(from.getName());
        setMainChannelId(from.getMainChannelId());
    }

    @Override
    public <E extends ISubchannel> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SubchannelRecord
     */
    public SubchannelRecord() {
        super(Subchannel.SUBCHANNEL);
    }

    /**
     * Create a detached, initialised SubchannelRecord
     */
    public SubchannelRecord(Integer id, String code, String name, Integer mainChannelId) {
        super(Subchannel.SUBCHANNEL);

        set(0, id);
        set(1, code);
        set(2, name);
        set(3, mainChannelId);
    }

    public SubchannelRecord(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}
