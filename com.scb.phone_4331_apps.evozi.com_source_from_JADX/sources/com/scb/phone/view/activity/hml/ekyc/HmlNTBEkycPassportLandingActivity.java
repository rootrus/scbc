package com.scb.phone.view.activity.hml.ekyc;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.HmlNTBBusinessOccupationInfoActivity;
import com.scb.phone.view.activity.ntb.NTBActivity;
import com.scb.phone.view.fragment.hml.ekyc.HmlEkycFragment;
import com.scb.phone.view.fragment.ntb.ekyc.EkycFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlNTBEkycPassportLandingActivity extends NTBActivity {
    public static final write MediaBrowserCompat$MediaItem = new write((byte) 0);

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        ap_();
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        MediaSessionCompat$QueueItem(getString(R.string.ntb_ekyc_title));
    }

    public final void setContentView() {
        HmlNTBBusinessOccupationInfoActivity.read read = HmlNTBBusinessOccupationInfoActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlNTBBusinessOccupationInfoActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ EkycFragment mo33978x50fd9e4a() {
        return new HmlEkycFragment();
    }
}
