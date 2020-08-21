package com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.mappers;

import io.vertx.sqlclient.Row;
import java.util.function.Function;

public class RowMappers {

    private RowMappers(){}

    public static Function<Row,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.AccountingSystem> getAccountingSystemMapper() {
        return row -> {
            com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.AccountingSystem pojo = new com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.AccountingSystem();
            pojo.setId(row.getInteger("id"));
            pojo.setCode(row.getString("code"));
            pojo.setDescription(row.getString("description"));
            pojo.setUserCreated(row.getString("user_created"));
            pojo.setUserUpdated(row.getString("user_updated"));
            pojo.setUserDeleted(row.getString("user_deleted"));
            pojo.setCreationDate(row.getOffsetDateTime("creation_date"));
            pojo.setUpdateDate(row.getOffsetDateTime("update_date"));
            pojo.setDeletionDate(row.getOffsetDateTime("deletion_date"));
            return pojo;
        };
    }

    public static Function<Row,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Channel> getChannelMapper() {
        return row -> {
            com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Channel pojo = new com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Channel();
            pojo.setId(row.getInteger("id"));
            pojo.setCode(row.getString("code"));
            pojo.setName(row.getString("name"));
            return pojo;
        };
    }

    public static Function<Row,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactInformation> getContactInformationMapper() {
        return row -> {
            com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactInformation pojo = new com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactInformation();
            pojo.setId(row.getInteger("id"));
            pojo.setName(row.getString("name"));
            pojo.setEmail(row.getString("email"));
            pojo.setPhoneNumber(row.getString("phone_number"));
            pojo.setUserCreated(row.getString("user_created"));
            pojo.setUserUpdated(row.getString("user_updated"));
            pojo.setUserDeleted(row.getString("user_deleted"));
            pojo.setCreationDate(row.getOffsetDateTime("creation_date"));
            pojo.setUpdateDate(row.getOffsetDateTime("update_date"));
            pojo.setDeletionDate(row.getOffsetDateTime("deletion_date"));
            return pojo;
        };
    }

    public static Function<Row,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose> getContactPurposeMapper() {
        return row -> {
            com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose pojo = new com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.ContactPurpose();
            pojo.setId(row.getInteger("id"));
            pojo.setContactInformationId(row.getInteger("contact_information_id"));
            pojo.setPurposeId(row.getInteger("purpose_id"));
            pojo.setUserCreated(row.getString("user_created"));
            pojo.setUserUpdated(row.getString("user_updated"));
            pojo.setUserDeleted(row.getString("user_deleted"));
            pojo.setCreationDate(row.getOffsetDateTime("creation_date"));
            pojo.setUpdateDate(row.getOffsetDateTime("update_date"));
            pojo.setDeletionDate(row.getOffsetDateTime("deletion_date"));
            return pojo;
        };
    }

    public static Function<Row,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Dealer> getDealerMapper() {
        return row -> {
            com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Dealer pojo = new com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Dealer();
            pojo.setId(row.getInteger("id"));
            pojo.setCode(row.getString("code"));
            pojo.setComercialName(row.getString("comercial_name"));
            pojo.setLevelId(row.getInteger("level_id"));
            pojo.setStatusId(row.getInteger("status_id"));
            pojo.setParentId(row.getInteger("parent_id"));
            pojo.setSubchannelId(row.getInteger("subchannel_id"));
            pojo.setInternalManagerId(row.getInteger("internal_manager_id"));
            pojo.setExternalManagerId(row.getInteger("external_manager_id"));
            pojo.setCommissioningSection(row.getString("commissioning_section"));
            pojo.setStoreType(row.getString("store_type"));
            pojo.setCompanyType(row.getString("company_type"));
            pojo.setDocumentType(row.getString("document_type"));
            pojo.setDocumentNumber(row.getString("document_number"));
            pojo.setCompanyName(row.getString("company_name"));
            pojo.setAddress(row.getString("address"));
            pojo.setCity(row.getString("city"));
            pojo.setProvince(row.getString("province"));
            pojo.setUserCreated(row.getString("user_created"));
            pojo.setUserUpdated(row.getString("user_updated"));
            pojo.setUserDeleted(row.getString("user_deleted"));
            pojo.setCreationDate(row.getOffsetDateTime("creation_date"));
            pojo.setUpdateDate(row.getOffsetDateTime("update_date"));
            pojo.setDeletionDate(row.getOffsetDateTime("deletion_date"));
            return pojo;
        };
    }

