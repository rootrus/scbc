package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.hml.HmlNTBPersonalInfoFragment;
import p040o.getDocHeight;
import p040o.getPageID;

public class HmlNTBPersonalInfoActivity extends BaseHmlPersonalInfoActivity {
    public static Intent IconCompatParcelizer(Context context) {
        return new Intent(context, HmlNTBPersonalInfoActivity.class);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return HmlNTBPersonalInfoFragment.MediaSessionCompat$ResultReceiverWrapper();
    }

    public void onBackPressed() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById instanceof HmlNTBPersonalInfoFragment) {
            getPageID getpageid = ((HmlNTBPersonalInfoFragment) findFragmentById).IconCompatParcelizer;
            getDocHeight getdocheight = getDocHeight.read;
            if (getpageid.RatingCompat != null) {
                getdocheight.IconCompatParcelizer(getpageid.RatingCompat);
            }
        }
    }
}
