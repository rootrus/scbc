package com.scb.phone.view.activity.cardmanagement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.fragment.cardmanagement.deejungtransfer.DeejungTransferSlipFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getScbsOnboardingProductCatalog;
import p040o.initializeAllApis;
import p040o.setTapText;

public class DeejungInstallmentsConfirmationActivity extends SaveSlipBaseActivity {
    private initializeAllApis MediaBrowserCompat$SearchResultReceiver;
    @BindView
    ConstraintLayout updationTextLayout;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final int mo14047x50fd9e4a() {
        return R.layout.f86632131493890;
    }

    public void onBackPressed() {
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, initializeAllApis initializeallapis) {
        Intent intent = new Intent(context, DeejungInstallmentsConfirmationActivity.class);
        intent.putExtra("com.scb.phone.view.activity.card_management.DeejungInstallmentsConfirmationActivity.KEY_DEEJUNG_INSTALLMENTS_CONFIRMATION_DISPLAY_MODEL", initializeallapis);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77282131492953);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        initializeAllApis initializeallapis = (initializeAllApis) getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungInstallmentsConfirmationActivity.KEY_DEEJUNG_INSTALLMENTS_CONFIRMATION_DISPLAY_MODEL");
        this.MediaBrowserCompat$SearchResultReceiver = initializeallapis;
        if (initializeallapis.read) {
            this.updationTextLayout.setVisibility(8);
        }
        MediaSessionCompat$QueueItem();
        mo13676d_("deejung_installment_successful");
    }

    public final Object MediaSessionCompat$ResultReceiverWrapper() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final getScbsOnboardingProductCatalog MediaSessionCompat$Token() {
        return new DeejungTransferSlipFragment();
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
    }
}