    public static Function<Row,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerAccountingSystem> getDealerAccountingSystemMapper() {
        return row -> {
            com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerAccountingSystem pojo = new com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerAccountingSystem();
            pojo.setId(row.getInteger("id"));
            pojo.setDealerId(row.getInteger("dealer_id"));
            pojo.setSystemId(row.getInteger("system_id"));
            pojo.setUserCreated(row.getString("user_created"));
            pojo.setUserUpdated(row.getString("user_updated"));
            pojo.setUserDeleted(row.getString("user_deleted"));
            pojo.setCreationDate(row.getOffsetDateTime("creation_date"));
            pojo.setUpdateDate(row.getOffsetDateTime("update_date"));
            pojo.setDeletionDate(row.getOffsetDateTime("deletion_date"));
            return pojo;
        };
    }

    public static Function<Row,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact> getDealerContactMapper() {
        return row -> {
            com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact pojo = new com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerContact();
            pojo.setId(row.getInteger("id"));
            pojo.setContactInformationId(row.getInteger("contact_information_id"));
            pojo.setDealerId(row.getInteger("dealer_id"));
            pojo.setUserCreated(row.getString("user_created"));
            pojo.setUserUpdated(row.getString("user_updated"));
            pojo.setUserDeleted(row.getString("user_deleted"));
            pojo.setCreationDate(row.getOffsetDateTime("creation_date"));
            pojo.setUpdateDate(row.getOffsetDateTime("update_date"));
            pojo.setDeletionDate(row.getOffsetDateTime("deletion_date"));
            return pojo;
        };
    }

    public static Function<Row,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerStatus> getDealerStatusMapper() {
        return row -> {
            com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerStatus pojo = new com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.DealerStatus();
            pojo.setId(row.getInteger("id"));
            pojo.setCode(row.getString("code"));
            pojo.setDescription(row.getString("description"));
            return pojo;
        };
    }

    public static Function<Row,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Level> getLevelMapper() {
        return row -> {
            com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Level pojo = new com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Level();
            pojo.setId(row.getInteger("id"));
            pojo.setHierarchicalLevel(row.getInteger("hierarchical_level"));
            pojo.setDescription(row.getString("description"));
            pojo.setMainChannelId(row.getInteger("main_channel_id"));
            return pojo;
        };
    }

    public static Function<Row,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Manager> getManagerMapper() {
        return row -> {
            com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Manager pojo = new com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Manager();
            pojo.setId(row.getInteger("id"));
            pojo.setCode(row.getString("code"));
            pojo.setName(row.getString("name"));
            pojo.setSurname(row.getString("surname"));
            pojo.setType(row.getString("type"));
            pojo.setUserCreated(row.getString("user_created"));
            pojo.setUserUpdated(row.getString("user_updated"));
            pojo.setUserDeleted(row.getString("user_deleted"));
            pojo.setCreationDate(row.getOffsetDateTime("creation_date"));
            pojo.setUpdateDate(row.getOffsetDateTime("update_date"));
            pojo.setDeletionDate(row.getOffsetDateTime("deletion_date"));
            return pojo;
        };
    }

    public static Function<Row,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Purpose> getPurposeMapper() {
        return row -> {
            com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Purpose pojo = new com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Purpose();
            pojo.setId(row.getInteger("id"));
            pojo.setName(row.getString("name"));
            return pojo;
        };
    }

    public static Function<Row,com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel> getSubchannelMapper() {
        return row -> {
            com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel pojo = new com.dovaleac.guessing.game.jooq.jklingsporn.generated.tables.pojos.Subchannel();
            pojo.setId(row.getInteger("id"));
            pojo.setCode(row.getString("code"));
            pojo.setName(row.getString("name"));
            pojo.setMainChannelId(row.getInteger("main_channel_id"));
            return pojo;
        };
    }

}
