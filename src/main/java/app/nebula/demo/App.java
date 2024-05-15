package app.nebula.demo;

import app.nebula.demo.api.GreetingsService;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.apache.dubbo.config.bootstrap.builders.ApplicationBuilder;
import org.apache.dubbo.config.bootstrap.builders.ProtocolBuilder;
import org.apache.dubbo.config.bootstrap.builders.ServiceBuilder;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        DubboBootstrap.getInstance()
                .application(ApplicationBuilder.newBuilder().name("dubbo-samples-api").logger("slf4j").build())
                .protocol(ProtocolBuilder.newBuilder().name("dubbo").port(50052).build())
                .service(ServiceBuilder.newBuilder().interfaceClass(GreetingsService.class).ref(new GreetingsServiceImpl()).build())
                .start()
                .await();
    }
}
