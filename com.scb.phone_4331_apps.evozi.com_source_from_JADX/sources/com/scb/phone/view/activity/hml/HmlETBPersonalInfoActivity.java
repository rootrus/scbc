package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.hml.HmlConsumerETBPersonalInfoFragment;
import com.scb.phone.view.fragment.hml.HmlETBPersonalInfoFragment;
import p040o.getDocHeight;
import p040o.getPageID;

public class HmlETBPersonalInfoActivity extends BaseHmlPersonalInfoActivity {
    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        return new Intent(context, HmlETBPersonalInfoActivity.class);
    }

    public void onBackPressed() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById instanceof HmlETBPersonalInfoFragment) {
            getPageID getpageid = ((HmlETBPersonalInfoFragment) findFragmentById).IconCompatParcelizer;
            getDocHeight getdocheight = getDocHeight.read;
            if (getpageid.RatingCompat != null) {
                getdocheight.IconCompatParcelizer(getpageid.RatingCompat);
            }
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Fragment mo13702x50fd9e4a() {
        return new HmlConsumerETBPersonalInfoFragment();
    }
}
