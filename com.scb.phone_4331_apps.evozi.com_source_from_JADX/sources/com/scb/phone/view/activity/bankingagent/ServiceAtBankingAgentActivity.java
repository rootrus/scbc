package com.scb.phone.view.activity.bankingagent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.bankingagent.ServiceAtBankingAgentCoachMarkActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MiddleOutStrategy;
import p040o.MiddleOutStrategy$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.MiddleOutStrategy$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.RttiCheckExtractor;
import p040o.ZSYMM;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class ServiceAtBankingAgentActivity extends BaseActivity implements RttiCheckExtractor {
    public static final ServiceAtBankingAgentActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem = new ServiceAtBankingAgentActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    private final HmlVerifyEmailActivity MediaDescriptionCompat;
    @HmlPinActivity
    public MiddleOutStrategy presenter;

    public ServiceAtBankingAgentActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = IconCompatParcelizer.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaDescriptionCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79892131493214);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.service_at_banking_agent_title);
        setTabContainer();
        MiddleOutStrategy middleOutStrategy = this.presenter;
        if (middleOutStrategy == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        middleOutStrategy.MediaBrowserCompat$ItemReceiver(this);
        MiddleOutStrategy middleOutStrategy2 = this.presenter;
        if (middleOutStrategy2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        if (!middleOutStrategy2.read.MediaBrowserCompat$CustomActionResultReceiver().isEmpty()) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = MiddleOutStrategy$MediaBrowserCompat$CustomActionResultReceiver.read;
            if (middleOutStrategy2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(middleOutStrategy2.RatingCompat);
            }
        }
        ((ZSYMM) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "bankingagent_landing");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.service_at_banking_agent_title);
        setTabContainer();
    }

    @OnClick
    public final void clickQRForDeposit() {
        MiddleOutStrategy middleOutStrategy = this.presenter;
        if (middleOutStrategy == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = MiddleOutStrategy$MediaBrowserCompat$ItemReceiver.read;
        if (middleOutStrategy.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(middleOutStrategy.RatingCompat);
        }
    }

    @OnClick
    public final void clickQRForWithdrawal() {
        MiddleOutStrategy middleOutStrategy = this.presenter;
        if (middleOutStrategy == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = MiddleOutStrategy.write.MediaBrowserCompat$ItemReceiver;
        if (middleOutStrategy.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(middleOutStrategy.RatingCompat);
        }
    }

    public final void write() {
        ServiceAtBankingAgentCoachMarkActivity.read read = ServiceAtBankingAgentCoachMarkActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, ServiceAtBankingAgentCoachMarkActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<ZSYMM> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ZSYMM zsymm = new ZSYMM();
            zsymm.read("bankingservice");
            return zsymm;
        }
    }

    public final void read() {
        onGetStartedClick.write((Object) "deposit", "type");
        ((ZSYMM) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver()).read("type", "deposit");
        ((ZSYMM) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver()).read("bankingagent");
        BankingEnterAmountActivity.MediaBrowserCompat$MediaItem.IconCompatParcelizer(this, "D", (ZSYMM) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver());
    }

    public final void IconCompatParcelizer() {
        onGetStartedClick.write((Object) "withdraw", "type");
        ((ZSYMM) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver()).read("type", "withdraw");
        ((ZSYMM) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver()).read("bankingagent");
        BankingEnterAmountActivity.MediaBrowserCompat$MediaItem.IconCompatParcelizer(this, "W", (ZSYMM) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver());
    }
}
