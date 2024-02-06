package com.scb.phone.view.activity.prepaid.reset;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prepaid.PrepaidDetailsActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.HashMap;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZHER2K;
import p040o.getKernelIDDstAtop;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class PrepaidResetPinSuccessActivity extends BaseActivity {
    private final HmlVerifyEmailActivity MediaBrowserCompat$SearchResultReceiver;
    private HashMap MediaMetadataCompat;

    public static final Intent IconCompatParcelizer(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return new Intent(context, PrepaidResetPinSuccessActivity.class);
    }

    private View MediaBrowserCompat$ItemReceiver(int i) {
        if (this.MediaMetadataCompat == null) {
            this.MediaMetadataCompat = new HashMap();
        }
        View view = (View) this.MediaMetadataCompat.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.MediaMetadataCompat.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onBackPressed() {
    }

    public PrepaidResetPinSuccessActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = C5704xaeeefa8a.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$SearchResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class write {
        public String read;

        private write() {
        }

        public write(String str) {
            this.read = str;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79272131493152);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        TextView textView = (TextView) MediaBrowserCompat$ItemReceiver(ZHER2K.write.pinchange_success_title);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "pinchange_success_title");
        textView.setText(getString(R.string.prepaid_reset_success_title));
        TextView textView2 = (TextView) MediaBrowserCompat$ItemReceiver(ZHER2K.write.pinchange_success_content);
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "pinchange_success_content");
        textView2.setVisibility(8);
        ((getKernelIDDstAtop) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_resetcardpin_success_screen");
    }

    @OnClick
    public final void onOkClick() {
        ((getKernelIDDstAtop) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_ok_resetpin");
        Intent read = PrepaidDetailsActivity.read((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }
}
