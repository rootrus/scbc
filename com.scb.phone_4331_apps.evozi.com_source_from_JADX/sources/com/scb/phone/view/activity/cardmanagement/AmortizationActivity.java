package com.scb.phone.view.activity.cardmanagement;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.presentation.presenter.cardmanagement.AmortizationPresenter;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTransferInstallmentsReviewActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.CrashlyticsReport;
import p040o.CreditCardCaptureModule_GetProcessingParametersFactory;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$2200;
import p040o.chain;
import p040o.ensureReceiverRegistered;
import p040o.entryRemoved;
import p040o.normalize;
import p040o.onGetStartedClick;
import p040o.registerAnalyticsConnectorListener;
import p040o.setTapText;

public final class AmortizationActivity extends BaseAmortizationActivity implements CreditCardCaptureModule_GetProcessingParametersFactory {
    private static C5564x6bb3addb MediaMetadataCompat = new C5564x6bb3addb((byte) 0);
    @HmlPinActivity
    public AmortizationPresenter presenter;

    public static final void write(Context context, ensureReceiverRegistered ensurereceiverregistered, normalize normalize, CrashlyticsReport.FilesPayload.File.Builder builder, chain chain) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) ensurereceiverregistered, "display");
        onGetStartedClick.write((Object) normalize, "planDisplay");
        onGetStartedClick.write((Object) builder, "accountSourceDisplay");
        onGetStartedClick.write((Object) chain, "creditCardDisplay");
        Intent intent = new Intent(context, AmortizationActivity.class);
        intent.putExtra("com.phone.scb.EXTRA_AMORTIZATION_SUMMARY_DISPLAY", ensurereceiverregistered);
        intent.putExtra("com.phone.scb.EXTRA_DEEJUNG_PLAN_DISPLAY", normalize);
        intent.putExtra("com.phone.scb.EXTRA_ACCOUNT_SOURCE_DISPLAY", builder);
        intent.putExtra("com.phone.scb.EXTRA_CREDIT_CARD_DISPLAY", chain);
        intent.addFlags(603979776);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            context.startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        entryRemoved lifecycle = getLifecycle();
        AmortizationPresenter amortizationPresenter = this.presenter;
        if (amortizationPresenter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        lifecycle.IconCompatParcelizer(amortizationPresenter);
        AmortizationPresenter amortizationPresenter2 = this.presenter;
        if (amortizationPresenter2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        amortizationPresenter2.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        ensureReceiverRegistered ensurereceiverregistered = intent != null ? (ensureReceiverRegistered) intent.getParcelableExtra("com.phone.scb.EXTRA_AMORTIZATION_SUMMARY_DISPLAY") : null;
        if (ensurereceiverregistered != null) {
            read(ensurereceiverregistered);
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.deejung_amortization_activity_title);
        setTabContainer();
    }

    public final void read(registerAnalyticsConnectorListener registeranalyticsconnectorlistener) {
        onGetStartedClick.write((Object) registeranalyticsconnectorlistener, "display");
        Intent IconCompatParcelizer = DeejungTransferInstallmentsReviewActivity.IconCompatParcelizer(this, registeranalyticsconnectorlistener);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, IconCompatParcelizer).read();
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

    @OnClick
    public final void onClickNextAction() {
        IconCompatParcelizer(false);
    }

    /* access modifiers changed from: private */
    public final void IconCompatParcelizer(boolean z) {
        AmortizationPresenter amortizationPresenter = this.presenter;
        if (amortizationPresenter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Intent intent = getIntent();
        CrashlyticsReport.FilesPayload.File.Builder builder = null;
        ensureReceiverRegistered ensurereceiverregistered = intent != null ? (ensureReceiverRegistered) intent.getParcelableExtra("com.phone.scb.EXTRA_AMORTIZATION_SUMMARY_DISPLAY") : null;
        Intent intent2 = getIntent();
        normalize normalize = intent2 != null ? (normalize) intent2.getParcelableExtra("com.phone.scb.EXTRA_DEEJUNG_PLAN_DISPLAY") : null;
        Intent intent3 = getIntent();
        if (intent3 != null) {
            builder = (CrashlyticsReport.FilesPayload.File.Builder) intent3.getParcelableExtra("com.phone.scb.EXTRA_ACCOUNT_SOURCE_DISPLAY");
        }
        CrashlyticsReport.FilesPayload.File.Builder builder2 = builder;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("com.phone.scb.EXTRA_CREDIT_CARD_DISPLAY");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtr…XTRA_CREDIT_CARD_DISPLAY)");
        amortizationPresenter.MediaBrowserCompat$CustomActionResultReceiver(ensurereceiverregistered, normalize, builder2, (chain) parcelableExtra, z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(access$2200 access_2200) {
        if (!isFinishing() && access_2200 != null) {
            CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
            String str = access_2200.MediaBrowserCompat$ItemReceiver;
            if (!(str == null || str.length() == 0)) {
                IconCompatParcelizer.mTitleTextView.setVisibility(0);
                IconCompatParcelizer.mTitleTextView.setText(str);
            }
            String str2 = access_2200.IconCompatParcelizer;
            if (!(str2 == null || str2.length() == 0)) {
                IconCompatParcelizer.mTextTextView.setVisibility(0);
                IconCompatParcelizer.mTextTextView.setText(str2);
            }
            CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.proceed), new write(this));
            IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), read.read).show();
        }
    }

    static final class write implements DialogInterface.OnClickListener {
        private /* synthetic */ AmortizationActivity MediaBrowserCompat$ItemReceiver;

        write(AmortizationActivity amortizationActivity) {
            this.MediaBrowserCompat$ItemReceiver = amortizationActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(true);
        }
    }

    static final class read implements DialogInterface.OnClickListener {
        public static final read read = new read();

        read() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        entryRemoved lifecycle = getLifecycle();
        AmortizationPresenter amortizationPresenter = this.presenter;
        if (amortizationPresenter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        lifecycle.MediaBrowserCompat$ItemReceiver(amortizationPresenter);
    }
}
