package com.example.demoxxljob.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyJob extends IJobHandler {

//    public ReturnT<String> demoJobHandler(String param) throws Exception {
//        XxlJobLogger.log("XXL-JOB, Hello World.");
//
//        for (int i = 0; i < 5; i++) {
//            XxlJobLogger.log("beat at:" + i);
//            TimeUnit.SECONDS.sleep(2);
//        }
//        return ReturnT.SUCCESS;
//    }

    @Override
    @XxlJob(value = "myJob")
    public ReturnT<String> execute(String s) throws Exception {
        log.info("s:{}", s);
        XxlJobLogger.log("XXL-JOB, Hello World.");
        return ReturnT.SUCCESS;
    }
}
