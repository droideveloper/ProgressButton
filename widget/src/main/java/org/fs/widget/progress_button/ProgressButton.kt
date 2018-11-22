/*
 * Progress Button Android Kotlin Copyright (C) 2018 Fatih, Open Source.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fs.widget.progress_button

import android.content.Context
import android.support.v4.widget.CircularProgressDrawable
import android.support.v7.widget.AppCompatButton
import android.util.AttributeSet

class ProgressButton @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, definedStyle: Int = 0): AppCompatButton(context, attrs, definedStyle) {

  companion object {
    const val STATE_IDLE = 0x00
    const val STATE_PROGRESS = 0x01
    const val STATE_SUCCESS = 0x02
    const val STATE_FAILURE = 0x03
  }

  private var state = STATE_IDLE

  private val progressDrawable by lazy { CircularProgressDrawable(context) }

  init {

  }

}