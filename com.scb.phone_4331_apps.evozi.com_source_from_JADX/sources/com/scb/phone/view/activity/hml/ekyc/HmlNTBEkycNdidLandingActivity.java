package com.scb.phone.view.activity.hml.ekyc;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.HmlNTBBusinessOccupationInfoActivity;
import com.scb.phone.view.activity.ndid.NdidLandingActivity;
import com.scb.phone.view.fragment.hml.ekyc.HmlNdidInstructionFragment;
import com.scb.phone.view.fragment.ndid.NdidInstructionFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlNTBEkycNdidLandingActivity extends NdidLandingActivity {
    public static final HmlNTBEkycNdidLandingActivity$MediaBrowserCompat$ItemReceiver MediaMetadataCompat = new HmlNTBEkycNdidLandingActivity$MediaBrowserCompat$ItemReceiver((byte) 0);

    public final String read() {
        return "your_loan";
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = super.onCreateView(str, context, attributeSet);
        mo13676d_("p10x1_ekyc_landing");
        return onCreateView;
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        ap_();
    }

    public final void AppCompatActivity() {
        MediaSessionCompat$QueueItem(getString(R.string.ntb_ekyc_title));
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        HmlNTBBusinessOccupationInfoActivity.read read = HmlNTBBusinessOccupationInfoActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlNTBBusinessOccupationInfoActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ NdidInstructionFragment mo33978x50fd9e4a() {
        return new HmlNdidInstructionFragment();
    }
}
