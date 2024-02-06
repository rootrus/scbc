package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.hml.HmlNTBConsentActivity;
import com.scb.phone.view.activity.hml.HmlNTBSuccessActivity;
import com.scb.phone.view.activity.hml.HmlVerifyPhoneLoanReviewActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C4630x94c42fe7;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getProfileShortCuts;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p040o.zzfe;

public final class HmlNTBLoanReviewActivity extends HmlBaseLoanReviewActivity<getProfileShortCuts> {
    public static final write MediaBrowserCompat$SearchResultReceiver = new write((byte) 0);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String mo14513x50fd9e4a() {
        return "ntb";
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void read() {
        HmlNTBSuccessActivity.write write2 = HmlNTBSuccessActivity.MediaBrowserCompat$SearchResultReceiver;
        Context baseContext = getBaseContext();
        onGetStartedClick.IconCompatParcelizer((Object) baseContext, "baseContext");
        onGetStartedClick.write((Object) baseContext, "context");
        Intent intent = new Intent(baseContext, HmlNTBSuccessActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
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

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        HmlNTBConsentActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBConsentActivity.MediaMetadataCompat;
        Intent MediaBrowserCompat$ItemReceiver = HmlNTBConsentActivity.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this, zzfe.zza.TERMS_N_CONDITIONS_DISBURSEMENT, (immediateFailedFuture) null);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read, 5500);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        HmlVerifyPhoneLoanReviewActivity.write write2 = HmlVerifyPhoneLoanReviewActivity.MediaDescriptionCompat;
        Context baseContext = getBaseContext();
        onGetStartedClick.IconCompatParcelizer((Object) baseContext, "baseContext");
        onGetStartedClick.write((Object) baseContext, "context");
        Intent intent = new Intent(baseContext, HmlVerifyPhoneLoanReviewActivity.class);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivityForResult(read, 1002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            T t = this.hmlLoanReviewPresenter;
            if (t == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("hmlLoanReviewPresenter");
            }
            getProfileShortCuts getprofileshortcuts = (getProfileShortCuts) t;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4630x94c42fe7.read;
            if (getprofileshortcuts.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getprofileshortcuts.RatingCompat);
            }
        }
    }
}
