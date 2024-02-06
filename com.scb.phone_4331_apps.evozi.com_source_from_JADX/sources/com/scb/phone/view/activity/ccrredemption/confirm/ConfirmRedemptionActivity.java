package com.scb.phone.view.activity.ccrredemption.confirm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.cardmanagement.SaveSlipBaseActivity;
import com.scb.phone.view.activity.ccrredemption.product.OPRRegistrationLandingActivity;
import com.scb.phone.view.activity.ccrredemption.product.OPRStatusRewardsLandingActivity;
import com.scb.phone.view.fragment.ccrredemption.review.NormalRedemptionSlipFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.AnalyticsConnectorRegistrar;
import p040o.C4416factory;
import p040o.ComponentContainer;
import p040o.HmlPinActivity;
import p040o.Maps;
import p040o.MyECouponActivity_ViewBinding;
import p040o.chain;
import p040o.eagerInDefaultApp;
import p040o.getAnnotations;
import p040o.getDeclaredClass;
import p040o.getDeclaringClass;
import p040o.getDocumentVerificationConfidenceRating;
import p040o.getScbsOnboardingProductCatalog;
import p040o.setFieldNamingStrategy;
import p040o.setTapText;
import p040o.shouldSkipClass;
import p040o.verifyDateType;

public class ConfirmRedemptionActivity extends SaveSlipBaseActivity implements getDocumentVerificationConfidenceRating {
    private AnalyticsConnectorRegistrar MediaMetadataCompat;
    @HmlPinActivity
    public setFieldNamingStrategy baseOprPresenter;
    @HmlPinActivity
    public getDeclaredClass presenter;
    @BindView
    Button redeemButton;
    @BindView
    TextView txvCardBalance;
    @BindView
    TextView txvDescription1;
    @BindView
    TextView txvDescription2;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final int mo14047x50fd9e4a() {
        return R.layout.f92452131494473;
    }

    public final chain MediaDescriptionCompat() {
        return null;
    }

    public void onBackPressed() {
    }

