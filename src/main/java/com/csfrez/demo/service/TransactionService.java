package com.csfrez.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;


@Service
public class TransactionService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Transactional(rollbackFor = Exception.class)
    public void test1() {
        System.out.println("test1 run...");
        int i = 1 / 0;
        System.out.println("test1 finish...");
    }

    @Transactional(rollbackFor = Exception.class)
    public void test2() {
        // 执行清空用户的数据库操作
//        userDao.deleteAll();
        System.out.println("userDao.deleteAll()");
        // 使用事件广播器来广播 用户清除事件
        applicationEventPublisher.publishEvent(new UserCleanEvent(this));
    }

}

@Component
class MyTransactionListener {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    private void onTestEvent(UserCleanEvent event) {
        System.out.println("UserCleanEvent detected ......");
    }

}

// 定义 用户清除事件，它需要继承ApplicationEvent
class UserCleanEvent extends ApplicationEvent {


    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public UserCleanEvent(Object source) {
        super(source);
    }
}
