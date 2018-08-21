package com.eddy.springbootrabbitmqconsumer.config;

import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory;


@Configuration
public class RabbitMQConfig implements RabbitListenerConfigurer{
	
	@Bean
	public MappingJackson2MessageConverter consumerJackson2MessageConverter() {
	   return new MappingJackson2MessageConverter();
	}

	@Bean
	public DefaultMessageHandlerMethodFactory messageHandlerMethodFactory() {
	   DefaultMessageHandlerMethodFactory factory = new DefaultMessageHandlerMethodFactory();
	   factory.setMessageConverter(consumerJackson2MessageConverter());
	   return factory;
	}

	@Override
	public void configureRabbitListeners(final RabbitListenerEndpointRegistrar registrar) {
	   registrar.setMessageHandlerMethodFactory(messageHandlerMethodFactory());
	}

	
	
}