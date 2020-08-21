/*
 * This file is generated by jOOQ.
 */
package com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables;


import com.dovaleac.guessing.game.jooq.jklingsporn.generated.Dealers;
import com.dovaleac.guessing.game.jooq.jklingsporn.generated.Keys;
import com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.records.ManagerRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Manager extends TableImpl<ManagerRecord> {

    private static final long serialVersionUID = 764129948;

    /**
     * The reference instance of <code>dealers.manager</code>
     */
    public static final Manager MANAGER = new Manager();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ManagerRecord> getRecordType() {
        return ManagerRecord.class;
    }

    /**
     * The column <code>dealers.manager.id</code>.
     */
    public final TableField<ManagerRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('dealers.manager_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dealers.manager.code</code>.
     */
    public final TableField<ManagerRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CHAR(30).nullable(false), this, "");

    /**
     * The column <code>dealers.manager.name</code>.
     */
    public final TableField<ManagerRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>dealers.manager.surname</code>.
     */
    public final TableField<ManagerRecord, String> SURNAME = createField(DSL.name("surname"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.manager.type</code>.
     */
    public final TableField<ManagerRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.manager.user_created</code>.
     */
    public final TableField<ManagerRecord, String> USER_CREATED = createField(DSL.name("user_created"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.manager.user_updated</code>.
     */
    public final TableField<ManagerRecord, String> USER_UPDATED = createField(DSL.name("user_updated"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.manager.user_deleted</code>.
     */
    public final TableField<ManagerRecord, String> USER_DELETED = createField(DSL.name("user_deleted"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.manager.creation_date</code>.
     */
    public final TableField<ManagerRecord, OffsetDateTime> CREATION_DATE = createField(DSL.name("creation_date"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>dealers.manager.update_date</code>.
     */
    public final TableField<ManagerRecord, OffsetDateTime> UPDATE_DATE = createField(DSL.name("update_date"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>dealers.manager.deletion_date</code>.
     */
    public final TableField<ManagerRecord, OffsetDateTime> DELETION_DATE = createField(DSL.name("deletion_date"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * Create a <code>dealers.manager</code> table reference
     */
    public Manager() {
        this(DSL.name("manager"), null);
    }

    /**
     * Create an aliased <code>dealers.manager</code> table reference
     */
    public Manager(String alias) {
        this(DSL.name(alias), MANAGER);
    }

    /**
     * Create an aliased <code>dealers.manager</code> table reference
     */
    public Manager(Name alias) {
        this(alias, MANAGER);
    }

    private Manager(Name alias, Table<ManagerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Manager(Name alias, Table<ManagerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Manager(Table<O> child, ForeignKey<O, ManagerRecord> key) {
        super(child, key, MANAGER);
    }

    @Override
    public Schema getSchema() {
        return Dealers.DEALERS;
    }

    @Override
    public Identity<ManagerRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MANAGER;
    }

    @Override
    public UniqueKey<ManagerRecord> getPrimaryKey() {
        return Keys.MANAGER_PKEY;
    }

    @Override
    public List<UniqueKey<ManagerRecord>> getKeys() {
        return Arrays.<UniqueKey<ManagerRecord>>asList(Keys.MANAGER_PKEY);
    }

    @Override
    public Manager as(String alias) {
        return new Manager(DSL.name(alias), this);
    }

    @Override
    public Manager as(Name alias) {
        return new Manager(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Manager rename(String name) {
        return new Manager(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Manager rename(Name name) {
        return new Manager(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, String, String, String, String, String, String, OffsetDateTime, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}