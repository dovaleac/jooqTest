/*
 * This file is generated by jOOQ.
 */
package com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos;


import com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.interfaces.ILevel;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Level implements VertxPojo, ILevel {

    private static final long serialVersionUID = -498591978;

    private Integer id;
    private Integer hierarchicalLevel;
    private String  description;
    private Integer mainChannelId;

    public Level() {}

    public Level(ILevel value) {
        this.id = value.getId();
        this.hierarchicalLevel = value.getHierarchicalLevel();
        this.description = value.getDescription();
        this.mainChannelId = value.getMainChannelId();
    }

    public Level(
        Integer id,
        Integer hierarchicalLevel,
        String  description,
        Integer mainChannelId
    ) {
        this.id = id;
        this.hierarchicalLevel = hierarchicalLevel;
        this.description = description;
        this.mainChannelId = mainChannelId;
    }

    public Level(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public Level setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public Integer getHierarchicalLevel() {
        return this.hierarchicalLevel;
    }

    @Override
    public Level setHierarchicalLevel(Integer hierarchicalLevel) {
        this.hierarchicalLevel = hierarchicalLevel;
        return this;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Level setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public Integer getMainChannelId() {
        return this.mainChannelId;
    }

    @Override
    public Level setMainChannelId(Integer mainChannelId) {
        this.mainChannelId = mainChannelId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Level (");

        sb.append(id);
        sb.append(", ").append(hierarchicalLevel);
        sb.append(", ").append(description);
        sb.append(", ").append(mainChannelId);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ILevel from) {
        setId(from.getId());
        setHierarchicalLevel(from.getHierarchicalLevel());
        setDescription(from.getDescription());
        setMainChannelId(from.getMainChannelId());
    }

    @Override
    public <E extends ILevel> E into(E into) {
        into.from(this);
        return into;
    }
}
