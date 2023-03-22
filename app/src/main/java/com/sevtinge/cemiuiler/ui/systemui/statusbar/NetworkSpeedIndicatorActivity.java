package com.sevtinge.cemiuiler.ui.systemui.statusbar;

import androidx.fragment.app.Fragment;

import com.sevtinge.cemiuiler.R;
import com.sevtinge.cemiuiler.ui.base.SubFragment;
import com.sevtinge.cemiuiler.ui.systemui.base.BaseSystemUIActivity;

public class NetworkSpeedIndicatorActivity extends BaseSystemUIActivity {

    @Override
    public Fragment initFragment() {
        return new NetworkSpeedIndicatorActivity.NetworkSpeedIndicatorFragment();
    }

    public static class NetworkSpeedIndicatorFragment extends SubFragment {

        @Override
        public int getContentResId() {
            return R.xml.system_ui_status_bar_network_speed_indicator;
        }
    }
}