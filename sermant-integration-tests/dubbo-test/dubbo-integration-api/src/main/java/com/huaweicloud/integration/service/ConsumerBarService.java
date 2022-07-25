/*
 * Copyright (C) 2022-2022 Huawei Technologies Co., Ltd. All rights reserved.
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

package com.huaweicloud.integration.service;

/**
 * 测试接口
 *
 * @author provenceee
 * @since 2022-04-28
 */
public interface ConsumerBarService {
    /**
     * 测试接口
     *
     * @param str 参数
     * @return 测试信息
     */
    String testBar(String str);

    /**
     * 测试接口
     *
     * @param str 参数
     * @return 测试信息
     */
    String testBar2(String str);

    /**
     * 测试接口
     *
     * @param str 参数
     * @return 测试信息
     */
    String testBarGeneric(String str);
}