package com.scb.phone.view.activity.hml;

import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.hml.C5998x440e4a6b;
import com.scb.phone.view.fragment.hml.HmlNTBOccupationInfoFragment;
import p040o.setWscClientIp;
import p040o.setWscClientIp$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.writeUInt64NoTag;

public final class HmlNTBOccupationInfoActivity extends HmlOccupationInfoActivity {
    public static final write MediaMetadataCompat = new write((byte) 0);

    /* access modifiers changed from: protected */
    public final String AppCompatActivity() {
        return "ntb";
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onBackPressed() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (!(findFragmentById instanceof HmlNTBOccupationInfoFragment)) {
            findFragmentById = null;
        }
        HmlNTBOccupationInfoFragment hmlNTBOccupationInfoFragment = (HmlNTBOccupationInfoFragment) findFragmentById;
        if (hmlNTBOccupationInfoFragment != null) {
            setWscClientIp setwscclientip = hmlNTBOccupationInfoFragment.presenter;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setWscClientIp$MediaBrowserCompat$CustomActionResultReceiver.write;
            if (setwscclientip.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(setwscclientip.RatingCompat);
            }
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        C5998x440e4a6b hmlNTBOccupationInfoFragment$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBOccupationInfoFragment.IconCompatParcelizer;
        return new HmlNTBOccupationInfoFragment();
    }
}
