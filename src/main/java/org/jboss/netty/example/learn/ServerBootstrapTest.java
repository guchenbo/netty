package org.jboss.netty.example.learn;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;

/**
 * @Author guchenbo
 * @Date 2018/10/17.
 */
public class ServerBootstrapTest {
    public static void main(String[] args) {
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        System.out.println(serverBootstrap.getPipeline());

        serverBootstrap.setPipelineFactory(new ChannelPipelineFactory() {
            public ChannelPipeline getPipeline() throws Exception {
                return Channels.pipeline();
            }
        });

        System.out.println(serverBootstrap.getPipeline());
    }
}
