package com.scb.phone.view.activity.prepaid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prepaid.PrepaidTravelForeignCurrencyWalletDetailActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;
import p040o.C4743hb;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.GoogleSigninService;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.LocalProjectProvider;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getCustomAttributes;
import p040o.getKernelIDDstAtop;
import p040o.getTopbarVisible;
import p040o.getTopbarVisible$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.hb$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class AddNewCurrencyActivity extends BaseActivity implements LocalProjectProvider.C69353.IconCompatParcelizer, getTopbarVisible$MediaBrowserCompat$CustomActionResultReceiver {
    public static final write MediaDescriptionCompat = new write((byte) 0);
    private getTopbarVisible MediaBrowserCompat$MediaItem;
    private final HmlVerifyEmailActivity MediaBrowserCompat$SearchResultReceiver;
    private getCustomAttributes MediaMetadataCompat;
    @HmlPinActivity
    public C4743hb mPresenter;
    @BindView
    public RecyclerView mRecyclerView;

    public AddNewCurrencyActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = read.read;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$SearchResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79332131493158);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        C4743hb hbVar = this.mPresenter;
        if (hbVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        hbVar.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.prepaid_add_currency_title);
        setTabContainer();
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mRecyclerView");
        }
        boolean z = false;
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new GoogleSigninService(), -1);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_PREPAID_TRAVEL_WALLET_SUMMARY");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtr…ID_TRAVEL_WALLET_SUMMARY)");
        this.MediaMetadataCompat = (getCustomAttributes) parcelableExtra;
        C4743hb hbVar2 = this.mPresenter;
        if (hbVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        getCustomAttributes getcustomattributes = this.MediaMetadataCompat;
        if (getcustomattributes == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPrepaidTravelSummaryDisplay");
        }
        onGetStartedClick.write((Object) getcustomattributes, "mPrepaidTravelSummaryDisplay");
        hbVar2.IconCompatParcelizer = getcustomattributes.read;
        writeUInt64NoTag.IconCompatParcelizer hb_mediabrowsercompat_customactionresultreceiver = new hb$MediaBrowserCompat$CustomActionResultReceiver(hbVar2);
        if (hbVar2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            hb_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(hbVar2.RatingCompat);
        }
        ((getKernelIDDstAtop) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_conversion_new_currency_screen");
    }

    public final void MediaBrowserCompat$ItemReceiver(ArrayList<AutoValue_CrashlyticsReport_Session_Event_Application> arrayList) {
        onGetStartedClick.write((Object) arrayList, "currencies");
        this.MediaBrowserCompat$MediaItem = new getTopbarVisible(arrayList, this);
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mRecyclerView");
        }
        getTopbarVisible gettopbarvisible = this.MediaBrowserCompat$MediaItem;
        if (gettopbarvisible == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAdapter");
        }
        recyclerView.setAdapter(gettopbarvisible);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application) {
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application, "prepaidTravelWalletDisplay");
        C4743hb hbVar = this.mPresenter;
        if (hbVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application, "prepaidTravelWalletDisplay");
        writeUInt64NoTag.IconCompatParcelizer write2 = new C4743hb.write(hbVar, autoValue_CrashlyticsReport_Session_Event_Application);
        if (hbVar.RatingCompat != null) {
            write2.IconCompatParcelizer(hbVar.RatingCompat);
        }
    }

    public final void write(AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application, ArrayList<String> arrayList) {
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application, "currency");
        onGetStartedClick.write((Object) arrayList, "thbWalletAllowTag");
        PrepaidTravelForeignCurrencyWalletDetailActivity.IconCompatParcelizer iconCompatParcelizer = PrepaidTravelForeignCurrencyWalletDetailActivity.MediaMetadataCompat;
        Context context = this;
        getCustomAttributes getcustomattributes = this.MediaMetadataCompat;
        if (getcustomattributes == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPrepaidTravelSummaryDisplay");
        }
        Intent read2 = PrepaidTravelForeignCurrencyWalletDetailActivity.IconCompatParcelizer.read(context, autoValue_CrashlyticsReport_Session_Event_Application, getcustomattributes, arrayList);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read3 = setTapText.write(this, read2).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read3.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onDestroy() {
        C4743hb hbVar = this.mPresenter;
        if (hbVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        hbVar.onDestroy();
        super.onDestroy();
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<getKernelIDDstAtop> {
        public static final read read = new read();

        read() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new getKernelIDDstAtop();
        }
    }
}
