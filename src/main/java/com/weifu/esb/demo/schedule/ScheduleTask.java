package com.weifu.esb.demo.schedule;

import com.weifu.esb.demo.services.impl.SAPEsbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Configuration
@EnableScheduling
public class ScheduleTask {

    @Autowired
    private SAPEsbService sapEsbService;

//    @Scheduled(cron = "0/5 * * * * ?")
    @Scheduled(fixedRate=1000 * 60 * 15)
    private void configureTasks() throws Exception {

        // 获取当前时间
        Calendar ca = Calendar.getInstance();

        SimpleDateFormat sdfYMDClear = new SimpleDateFormat("YYYY-MM-dd");
        SimpleDateFormat sdfYMDInsert = new SimpleDateFormat("YYYYMMdd");
        SimpleDateFormat sdfHMS = new SimpleDateFormat("HHmmss");

        Date curDate = ca.getTime();
        String hmsStr = sdfHMS.format(curDate);

        // 插入前一天最新数据
        if(hmsStr.compareTo("003000") == -1){
            ca.add(Calendar.DATE, -1);

            Date lastDay = ca.getTime();
            String ymdStrClear = sdfYMDClear.format(lastDay);
            String ymdStrInsert = sdfYMDInsert.format(lastDay);

            sapEsbService.clearHDeliveryRecord(ymdStrClear);
            sapEsbService.insertHDeliveryRecordObj(ymdStrInsert);

        } else { // 定时更新当然的数据

            String ymdStrClear = sdfYMDClear.format(curDate);
            String ymdStrInsert = sdfYMDInsert.format(curDate);

            sapEsbService.clearHDeliveryRecord(ymdStrClear);
            sapEsbService.insertHDeliveryRecordObj(ymdStrInsert);
        }

        // update HInventoryStock
        sapEsbService.clearHInventoryStock();
        sapEsbService.insertHInventoryStockObj();

    }
}
