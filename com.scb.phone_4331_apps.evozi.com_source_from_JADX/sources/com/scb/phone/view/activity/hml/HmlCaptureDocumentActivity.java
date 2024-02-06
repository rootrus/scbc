package com.scb.phone.view.activity.hml;

import android.content.Intent;
import com.scb.phone.view.activity.additionaldocument.CaptureDocumentActivity;
import com.scb.phone.view.activity.hml.submission.HmlCropDocumentActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlCaptureDocumentActivity extends CaptureDocumentActivity {
    public static final HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver MediaMetadataCompat = new HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver((byte) 0);

    public final void IconCompatParcelizer(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "path");
        onGetStartedClick.write((Object) str2, "applicationId");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        HmlCropDocumentActivity.write write = HmlCropDocumentActivity.MediaBrowserCompat$SearchResultReceiver;
        String stringExtra = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(Ca…ocumentActivity.FLOW_TAG)");
        Intent write2 = HmlCropDocumentActivity.write.write(this, str2, str, str3, str4, stringExtra, false);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, write2).read();
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
