/**
 * Copyright 2017 Harish Sridharan
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cooltechworks.sample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.cooltechworks.sample.utils.BaseUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createClickListener(list_demo_button, BaseUtils.TYPE_LIST)
        createClickListener(grid_demo_button, BaseUtils.TYPE_GRID)
        createClickListener(list_second_demo_button, BaseUtils.TYPE_SECOND_LIST)
        createClickListener(grid_second_demo_button, BaseUtils.TYPE_SECOND_GRID)
    }

    private fun createClickListener(button: Button, demoType: Int) {
        button.setOnClickListener { startDemo(demoType) }
    }

    private fun startDemo(demoType: Int) {
        val intent = Intent(this, DemoActivity::class.java)
        intent.putExtra(DemoActivity.EXTRA_TYPE, demoType)
        startActivity(intent)
    }
}
