package org.ibase4j.core.support.mq;

import java.io.Serializable;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
/**
 * @author LiMiaoMiao
 * @version 2017年5月18日 下午20:21:19
 */
public class TopicSender {
	@Autowired
	@Qualifier("jmsTopicTemplate")
	private JmsTemplate jmsTemplate;

	/**
	 * 发送一条消息到指定的订阅者（目标）
	 * 
	 * @param topicName 订阅者名称
	 * @param message 消息内容
	 */
	public void send(String topicName, final Serializable message) {
		jmsTemplate.send(topicName, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createObjectMessage(message);
			}
		});
	}
}
