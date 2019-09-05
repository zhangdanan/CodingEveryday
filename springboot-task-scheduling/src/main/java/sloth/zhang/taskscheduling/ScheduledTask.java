package sloth.zhang.taskscheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Authorz; sloth
 * @Description:
 * @Data:Create in 9:48 2019/8/19
 * @Modificd By;
 */
@Component
public class ScheduledTask {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 任务调度，每隔5秒执行一次
     * @author:SimpleWu
     * @Date:2018年10月12日
     */

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }
}
