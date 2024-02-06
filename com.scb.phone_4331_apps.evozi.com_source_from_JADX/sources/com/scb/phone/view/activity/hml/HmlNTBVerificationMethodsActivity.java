package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.ekyc.C5629xe00ea892;
import com.scb.phone.view.activity.hml.ekyc.HmlNTBEkycBranchInstructionActivity;
import com.scb.phone.view.activity.hml.ekyc.HmlNTBEkycNdidLandingActivity;
import com.scb.phone.view.activity.hml.ekyc.HmlNTBEkycNdidLandingActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.hml.ekyc.HmlNTBEkycPassportLandingActivity;
import com.scb.phone.view.activity.ntb.NtbOpenAccountLandingActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlNTBVerificationMethodsActivity extends NtbOpenAccountLandingActivity {
    public static final C5619xe159b4de MediaDescriptionCompat = new C5619xe159b4de((byte) 0);

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MediaSessionCompat$QueueItem(getString(R.string.hml_ntb_ekyc_verification_methods_title));
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo33954x50fd9e4a() {
        this.scbAnalytics.write("open_account_select_method", new ZSYR2K("feature", "your_loan"), new ZSYR2K("source", this.presenter.read()));
    }

    public final void MediaBrowserCompat$MediaItem() {
        IconCompatParcelizer();
    }

    public final void IconCompatParcelizer() {
        HmlNTBEkycNdidLandingActivity$MediaBrowserCompat$ItemReceiver hmlNTBEkycNdidLandingActivity$MediaBrowserCompat$ItemReceiver = HmlNTBEkycNdidLandingActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlNTBEkycNdidLandingActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        HmlNTBEkycPassportLandingActivity.write write = HmlNTBEkycPassportLandingActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlNTBEkycPassportLandingActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read() {
        C5629xe00ea892 hmlNTBEkycBranchInstructionActivity$MediaBrowserCompat$ItemReceiver = HmlNTBEkycBranchInstructionActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlNTBEkycBranchInstructionActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
