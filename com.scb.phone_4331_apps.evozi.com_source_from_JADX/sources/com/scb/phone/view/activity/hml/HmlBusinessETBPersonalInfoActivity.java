package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.hml.HmlBusinessOwnerETBPersonalInfoFragment;
import p040o.ZSYR2K;

public final class HmlBusinessETBPersonalInfoActivity extends HmlETBPersonalInfoActivity {
    public static final write MediaDescriptionCompat = new write((byte) 0);

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.scbAnalytics.write("p10x1_business_verification_personal_info", new ZSYR2K("user_type", "etb"));
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new HmlBusinessOwnerETBPersonalInfoFragment();
    }
}
