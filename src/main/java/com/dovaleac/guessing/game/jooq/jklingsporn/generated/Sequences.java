/*
 * This file is generated by jOOQ.
 */
package com.dovaleac.guessing.game.jooq.jklingsporn.generated;


import org.jooq.Sequence;
import org.jooq.impl.Internal;


/**
 * Convenience access to all sequences in dealers
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>dealers.accounting_system_id_seq</code>
     */
    public static final Sequence<Integer> ACCOUNTING_SYSTEM_ID_SEQ = Internal.createSequence("accounting_system_id_seq", Dealers.DEALERS, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>dealers.channel_id_seq</code>
     */
    public static final Sequence<Integer> CHANNEL_ID_SEQ = Internal.createSequence("channel_id_seq", Dealers.DEALERS, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>dealers.contact_information_id_seq</code>
     */
    public static final Sequence<Integer> CONTACT_INFORMATION_ID_SEQ = Internal.createSequence("contact_information_id_seq", Dealers.DEALERS, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>dealers.contact_purpose_id_seq</code>
     */
    public static final Sequence<Integer> CONTACT_PURPOSE_ID_SEQ = Internal.createSequence("contact_purpose_id_seq", Dealers.DEALERS, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>dealers.dealer_accounting_system_id_seq</code>
     */
    public static final Sequence<Integer> DEALER_ACCOUNTING_SYSTEM_ID_SEQ = Internal.createSequence("dealer_accounting_system_id_seq", Dealers.DEALERS, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>dealers.dealer_contact_id_seq</code>
     */
    public static final Sequence<Integer> DEALER_CONTACT_ID_SEQ = Internal.createSequence("dealer_contact_id_seq", Dealers.DEALERS, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>dealers.dealer_id_seq</code>
     */
    public static final Sequence<Integer> DEALER_ID_SEQ = Internal.createSequence("dealer_id_seq", Dealers.DEALERS, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>dealers.dealer_status_id_seq</code>
     */
    public static final Sequence<Integer> DEALER_STATUS_ID_SEQ = Internal.createSequence("dealer_status_id_seq", Dealers.DEALERS, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>dealers.level_id_seq</code>
     */
    public static final Sequence<Integer> LEVEL_ID_SEQ = Internal.createSequence("level_id_seq", Dealers.DEALERS, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>dealers.manager_id_seq</code>
     */
    public static final Sequence<Integer> MANAGER_ID_SEQ = Internal.createSequence("manager_id_seq", Dealers.DEALERS, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>dealers.purpose_id_seq</code>
     */
    public static final Sequence<Integer> PURPOSE_ID_SEQ = Internal.createSequence("purpose_id_seq", Dealers.DEALERS, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);

    /**
     * The sequence <code>dealers.subchannel_id_seq</code>
     */
    public static final Sequence<Integer> SUBCHANNEL_ID_SEQ = Internal.createSequence("subchannel_id_seq", Dealers.DEALERS, org.jooq.impl.SQLDataType.INTEGER.nullable(false), null, null, null, null, false, null);
}
