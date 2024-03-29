/*
 * This file is generated by jOOQ.
 */
package com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.daos;


import com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.ContactPurpose;
import com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.records.ContactPurposeRecord;

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
public class ContactPurposeDao extends AbstractReactiveVertxDAO<ContactPurposeRecord, com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose, Integer, Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>>, Single<Optional<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>>, Single<Integer>, Single<Integer>> implements io.github.jklingsporn.vertx.jooq.rx.VertxDAO<ContactPurposeRecord,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose,Integer> {

    /**
     * @param configuration The Configuration used for rendering and query execution.
     * @param vertx the vertx instance
     */
    public ContactPurposeDao(Configuration configuration, io.vertx.reactivex.sqlclient.SqlClient delegate) {
        super(ContactPurpose.CONTACT_PURPOSE, com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose.class, new ReactiveRXQueryExecutor<ContactPurposeRecord,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose,Integer>(configuration,delegate,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.mappers.RowMappers.getContactPurposeMapper()));
    }

    @Override
    protected Integer getId(com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose object) {
        return object.getId();
    }

    /**
     * Find records that have <code>contact_information_id IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>> findManyByContactInformationId(Collection<Integer> values) {
        return findManyByCondition(ContactPurpose.CONTACT_PURPOSE.CONTACT_INFORMATION_ID.in(values));
    }

    /**
     * Find records that have <code>contact_information_id IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>> findManyByContactInformationId(Collection<Integer> values, int limit) {
        return findManyByCondition(ContactPurpose.CONTACT_PURPOSE.CONTACT_INFORMATION_ID.in(values),limit);
    }

    /**
     * Find records that have <code>purpose_id IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>> findManyByPurposeId(Collection<Integer> values) {
        return findManyByCondition(ContactPurpose.CONTACT_PURPOSE.PURPOSE_ID.in(values));
    }

    /**
     * Find records that have <code>purpose_id IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>> findManyByPurposeId(Collection<Integer> values, int limit) {
        return findManyByCondition(ContactPurpose.CONTACT_PURPOSE.PURPOSE_ID.in(values),limit);
    }

    /**
     * Find records that have <code>user_created IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>> findManyByUserCreated(Collection<String> values) {
        return findManyByCondition(ContactPurpose.CONTACT_PURPOSE.USER_CREATED.in(values));
    }

    /**
     * Find records that have <code>user_created IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>> findManyByUserCreated(Collection<String> values, int limit) {
        return findManyByCondition(ContactPurpose.CONTACT_PURPOSE.USER_CREATED.in(values),limit);
    }

    /**
     * Find records that have <code>user_updated IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>> findManyByUserUpdated(Collection<String> values) {
        return findManyByCondition(ContactPurpose.CONTACT_PURPOSE.USER_UPDATED.in(values));
    }

    /**
     * Find records that have <code>user_updated IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>> findManyByUserUpdated(Collection<String> values, int limit) {
        return findManyByCondition(ContactPurpose.CONTACT_PURPOSE.USER_UPDATED.in(values),limit);
    }

    /**
     * Find records that have <code>user_deleted IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>> findManyByUserDeleted(Collection<String> values) {
        return findManyByCondition(ContactPurpose.CONTACT_PURPOSE.USER_DELETED.in(values));
    }

    /**
     * Find records that have <code>user_deleted IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>> findManyByUserDeleted(Collection<String> values, int limit) {
        return findManyByCondition(ContactPurpose.CONTACT_PURPOSE.USER_DELETED.in(values),limit);
    }

    /**
     * Find records that have <code>creation_date IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>> findManyByCreationDate(Collection<OffsetDateTime> values) {
        return findManyByCondition(ContactPurpose.CONTACT_PURPOSE.CREATION_DATE.in(values));
    }

    /**
     * Find records that have <code>creation_date IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>> findManyByCreationDate(Collection<OffsetDateTime> values, int limit) {
        return findManyByCondition(ContactPurpose.CONTACT_PURPOSE.CREATION_DATE.in(values),limit);
    }

    /**
     * Find records that have <code>update_date IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>> findManyByUpdateDate(Collection<OffsetDateTime> values) {
        return findManyByCondition(ContactPurpose.CONTACT_PURPOSE.UPDATE_DATE.in(values));
    }

    /**
     * Find records that have <code>update_date IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>> findManyByUpdateDate(Collection<OffsetDateTime> values, int limit) {
        return findManyByCondition(ContactPurpose.CONTACT_PURPOSE.UPDATE_DATE.in(values),limit);
    }

    /**
     * Find records that have <code>deletion_date IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>> findManyByDeletionDate(Collection<OffsetDateTime> values) {
        return findManyByCondition(ContactPurpose.CONTACT_PURPOSE.DELETION_DATE.in(values));
    }

    /**
     * Find records that have <code>deletion_date IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose>> findManyByDeletionDate(Collection<OffsetDateTime> values, int limit) {
        return findManyByCondition(ContactPurpose.CONTACT_PURPOSE.DELETION_DATE.in(values),limit);
    }

    @Override
    public ReactiveRXQueryExecutor<ContactPurposeRecord,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose,Integer> queryExecutor(){
        return (ReactiveRXQueryExecutor<ContactPurposeRecord,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose,Integer>) super.queryExecutor();
    }
}
