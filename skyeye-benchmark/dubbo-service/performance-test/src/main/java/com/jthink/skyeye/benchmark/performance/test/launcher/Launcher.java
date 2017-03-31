package com.jthink.skyeye.benchmark.performance.test.launcher;

import com.jthink.skyeye.benchmark.performance.test.task.RpcCaller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * JThink@JThink
 *
 * @author JThink
 * @version 0.0.1
 * @desc 启动类
 * @date 2016-12-14 16:52:22
 */
public class Launcher {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(new RpcCaller("trace/trace"));
    }
}
