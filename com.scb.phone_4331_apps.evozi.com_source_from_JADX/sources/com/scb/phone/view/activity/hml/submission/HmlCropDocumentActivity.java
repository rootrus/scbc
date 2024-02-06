package com.scb.phone.view.activity.hml.submission;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.additionaldocument.CropDocumentActivity;
import com.scb.phone.view.activity.hml.C5621x983ea256;
import com.scb.phone.view.activity.hml.HmlCaptureDocumentActivity;
import com.scb.phone.view.activity.hml.HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.hml.HmlReviewDocumentActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlCropDocumentActivity extends CropDocumentActivity {
    public static final write MediaBrowserCompat$SearchResultReceiver = new write((byte) 0);

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public static Intent write(Context context, String str, String str2, String str3, String str4, String str5, boolean z) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "applicationId");
            onGetStartedClick.write((Object) str2, "path");
            onGetStartedClick.write((Object) str3, "documentType");
            onGetStartedClick.write((Object) str4, "productType");
            onGetStartedClick.write((Object) str5, "flow");
            Intent intent = new Intent(context, HmlCropDocumentActivity.class);
            intent.putExtra("IMAGE_PATH_TAG", str2);
            intent.putExtra("APPLICATION_ID_TAG", str);
            intent.putExtra("DOCUMENT_TYPE_TAG", str3);
            intent.putExtra("PRODUCT_TYPE_TAG", str4);
            intent.putExtra("FLOW_TAG", str5);
            intent.putExtra("FROM_GALLERY_TAG", z);
            return intent;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3, String str4, String str5, boolean z) {
        onGetStartedClick.write((Object) str, "path");
        onGetStartedClick.write((Object) str2, "applicationId");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        C5621x983ea256 hmlReviewDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlReviewDocumentActivity.MediaMetadataCompat;
        Intent IconCompatParcelizer = C5621x983ea256.IconCompatParcelizer(this, str2, str, str3, str4, str5, z);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
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
        finish();
    }

    public final void write(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "documentType");
        onGetStartedClick.write((Object) str3, "productType");
        onGetStartedClick.write((Object) str4, "flow");
        HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver hmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver = HmlCaptureDocumentActivity.MediaMetadataCompat;
        Intent IconCompatParcelizer = HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this, str, str2, str3, str4);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
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
        finish();
    }
}
