package com.scb.phone.view.activity.hml.promptpay;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.data.network.service.easycash.EasycashMCMCDetailService;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlNTBOccupationInfoActivity;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.CrashlyticsController;
import p040o.HmlBusinessOwnerReviewSubmissionActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportCaptureModule_KtaExceptionResponseDeserializer_Factory;
import p040o.getDisplayValue;
import p040o.getDisplayValue$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.setBackendId;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p040o.zzjx;

public final class HmlPromptPayVerificationActivity extends BaseActivity implements PassportCaptureModule_KtaExceptionResponseDeserializer_Factory {
    @BindView
    public ProgressStateBar breadcrumbnsNtb;
    @BindView
    public Button button;
    @BindView
    public TextView mainTextView;
    @HmlPinActivity
    public getDisplayValue presenter;
    @BindView
    public TextView secondaryTextView;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78342131493059);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.hml_prompt_pay_title));
        setTabContainer();
        ProgressStateBar progressStateBar = this.breadcrumbnsNtb;
        if (progressStateBar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbnsNtb");
        }
        String[] stringArray = getResources().getStringArray(R.array.f64702130903049);
        onGetStartedClick.IconCompatParcelizer((Object) stringArray, "resources.getStringArray…rray.hml_breadcrumbs_ntb)");
        progressStateBar.setStates(HmlBusinessOwnerReviewSubmissionActivity.write((T[]) stringArray));
        ProgressStateBar progressStateBar2 = this.breadcrumbnsNtb;
        if (progressStateBar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbnsNtb");
        }
        progressStateBar2.setVisibility(0);
        ProgressStateBar progressStateBar3 = this.breadcrumbnsNtb;
        if (progressStateBar3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbnsNtb");
        }
        progressStateBar3.setCurrentState(1);
        getDisplayValue getdisplayvalue = this.presenter;
        if (getdisplayvalue == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getdisplayvalue.MediaBrowserCompat$ItemReceiver(this);
        Button button2 = this.button;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("button");
        }
        button2.setOnClickListener(new write(this));
        mo13676d_("p10x1_ntb_promptpay_verification");
    }

    static final class write implements View.OnClickListener {
        private /* synthetic */ HmlPromptPayVerificationActivity write;

        write(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
            this.write = hmlPromptPayVerificationActivity;
        }

        public final void onClick(View view) {
            getDisplayValue getdisplayvalue = this.write.presenter;
            if (getdisplayvalue == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            zzjx.zzb.zza zza = getdisplayvalue.read;
            if (zza == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("stage");
            }
            int i = setBackendId.IconCompatParcelizer[zza.ordinal()];
            boolean z = false;
            if (i == 1) {
                if (getdisplayvalue.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getdisplayvalue.RatingCompat.AlertController$RecycleListView();
                }
                getdisplayvalue.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
                getdisplayvalue.IconCompatParcelizer.IconCompatParcelizer(new getDisplayValue$MediaBrowserCompat$CustomActionResultReceiver(getdisplayvalue));
            } else if (i == 2) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getDisplayValue.read.MediaBrowserCompat$ItemReceiver;
                if (getdisplayvalue.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(getdisplayvalue.RatingCompat);
                }
            } else if (i == 3) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getDisplayValue.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                if (getdisplayvalue.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer2.IconCompatParcelizer(getdisplayvalue.RatingCompat);
                }
            }
        }
    }

    public final void onStart() {
        super.onStart();
        getDisplayValue getdisplayvalue = this.presenter;
        if (getdisplayvalue == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (getdisplayvalue.RatingCompat != null) {
            getdisplayvalue.RatingCompat.AlertController$RecycleListView();
        }
        getdisplayvalue.write.MediaBrowserCompat$ItemReceiver();
        getdisplayvalue.write.IconCompatParcelizer(new getDisplayValue.write(getdisplayvalue));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.hml_prompt_pay_title));
        setTabContainer();
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsController.C32378.C32381 r6) {
        CharSequence charSequence;
        onGetStartedClick.write((Object) r6, "display");
        TextView textView = this.mainTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mainTextView");
        }
        int i = 0;
        if (Build.VERSION.SDK_INT >= 24) {
            charSequence = Html.fromHtml(getString(r6.MediaBrowserCompat$CustomActionResultReceiver), 0);
        } else {
            charSequence = Html.fromHtml(getString(r6.MediaBrowserCompat$CustomActionResultReceiver));
        }
        textView.setText(charSequence);
        TextView textView2 = this.secondaryTextView;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("secondaryTextView");
        }
        Integer num = r6.read;
        if (num != null) {
            int intValue = num.intValue();
            TextView textView3 = this.secondaryTextView;
            if (textView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("secondaryTextView");
            }
            textView3.setText(getString(intValue));
        } else {
            i = 8;
        }
        textView2.setVisibility(i);
        Button button2 = this.button;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("button");
        }
        button2.setText(getString(r6.write));
    }

    public static final class read {
        public final EasycashMCMCDetailService write;

        private read() {
        }

        @HmlPinActivity
        public read(EasycashMCMCDetailService easycashMCMCDetailService) {
            onGetStartedClick.write((Object) easycashMCMCDetailService, "service");
            this.write = easycashMCMCDetailService;
        }
    }

    public final void IconCompatParcelizer() {
        HmlNTBOccupationInfoActivity.write write2 = HmlNTBOccupationInfoActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlNTBOccupationInfoActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        HmlNTBPromptPayNotFoundActivity$MediaBrowserCompat$ItemReceiver hmlNTBPromptPayNotFoundActivity$MediaBrowserCompat$ItemReceiver = HmlNTBPromptPayNotFoundActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlNTBPromptPayNotFoundActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
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
    }

    public final void read() {
        HmlPromptpayEnterCodeActivity$MediaBrowserCompat$ItemReceiver hmlPromptpayEnterCodeActivity$MediaBrowserCompat$ItemReceiver = HmlPromptpayEnterCodeActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlPromptpayEnterCodeActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
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
    }
}
