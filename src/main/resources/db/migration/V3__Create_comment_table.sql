CREATE TABLE COMMENT
(
    ID BIGINT AUTO_INCREMENT,
    PARENT_ID BIGINT NOT NULL,
    TYPE INT NOT NULL,
    COMMENTATOR BIGINT NOT NULL,
    GMT_CREATE BIGINT NOT NULL,
    GMT_MODIFIED BIGINT NOT NULL,
    LIKE_COUNT BIGINT DEFAULT 0,
    CONTENT VARCHAR(1024) NULL,
    COMMENT_COUNT INT DEFAULT 0,
    constraint COMMENT_PK
        primary key (ID)
);