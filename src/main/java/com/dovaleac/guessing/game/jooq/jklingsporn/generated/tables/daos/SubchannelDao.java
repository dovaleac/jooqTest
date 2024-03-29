/*
 * This file is generated by jOOQ.
 */
package com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.daos;


import com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.Subchannel;
import com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.records.SubchannelRecord;

import io.github.jklingsporn.vertx.jooq.shared.reactive.AbstractReactiveVertxDAO;

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
public class SubchannelDao extends AbstractReactiveVertxDAO<SubchannelRecord, com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel, Integer, Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel>>, Single<Optional<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel>>, Single<Integer>, Single<Integer>> implements io.github.jklingsporn.vertx.jooq.rx.VertxDAO<SubchannelRecord,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel,Integer> {

    /**
     * @param configuration The Configuration used for rendering and query execution.
     * @param vertx the vertx instance
     */
    public SubchannelDao(Configuration configuration, io.vertx.reactivex.sqlclient.SqlClient delegate) {
        super(Subchannel.SUBCHANNEL, com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel.class, new ReactiveRXQueryExecutor<SubchannelRecord,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel,Integer>(configuration,delegate,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.mappers.RowMappers.getSubchannelMapper()));
    }

    @Override
    protected Integer getId(com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel object) {
        return object.getId();
    }

    /**
     * Find records that have <code>code IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel>> findManyByCode(Collection<String> values) {
        return findManyByCondition(Subchannel.SUBCHANNEL.CODE.in(values));
    }

    /**
     * Find records that have <code>code IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(Subchannel.SUBCHANNEL.CODE.in(values),limit);
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel>> findManyByName(Collection<String> values) {
        return findManyByCondition(Subchannel.SUBCHANNEL.NAME.in(values));
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(Subchannel.SUBCHANNEL.NAME.in(values),limit);
    }

    /**
     * Find records that have <code>main_channel_id IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel>> findManyByMainChannelId(Collection<Integer> values) {
        return findManyByCondition(Subchannel.SUBCHANNEL.MAIN_CHANNEL_ID.in(values));
    }

    /**
     * Find records that have <code>main_channel_id IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel>> findManyByMainChannelId(Collection<Integer> values, int limit) {
        return findManyByCondition(Subchannel.SUBCHANNEL.MAIN_CHANNEL_ID.in(values),limit);
    }

    @Override
    public ReactiveRXQueryExecutor<SubchannelRecord,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel,Integer> queryExecutor(){
        return (ReactiveRXQueryExecutor<SubchannelRecord,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel,Integer>) super.queryExecutor();
    }
}
