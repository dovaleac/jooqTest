/*
 * This file is generated by jOOQ.
 */
package com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.daos;


import com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.Channel;
import com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.records.ChannelRecord;

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
public class ChannelDao extends AbstractReactiveVertxDAO<ChannelRecord, com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Channel, Integer, Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Channel>>, Single<Optional<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Channel>>, Single<Integer>, Single<Integer>> implements io.github.jklingsporn.vertx.jooq.rx.VertxDAO<ChannelRecord,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Channel,Integer> {

    /**
     * @param configuration The Configuration used for rendering and query execution.
     * @param vertx the vertx instance
     */
    public ChannelDao(Configuration configuration, io.vertx.reactivex.sqlclient.SqlClient delegate) {
        super(Channel.CHANNEL, com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Channel.class, new ReactiveRXQueryExecutor<ChannelRecord,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Channel,Integer>(configuration,delegate,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.mappers.RowMappers.getChannelMapper()));
    }

    @Override
    protected Integer getId(com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Channel object) {
        return object.getId();
    }

    /**
     * Find records that have <code>code IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Channel>> findManyByCode(Collection<String> values) {
        return findManyByCondition(Channel.CHANNEL.CODE.in(values));
    }

    /**
     * Find records that have <code>code IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Channel>> findManyByCode(Collection<String> values, int limit) {
        return findManyByCondition(Channel.CHANNEL.CODE.in(values),limit);
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Channel>> findManyByName(Collection<String> values) {
        return findManyByCondition(Channel.CHANNEL.NAME.in(values));
    }

    /**
     * Find records that have <code>name IN (values)</code> asynchronously limited by the given limit
     */
    public Single<List<com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Channel>> findManyByName(Collection<String> values, int limit) {
        return findManyByCondition(Channel.CHANNEL.NAME.in(values),limit);
    }

    @Override
    public ReactiveRXQueryExecutor<ChannelRecord,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Channel,Integer> queryExecutor(){
        return (ReactiveRXQueryExecutor<ChannelRecord,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Channel,Integer>) super.queryExecutor();
    }
}
