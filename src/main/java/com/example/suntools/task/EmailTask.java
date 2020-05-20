package com.example.suntools.task;

import com.example.suntools.entity.ChinaDateEntity;
import com.example.suntools.entity.EmailEntity;
import com.example.suntools.tools.ChinaDateTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * EmailTask
 * ---------------------------------------------------------------------------------------------------------------------
 * 邮件定时任务
 *
 * @author Ike
 * @date 2020年5月13日16:00:51
 */
@Component
@EnableScheduling
public class EmailTask {
    @Autowired
    private JavaMailSender jms;

    @Scheduled(cron = "0 30 7 ? * *")
    public void sendMail(EmailEntity emailEntity) {
        System.out.println("开始");
        ChinaDateEntity chinaDateEntity = ChinaDateTool.getBirthdayPerson();
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        try {
            simpleMailMessage.setFrom(EmailEntity.SEND_EMAIL_ACCOUNT);
            //接收者
            simpleMailMessage.setTo(emailEntity.getTo());
            // 发送的标题
            simpleMailMessage.setSubject(emailEntity.getSubject());
            // 发送的内容
            String text;
            text = chinaDateEntity.getBirthdayPersons();
            simpleMailMessage.setText(text + emailEntity.getText());
            // 发送邮件
            jms.send(simpleMailMessage);
            System.out.println("成功发送");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("失败" + e);
        }
    }
}
