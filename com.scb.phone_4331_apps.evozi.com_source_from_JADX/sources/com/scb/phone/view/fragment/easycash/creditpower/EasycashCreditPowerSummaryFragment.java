package com.scb.phone.view.fragment.easycash.creditpower;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.EasycashLandingActivity;
import com.scb.phone.view.activity.easycash.EasycashReferralSendProductActivity;
import com.scb.phone.view.activity.easycash.introduction.C5599x710e2b77;
import com.scb.phone.view.activity.easycash.introduction.EasycashCommercialLoanIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashCreditCardIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashMCMCIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashMortgageIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashPurposefulLoanIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashSpeedyCashIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashSpeedyLoanIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashSpeedyLoanTopupIntroductionActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsBackgroundWorker;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MultiDetector;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Onboarding;
import p040o.ZTBSV;
import p040o.access$1200;
import p040o.doQuickAnalysis;
import p040o.doQuickAnalysis$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.forEachClear;
import p040o.getCpuArchitectureInt;
import p040o.getInvestmentSummary;
import p040o.getLegacySharedPrefs;
import p040o.getRepeat;
import p040o.onGetStartedClick;
import p040o.performUpdateApp;
import p040o.setPreviousExpirable;
import p040o.setPreviousExpirable$MediaBrowserCompat$ItemReceiver;
import p040o.setTapText;
import p040o.submitTask;
import p040o.writeUInt64NoTag;

public final class EasycashCreditPowerSummaryFragment extends BaseFragment implements CheckExtractActivity_MembersInjector.setHasDecor, getRepeat.write {
    public static final read MediaBrowserCompat$CustomActionResultReceiver = new read((byte) 0);
    public final HmlVerifyEmailActivity IconCompatParcelizer;
    @BindView
    public Button btExit;
    @HmlPinActivity
    public doQuickAnalysis presenter;
    @BindView
    public RecyclerView rvLoans;
    @HmlPinActivity
    public forEachClear tracker;

    public final /* synthetic */ void IconCompatParcelizer(CrashlyticsBackgroundWorker.C32131 r1) {
    }

