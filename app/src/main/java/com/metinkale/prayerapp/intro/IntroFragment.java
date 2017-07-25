/*
 * Copyright (c) 2013-2017 Metin Kale
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

package com.metinkale.prayerapp.intro;

import android.support.v4.app.Fragment;

/**
 * Created by metin on 17.07.2017.
 */

public abstract class IntroFragment extends Fragment {
    private float mPagerPosition;

    public void setPagerPosition(float pagerPosition) {
        if (mPagerPosition == 0 && pagerPosition > 0)
            onExit();

        if (mPagerPosition == 1 && pagerPosition < 1)
            onEnter();

        if (pagerPosition == 0) {
            onSelect();
        }
        this.mPagerPosition = pagerPosition;

    }

    protected abstract void onSelect();

    protected abstract void onEnter();

    protected abstract void onExit();
}
