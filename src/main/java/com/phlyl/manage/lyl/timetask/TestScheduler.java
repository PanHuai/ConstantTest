package com.phlyl.manage.lyl.timetask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by 潘淮  on 2018/9/7.<br>
 *     定时任务测试
 */
@Component
public class TestScheduler {

    @Scheduled(cron = "1 * * * * *")
    public void test() {
        System.out.println("我爱你");
    }
}
