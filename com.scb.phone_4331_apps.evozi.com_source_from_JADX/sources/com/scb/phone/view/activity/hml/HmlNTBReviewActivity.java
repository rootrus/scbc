package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.HmlNTBApplicationOutcomeActivity;
import com.scb.phone.view.activity.hml.HmlNTBConsentActivity;
import com.scb.phone.view.activity.hml.HmlVerifyPhoneReviewActivity;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.EnumMap;
import p040o.HmlBusinessOwnerReviewSubmissionActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.VisibilityAwareImageButton;
import p040o.ZSYR2K;
import p040o.immediateFailedFuture;
import p040o.isRetryOk;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeNonFatalException;
import p040o.zzfe;

public final class HmlNTBReviewActivity extends HmlBaseReviewActivity<isRetryOk> {
    public static final IconCompatParcelizer MediaMetadataCompat = new IconCompatParcelizer((byte) 0);

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, boolean z) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "principalAmount");
    }

    /* access modifiers changed from: protected */
    public final boolean MediaSessionCompat$Token() {
        return true;
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static Intent write(Context context, VisibilityAwareImageButton visibilityAwareImageButton, String str) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) visibilityAwareImageButton, "type");
            Intent putExtra = new Intent(context, HmlNTBReviewActivity.class).putExtra("EXTRA_TYPE", visibilityAwareImageButton.ordinal());
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "putExtra(key, value?.ordinal ?: -1)");
            Intent putExtra2 = putExtra.putExtra("DEEP_LINK_ID", str);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra2, "Intent(context, HmlNTBRe…DEEP_LINK_ID, deepLinkId)");
            return putExtra2;
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        this.scbAnalytics.write("p10x1_ntb_review_submission", new ZSYR2K("user_type", "ntb"));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "amount");
        this.scbAnalytics.write("p10x1_ntb_review_submission_confirmation", new ZSYR2K("product_type", str), new ZSYR2K("product_application_amount", str2));
    }

    public final void read(writeNonFatalException writenonfatalexception) {
        onGetStartedClick.write((Object) writenonfatalexception, "display");
        super.read(writenonfatalexception);
        ProgressStateBar progressStateBar = this.breadcrumbs;
        if (progressStateBar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbs");
        }
        String[] stringArray = getResources().getStringArray(R.array.f64702130903049);
        onGetStartedClick.IconCompatParcelizer((Object) stringArray, "resources.getStringArray…rray.hml_breadcrumbs_ntb)");
        progressStateBar.setStates(HmlBusinessOwnerReviewSubmissionActivity.write((T[]) stringArray));
        ProgressStateBar progressStateBar2 = this.breadcrumbs;
        if (progressStateBar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbs");
        }
        progressStateBar2.setVisibility(0);
        ProgressStateBar progressStateBar3 = this.breadcrumbs;
        if (progressStateBar3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbs");
        }
        progressStateBar3.setCurrentState(3);
        TextView textView = this.tvNameLabel;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvNameLabel");
        }
        textView.setText(getString(R.string.hml_review_thai_name));
        TextView textView2 = this.tvTitle;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTitle");
        }
        textView2.setText(writenonfatalexception.MediaBrowserCompat$SearchResultReceiver);
        TextView textView3 = this.tvEngName;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvEngName");
        }
        textView3.setText(writenonfatalexception.MediaBrowserCompat$ItemReceiver);
        TextView textView4 = this.tvBirth;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvBirth");
        }
        textView4.setText(writenonfatalexception.IconCompatParcelizer.write);
        TextView textView5 = this.tvNationalId;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvNationalId");
        }
        textView5.setText(writenonfatalexception.IconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer);
        TextView textView6 = this.tvLaserId;
        if (textView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLaserId");
        }
        textView6.setText(writenonfatalexception.IconCompatParcelizer.IconCompatParcelizer.write);
        TextView textView7 = this.tvIssue;
        if (textView7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvIssue");
        }
        textView7.setText(writenonfatalexception.IconCompatParcelizer.IconCompatParcelizer.read);
        TextView textView8 = this.tvHomeAddress;
        if (textView8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvHomeAddress");
        }
        textView8.setText(writenonfatalexception.IconCompatParcelizer.read);
        ProgressStateBar progressStateBar4 = this.breadcrumbs;
        if (progressStateBar4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbs");
        }
        progressStateBar4.setVisibility(0);
        View view = this.separatorBreadcrumbs;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("separatorBreadcrumbs");
        }
        view.setVisibility(0);
        TextView textView9 = this.tvTitleLabel;
        if (textView9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTitleLabel");
        }
        textView9.setVisibility(0);
        TextView textView10 = this.tvTitle;
        if (textView10 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTitle");
        }
        textView10.setVisibility(0);
        TextView textView11 = this.tvNameLabel;
        if (textView11 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvNameLabel");
        }
        textView11.setVisibility(0);
        TextView textView12 = this.tvName;
        if (textView12 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvName");
        }
        textView12.setVisibility(0);
        TextView textView13 = this.tvEngNameLabel;
        if (textView13 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvEngNameLabel");
        }
        textView13.setVisibility(0);
        TextView textView14 = this.tvEngName;
        if (textView14 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvEngName");
        }
        textView14.setVisibility(0);
        TextView textView15 = this.tvBirthLabel;
        if (textView15 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvBirthLabel");
        }
        textView15.setVisibility(0);
        TextView textView16 = this.tvBirth;
        if (textView16 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvBirth");
        }
        textView16.setVisibility(0);
        TextView textView17 = this.tvNationalIdLabel;
        if (textView17 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvNationalIdLabel");
        }
        textView17.setVisibility(0);
        TextView textView18 = this.tvNationalId;
        if (textView18 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvNationalId");
        }
        textView18.setVisibility(0);
        TextView textView19 = this.tvLaserIdLabel;
        if (textView19 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLaserIdLabel");
        }
        textView19.setVisibility(0);
        TextView textView20 = this.tvLaserId;
        if (textView20 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLaserId");
        }
        textView20.setVisibility(0);
        TextView textView21 = this.tvIssueLabel;
        if (textView21 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvIssueLabel");
        }
        textView21.setVisibility(0);
        TextView textView22 = this.tvIssue;
        if (textView22 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvIssue");
        }
        textView22.setVisibility(0);
        TextView textView23 = this.tvHomeAddressLabel;
        if (textView23 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvHomeAddressLabel");
        }
        textView23.setVisibility(0);
        TextView textView24 = this.tvHomeAddress;
        if (textView24 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvHomeAddress");
        }
        textView24.setVisibility(0);
        TextView textView25 = this.tvLaserLabel;
        if (textView25 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLaserLabel");
        }
        textView25.setVisibility(8);
        TextView textView26 = this.tvLaser;
        if (textView26 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLaser");
        }
        textView26.setVisibility(8);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1001 && i2 == -1) {
            MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void read(EnumMap<zzfe.zza, Boolean> enumMap, String str) {
        onGetStartedClick.write((Object) enumMap, "consents");
        onGetStartedClick.write((Object) str, "applicationUuid");
        HmlVerifyPhoneReviewActivity.write write = HmlVerifyPhoneReviewActivity.MediaMetadataCompat;
        Context baseContext = getBaseContext();
        onGetStartedClick.IconCompatParcelizer((Object) baseContext, "baseContext");
        onGetStartedClick.write((Object) baseContext, "context");
        onGetStartedClick.write((Object) enumMap, "consents");
        onGetStartedClick.write((Object) str, "appuid");
        Intent putExtra = new Intent(baseContext, HmlVerifyPhoneReviewActivity.class).putExtra("com.scb.phone.EXTRA_DISPLAY", enumMap).putExtra("APP_UID", str);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlVerif…putExtra(APP_UID, appuid)");
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, putExtra).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read, 1001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        HmlNTBApplicationOutcomeActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBApplicationOutcomeActivity.MediaBrowserCompat$SearchResultReceiver;
        Context baseContext = getBaseContext();
        onGetStartedClick.IconCompatParcelizer((Object) baseContext, "baseContext");
        onGetStartedClick.write((Object) baseContext, "context");
        Intent putExtra = new Intent(baseContext, HmlNTBApplicationOutcomeActivity.class).putExtra("SHOW_PENDING_STATE", true);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlNTBAp…_EXTRA, showPendingState)");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, putExtra).read();
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

    public final void MediaBrowserCompat$CustomActionResultReceiver(zzfe.zza zza, immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) zza, "type");
        onGetStartedClick.write((Object) immediatefailedfuture, "termsAndConsInfoDisplay");
        HmlNTBConsentActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBConsentActivity.MediaMetadataCompat;
        Intent MediaBrowserCompat$ItemReceiver = HmlNTBConsentActivity.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this, zza, immediatefailedfuture);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 1002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
