package netty.test;

/**
 * @Author guchenbo
 * @Date 2018/10/28.
 */
public class HelloTask implements Runnable {

    @Override
    public void run() {
        System.out.println("hello world");
    }
}
