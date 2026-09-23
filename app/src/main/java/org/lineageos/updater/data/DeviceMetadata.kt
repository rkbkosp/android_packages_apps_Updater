/*
 * SPDX-FileCopyrightText: crDroid Android Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.updater.data

data class DeviceMetadata(
    val maintainer: String? = null,
    val device: String? = null,
    val forum: String? = null,
    val telegram: String = DEFAULT_TELEGRAM,
    val paypal: String? = null,
) {
    companion object {
        const val DEFAULT_TELEGRAM = "https://t.me/crDroidAndroid"
    }
}
