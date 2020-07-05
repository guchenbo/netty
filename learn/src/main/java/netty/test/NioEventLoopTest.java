package netty.test;

import io.netty.channel.nio.NioEventLoopGroup;

/**
 * @Author guchenbo
 * @Date 2018/10/28.
 */
public class NioEventLoopTest {

    public static void main(String[] args) {

        NioEventLoopGroup group = new NioEventLoopGroup();
        System.out.println(group.next());

    }
}
