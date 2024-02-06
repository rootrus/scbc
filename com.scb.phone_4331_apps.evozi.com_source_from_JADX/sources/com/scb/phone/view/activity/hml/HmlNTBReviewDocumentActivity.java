package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.additionaldocument.ReviewDocumentActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlNTBReviewDocumentActivity extends ReviewDocumentActivity {
    public static final read MediaBrowserCompat$SearchResultReceiver = new read((byte) 0);

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, String str2, String str3, String str4, String str5, boolean z) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "applicationId");
            onGetStartedClick.write((Object) str2, "path");
            onGetStartedClick.write((Object) str3, "documentType");
            onGetStartedClick.write((Object) str4, "productType");
            onGetStartedClick.write((Object) str5, "flow");
            Intent putExtra = new Intent(context, HmlNTBReviewDocumentActivity.class).putExtra("IMAGE_PATH_TAG", str2).putExtra("APPLICATION_ID_TAG", str).putExtra("DOCUMENT_TYPE_TAG", str3).putExtra("PRODUCT_TYPE_TAG", str4).putExtra("FLOW_TAG", str5).putExtra("FROM_GALLERY_TAG", z);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlNTBRe…GALLERY_TAG, fromGallery)");
            return putExtra;
        }
    }

    public final void write() {
        C5614x389c0c48 hmlNTBCaptureDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBCaptureDocumentActivity.MediaBrowserCompat$MediaItem;
        String stringExtra = getIntent().getStringExtra("APPLICATION_ID_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(Co…tants.APPLICATION_ID_TAG)");
        String stringExtra2 = getIntent().getStringExtra("DOCUMENT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(Constants.DOCUMENT_TYPE_TAG)");
        String stringExtra3 = getIntent().getStringExtra("PRODUCT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra3, "intent.getStringExtra(Constants.PRODUCT_TYPE_TAG)");
        String stringExtra4 = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra4, "intent.getStringExtra(Constants.FLOW_TAG)");
        Intent read2 = C5614x389c0c48.read(this, stringExtra, stringExtra2, stringExtra3, stringExtra4);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read3 = setTapText.write(this, read2).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read3.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final Intent MediaSessionCompat$Token() {
        return new Intent(this, HmlNTBDocumentListActivity.class);
    }
}
