/*
 * This file is generated by jOOQ.
 */
package com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.daos;


import com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.DealerContact;
import com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.records.DealerContactRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;

import java.time.OffsetDateTime;
import java.util.Collection;

import org.jooq.Configuration;


import java.util.List;
import io.reactivex.Single;
import java.util.Optional;
import io.github.jklingsporn.vertx.jooq.rx.reactivepg.ReactiveRXQueryExecutor;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DealerContactDao extends AbstractReactiveVertxDAO<DealerContactRecord, com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact, Integer, Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>>, Single<Optional<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>>, Single<Integer>, Single<Integer>> implements io.github.jklingsporn.vertx.jooq.rx.VertxDAO<DealerContactRecord,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact,Integer> {

    /**
     * @param configuration The Configuration used for rendering and query execution.
     * @param vertx the vertx instance
     */
    public DealerContactDao(Configuration configuration, io.vertx.reactivex.sqlclient.SqlClient delegate) {
        super(DealerContact.DEALER_CONTACT, com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact.class, new ReactiveRXQueryExecutor<DealerContactRecord,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact,Integer>(configuration,delegate,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.mappers.RowMappers.getDealerContactMapper()));
    }

    @Override
    protected Integer getId(com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact object) {
        return object.getId();
    }

    /**
     * Find records that have <code>contact_information_id IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>> findManyByContactInformationId(Collection<Integer> values) {
        return findManyByCondition(DealerContact.DEALER_CONTACT.CONTACT_INFORMATION_ID.in(values));
    }

    /**
     * Find records that have <code>contact_information_id IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>> findManyByContactInformationId(Collection<Integer> values, int limit) {
        return findManyByCondition(DealerContact.DEALER_CONTACT.CONTACT_INFORMATION_ID.in(values),limit);
    }

    /**
     * Find records that have <code>dealer_id IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>> findManyByDealerId(Collection<Integer> values) {
        return findManyByCondition(DealerContact.DEALER_CONTACT.DEALER_ID.in(values));
    }

    /**
     * Find records that have <code>dealer_id IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>> findManyByDealerId(Collection<Integer> values, int limit) {
        return findManyByCondition(DealerContact.DEALER_CONTACT.DEALER_ID.in(values),limit);
    }

    /**
     * Find records that have <code>user_created IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>> findManyByUserCreated(Collection<String> values) {
        return findManyByCondition(DealerContact.DEALER_CONTACT.USER_CREATED.in(values));
    }

    /**
     * Find records that have <code>user_created IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>> findManyByUserCreated(Collection<String> values, int limit) {
        return findManyByCondition(DealerContact.DEALER_CONTACT.USER_CREATED.in(values),limit);
    }

    /**
     * Find records that have <code>user_updated IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>> findManyByUserUpdated(Collection<String> values) {
        return findManyByCondition(DealerContact.DEALER_CONTACT.USER_UPDATED.in(values));
    }

    /**
     * Find records that have <code>user_updated IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>> findManyByUserUpdated(Collection<String> values, int limit) {
        return findManyByCondition(DealerContact.DEALER_CONTACT.USER_UPDATED.in(values),limit);
    }

    /**
     * Find records that have <code>user_deleted IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>> findManyByUserDeleted(Collection<String> values) {
        return findManyByCondition(DealerContact.DEALER_CONTACT.USER_DELETED.in(values));
    }

    /**
     * Find records that have <code>user_deleted IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>> findManyByUserDeleted(Collection<String> values, int limit) {
        return findManyByCondition(DealerContact.DEALER_CONTACT.USER_DELETED.in(values),limit);
    }

    /**
     * Find records that have <code>creation_date IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>> findManyByCreationDate(Collection<OffsetDateTime> values) {
        return findManyByCondition(DealerContact.DEALER_CONTACT.CREATION_DATE.in(values));
    }

    /**
     * Find records that have <code>creation_date IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>> findManyByCreationDate(Collection<OffsetDateTime> values, int limit) {
        return findManyByCondition(DealerContact.DEALER_CONTACT.CREATION_DATE.in(values),limit);
    }

    /**
     * Find records that have <code>update_date IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>> findManyByUpdateDate(Collection<OffsetDateTime> values) {
        return findManyByCondition(DealerContact.DEALER_CONTACT.UPDATE_DATE.in(values));
    }

    /**
     * Find records that have <code>update_date IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>> findManyByUpdateDate(Collection<OffsetDateTime> values, int limit) {
        return findManyByCondition(DealerContact.DEALER_CONTACT.UPDATE_DATE.in(values),limit);
    }

    /**
     * Find records that have <code>deletion_date IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>> findManyByDeletionDate(Collection<OffsetDateTime> values) {
        return findManyByCondition(DealerContact.DEALER_CONTACT.DELETION_DATE.in(values));
    }

    /**
     * Find records that have <code>deletion_date IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact>> findManyByDeletionDate(Collection<OffsetDateTime> values, int limit) {
        return findManyByCondition(DealerContact.DEALER_CONTACT.DELETION_DATE.in(values),limit);
    }

    @Override
    public ReactiveRXQueryExecutor<DealerContactRecord,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact,Integer> queryExecutor(){
        return (ReactiveRXQueryExecutor<DealerContactRecord,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact,Integer>) super.queryExecutor();
    }
}