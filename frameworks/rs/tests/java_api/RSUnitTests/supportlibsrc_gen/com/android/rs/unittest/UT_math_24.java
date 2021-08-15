// This file is automatically generated from
// frameworks/rs/tests/java_api/RSUnitTests/RSUnitTests.py
/*
 * Copyright (C) 2017 The Android Open Source Project
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

package com.android.rs.unittest;

import android.content.Context;
import androidx.renderscript.RenderScript;

public class UT_math_24 extends UnitTest {

    public UT_math_24(Context ctx) {
        super("Math_24", ctx);
    }

    public void run() {
        RenderScript pRS = createRenderScript(true);
        ScriptC_math_24 s = new ScriptC_math_24(pRS);
        s.invoke_math_24_test(0, 0);
        pRS.finish();
        s.destroy();
        pRS.destroy();
    }
}