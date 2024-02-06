package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlOccupationInfoFragment;
import p040o.ZSYR2K;
import p040o.setWscClientIp;
import p040o.setWscClientIp$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.writeUInt64NoTag;

public class HmlOccupationInfoActivity extends BaseActivityWithFragment {
    /* access modifiers changed from: protected */
    public String AppCompatActivity() {
        return "etb";
    }

    public static Intent read(Context context) {
        return new Intent(context, HmlOccupationInfoActivity.class);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Fragment mo13702x50fd9e4a() {
        return HmlOccupationInfoFragment.MediaMetadataCompat();
    }

    public final String au_() {
        return getString(R.string.hml_occupation_information_title_header);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById instanceof HmlOccupationInfoFragment) {
            setWscClientIp setwscclientip = ((HmlOccupationInfoFragment) findFragmentById).presenter;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setWscClientIp$MediaBrowserCompat$CustomActionResultReceiver.write;
            if (setwscclientip.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(setwscclientip.RatingCompat);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.scbAnalytics.write("p10x1_verification_occupation_info", new ZSYR2K("user_type", AppCompatActivity()));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setPrimaryBackground();
    }
}
