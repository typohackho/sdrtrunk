/*
 * *****************************************************************************
 * Copyright (C) 2014-2023 Dennis Sheirer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * ****************************************************************************
 */

// Generated by jextract

package io.github.dsheirer.source.tuner.sdrplay.api.v3_07;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;
class constants$8 {

    static final FunctionDescriptor sdrplay_api_SelectDevice$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sdrplay_api_SelectDevice$MH = RuntimeHelper.downcallHandle(
        "sdrplay_api_SelectDevice",
        constants$8.sdrplay_api_SelectDevice$FUNC
    );
    static final FunctionDescriptor sdrplay_api_ReleaseDevice$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sdrplay_api_ReleaseDevice$MH = RuntimeHelper.downcallHandle(
        "sdrplay_api_ReleaseDevice",
        constants$8.sdrplay_api_ReleaseDevice$FUNC
    );
    static final FunctionDescriptor sdrplay_api_GetErrorString$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle sdrplay_api_GetErrorString$MH = RuntimeHelper.downcallHandle(
        "sdrplay_api_GetErrorString",
        constants$8.sdrplay_api_GetErrorString$FUNC
    );
    static final FunctionDescriptor sdrplay_api_GetLastError$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sdrplay_api_GetLastError$MH = RuntimeHelper.downcallHandle(
        "sdrplay_api_GetLastError",
        constants$8.sdrplay_api_GetLastError$FUNC
    );
    static final FunctionDescriptor sdrplay_api_DisableHeartbeat$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle sdrplay_api_DisableHeartbeat$MH = RuntimeHelper.downcallHandle(
        "sdrplay_api_DisableHeartbeat",
        constants$8.sdrplay_api_DisableHeartbeat$FUNC
    );
    static final FunctionDescriptor sdrplay_api_DebugEnable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle sdrplay_api_DebugEnable$MH = RuntimeHelper.downcallHandle(
        "sdrplay_api_DebugEnable",
        constants$8.sdrplay_api_DebugEnable$FUNC
    );
}


