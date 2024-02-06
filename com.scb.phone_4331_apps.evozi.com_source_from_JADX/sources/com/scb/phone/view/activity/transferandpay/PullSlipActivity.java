package com.scb.phone.view.activity.transferandpay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.C4054b;
import p040o.CrashlyticsReport;
import p040o.ForwardingFuture;
import p040o.HmlPinActivity;
import p040o.Iterables;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$lambda$3;
import p040o.b$2$MediaBrowserCompat$ItemReceiver;
import p040o.getTopLeftCornerWidth$AppCompatDelegateImpl$ListMenuDecorView;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class PullSlipActivity extends BaseActivity implements getTopLeftCornerWidth$AppCompatDelegateImpl$ListMenuDecorView {
    @HmlPinActivity
    public Iterables.C352414 mComponentFactory;
    @BindView
    public LinearLayout mContainer;
    @HmlPinActivity
    public C4054b.C40572 mPresenter;

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context, CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder, access$lambda$3 access_lambda_3) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) builder, "billScanDisplay");
        onGetStartedClick.write((Object) access_lambda_3, "pullSlipDisplay");
        Intent intent = new Intent(context, PullSlipActivity.class);
        intent.putExtra("EXTRA_BILL_SCAN_DISPLAY", builder);
        intent.putExtra("EXTRA_PULL_SLIP_DISPLAY", access_lambda_3);
        return intent;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79492131493174);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        C4054b.C40572 r5 = this.mPresenter;
        if (r5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        r5.MediaBrowserCompat$ItemReceiver(this);
        CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder = (CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder) getIntent().getParcelableExtra("EXTRA_BILL_SCAN_DISPLAY");
        access$lambda$3 access_lambda_3 = (access$lambda$3) getIntent().getParcelableExtra("EXTRA_PULL_SLIP_DISPLAY");
        C4054b.C40572 r2 = this.mPresenter;
        if (r2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        onGetStartedClick.IconCompatParcelizer((Object) builder, "billScanDisplay");
        onGetStartedClick.IconCompatParcelizer((Object) access_lambda_3, "pullSlipDisplay");
        onGetStartedClick.write((Object) builder, "billScanDisplay");
        onGetStartedClick.write((Object) access_lambda_3, "pullSlipDisplay");
        writeUInt64NoTag.IconCompatParcelizer read = new C4054b.C40572.read(r2.write.write(builder, access_lambda_3));
        if (r2.RatingCompat != null) {
            read.IconCompatParcelizer(r2.RatingCompat);
        }
    }

    @OnClick
    public final void btnScanAgainClicked() {
        C4054b.C40572 r0 = this.mPresenter;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = b$2$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        if (r0.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(r0.RatingCompat);
        }
    }

    @OnClick
    public final void btnReturnClicked() {
        C4054b.C40572 r0 = this.mPresenter;
        if (r0 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4054b.C40572.write.write;
        if (r0.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(r0.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<? extends ForwardingFuture> list) {
        onGetStartedClick.write((Object) list, "displays");
        for (ForwardingFuture forwardingFuture : list) {
            Iterables.C352414 r1 = this.mComponentFactory;
            if (r1 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mComponentFactory");
            }
            ItemCustom MediaBrowserCompat$CustomActionResultReceiver = r1.MediaBrowserCompat$CustomActionResultReceiver(this, forwardingFuture);
            MediaBrowserCompat$CustomActionResultReceiver.setUpWithDisplay(forwardingFuture);
            LinearLayout linearLayout = this.mContainer;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mContainer");
            }
            linearLayout.addView(MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final void read() {
        Intent intent = new Intent(this, ScanPaymentActivity.class);
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
        finish();
    }

    public final void IconCompatParcelizer() {
        if (!HomeActivity.AppCompatDelegateImpl$ListMenuDecorView()) {
            finishAffinity();
        }
        HomeActivity.write((Context) this, true);
    }
}
