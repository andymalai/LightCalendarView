/*
 * Copyright (C) 2016 RECRUIT MARKETING PARTNERS CO., LTD.
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

package jp.co.recruit_mp.android.lightcalendarview

import android.content.Context
import android.content.res.ColorStateList
import android.support.v4.content.res.ResourcesCompat

/**
 * Created by recruit-mahayash on 10/16/16.
 */
/** Returns a themed color */
internal fun Context.getStyledColor(attrResId: Int, defaultColor: Int): Int {
    val a = obtainStyledAttributes(intArrayOf(attrResId))
    val color = a.getColor(0, defaultColor)
    a.recycle()
    return color
}

/** Returns a themed dimension */
internal fun Context.getStyledDimension(attrResId: Int, defaultValue: Float): Float {
    val a = obtainStyledAttributes(intArrayOf(attrResId))
    val dimen = a.getDimension(0, defaultValue)
    a.recycle()
    return dimen
}

/** Returns a resourced dimension */
internal fun Context.getDimension(resId: Int): Float = resources.getDimension(resId)

/** Returns a resourced color */
internal fun Context.getColorCompat(resId: Int) = ResourcesCompat.getColor(resources, resId, theme)

/** Returns a resourced color state list */
internal fun Context.getColorStateListCompat(resId: Int): ColorStateList = ResourcesCompat.getColorStateList(resources, resId, theme) ?: throw IllegalStateException("Resource not found ${resId}")

/** Returns a resourced string array */
internal fun Context.getStringArray(resId: Int): Array<String> = resources.getStringArray(resId)