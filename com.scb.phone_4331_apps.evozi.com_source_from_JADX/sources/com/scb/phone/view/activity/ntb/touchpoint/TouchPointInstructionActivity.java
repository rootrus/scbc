package com.scb.phone.view.activity.ntb.touchpoint;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointWebViewActivity;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointWifiSettingsActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C4234dC;
import p040o.C7041xd5e892c2;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getKernelIDMultiply;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class TouchPointInstructionActivity extends BaseTouchPointBreadcrumbActivity {
    @HmlPinActivity
    public C4234dC presenter;

    public static final Intent IconCompatParcelizer(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return new Intent(context, TouchPointInstructionActivity.class);
    }

    public static final class write {
        public String IconCompatParcelizer;

        private write() {
        }

        public write(String str) {
            this.IconCompatParcelizer = str;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f80132131493238);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.auto_touchpoints_verify_at_scb_easy_id);
        setTabContainer();
        new getKernelIDMultiply().MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "touchpoint_ekyc_instruction");
        C4234dC dCVar = this.presenter;
        if (dCVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        dCVar.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat();
    }

    /* access modifiers changed from: protected */
    public final C5677x8060c4c1 MediaSessionCompat$ResultReceiverWrapper() {
        return C5677x8060c4c1.INPUT_YOUR_INFORMATION;
    }

    @OnClick
    public final void onProceedClick() {
        TouchPointWifiSettingsActivity.write write2 = TouchPointWifiSettingsActivity.MediaBrowserCompat$SearchResultReceiver;
        Intent MediaBrowserCompat$CustomActionResultReceiver = TouchPointWifiSettingsActivity.write.MediaBrowserCompat$CustomActionResultReceiver(this, C7041xd5e892c2.NORMAL_FLOW.name());
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public final void onFindTouchPointsClick() {
        TouchPointWebViewActivity.write write2 = TouchPointWebViewActivity.MediaBrowserCompat$MediaItem;
        Intent MediaBrowserCompat$CustomActionResultReceiver = TouchPointWebViewActivity.write.MediaBrowserCompat$CustomActionResultReceiver(this, "https://www.scb.co.th/th/personal-banking/other-services/scb-easy-id.html");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
