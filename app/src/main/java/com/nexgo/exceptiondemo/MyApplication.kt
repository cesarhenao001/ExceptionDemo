/*
 * Copyright (c) 2021
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
package com.nexgo.exceptiondemo

import android.app.Application
import android.content.Context
import com.nexgo.exception.NexgoCatch.Builder
import com.nexgo.exception.NexgoCatchManager
import com.nexgo.exception.ReportFlags


class MyApplication : Application() {
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        NexgoCatchManager.getInstance().init(
            Builder()
                .setApplication(this)
                .setUrl("https://api.cloud.nexgoglobal.com")
                .setAppId("xgd1vjfaoma0ad4mgu1")
                .setSecretKey("51adc7fcf6af5d36964bf5c8fdeca84717f5ab5850c3089adc69561c09f5f211")
                .setReportFlags(ReportFlags.OPEN_ONLY, ReportFlags.WIFI_ONLY,ReportFlags.NOT_SEND_DUPLICATE)
                .build()
        )

    }
}

