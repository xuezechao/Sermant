/*
 * Copyright (C) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.gray.dubbo.interceptor.servicecomb;

import com.huawei.javamesh.core.agent.common.BeforeResult;
import com.huawei.javamesh.core.agent.interceptor.InstanceMethodInterceptor;
import com.huawei.javamesh.core.lubanops.bootstrap.log.LogFactory;
import com.huawei.javamesh.core.service.ServiceManager;
import com.huawei.gray.dubbo.service.RegistrationService;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 增强RegistrationListener类的notify方法
 *
 * @author pengyuyi
 * @since 2021年11月8日
 */
public class RegistrationInterceptor implements InstanceMethodInterceptor {
    private static final Logger LOGGER = LogFactory.getLogger();

    private RegistrationService registrationService;

    @Override
    public void before(Object obj, Method method, Object[] arguments, BeforeResult beforeResult) throws Exception {
        registrationService = ServiceManager.getService(RegistrationService.class);
        registrationService.before(obj, method, arguments, beforeResult);
    }

    /**
     * Dubbo启动时，获取并缓存应用名
     *
     * @param obj 增强的类
     * @param method 增强的方法
     * @param arguments 增强方法的所有参数
     * @param result the method's original return value. May be null if the method triggers an exception.
     * @return 返回值
     * @throws Exception 增强时可能出现的异常
     */
    @Override
    public Object after(Object obj, Method method, Object[] arguments, Object result) throws Exception {
        return result;
    }

    @Override
    public void onThrow(Object obj, Method method, Object[] arguments, Throwable throwable) {
        LOGGER.log(Level.SEVERE, "RegistrationInterceptor is error!", throwable);
    }
}