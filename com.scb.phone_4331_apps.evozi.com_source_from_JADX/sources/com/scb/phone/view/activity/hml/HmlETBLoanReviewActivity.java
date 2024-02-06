package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.widget.CheckBox;
import com.scb.phone.view.activity.hml.HmlConsentActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C3283xb329dd43;
import p040o.CustomAdvertisingIdClient;
import p040o.MyECouponActivity_ViewBinding;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p040o.zzfe;

public final class HmlETBLoanReviewActivity extends HmlBaseLoanReviewActivity<CustomAdvertisingIdClient.C3279a> {
    public static final C5608x8c1cdc30 MediaBrowserCompat$MediaItem = new C5608x8c1cdc30((byte) 0);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String mo14513x50fd9e4a() {
        return "etb";
    }

    public final void read() {
        C5610xd0499873 hmlETBSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlETBSuccessActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlETBSuccessActivity.class);
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
    }

    public final void IconCompatParcelizer() {
        HmlEtbConfirmationOtpActivity$MediaBrowserCompat$ItemReceiver hmlEtbConfirmationOtpActivity$MediaBrowserCompat$ItemReceiver = HmlEtbConfirmationOtpActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        CheckBox checkBox = this.termsConditionsCheckbox;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("termsConditionsCheckbox");
        }
        boolean isChecked = checkBox.isChecked();
        onGetStartedClick.write((Object) context, "context");
        Intent putExtra = new Intent(context, HmlEtbConfirmationOtpActivity.class).putExtra("TNC_DISBURSEMENT_ACCEPTED", isChecked);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlEtbCo… tncDisbursementAccepted)");
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, putExtra).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 1101);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        HmlConsentActivity.read read = HmlConsentActivity.MediaMetadataCompat;
        Intent write = HmlConsentActivity.read.write(this, zzfe.zza.TERMS_N_CONDITIONS_DISBURSEMENT, (immediateFailedFuture) null);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, write).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read2, 5500);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1101) {
            T t = this.hmlLoanReviewPresenter;
            if (t == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("hmlLoanReviewPresenter");
            }
            CustomAdvertisingIdClient.C3279a aVar = (CustomAdvertisingIdClient.C3279a) t;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C3283xb329dd43.MediaBrowserCompat$ItemReceiver;
            if (aVar.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(aVar.RatingCompat);
            }
        }
    }
}
