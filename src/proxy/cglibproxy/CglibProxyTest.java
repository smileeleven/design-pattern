package proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import org.junit.jupiter.api.Test;

/**
 * CGLib动态代理 测试类
 *
 * @author illusoryCloud
 */
public class CglibProxyTest {
    @Test
    public void cglibProxyTest(){
        Enhancer enhancer=new Enhancer();
        //设置父类 即被代理类 cglib是通过生成子类的方式来代理的
        enhancer.setSuperclass(Dancer.class);
        //设置回调
        enhancer.setCallback(new MyMethodInterceptor());
        Dancer dancer= (Dancer) enhancer.create();
        dancer.dance();
    }
}
