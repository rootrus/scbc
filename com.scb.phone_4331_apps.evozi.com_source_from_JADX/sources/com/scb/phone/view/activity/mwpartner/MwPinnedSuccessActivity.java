package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.ErrorEventDelegate;
import p040o.HmlPinActivity;
import p040o.IProjectProvider;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getKernelIDClear;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class MwPinnedSuccessActivity extends BaseActivity implements IProjectProvider {
    public static final write MediaBrowserCompat$SearchResultReceiver = new write((byte) 0);
    @HmlPinActivity
    public ErrorEventDelegate presenter;
    @BindView
    public TextView tvAddress;
    @BindView
    public TextView tvDateTime;
    @BindView
    public TextView tvDroppedPin;

    public final void onBackPressed() {
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder;
        super.onCreate(bundle);
        setContentView(R.layout.f78922131493117);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        ErrorEventDelegate errorEventDelegate = this.presenter;
        if (errorEventDelegate == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        errorEventDelegate.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        if (!(extras == null || (crashlyticsReportSessionEventApplicationExecutionThreadEncoder = (AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder) extras.getParcelable("MERCHANT_PINNED_SUCCESS")) == null)) {
            ErrorEventDelegate errorEventDelegate2 = this.presenter;
            if (errorEventDelegate2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.IconCompatParcelizer((Object) crashlyticsReportSessionEventApplicationExecutionThreadEncoder, "it");
            onGetStartedClick.write((Object) crashlyticsReportSessionEventApplicationExecutionThreadEncoder, "display");
            writeUInt64NoTag.IconCompatParcelizer read = new ErrorEventDelegate.read(crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
            if (errorEventDelegate2.RatingCompat != null) {
                read.IconCompatParcelizer(errorEventDelegate2.RatingCompat);
            }
        }
        new getKernelIDClear().MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "merchant_successful_pinshoplocation");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder) {
        onGetStartedClick.write((Object) crashlyticsReportSessionEventApplicationExecutionThreadEncoder, "display");
        TextView textView = this.tvDateTime;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDateTime");
        }
        textView.setText(crashlyticsReportSessionEventApplicationExecutionThreadEncoder.write);
        TextView textView2 = this.tvDroppedPin;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDroppedPin");
        }
        textView2.setText(crashlyticsReportSessionEventApplicationExecutionThreadEncoder.read);
        TextView textView3 = this.tvAddress;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAddress");
        }
        textView3.setText(crashlyticsReportSessionEventApplicationExecutionThreadEncoder.IconCompatParcelizer);
    }

    @OnClick
    public final void onDoneClick() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = MwLandingActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) this);
        MediaBrowserCompat$CustomActionResultReceiver.addFlags(603979776);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
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

    public final void onDestroy() {
        super.onDestroy();
        ErrorEventDelegate errorEventDelegate = this.presenter;
        if (errorEventDelegate == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        errorEventDelegate.onDestroy();
    }
}
