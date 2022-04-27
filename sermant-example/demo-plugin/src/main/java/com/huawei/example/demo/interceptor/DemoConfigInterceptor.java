/*
 * Copyright (C) 2021-2021 Huawei Technologies Co., Ltd. All rights reserved.
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

package com.huawei.example.demo.interceptor;

import com.huawei.example.demo.common.DemoLogger;
import com.huawei.example.demo.config.DemoConfig;

import com.huaweicloud.sermant.core.plugin.agent.entity.ExecuteContext;
import com.huaweicloud.sermant.core.plugin.agent.interceptor.AbstractInterceptor;
import com.huaweicloud.sermant.core.plugin.config.PluginConfigManager;

/**
 * 统一配置功能的拦截器示例，在本示例中，将展示如何在插件端获取统一配置
 *
 * @author HapThorin
 * @version 1.0.0
 * @since 2021-10-25
 */
public class DemoConfigInterceptor extends AbstractInterceptor {
    private DemoConfig config;

    @Override
    public ExecuteContext before(ExecuteContext context) throws Exception {
        DemoLogger.println(context.getRawCls().getSimpleName() + ": [DemoConfigInterceptor]-before");
        config = PluginConfigManager.getPluginConfig(DemoConfig.class);
        return context;
    }

    @Override
    public ExecuteContext after(ExecuteContext context) throws Exception {
        final String clsName = context.getRawCls().getSimpleName();
        DemoLogger.println(clsName + ": " + config);
        DemoLogger.println(clsName + ": [DemoConfigInterceptor]-after");
        return context;
    }
}
