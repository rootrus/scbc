package com.scb.phone.view.activity.bond;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.TermsConditionsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C10019it;
import p040o.C10020iv;
import p040o.C10021ix;
import p040o.C7039x355e6121;
import p040o.DefaultHeartBeatInfo$$Lambda$1;
import p040o.FragmentBuilder_BindCreditLimitFragment;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.JsonValueObjectEncoderContext;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Service;
import p040o.access$2300;
import p040o.getIdManager;
import p040o.immediateFailedCheckedFuture;
import p040o.internalAddIgnoreNullValues;
import p040o.proxyGetICheckDetector;
import p040o.setTapText;
import p040o.zzvk;

public class BondTermsAndConditionsActivity extends BaseActivity implements proxyGetICheckDetector.IconCompatParcelizer, FragmentBuilder_BindCreditLimitFragment {
    @HmlPinActivity
    public DefaultHeartBeatInfo$$Lambda$1 bondTermsAndConditionsPresenter;

    public static Intent IconCompatParcelizer(Context context, Service service, C7039x355e6121.read read) {
        Intent intent = new Intent(context, BondTermsAndConditionsActivity.class);
        intent.putExtra("BOND_PURCHASE_VERIFICATION_DISPLAY", service);
        intent.putExtra("PURCHASE_BOND_FLOW", read);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77942131493019);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.bond_terms_and_conditions_header);
        setTabContainer();
        mo13676d_("bond_purchase_tc");
        this.bondTermsAndConditionsPresenter.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("BOND_PURCHASE_VERIFICATION_DISPLAY") && intent.hasExtra("PURCHASE_BOND_FLOW")) {
            DefaultHeartBeatInfo$$Lambda$1 defaultHeartBeatInfo$$Lambda$1 = this.bondTermsAndConditionsPresenter;
            Service service = (Service) intent.getParcelableExtra("BOND_PURCHASE_VERIFICATION_DISPLAY");
            C7039x355e6121.read read = (C7039x355e6121.read) intent.getSerializableExtra("PURCHASE_BOND_FLOW");
            if (service != null) {
                defaultHeartBeatInfo$$Lambda$1.write = service;
                defaultHeartBeatInfo$$Lambda$1.read = read;
                if (defaultHeartBeatInfo$$Lambda$1.RatingCompat != null) {
                    defaultHeartBeatInfo$$Lambda$1.RatingCompat.AlertController$RecycleListView();
                }
                if (defaultHeartBeatInfo$$Lambda$1.read == C7039x355e6121.read.DLT) {
                    defaultHeartBeatInfo$$Lambda$1.IconCompatParcelizer.IconCompatParcelizer("2.0");
                } else {
                    defaultHeartBeatInfo$$Lambda$1.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
                }
                defaultHeartBeatInfo$$Lambda$1.IconCompatParcelizer.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzvk>() {
                    public final /* synthetic */ void onNext(Object obj) {
                        DefaultHeartBeatInfo$$Lambda$1.MediaBrowserCompat$ItemReceiver(DefaultHeartBeatInfo$$Lambda$1.this);
                        DefaultHeartBeatInfo$$Lambda$1 defaultHeartBeatInfo$$Lambda$1 = DefaultHeartBeatInfo$$Lambda$1.this;
                        JsonDataEncoderBuilder$$Lambda$5 jsonDataEncoderBuilder$$Lambda$5 = new JsonDataEncoderBuilder$$Lambda$5(this, (zzvk) obj);
                        if (defaultHeartBeatInfo$$Lambda$1.RatingCompat != null) {
                            jsonDataEncoderBuilder$$Lambda$5.IconCompatParcelizer(defaultHeartBeatInfo$$Lambda$1.RatingCompat);
                        }
                    }

                    public final void onError(Throwable th) {
                        DefaultHeartBeatInfo$$Lambda$1.this.MediaBrowserCompat$ItemReceiver(DefaultHeartBeatInfo$$Lambda$1.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                    }
                });
            }
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        DefaultHeartBeatInfo$$Lambda$1 defaultHeartBeatInfo$$Lambda$1 = this.bondTermsAndConditionsPresenter;
        JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(defaultHeartBeatInfo$$Lambda$1);
        if (defaultHeartBeatInfo$$Lambda$1.RatingCompat != null) {
            jsonValueObjectEncoderContext.IconCompatParcelizer(defaultHeartBeatInfo$$Lambda$1.RatingCompat);
        }
    }

    public final void MediaSessionCompat$QueueItem() {
        DefaultHeartBeatInfo$$Lambda$1 defaultHeartBeatInfo$$Lambda$1 = this.bondTermsAndConditionsPresenter;
        internalAddIgnoreNullValues internaladdignorenullvalues = new internalAddIgnoreNullValues(defaultHeartBeatInfo$$Lambda$1);
        if (defaultHeartBeatInfo$$Lambda$1.RatingCompat != null) {
            internaladdignorenullvalues.IconCompatParcelizer(defaultHeartBeatInfo$$Lambda$1.RatingCompat);
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.bond_terms_and_conditions_header);
        setTabContainer();
    }

    public final void read(getIdManager getidmanager) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsConditionsFragment.IconCompatParcelizer(getidmanager)).write();
    }

    public final void MediaBrowserCompat$ItemReceiver(immediateFailedCheckedFuture immediatefailedcheckedfuture) {
        MediaBrowserCompat$ItemReceiver(immediatefailedcheckedfuture, new C10019it(this));
    }

    public final void IconCompatParcelizer(immediateFailedCheckedFuture immediatefailedcheckedfuture) {
        MediaBrowserCompat$ItemReceiver(immediatefailedcheckedfuture, new C10020iv(this));
    }

    public final void read(Service service, C7039x355e6121.read read) {
        Intent MediaBrowserCompat$CustomActionResultReceiver = BondPurchaseReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(this, service, read);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        RatingCompat(false);
    }

    private void MediaBrowserCompat$ItemReceiver(immediateFailedCheckedFuture immediatefailedcheckedfuture, DialogInterface.OnClickListener onClickListener) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String str = immediatefailedcheckedfuture.IconCompatParcelizer;
        if (!(str == null || str.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(str);
        }
        String str2 = immediatefailedcheckedfuture.MediaBrowserCompat$CustomActionResultReceiver;
        if (true ^ (str2 == null || str2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(str2);
        }
        IconCompatParcelizer.IconCompatParcelizer(immediatefailedcheckedfuture.read, onClickListener).MediaBrowserCompat$ItemReceiver(immediatefailedcheckedfuture.MediaBrowserCompat$ItemReceiver, C10021ix.MediaBrowserCompat$CustomActionResultReceiver).show();
    }
}
