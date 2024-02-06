package com.scb.phone.view.activity.cardmanagement.deejungtransfer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.cardmanagement.SaveSlipBaseActivity;
import com.scb.phone.view.fragment.cardmanagement.deejungtransfer.DeejungTransferMinFullSlipFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.AnalyticsConnector;
import p040o.AnalyticsConnectorImpl;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.UserAgentPublisher;
import p040o.ZSYR2K;
import p040o.getProjectId;
import p040o.getScbsOnboardingProductCatalog;
import p040o.setTapText;

public class DeejungTransferMinFullConfirmationActivity extends SaveSlipBaseActivity implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    private getProjectId MediaBrowserCompat$MediaItem;
    @HmlPinActivity
    public UserAgentPublisher presenter;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final int mo14047x50fd9e4a() {
        return R.layout.f86612131493888;
    }

    public void onBackPressed() {
    }

    public static Intent read(Context context, getProjectId getprojectid, AnalyticsConnectorImpl analyticsConnectorImpl) {
        Intent intent = new Intent(context, DeejungTransferMinFullConfirmationActivity.class);
        intent.putExtra("com.scb.phone.view.activity.card_management.DeejungTransferConfirmationHeaderFragment.KEY_TRANSFER_CONFIRMATION_HEADER_DISPLAY_MODEL", getprojectid);
        intent.putExtra("com.scb.phone.view.activity.card_management.DeejungTransferMinFullSummaryFragment.KEY_TRANSFER_INSTALLMENT_SUMMARY_DISPLAY_MODEL", analyticsConnectorImpl);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        setContentView(R.layout.f80212131493246);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$MediaItem = (getProjectId) getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungTransferConfirmationHeaderFragment.KEY_TRANSFER_CONFIRMATION_HEADER_DISPLAY_MODEL");
        MediaSessionCompat$QueueItem();
        this.scbAnalytics.write("deejung_transfer_successful", new ZSYR2K("option", "minorfull"));
    }

    @OnClick
    public void onAccountsClick() {
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

    public final Object MediaSessionCompat$ResultReceiverWrapper() {
        return new AnalyticsConnector(this.MediaBrowserCompat$MediaItem, (AnalyticsConnectorImpl) getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungTransferMinFullSummaryFragment.KEY_TRANSFER_INSTALLMENT_SUMMARY_DISPLAY_MODEL"));
    }

    public final getScbsOnboardingProductCatalog MediaSessionCompat$Token() {
        return new DeejungTransferMinFullSlipFragment();
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
