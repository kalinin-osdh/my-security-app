--liquibase formatted sql

--changeset kalinin:003-create-user-role-table

CREATE TABLE users_role
(
    user_id BIGINT NOT NULL,
    role_id BIGINT NOT NULL,

    CONSTRAINT pk_users_role
        PRIMARY KEY (user_id, role_id),

    CONSTRAINT fk_users_role_user
        FOREIGN KEY (user_id)
            REFERENCES users (id)
            ON DELETE CASCADE,

    CONSTRAINT fk_users_role_role
        FOREIGN KEY (role_id)
            REFERENCES role (id)
            ON DELETE CASCADE
);