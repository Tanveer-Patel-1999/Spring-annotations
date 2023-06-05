package com.authex.redis;

import com.authex.redis.propertysource.EnvironmentPojoToRead;
import com.authex.redis.propertysource.PropertySourceDemo;
import com.authex.redis.scope.PrototypeBean;
import com.authex.redis.scope.SingletoneBean;
import com.authex.redis.value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RedisApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(RedisApplication.class, args);

		SingletoneBean singletoneBean = context.getBean(SingletoneBean.class);
		System.out.println(singletoneBean.hashCode());
		SingletoneBean singletoneBean1 = context.getBean(SingletoneBean.class);
		System.out.println(singletoneBean1.hashCode());
		SingletoneBean singletoneBean2 = context.getBean(SingletoneBean.class);
		System.out.println(singletoneBean2.hashCode());

		PrototypeBean prototypeBean = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean.hashCode());
		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.hashCode());
		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.hashCode());

		ValueAnnotationDemo demo = context.getBean(ValueAnnotationDemo.class);
		System.out.println(demo.getDefaultName());
		System.out.println(demo.getHost());
		System.out.println(demo.getEmail());
		System.out.println(demo.getPassword());

		System.out.println("******************* read the custom properties file using @Value annotation  **************");
		PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
		System.out.println(propertySourceDemo.getEmail());
		System.out.println(propertySourceDemo.getHost());
		System.out.println(propertySourceDemo.getPassword());
		System.out.println(propertySourceDemo.getAppName());
		System.out.println(propertySourceDemo.getAppDescription());

		System.out.println("******************* read the custom properties file using Environment class **************");
		EnvironmentPojoToRead propertySourceDemo1 = context.getBean(EnvironmentPojoToRead.class);
		System.out.println(propertySourceDemo1.getEmail());
		System.out.println(propertySourceDemo1.getHost());
		System.out.println(propertySourceDemo1.getPassword());
		System.out.println(propertySourceDemo1.getAppName());
		System.out.println(propertySourceDemo1.getAppDescription());
	}

}
