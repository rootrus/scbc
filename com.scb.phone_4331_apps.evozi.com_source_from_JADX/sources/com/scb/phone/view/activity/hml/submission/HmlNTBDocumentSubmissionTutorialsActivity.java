package com.scb.phone.view.activity.hml.submission;

import android.content.Intent;
import com.scb.phone.view.activity.hml.C5614x389c0c48;
import com.scb.phone.view.activity.hml.HmlNTBCaptureDocumentActivity;
import com.scb.phone.view.activity.hml.HmlNTBReviewDocumentActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlNTBDocumentSubmissionTutorialsActivity extends HmlDocumentSubmissionTutorialsActivity {
    public static final C5637xbdb9ef55 MediaDescriptionCompat = new C5637xbdb9ef55((byte) 0);

    /* access modifiers changed from: protected */
    public final String AppCompatActivity() {
        return "ntb";
    }

    public final void read() {
        C5614x389c0c48 hmlNTBCaptureDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBCaptureDocumentActivity.MediaBrowserCompat$MediaItem;
        String stringExtra = getIntent().getStringExtra("APPLICATION_ID_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(Co…tants.APPLICATION_ID_TAG)");
        String stringExtra2 = getIntent().getStringExtra("DOCUMENT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(Constants.DOCUMENT_TYPE_TAG)");
        String stringExtra3 = getIntent().getStringExtra("PRODUCT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra3, "intent.getStringExtra(Constants.PRODUCT_TYPE_TAG)");
        String stringExtra4 = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra4, "intent.getStringExtra(Constants.FLOW_TAG)");
        Intent read = C5614x389c0c48.read(this, stringExtra, stringExtra2, stringExtra3, stringExtra4);
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
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        C5635x9aabe7dc hmlNTBCropDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBCropDocumentActivity.MediaMetadataCompat;
        String stringExtra = getIntent().getStringExtra("APPLICATION_ID_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(Co…tants.APPLICATION_ID_TAG)");
        String stringExtra2 = getIntent().getStringExtra("IMAGE_PATH_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(Constants.IMAGE_PATH_TAG)");
        String stringExtra3 = getIntent().getStringExtra("DOCUMENT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra3, "intent.getStringExtra(Constants.DOCUMENT_TYPE_TAG)");
        String stringExtra4 = getIntent().getStringExtra("PRODUCT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra4, "intent.getStringExtra(Constants.PRODUCT_TYPE_TAG)");
        String stringExtra5 = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra5, "intent.getStringExtra(Constants.FLOW_TAG)");
        Intent MediaBrowserCompat$CustomActionResultReceiver = C5635x9aabe7dc.MediaBrowserCompat$CustomActionResultReceiver(this, stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, getIntent().getBooleanExtra("FROM_GALLERY_TAG", false));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
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

    public final void IconCompatParcelizer() {
        HmlNTBReviewDocumentActivity.read read = HmlNTBReviewDocumentActivity.MediaBrowserCompat$SearchResultReceiver;
        String stringExtra = getIntent().getStringExtra("APPLICATION_ID_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(Co…tants.APPLICATION_ID_TAG)");
        String stringExtra2 = getIntent().getStringExtra("IMAGE_PATH_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(Constants.IMAGE_PATH_TAG)");
        String stringExtra3 = getIntent().getStringExtra("DOCUMENT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra3, "intent.getStringExtra(Constants.DOCUMENT_TYPE_TAG)");
        String stringExtra4 = getIntent().getStringExtra("PRODUCT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra4, "intent.getStringExtra(Constants.PRODUCT_TYPE_TAG)");
        String stringExtra5 = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra5, "intent.getStringExtra(Constants.FLOW_TAG)");
        Intent MediaBrowserCompat$CustomActionResultReceiver = HmlNTBReviewDocumentActivity.read.MediaBrowserCompat$CustomActionResultReceiver(this, stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, getIntent().getBooleanExtra("FROM_GALLERY_TAG", false));
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
    }

    public final void write() {
        String stringExtra = getIntent().getStringExtra("APPLICATION_ID_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(Co…tants.APPLICATION_ID_TAG)");
        String stringExtra2 = getIntent().getStringExtra("DOCUMENT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(Constants.DOCUMENT_TYPE_TAG)");
        String stringExtra3 = getIntent().getStringExtra("PRODUCT_TYPE_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra3, "intent.getStringExtra(Constants.PRODUCT_TYPE_TAG)");
        String stringExtra4 = getIntent().getStringExtra("FLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra4, "intent.getStringExtra(Constants.FLOW_TAG)");
        Intent write = C5637xbdb9ef55.write(this, stringExtra, stringExtra2, stringExtra3, stringExtra4);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, write).read();
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
