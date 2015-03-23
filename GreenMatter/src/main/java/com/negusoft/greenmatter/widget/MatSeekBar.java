/*******************************************************************************
 * Copyright 2015 NEGU Soft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.negusoft.greenmatter.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/**
 * SeekBar implementation to fix a glitch when fading in/out the thumb drawable.
 * To fix the issue, It invalidates the whole view when the underlying drawables requests invalidation.
 */
public class MatSeekBar extends SeekBar {
    public MatSeekBar(Context context) {
        super(context);
    }

    public MatSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MatSeekBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void invalidateDrawable(Drawable dr) {
        super.invalidateDrawable(dr);
        invalidate();
    }
}