    public final /* synthetic */ void IconCompatParcelizer(submitTask submittask) {
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsBackgroundWorker.C32131 r1) {
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getCpuArchitectureInt getcpuarchitectureint) {
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(access$1200 access_1200) {
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(getCpuArchitectureInt getcpuarchitectureint) {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final /* synthetic */ void write() {
    }

    public final /* synthetic */ void write(getCpuArchitectureInt getcpuarchitectureint) {
    }

    public EasycashCreditPowerSummaryFragment() {
        FundActionsSuccessActivity easycashCreditPowerSummaryFragment$MediaBrowserCompat$CustomActionResultReceiver = new C5922x874d256c(this);
        onGetStartedClick.write((Object) easycashCreditPowerSummaryFragment$MediaBrowserCompat$CustomActionResultReceiver, "initializer");
        this.IconCompatParcelizer = new HmlVerifyPhoneTermsConditionsActivity(easycashCreditPowerSummaryFragment$MediaBrowserCompat$CustomActionResultReceiver);
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f86952131493922, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        doQuickAnalysis doquickanalysis = this.presenter;
        if (doquickanalysis == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        doquickanalysis.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ EasycashCreditPowerSummaryFragment MediaBrowserCompat$CustomActionResultReceiver;

        IconCompatParcelizer(EasycashCreditPowerSummaryFragment easycashCreditPowerSummaryFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = easycashCreditPowerSummaryFragment;
        }

        public final void onClick(View view) {
            EasycashCreditPowerSummaryFragment easycashCreditPowerSummaryFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (!((CustomDialog) easycashCreditPowerSummaryFragment.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).isShowing()) {
                ((CustomDialog) easycashCreditPowerSummaryFragment.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).show();
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList parcelableArrayList;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Button button = this.btExit;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btExit");
        }
        button.setOnClickListener(new IconCompatParcelizer(this));
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("tile_displays") && arguments.containsKey("ncb_accepted_flag") && (parcelableArrayList = arguments.getParcelableArrayList("tile_displays")) != null) {
            doQuickAnalysis doquickanalysis = this.presenter;
            if (doquickanalysis == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.IconCompatParcelizer((Object) parcelableArrayList, "arrayCreditCard");
            List<performUpdateApp> list = parcelableArrayList;
            String write = AlertController$RecycleListView.write(arguments, "ncb_accepted_flag");
            onGetStartedClick.write((Object) list, "productDisplays");
            onGetStartedClick.write((Object) write, "ncbAcceptedFlag");
            doquickanalysis.MediaBrowserCompat$SearchResultReceiver = list;
            doquickanalysis.read = write;
            writeUInt64NoTag.IconCompatParcelizer doquickanalysis_mediabrowsercompat_customactionresultreceiver = new doQuickAnalysis$MediaBrowserCompat$CustomActionResultReceiver(list);
            if (doquickanalysis.RatingCompat != null) {
                doquickanalysis_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(doquickanalysis.RatingCompat);
            }
        }
    }

    public final void read(int i) {
        int hashCode;
        doQuickAnalysis doquickanalysis = this.presenter;
        if (doquickanalysis == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        List<performUpdateApp> list = doquickanalysis.MediaBrowserCompat$SearchResultReceiver;
        if (list == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productDisplays");
        }
        performUpdateApp performupdateapp = list.get(i);
        String str = performupdateapp.MediaSessionCompat$ResultReceiverWrapper;
        boolean z = true;
        if (str == null || ((hashCode = str.hashCode()) == 2020783 ? !str.equals("AUTO") : hashCode != 2223327 || !str.equals("HOME"))) {
            if (doquickanalysis.RatingCompat == null) {
                z = false;
            }
            if (z) {
                doquickanalysis.RatingCompat.AlertController$RecycleListView();
            }
            doquickanalysis.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(performupdateapp.MediaSessionCompat$ResultReceiverWrapper);
            doquickanalysis.IconCompatParcelizer.IconCompatParcelizer(new doQuickAnalysis.write(doquickanalysis, performupdateapp));
            return;
        }
        if (doquickanalysis.RatingCompat == null) {
            z = false;
        }
        if (z) {
            doquickanalysis.RatingCompat.AlertController$RecycleListView();
        }
        MultiDetector multiDetector = doquickanalysis.write;
        setPreviousExpirable$MediaBrowserCompat$ItemReceiver setpreviousexpirable_mediabrowsercompat_itemreceiver = new setPreviousExpirable$MediaBrowserCompat$ItemReceiver();
        setpreviousexpirable_mediabrowsercompat_itemreceiver.IconCompatParcelizer = performupdateapp.MediaSessionCompat$ResultReceiverWrapper;
        multiDetector.IconCompatParcelizer(new setPreviousExpirable(setpreviousexpirable_mediabrowsercompat_itemreceiver, (byte) 0));
        doquickanalysis.write.IconCompatParcelizer(new doQuickAnalysis.IconCompatParcelizer(doquickanalysis, performupdateapp));
    }

    public final void write(List<performUpdateApp> list) {
        onGetStartedClick.write((Object) list, "displays");
        Context context = getContext();
        if (context != null) {
            RecyclerView recyclerView = this.rvLoans;
            if (recyclerView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvLoans");
            }
            recyclerView.setLayoutManager(new LinearLayoutManager());
            RecyclerView recyclerView2 = this.rvLoans;
            if (recyclerView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvLoans");
            }
            recyclerView2.IconCompatParcelizer((RecyclerView.RatingCompat) new getInvestmentSummary(context, 16), -1);
        }
        getRepeat getrepeat = new getRepeat(list, this);
        RecyclerView recyclerView3 = this.rvLoans;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvLoans");
        }
        recyclerView3.setAdapter(getrepeat);
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsBackgroundWorker.C32131 r2) {
        onGetStartedClick.write((Object) r2, "display");
        Intent write = EasycashReferralSendProductActivity.write(getContext(), r2);
        onGetStartedClick.IconCompatParcelizer((Object) write, "EasycashReferralSendProd…yIntent(context, display)");
        write(write);
    }

    public final void IconCompatParcelizer() {
        EasycashLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
    }

    public final void read(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r3) {
        onGetStartedClick.write((Object) getlegacysharedprefs, "display");
        onGetStartedClick.write((Object) r3, "introductionDisplay");
        Intent read2 = EasycashCreditCardIntroductionActivity.read(getContext(), getlegacysharedprefs, r3);
        onGetStartedClick.IconCompatParcelizer((Object) read2, "EasycashCreditCardIntrod…lay, introductionDisplay)");
        write(read2);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r3) {
        onGetStartedClick.write((Object) getlegacysharedprefs, "display");
        onGetStartedClick.write((Object) r3, "introductionDisplay");
        Intent write = EasycashSpeedyCashIntroductionActivity.write(getContext(), getlegacysharedprefs, r3);
        onGetStartedClick.IconCompatParcelizer((Object) write, "EasycashSpeedyCashIntrod…lay, introductionDisplay)");
        write(write);
    }

    public final void MediaMetadataCompat(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r3) {
        onGetStartedClick.write((Object) getlegacysharedprefs, "display");
        onGetStartedClick.write((Object) r3, "introductionDisplay");
        Intent write = EasycashSpeedyLoanIntroductionActivity.write(getContext(), getlegacysharedprefs, r3);
        onGetStartedClick.IconCompatParcelizer((Object) write, "EasycashSpeedyLoanIntrod…lay, introductionDisplay)");
        write(write);
    }

    public final void RatingCompat(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r3) {
        onGetStartedClick.write((Object) getlegacysharedprefs, "display");
        onGetStartedClick.write((Object) r3, "introductionDisplay");
        Intent MediaBrowserCompat$ItemReceiver = EasycashSpeedyLoanTopupIntroductionActivity.MediaBrowserCompat$ItemReceiver(getContext(), getlegacysharedprefs, r3);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "EasycashSpeedyLoanTopupI…lay, introductionDisplay)");
        write(MediaBrowserCompat$ItemReceiver);
    }

    public final void MediaBrowserCompat$SearchResultReceiver(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r3) {
        onGetStartedClick.write((Object) getlegacysharedprefs, "display");
        onGetStartedClick.write((Object) r3, "introductionDisplay");
        Intent MediaBrowserCompat$ItemReceiver = EasycashPurposefulLoanIntroductionActivity.MediaBrowserCompat$ItemReceiver(getContext(), getlegacysharedprefs, r3);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "EasycashPurposefulLoanIn…lay, introductionDisplay)");
        write(MediaBrowserCompat$ItemReceiver);
    }

    public final void IconCompatParcelizer(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r3) {
        onGetStartedClick.write((Object) getlegacysharedprefs, "display");
        onGetStartedClick.write((Object) r3, "introductionDisplay");
        Intent IconCompatParcelizer2 = EasycashCommercialLoanIntroductionActivity.IconCompatParcelizer(getContext(), getlegacysharedprefs, r3);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "EasycashCommercialLoanIn…lay, introductionDisplay)");
        write(IconCompatParcelizer2);
    }

    public final void MediaBrowserCompat$ItemReceiver(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r3) {
        C5599x710e2b77 easycashMCMCIntroductionActivity$MediaBrowserCompat$CustomActionResultReceiver = EasycashMCMCIntroductionActivity.MediaDescriptionCompat;
        write(C5599x710e2b77.read(getContext(), getlegacysharedprefs, r3));
    }

    public final void write(getLegacySharedPrefs getlegacysharedprefs, Onboarding.C37171 r3) {
        onGetStartedClick.write((Object) getlegacysharedprefs, "display");
        onGetStartedClick.write((Object) r3, "introductionDisplay");
        Intent read2 = EasycashMortgageIntroductionActivity.read(getContext(), getlegacysharedprefs, r3);
        onGetStartedClick.IconCompatParcelizer((Object) read2, "EasycashMortgageIntroduc…lay, introductionDisplay)");
        write(read2);
    }

    private final void write(Intent intent) {
        intent.putExtra("com.scb.phone.view.activity.easycash.PRODUCT_TYPE", "CREDIT_POWER");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "productType");
        forEachClear foreachclear = this.tracker;
        if (foreachclear == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        foreachclear.IconCompatParcelizer.edit().putString("entry_point", "REGULAR").apply();
        foreachclear.write();
        forEachClear foreachclear2 = this.tracker;
        if (foreachclear2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "COMMERCIAL_LOAN")) {
            str = "BUSINESS_LOAN";
        }
        foreachclear2.IconCompatParcelizer.edit().putString("product_type", str).apply();
        foreachclear2.write();
        forEachClear foreachclear3 = this.tracker;
        if (foreachclear3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        ZTBSV ztbsv = foreachclear3;
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_credit_power_launcher");
        }
    }

    public final void onDestroy() {
        forEachClear foreachclear = this.tracker;
        if (foreachclear == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        foreachclear.IconCompatParcelizer();
        super.onDestroy();
    }
}
