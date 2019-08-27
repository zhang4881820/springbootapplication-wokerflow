package com.honghh.bootfirst.delegate;

import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * ClassName: ReviewApprove
 * Description:
 *
 * @author honghh
 * @date 2019/02/20 19:54
 * Copyright (C) 杭州同基汽车科技有限公司
 */
@Slf4j
public class ReviewApprove implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) {
        //可以发送消息给某人
        log.info("通过，userId是：{}",delegateExecution.getVariable("userId"));
    }
}
