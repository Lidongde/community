package com.lionde.community.enums;

public enum NotificationTypeEnum {
    REPLY_QUESTION(1, "回复了问题"),
    REPLY_COMMENT(2, "恢复了评论");
    private int type;
    private String name;
    NotificationTypeEnum(int status, String name) {
        this.type = status;
        this.name = name;
    }

    public int getType() {return type;}
    public String getName() {return name;}
    public static String nameOfType(int type) {
        for (NotificationTypeEnum notificationTypeEnum : NotificationTypeEnum.values())
            if (notificationTypeEnum.getType() == type)
                return notificationTypeEnum.getName();
        return "";
    }
}
