/*
 * This file is generated by jOOQ.
 */
package com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables;


import com.dovaleac.guessing.game.jooq.jklingsporn.generated.Dealers;
import com.dovaleac.guessing.game.jooq.jklingsporn.generated.Keys;
import com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.records.AccountingSystemRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class AccountingSystem extends TableImpl<AccountingSystemRecord> {

    private static final long serialVersionUID = -969100305;

    /**
     * The reference instance of <code>dealers.accounting_system</code>
     */
    public static final AccountingSystem ACCOUNTING_SYSTEM = new AccountingSystem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AccountingSystemRecord> getRecordType() {
        return AccountingSystemRecord.class;
    }

    /**
     * The column <code>dealers.accounting_system.id</code>.
     */
    public final TableField<AccountingSystemRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('dealers.accounting_system_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dealers.accounting_system.code</code>.
     */
    public final TableField<AccountingSystemRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CHAR(20).nullable(false), this, "");

    /**
     * The column <code>dealers.accounting_system.description</code>.
     */
    public final TableField<AccountingSystemRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.accounting_system.user_created</code>.
     */
    public final TableField<AccountingSystemRecord, String> USER_CREATED = createField(DSL.name("user_created"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.accounting_system.user_updated</code>.
     */
    public final TableField<AccountingSystemRecord, String> USER_UPDATED = createField(DSL.name("user_updated"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.accounting_system.user_deleted</code>.
     */
    public final TableField<AccountingSystemRecord, String> USER_DELETED = createField(DSL.name("user_deleted"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.accounting_system.creation_date</code>.
     */
    public final TableField<AccountingSystemRecord, OffsetDateTime> CREATION_DATE = createField(DSL.name("creation_date"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>dealers.accounting_system.update_date</code>.
     */
    public final TableField<AccountingSystemRecord, OffsetDateTime> UPDATE_DATE = createField(DSL.name("update_date"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>dealers.accounting_system.deletion_date</code>.
     */
    public final TableField<AccountingSystemRecord, OffsetDateTime> DELETION_DATE = createField(DSL.name("deletion_date"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * Create a <code>dealers.accounting_system</code> table reference
     */
    public AccountingSystem() {
        this(DSL.name("accounting_system"), null);
    }

    /**
     * Create an aliased <code>dealers.accounting_system</code> table reference
     */
    public AccountingSystem(String alias) {
        this(DSL.name(alias), ACCOUNTING_SYSTEM);
    }

    /**
     * Create an aliased <code>dealers.accounting_system</code> table reference
     */
    public AccountingSystem(Name alias) {
        this(alias, ACCOUNTING_SYSTEM);
    }

    private AccountingSystem(Name alias, Table<AccountingSystemRecord> aliased) {
        this(alias, aliased, null);
    }

    private AccountingSystem(Name alias, Table<AccountingSystemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> AccountingSystem(Table<O> child, ForeignKey<O, AccountingSystemRecord> key) {
        super(child, key, ACCOUNTING_SYSTEM);
    }

    @Override
    public Schema getSchema() {
        return Dealers.DEALERS;
    }

    @Override
    public Identity<AccountingSystemRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ACCOUNTING_SYSTEM;
    }

    @Override
    public UniqueKey<AccountingSystemRecord> getPrimaryKey() {
        return Keys.ACCOUNTING_SYSTEM_PKEY;
    }

    @Override
    public List<UniqueKey<AccountingSystemRecord>> getKeys() {
        return Arrays.<UniqueKey<AccountingSystemRecord>>asList(Keys.ACCOUNTING_SYSTEM_PKEY);
    }

    @Override
    public AccountingSystem as(String alias) {
        return new AccountingSystem(DSL.name(alias), this);
    }

    @Override
    public AccountingSystem as(Name alias) {
        return new AccountingSystem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AccountingSystem rename(String name) {
        return new AccountingSystem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AccountingSystem rename(Name name) {
        return new AccountingSystem(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, String, String, String, OffsetDateTime, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}