    public static Intent write(Context context, AnalyticsConnectorRegistrar analyticsConnectorRegistrar) {
        Intent intent = new Intent(context, ConfirmRedemptionActivity.class);
        intent.putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.confirm.ConfirmRedemptionActivity.CONFIRM_REDEMPTION_DTO_EXTRA", analyticsConnectorRegistrar);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77162131492941);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        AnalyticsConnectorRegistrar analyticsConnectorRegistrar = (AnalyticsConnectorRegistrar) getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.confirm.ConfirmRedemptionActivity.CONFIRM_REDEMPTION_DTO_EXTRA");
        this.MediaMetadataCompat = analyticsConnectorRegistrar;
        analyticsConnectorRegistrar.setBackgroundResource = new Maps.MapDifferenceImpl(getResources());
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.baseOprPresenter.MediaBrowserCompat$ItemReceiver(this);
        getDeclaredClass getdeclaredclass = this.presenter;
        verifyDateType verifydatetype = new verifyDateType(this.MediaMetadataCompat.MediaDescriptionCompat);
        if (getdeclaredclass.RatingCompat != null) {
            verifydatetype.IconCompatParcelizer(getdeclaredclass.RatingCompat);
        }
        if (this.MediaMetadataCompat.MediaMetadataCompat) {
            mo13676d_("rewards_1point_successful");
        } else if (!this.MediaMetadataCompat.MediaDescriptionCompat) {
            mo13676d_("rewards_successful");
        } else if (this.MediaMetadataCompat.f2669x50fd9e4a) {
            mo13676d_("rewards_1point_renew_successful");
        } else {
            mo13676d_("rewards_1point_register_successful");
        }
        MediaSessionCompat$QueueItem();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.txvCardBalance.setText(this.MediaMetadataCompat.read());
    }

    public final void IconCompatParcelizer() {
        this.txvDescription1.setVisibility(8);
        this.txvDescription2.setText(getResources().getString(R.string.opr_registration_description));
        this.redeemButton.setText(getResources().getString(R.string.view_1_point_redemption));
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
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

    public final void RatingCompat() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
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

    /* access modifiers changed from: package-private */
    @OnClick
    public void onRedeemAnotherRewardClick() {
        getDeclaredClass getdeclaredclass = this.presenter;
        boolean z = true;
        if (this.MediaMetadataCompat.MediaDescriptionCompat) {
            getDeclaringClass getdeclaringclass = getDeclaringClass.MediaBrowserCompat$CustomActionResultReceiver;
            if (getdeclaredclass.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getdeclaringclass.IconCompatParcelizer(getdeclaredclass.RatingCompat);
                return;
            }
            return;
        }
        shouldSkipClass shouldskipclass = shouldSkipClass.MediaBrowserCompat$ItemReceiver;
        if (getdeclaredclass.RatingCompat == null) {
            z = false;
        }
        if (z) {
            shouldskipclass.IconCompatParcelizer(getdeclaredclass.RatingCompat);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onAccountSummaryClick() {
        getDeclaredClass getdeclaredclass = this.presenter;
        getAnnotations getannotations = new getAnnotations(this.MediaMetadataCompat.MediaDescriptionCompat, Boolean.valueOf(this.MediaMetadataCompat.MediaMetadataCompat));
        if (getdeclaredclass.RatingCompat != null) {
            getannotations.IconCompatParcelizer(getdeclaredclass.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent();
        intent.putExtra("com.scb.phone.presentation.view.activity.ccr_redemption.confirm.ConfirmRedemptionActivity.CARD_POINTS_BALANCE", this.MediaMetadataCompat.Keep);
        setResult(-1, intent);
        finish();
    }

    public final void read() {
        C4416factory factory = new C4416factory();
        factory.MediaMetadataCompat = this.MediaMetadataCompat.write;
        factory.MediaBrowserCompat$SearchResultReceiver = this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver;
        factory.write = this.MediaMetadataCompat.IconCompatParcelizer;
        factory.IconCompatParcelizer = this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver;
        factory.MediaBrowserCompat$CustomActionResultReceiver = this.MediaMetadataCompat.MediaSessionCompat$QueueItem;
        factory.MediaBrowserCompat$ItemReceiver = this.MediaMetadataCompat.read();
        factory.MediaBrowserCompat$MediaItem = false;
        factory.read = this.MediaMetadataCompat.read;
        this.baseOprPresenter.read(factory);
    }

    public final void read(ComponentContainer componentContainer) {
        if (HomeActivity.AppCompatDelegateImpl$ListMenuDecorView()) {
            setIcon();
        }
        componentContainer.Keep = "Rewards catalogue";
        Intent write = OPRRegistrationLandingActivity.write(this, componentContainer);
        write.addFlags(603979776);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, write).read();
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

    public final void MediaBrowserCompat$CustomActionResultReceiver(eagerInDefaultApp eagerindefaultapp) {
        if (HomeActivity.AppCompatDelegateImpl$ListMenuDecorView()) {
            setIcon();
        }
        eagerindefaultapp.Keep = 0;
        Intent write = OPRStatusRewardsLandingActivity.write(this, eagerindefaultapp);
        write.addFlags(603979776);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, write).read();
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

    private void setIcon() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
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

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final Object MediaSessionCompat$ResultReceiverWrapper() {
        return this.MediaMetadataCompat;
    }

    public final getScbsOnboardingProductCatalog MediaSessionCompat$Token() {
        return new NormalRedemptionSlipFragment();
    }

    public final void write() {
        this.txvDescription1.setVisibility(0);
        this.txvDescription2.setVisibility(0);
        if (this.MediaMetadataCompat.MediaMetadataCompat) {
            this.txvDescription1.setText(getResources().getString(R.string.voucher_delivery_eta));
            this.txvDescription2.setText(getResources().getString(R.string.cash_rewards_eta_opr));
            this.redeemButton.setVisibility(8);
            return;
        }
        this.txvDescription1.setText(getResources().getString(R.string.item_delivery_eta));
        this.txvDescription2.setText(getResources().getString(R.string.cash_rewards_eta));
        this.redeemButton.setText(getResources().getString(R.string.redeem_another_reward));
    }
}
