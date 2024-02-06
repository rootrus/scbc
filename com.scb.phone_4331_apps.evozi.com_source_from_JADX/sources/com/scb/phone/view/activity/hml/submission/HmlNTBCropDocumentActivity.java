package com.scb.phone.view.activity.hml.submission;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.additionaldocument.CropDocumentActivity;
import com.scb.phone.view.activity.hml.C5614x389c0c48;
import com.scb.phone.view.activity.hml.HmlNTBCaptureDocumentActivity;
import com.scb.phone.view.activity.hml.HmlNTBReviewDocumentActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlNTBCropDocumentActivity extends CropDocumentActivity {
    public static final C5635x9aabe7dc MediaMetadataCompat = new C5635x9aabe7dc((byte) 0);

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3, String str4, String str5, boolean z) {
        onGetStartedClick.write((Object) str, "path");
        onGetStartedClick.write((Object) str2, "applicationId");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        HmlNTBReviewDocumentActivity.read read = HmlNTBReviewDocumentActivity.MediaBrowserCompat$SearchResultReceiver;
        Intent MediaBrowserCompat$CustomActionResultReceiver = HmlNTBReviewDocumentActivity.read.MediaBrowserCompat$CustomActionResultReceiver(this, str2, str, str3, str4, str5, z);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
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
        finish();
    }

    public final void write(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "documentType");
        onGetStartedClick.write((Object) str3, "productType");
        onGetStartedClick.write((Object) str4, "flow");
        C5614x389c0c48 hmlNTBCaptureDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBCaptureDocumentActivity.MediaBrowserCompat$MediaItem;
        Intent read = C5614x389c0c48.read(this, str, str2, str3, str4);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
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
        finish();
    }

    public final Intent read(Context context, String str, String str2, String str3, String str4, String str5, boolean z) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "path");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        C5637xbdb9ef55 hmlNTBDocumentSubmissionTutorialsActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBDocumentSubmissionTutorialsActivity.MediaDescriptionCompat;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        onGetStartedClick.write((Object) str2, "path");
        Intent MediaBrowserCompat$ItemReceiver = C5637xbdb9ef55.MediaBrowserCompat$ItemReceiver(context, str, str3, str4, str5);
        MediaBrowserCompat$ItemReceiver.putExtra("STEP_TAG", "CROP_TUTORIAL_STEP");
        MediaBrowserCompat$ItemReceiver.putExtra("IMAGE_PATH_TAG", str2);
        MediaBrowserCompat$ItemReceiver.putExtra("FROM_GALLERY_TAG", z);
        MediaBrowserCompat$ItemReceiver.putExtra("ENABLE_NAVIGATION_TAG", false);
        return MediaBrowserCompat$ItemReceiver;
    }

    public final Intent IconCompatParcelizer(Context context, String str, String str2, String str3, String str4, String str5, boolean z) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "path");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        C5637xbdb9ef55 hmlNTBDocumentSubmissionTutorialsActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBDocumentSubmissionTutorialsActivity.MediaDescriptionCompat;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        onGetStartedClick.write((Object) str2, "path");
        Intent MediaBrowserCompat$ItemReceiver = C5637xbdb9ef55.MediaBrowserCompat$ItemReceiver(context, str, str3, str4, str5);
        MediaBrowserCompat$ItemReceiver.putExtra("STEP_TAG", "REVIEW_TUTORIAL_STEP");
        MediaBrowserCompat$ItemReceiver.putExtra("IMAGE_PATH_TAG", str2);
        MediaBrowserCompat$ItemReceiver.putExtra("FROM_GALLERY_TAG", z);
        return MediaBrowserCompat$ItemReceiver;
    }
}
