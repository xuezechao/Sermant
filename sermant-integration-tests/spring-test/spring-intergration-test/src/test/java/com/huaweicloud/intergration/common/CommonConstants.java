/*
 * Copyright (C) 2022-2022 Huawei Technologies Co., Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.huaweicloud.intergration.common;

/**
 * 所有测试的公共参数
 *
 * @author zhouss
 * @since 2022-08-02
 */
public class CommonConstants {
    /**
     * spring集成测试类型
     */
    public static final String TEST_TYPE = "sermant.integration.test.type";

    /**
     * 测试类型分隔符, 支持多个测试类型
     */
    public static final String TEST_TYPE_SEPARATOR = ",";

    private CommonConstants() {
    }
}
