package step3;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

//@WebListener // 따로 URL을 지정하지 않는다
public class Listener02 implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Listener02.requestInitialized()");
    }
    
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Listener02.requestDestroyed()");
    }
}
