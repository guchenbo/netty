package io.netty.example.echo;

import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author guchenbo
 * @Date 2020/4/6.
 */
public class MyServer {
    public static void main(String[] args) {
        EventLoopGroup group = new NioEventLoopGroup(1);

        group.next().execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
                System.out.println(Thread.currentThread());
                System.out.println(Thread.currentThread().getClass());
                System.out.println(Thread.currentThread().hashCode());
            }
        });
        group.next().execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("2");
                System.out.println(Thread.currentThread());
                System.out.println(Thread.currentThread().getClass());
                System.out.println(Thread.currentThread().hashCode());
            }
        });
        System.out.println("st");

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("3");
                System.out.println(Thread.currentThread());
                System.out.println(Thread.currentThread().getClass());

            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("4");
                System.out.println(Thread.currentThread());
                System.out.println(Thread.currentThread().getClass());

            }
        });
        System.out.println("st2");
    }
}
