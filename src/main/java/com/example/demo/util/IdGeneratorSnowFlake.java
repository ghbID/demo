package com.example.demo.util;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.IdUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class IdGeneratorSnowFlake {


    //几号机房号的 几号机器 在

    // 取值范围0到31 机器号
    private long workerId = 0;

    // 取值范围0到31 指定机房号，可以放到配置文件中读取
    private long datacenterId = 0;

    private Snowflake snowflake = IdUtil.createSnowflake(workerId, datacenterId);

    @PostConstruct //调用前的初始化工作
    public void init(){
        try {
            workerId = NetUtil.ipv4ToLong(NetUtil.getLocalhostStr());
            log.info("当前机器的workerid：{}", workerId);
        }catch (Exception e){
            e.printStackTrace();
            log.warn("当前机器的workerId", e);
        }
    }

    public synchronized long snowflakeId(){ //调用hutool默认的
        return snowflake.nextId();
    }

    public synchronized long snowflakeId(long workerId, long datacenterId){
        Snowflake snowflake = IdUtil.createSnowflake(workerId, datacenterId);
        return snowflake.nextId();
    }

    public static void main(String[] args) {
        System.out.println(new IdGeneratorSnowFlake().snowflakeId());
        //       System.out.println("1565578989701955584".length());
    }

}