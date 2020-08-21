/*
 * This file is generated by jOOQ.
 */
package com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables;


import com.dovaleac.guessing.game.jooq.jklingsporn.generated.Dealers;
import com.dovaleac.guessing.game.jooq.jklingsporn.generated.Keys;
import com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.records.DealerRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
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
public class Dealer extends TableImpl<DealerRecord> {

    private static final long serialVersionUID = 950698055;

    /**
     * The reference instance of <code>dealers.dealer</code>
     */
    public static final Dealer DEALER = new Dealer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DealerRecord> getRecordType() {
        return DealerRecord.class;
    }

    /**
     * The column <code>dealers.dealer.id</code>.
     */
    public final TableField<DealerRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('dealers.dealer_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dealers.dealer.code</code>.
     */
    public final TableField<DealerRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CHAR(10).nullable(false), this, "");

    /**
     * The column <code>dealers.dealer.comercial_name</code>.
     */
    public final TableField<DealerRecord, String> COMERCIAL_NAME = createField(DSL.name("comercial_name"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>dealers.dealer.level_id</code>.
     */
    public final TableField<DealerRecord, Integer> LEVEL_ID = createField(DSL.name("level_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dealers.dealer.status_id</code>.
     */
    public final TableField<DealerRecord, Integer> STATUS_ID = createField(DSL.name("status_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>dealers.dealer.parent_id</code>.
     */
    public final TableField<DealerRecord, Integer> PARENT_ID = createField(DSL.name("parent_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>dealers.dealer.subchannel_id</code>.
     */
    public final TableField<DealerRecord, Integer> SUBCHANNEL_ID = createField(DSL.name("subchannel_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>dealers.dealer.internal_manager_id</code>.
     */
    public final TableField<DealerRecord, Integer> INTERNAL_MANAGER_ID = createField(DSL.name("internal_manager_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>dealers.dealer.external_manager_id</code>.
     */
    public final TableField<DealerRecord, Integer> EXTERNAL_MANAGER_ID = createField(DSL.name("external_manager_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>dealers.dealer.commissioning_section</code>.
     */
    public final TableField<DealerRecord, String> COMMISSIONING_SECTION = createField(DSL.name("commissioning_section"), org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>dealers.dealer.store_type</code>.
     */
    public final TableField<DealerRecord, String> STORE_TYPE = createField(DSL.name("store_type"), org.jooq.impl.SQLDataType.CHAR(20), this, "");

    /**
     * The column <code>dealers.dealer.company_type</code>.
     */
    public final TableField<DealerRecord, String> COMPANY_TYPE = createField(DSL.name("company_type"), org.jooq.impl.SQLDataType.CHAR(20), this, "");

    /**
     * The column <code>dealers.dealer.document_type</code>.
     */
    public final TableField<DealerRecord, String> DOCUMENT_TYPE = createField(DSL.name("document_type"), org.jooq.impl.SQLDataType.CHAR(10), this, "");

    /**
     * The column <code>dealers.dealer.document_number</code>.
     */
    public final TableField<DealerRecord, String> DOCUMENT_NUMBER = createField(DSL.name("document_number"), org.jooq.impl.SQLDataType.CHAR(20), this, "");

    /**
     * The column <code>dealers.dealer.company_name</code>.
     */
    public final TableField<DealerRecord, String> COMPANY_NAME = createField(DSL.name("company_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.dealer.address</code>.
     */
    public final TableField<DealerRecord, String> ADDRESS = createField(DSL.name("address"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.dealer.city</code>.
     */
    public final TableField<DealerRecord, String> CITY = createField(DSL.name("city"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.dealer.province</code>.
     */
    public final TableField<DealerRecord, String> PROVINCE = createField(DSL.name("province"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.dealer.user_created</code>.
     */
    public final TableField<DealerRecord, String> USER_CREATED = createField(DSL.name("user_created"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.dealer.user_updated</code>.
     */
    public final TableField<DealerRecord, String> USER_UPDATED = createField(DSL.name("user_updated"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.dealer.user_deleted</code>.
     */
    public final TableField<DealerRecord, String> USER_DELETED = createField(DSL.name("user_deleted"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.dealer.creation_date</code>.
     */
    public final TableField<DealerRecord, OffsetDateTime> CREATION_DATE = createField(DSL.name("creation_date"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>dealers.dealer.update_date</code>.
     */
    public final TableField<DealerRecord, OffsetDateTime> UPDATE_DATE = createField(DSL.name("update_date"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>dealers.dealer.deletion_date</code>.
     */
    public final TableField<DealerRecord, OffsetDateTime> DELETION_DATE = createField(DSL.name("deletion_date"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * Create a <code>dealers.dealer</code> table reference
     */
    public Dealer() {
        this(DSL.name("dealer"), null);
    }

    /**
     * Create an aliased <code>dealers.dealer</code> table reference
     */
    public Dealer(String alias) {
        this(DSL.name(alias), DEALER);
    }

    /**
     * Create an aliased <code>dealers.dealer</code> table reference
     */
    public Dealer(Name alias) {
        this(alias, DEALER);
    }

    private Dealer(Name alias, Table<DealerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Dealer(Name alias, Table<DealerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Dealer(Table<O> child, ForeignKey<O, DealerRecord> key) {
        super(child, key, DEALER);
    }

    @Override
    public Schema getSchema() {
        return Dealers.DEALERS;
    }

    @Override
    public Identity<DealerRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DEALER;
    }

    @Override
    public UniqueKey<DealerRecord> getPrimaryKey() {
        return Keys.DEALER_PKEY;
    }

    @Override
    public List<UniqueKey<DealerRecord>> getKeys() {
        return Arrays.<UniqueKey<DealerRecord>>asList(Keys.DEALER_PKEY);
    }

    @Override
    public List<ForeignKey<DealerRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DealerRecord, ?>>asList(Keys.DEALER__DEALER_LEVEL_ID_FKEY, Keys.DEALER__DEALER_STATUS_ID_FKEY, Keys.DEALER__DEALER_PARENT_ID_FKEY, Keys.DEALER__DEALER_SUBCHANNEL_ID_FKEY, Keys.DEALER__DEALER_INTERNAL_MANAGER_ID_FKEY, Keys.DEALER__DEALER_EXTERNAL_MANAGER_ID_FKEY);
    }

    public Level level() {
        return new Level(this, Keys.DEALER__DEALER_LEVEL_ID_FKEY);
    }

    public DealerStatus dealerStatus() {
        return new DealerStatus(this, Keys.DEALER__DEALER_STATUS_ID_FKEY);
    }

    public Dealer dealer() {
        return new Dealer(this, Keys.DEALER__DEALER_PARENT_ID_FKEY);
    }

    public Subchannel subchannel() {
        return new Subchannel(this, Keys.DEALER__DEALER_SUBCHANNEL_ID_FKEY);
    }

    public Manager dealerInternalManagerIdFkey() {
        return new Manager(this, Keys.DEALER__DEALER_INTERNAL_MANAGER_ID_FKEY);
    }

    public Manager dealerExternalManagerIdFkey() {
        return new Manager(this, Keys.DEALER__DEALER_EXTERNAL_MANAGER_ID_FKEY);
    }

    @Override
    public Dealer as(String alias) {
        return new Dealer(DSL.name(alias), this);
    }

    @Override
    public Dealer as(Name alias) {
        return new Dealer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Dealer rename(String name) {
        return new Dealer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Dealer rename(Name name) {
        return new Dealer(name, null);
    }
}
