package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.HmlConsentActivity;
import com.scb.phone.view.activity.hml.HmlEtbSubmissionOtpActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.EnumMap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.NetworkService;
import p040o.NetworkService$MediaBrowserCompat$ItemReceiver;
import p040o.VisibilityAwareImageButton;
import p040o.ZSYR2K;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeNonFatalException;
import p040o.writeUInt64NoTag;
import p040o.zzcz;
import p040o.zzfe;

public final class HmlETBReviewActivity extends HmlBaseReviewActivity<NetworkService> {
    public static final read MediaMetadataCompat = new read((byte) 0);

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, VisibilityAwareImageButton visibilityAwareImageButton, String str) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) visibilityAwareImageButton, "type");
            Intent putExtra = new Intent(context, HmlETBReviewActivity.class).putExtra("EXTRA_TYPE", visibilityAwareImageButton.ordinal());
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "putExtra(key, value?.ordinal ?: -1)");
            Intent putExtra2 = putExtra.putExtra("DEEP_LINK_ID", str);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra2, "Intent(context, HmlETBRe…DEEP_LINK_ID, deepLinkId)");
            return putExtra2;
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        this.scbAnalytics.write("p10x1_review_submission", new ZSYR2K("user_type", "etb"));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "amount");
        this.scbAnalytics.write("p10x1_review_submission_confirmation", new ZSYR2K("product_type", str), new ZSYR2K("product_application_amount", str2));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = HmlApplicationOutcomeActivity.MediaBrowserCompat$CustomActionResultReceiver(this, true);
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

    public final void read(EnumMap<zzfe.zza, Boolean> enumMap, String str) {
        onGetStartedClick.write((Object) enumMap, "consents");
        onGetStartedClick.write((Object) str, "applicationUuid");
        HmlEtbSubmissionOtpActivity.write write = HmlEtbSubmissionOtpActivity.MediaDescriptionCompat;
        Context context = this;
        Boolean bool = enumMap.get(zzfe.zza.TERMS_N_CONDITIONS);
        Boolean bool2 = enumMap.get(zzfe.zza.MODEL_CONSENT);
        Boolean bool3 = enumMap.get(zzfe.zza.CROSS_SELL_CONSENT);
        String str2 = this.MediaBrowserCompat$MediaItem;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("principal");
        }
        String str3 = this.MediaDescriptionCompat;
        if (str3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("repayment");
        }
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("term");
        }
        Intent MediaBrowserCompat$ItemReceiver = HmlEtbSubmissionOtpActivity.write.MediaBrowserCompat$ItemReceiver(context, bool, bool2, bool3, str, (String) null, str2, str3, str4);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read2, 1100);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(zzfe.zza zza, immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) zza, "type");
        onGetStartedClick.write((Object) immediatefailedfuture, "termsAndConsInfoDisplay");
        HmlConsentActivity.read read2 = HmlConsentActivity.MediaMetadataCompat;
        Intent write = HmlConsentActivity.read.write(this, zza, immediatefailedfuture);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read3 = setTapText.write(this, write).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read3.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read3, 1002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1100) {
            T t = this.presenter;
            if (t == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            NetworkService networkService = (NetworkService) t;
            writeUInt64NoTag.IconCompatParcelizer networkService$MediaBrowserCompat$ItemReceiver = new NetworkService$MediaBrowserCompat$ItemReceiver(networkService);
            if (networkService.RatingCompat != null) {
                networkService$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(networkService.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, boolean z) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "principalAmount");
        ZSYR2K[] zsyr2kArr = new ZSYR2K[4];
        zsyr2kArr[0] = new ZSYR2K("user_type", "etb");
        zsyr2kArr[1] = new ZSYR2K("loan_type", z ? "business_owner" : "consumer");
        zsyr2kArr[2] = new ZSYR2K("product_type", str);
        zsyr2kArr[3] = new ZSYR2K("product_application_amount", str2);
        this.scbAnalytics.write("p10x1_etb_otp", zsyr2kArr);
    }

    public final void read(writeNonFatalException writenonfatalexception) {
        onGetStartedClick.write((Object) writenonfatalexception, "display");
        super.read(writenonfatalexception);
        zzcz.zzb zzb = writenonfatalexception.read.MediaBrowserCompat$CustomActionResultReceiver;
        if (zzb != null) {
            TextView textView = this.stampDutyDescription;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("stampDutyDescription");
            }
            textView.setVisibility(0);
            View view = this.stampDutySeparator;
            if (view == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("stampDutySeparator");
            }
            view.setVisibility(0);
            TextView textView2 = this.stampDutyLabel;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("stampDutyLabel");
            }
            textView2.setVisibility(0);
            TextView textView3 = this.stampDutyLabel;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("stampDutyLabel");
            }
            textView3.setText(getString(R.string.hml_review_stamp_duty_label, new Object[]{zzb.read}));
            TextView textView4 = this.stampDutyDescription;
            if (textView4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("stampDutyDescription");
            }
            textView4.setText(getString(R.string.hml_review_stamp_duty_description, new Object[]{zzb.read, zzb.IconCompatParcelizer}));
        }
    }
}
