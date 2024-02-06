package com.scb.phone.view.activity.hml;

import android.content.Intent;
import com.scb.phone.view.activity.hml.submission.HmlDocumentSubmissionActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportCaptureModule_GetIJsonExactionHelperKtaFactory;
import p040o.ZSYR2K;
import p040o.onGetStartedClick;
import p040o.setPersonalShortCuts;
import p040o.setProperty;
import p040o.setProperty$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setReadOnly;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class HmlSensitiveConsentActivity extends HmlBaseConsentActivity implements PassportCaptureModule_GetIJsonExactionHelperKtaFactory {
    public static final IconCompatParcelizer MediaMetadataCompat = new IconCompatParcelizer((byte) 0);
    @HmlPinActivity
    public setProperty presenter;

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        setProperty setproperty = this.presenter;
        if (setproperty == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setproperty.MediaBrowserCompat$ItemReceiver(this);
    }

    public final setReadOnly<?> MediaSessionCompat$QueueItem() {
        setProperty setproperty = this.presenter;
        if (setproperty == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return setproperty;
    }

    public final void IconCompatParcelizer() {
        HmlDocumentSubmissionActivity.write write = HmlDocumentSubmissionActivity.MediaDescriptionCompat;
        Intent MediaBrowserCompat$ItemReceiver = HmlDocumentSubmissionActivity.write.MediaBrowserCompat$ItemReceiver(this, setPersonalShortCuts.RESUBMISSION);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
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

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = HmlApplicationOutcomeActivity.MediaBrowserCompat$CustomActionResultReceiver(this, false);
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
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        setProperty setproperty = this.presenter;
        if (setproperty == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z2 = false;
        if (z) {
            setproperty.MediaBrowserCompat$ItemReceiver(true);
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setProperty.write.IconCompatParcelizer;
            if (setproperty.RatingCompat != null) {
                z2 = true;
            }
            if (z2) {
                iconCompatParcelizer.IconCompatParcelizer(setproperty.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer setproperty_mediabrowsercompat_customactionresultreceiver = new setProperty$MediaBrowserCompat$CustomActionResultReceiver(setproperty);
        if (setproperty.RatingCompat != null) {
            z2 = true;
        }
        if (z2) {
            setproperty_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(setproperty.RatingCompat);
        }
    }

    public final void MediaDescriptionCompat() {
        this.scbAnalytics.write("p10x1_sensitive_consent", new ZSYR2K("user_type", MediaSessionCompat$Token()), new ZSYR2K("button", "accept"), new ZSYR2K("loan_type", "consumer"));
    }
}
