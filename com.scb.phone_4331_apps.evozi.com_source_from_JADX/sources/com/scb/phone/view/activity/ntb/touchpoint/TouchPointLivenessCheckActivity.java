package com.scb.phone.view.activity.ntb.touchpoint;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.ndid.BaseLivenessCheckActivity;
import com.scb.phone.view.activity.ntb.fatca.FatcaErrorActivity;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointFatcaActivity;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointSelectAccountActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C4066bA;
import p040o.C4247dF;
import p040o.HmlPinActivity;
import p040o.IOException;
import p040o.ImageField$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getKernelIDMultiply;
import p040o.getSpans;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class TouchPointLivenessCheckActivity extends BaseLivenessCheckActivity implements ImageField$MediaBrowserCompat$ItemReceiver {
    public static final C5679xbaf88dd0 MediaMetadataCompat = new C5679xbaf88dd0((byte) 0);
    private getKernelIDMultiply MediaBrowserCompat$MediaItem = new getKernelIDMultiply();
    @HmlPinActivity
    public C4247dF touchPointLivenessCheckPresenter;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("EXTRA_FATCA_STATUS") : null;
        C4247dF dFVar = this.touchPointLivenessCheckPresenter;
        if (dFVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("touchPointLivenessCheckPresenter");
        }
        IOException iOException = IOException.MediaBrowserCompat$CustomActionResultReceiver;
        if (dFVar.RatingCompat != null) {
            iOException.IconCompatParcelizer(dFVar.RatingCompat);
        }
        dFVar.read = stringExtra;
        getSpans.IconCompatParcelizer(this);
        getKernelIDMultiply getkernelidmultiply = this.MediaBrowserCompat$MediaItem;
        C4247dF dFVar2 = this.touchPointLivenessCheckPresenter;
        if (dFVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("touchPointLivenessCheckPresenter");
        }
        String write = dFVar2.MediaBrowserCompat$ItemReceiver.write();
        onGetStartedClick.write((Object) write, "customerGroup");
        getkernelidmultiply.read("customer_group", write);
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "touchpoint_ekyc_facial");
    }

    public final C4066bA<?> MediaSessionCompat$Token() {
        C4247dF dFVar = this.touchPointLivenessCheckPresenter;
        if (dFVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("touchPointLivenessCheckPresenter");
        }
        return dFVar;
    }

    public final void onDestroy() {
        C4247dF dFVar = this.touchPointLivenessCheckPresenter;
        if (dFVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("touchPointLivenessCheckPresenter");
        }
        dFVar.onDestroy();
        super.onDestroy();
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        onGetStartedClick.write((Object) strArr, "permissions");
        onGetStartedClick.write((Object) iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        getSpans.IconCompatParcelizer(this, i, iArr);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        super.MediaSessionCompat$ResultReceiverWrapper();
        finish();
    }

    public final void MediaSessionCompat$QueueItem() {
        super.MediaSessionCompat$QueueItem();
        finish();
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        super.AppCompatDelegateImpl$ListMenuDecorView();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        TouchPointFatcaActivity.write write = TouchPointFatcaActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, TouchPointFatcaActivity.class);
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

    public final void write() {
        Intent intent = new Intent(this, FatcaErrorActivity.class);
        intent.putExtra("EXTRA_TITLE", R.string.fatca_error_open_account_title);
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
        finish();
    }

    public final void read() {
        TouchPointSelectAccountActivity.write write = TouchPointSelectAccountActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, TouchPointSelectAccountActivity.class);
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
}
