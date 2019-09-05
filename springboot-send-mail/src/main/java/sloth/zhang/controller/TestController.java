package sloth.zhang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 16:29 2019/8/9
 * @Modificd By;
 */

@RestController
@RequestMapping("mail")
public class TestController {
    @Autowired
    JavaMailSender mailSender;

    @RequestMapping("sendmail")
    @Scheduled(fixedRate = 1000)
    public Object sendEmail(){

        try {
            final MimeMessage mimeMessage = this.mailSender.createMimeMessage();
            final MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
            message.setFrom("m18855092854@163.com");
            message.setTo("178625120@qq.com");
            message.setSubject("测试邮件主题");
            message.setText("测试邮件内容");
            this.mailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        } finally {
            return "sendEmail!";
        }

    }
}
