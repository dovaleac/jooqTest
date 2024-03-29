/*
 * This file is generated by jOOQ.
 */
package com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables;


import com.dovaleac.guessing.game.jooq.jklingsporn.generated.Dealers;
import com.dovaleac.guessing.game.jooq.jklingsporn.generated.Keys;
import com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.records.ContactInformationRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class ContactInformation extends TableImpl<ContactInformationRecord> {

    private static final long serialVersionUID = -1084481906;

    /**
     * The reference instance of <code>dealers.contact_information</code>
     */
    public static final ContactInformation CONTACT_INFORMATION = new ContactInformation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContactInformationRecord> getRecordType() {
        return ContactInformationRecord.class;
    }

    /**
     * The column <code>dealers.contact_information.id</code>.
     */
    public final TableField<ContactInformationRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('dealers.contact_information_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>dealers.contact_information.name</code>.
     */
    public final TableField<ContactInformationRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>dealers.contact_information.email</code>.
     */
    public final TableField<ContactInformationRecord, String> EMAIL = createField(DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.contact_information.phone_number</code>.
     */
    public final TableField<ContactInformationRecord, String> PHONE_NUMBER = createField(DSL.name("phone_number"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.contact_information.user_created</code>.
     */
    public final TableField<ContactInformationRecord, String> USER_CREATED = createField(DSL.name("user_created"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.contact_information.user_updated</code>.
     */
    public final TableField<ContactInformationRecord, String> USER_UPDATED = createField(DSL.name("user_updated"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.contact_information.user_deleted</code>.
     */
    public final TableField<ContactInformationRecord, String> USER_DELETED = createField(DSL.name("user_deleted"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>dealers.contact_information.creation_date</code>.
     */
    public final TableField<ContactInformationRecord, OffsetDateTime> CREATION_DATE = createField(DSL.name("creation_date"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>dealers.contact_information.update_date</code>.
     */
    public final TableField<ContactInformationRecord, OffsetDateTime> UPDATE_DATE = createField(DSL.name("update_date"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * The column <code>dealers.contact_information.deletion_date</code>.
     */
    public final TableField<ContactInformationRecord, OffsetDateTime> DELETION_DATE = createField(DSL.name("deletion_date"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * Create a <code>dealers.contact_information</code> table reference
     */
    public ContactInformation() {
        this(DSL.name("contact_information"), null);
    }

    /**
     * Create an aliased <code>dealers.contact_information</code> table reference
     */
    public ContactInformation(String alias) {
        this(DSL.name(alias), CONTACT_INFORMATION);
    }

    /**
     * Create an aliased <code>dealers.contact_information</code> table reference
     */
    public ContactInformation(Name alias) {
        this(alias, CONTACT_INFORMATION);
    }

    private ContactInformation(Name alias, Table<ContactInformationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ContactInformation(Name alias, Table<ContactInformationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ContactInformation(Table<O> child, ForeignKey<O, ContactInformationRecord> key) {
        super(child, key, CONTACT_INFORMATION);
    }

    @Override
    public Schema getSchema() {
        return Dealers.DEALERS;
    }

    @Override
    public Identity<ContactInformationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CONTACT_INFORMATION;
    }

    @Override
    public UniqueKey<ContactInformationRecord> getPrimaryKey() {
        return Keys.CONTACT_INFORMATION_PKEY;
    }

    @Override
    public List<UniqueKey<ContactInformationRecord>> getKeys() {
        return Arrays.<UniqueKey<ContactInformationRecord>>asList(Keys.CONTACT_INFORMATION_PKEY);
    }

    @Override
    public ContactInformation as(String alias) {
        return new ContactInformation(DSL.name(alias), this);
    }

    @Override
    public ContactInformation as(Name alias) {
        return new ContactInformation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContactInformation rename(String name) {
        return new ContactInformation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ContactInformation rename(Name name) {
        return new ContactInformation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Integer, String, String, String, String, String, String, OffsetDateTime, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
