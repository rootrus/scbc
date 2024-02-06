package com.scb.phone.view.activity.hml;

import android.content.Intent;
import com.scb.phone.view.activity.additionaldocument.ReviewDocumentActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlReviewDocumentActivity extends ReviewDocumentActivity {
    public static final C5621x983ea256 MediaMetadataCompat = new C5621x983ea256((byte) 0);

    public final void write() {
        HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver hmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver = HmlCaptureDocumentActivity.MediaMetadataCompat;
        String stringExtra = getIntent().getStringExtra("APPLICATION_ID_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(Co…tants.APPLICATION_ID_TAG)");
        String stringExtra2 = getIntent().getStringExtra("DOCUMENT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(Constants.DOCUMENT_TYPE_TAG)");
        String stringExtra3 = getIntent().getStringExtra("PRODUCT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra3, "intent.getStringExtra(Constants.PRODUCT_TYPE_TAG)");
        String stringExtra4 = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra4, "intent.getStringExtra(Constants.FLOW_TAG)");
        Intent IconCompatParcelizer = HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this, stringExtra, stringExtra2, stringExtra3, stringExtra4);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
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

    public final void read(boolean z) {
        if (z) {
            sendBroadcast(new Intent().setAction("com.scb.phone/BROADCAST_RELOAD_DOCUMENT_LIST"));
        }
        finish();
    }
}
