package server.main.java.suntools.entity;

import lombok.Data;

/**
 * EmailEntity
 * ---------------------------------------------------------------------------------------------------------------------
 * 邮件实体
 *
 * @author Ike
 * @date 2020年5月13日15:46:01
 */
@Data
public class EmailEntity {
    // 发件人邮箱
    public static final String SEND_EMAIL_ACCOUNT = "sunw786934@163.com";
    // 收件人邮箱
    private             String to;
    // 邮箱标题
    private             String subject;
    // 邮件内容
    private             String text;
}
