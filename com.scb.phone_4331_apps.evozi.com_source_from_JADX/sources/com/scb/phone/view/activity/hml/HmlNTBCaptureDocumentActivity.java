package com.scb.phone.view.activity.hml;

import android.content.Intent;
import com.scb.phone.view.activity.additionaldocument.CaptureDocumentActivity;
import com.scb.phone.view.activity.hml.submission.C5635x9aabe7dc;
import com.scb.phone.view.activity.hml.submission.HmlNTBCropDocumentActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlNTBCaptureDocumentActivity extends CaptureDocumentActivity {
    public static final C5614x389c0c48 MediaBrowserCompat$MediaItem = new C5614x389c0c48((byte) 0);

    public final void IconCompatParcelizer(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "path");
        onGetStartedClick.write((Object) str2, "applicationId");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        C5635x9aabe7dc hmlNTBCropDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBCropDocumentActivity.MediaMetadataCompat;
        String stringExtra = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(FLOW_TAG)");
        Intent MediaBrowserCompat$CustomActionResultReceiver = C5635x9aabe7dc.MediaBrowserCompat$CustomActionResultReceiver(this, str2, str, str3, str4, stringExtra, false);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 1234);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final Intent MediaSessionCompat$ResultReceiverWrapper() {
        return new Intent(this, HmlNTBDocumentListActivity.class);
    }
}
