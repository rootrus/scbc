package com.scb.phone.view.activity.insurance;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.p032rd.PageIndicatorView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ccsof.CcSofCreditCardOnlyActivity;
import com.scb.phone.view.activity.ccsof.CcSofCreditCardOnlyActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.ccsof.CcSofHybridActivity;
import com.scb.phone.view.activity.partner.PartnerBillPaymentInputActivity;
import com.scb.phone.view.adapter.insurance.InsurersAdapter;
import com.scb.phone.view.adapter.insurance.PolicyCardAdapter;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.C3585x9589b984;
import p040o.C4593x5d42664;
import p040o.C6489x271d6c26;
import p040o.C9975x7cd9f783;
import p040o.CheckEligibilityActivity;
import p040o.CrashlyticsController;
import p040o.CrashlyticsCore;
import p040o.CrashlyticsReport;
import p040o.CustomConcurrentHashMap;
import p040o.FragmentBuilder_BindCreditCardFragment;
import p040o.FragmentBuilder_BindOccupationInfoFragment;
import p040o.FragmentBuilder_BindOthersTabFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.LinkedListMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PassportCaptureModule_GetUriRttiFactory;
import p040o.access$2300;
import p040o.getIsDocumentClassIndexFieldString;
import p040o.getIsDocumentClassIndexFieldString$MediaBrowserCompat$MediaItem;
import p040o.getLastInNonemptyList$MediaBrowserCompat$ItemReceiver;
import p040o.getLogFileDir;
import p040o.jsonFromMapEntryString;
import p040o.lambda$processSetComponents$1;
import p040o.onGetStartedClick;
import p040o.setGuidelineEnd;
import p040o.setTabTextColors;
import p040o.setTapText;

public final class InsurancePortfolioActivity extends BaseActivity implements PassportCaptureModule_GetUriRttiFactory.read, FragmentBuilder_BindCreditCardFragment.IconCompatParcelizer, InsurersAdapter.write {
    public static final IconCompatParcelizer MediaMetadataCompat = new IconCompatParcelizer((byte) 0);
    private final HmlVerifyEmailActivity MediaBrowserCompat$MediaItem;
    private final HmlVerifyEmailActivity MediaBrowserCompat$SearchResultReceiver;
    private final HmlVerifyEmailActivity MediaDescriptionCompat;
    @BindView
    public ConstraintLayout caLayoutPaymentCarSection;
    @BindView
    public ConstraintLayout csLayoutEmptyPolicy;
    @BindView
    public ConstraintLayout csLayoutPolicyHeaderSection;
    @BindView
    public LinearLayout llLayoutPaymentSection;
    @BindView
    public NestedScrollView nsvInsurancePortfolio;
    @BindView
    public PageIndicatorView pivPolicyCardIndicator;
    @HmlPinActivity
    public getIsDocumentClassIndexFieldString presenter;
    @BindView
    public RecyclerView rvInsurers;
    @BindView
    public RecyclerView rvPolicyCard;
    @BindView
    public TextView tvCarRepairType;
    @BindView
    public TextView tvDueAmount;
    @BindView
    public TextView tvDueDate;
    @BindView
    public TextView tvEffectiveDate;
    @BindView
    public TextView tvEndDate;
    @BindView
    public TextView tvInsuranceType;
    @BindView
    public TextView tvNewSumAssured;
    @BindView
    public TextView tvPaymentDisclaimer;
    @BindView
    public TextView tvPaymentPlan;
    @BindView
    public TextView tvPolicyHeader;
    @BindView
    public TextView tvPolicyHeaderLabel;
    @BindView
    public TextView tvPolicyRenewal;
    @BindView
    public TextView tvPremium;
    @BindView
    public TextView tvPremiumAmount;
    @BindView
    public TextView tvSumAssured;

    public InsurancePortfolioActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = C5638xf6b4ceaa.write;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$SearchResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
        FundActionsSuccessActivity fundActionsSuccessActivity2 = read.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundActionsSuccessActivity2, "initializer");
        this.MediaBrowserCompat$MediaItem = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity2);
        FundActionsSuccessActivity insurancePortfolioActivity$MediaBrowserCompat$ItemReceiver = new InsurancePortfolioActivity$MediaBrowserCompat$ItemReceiver(this);
        onGetStartedClick.write((Object) insurancePortfolioActivity$MediaBrowserCompat$ItemReceiver, "initializer");
        this.MediaDescriptionCompat = new HmlVerifyPhoneTermsConditionsActivity(insurancePortfolioActivity$MediaBrowserCompat$ItemReceiver);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78422131493067);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.auto_my_insurance_navigation_title));
        RecyclerView recyclerView = this.rvInsurers;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvInsurers");
        }
        recyclerView.getContext();
        boolean z = false;
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter((InsurersAdapter) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver());
        RecyclerView recyclerView2 = this.rvPolicyCard;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvPolicyCard");
        }
        recyclerView2.setAdapter((PolicyCardAdapter) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver());
        recyclerView2.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        ((setGuidelineEnd) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$CustomActionResultReceiver(recyclerView2);
        RecyclerView.ParcelableVolumeInfo fragmentBuilder_BindCreditCardFragment = new FragmentBuilder_BindCreditCardFragment((setGuidelineEnd) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(), C6489x271d6c26.NOTIFY_ON_SCROLL, this);
        if (recyclerView2.setGroupDividerEnabled == null) {
            recyclerView2.setGroupDividerEnabled = new ArrayList();
        }
        recyclerView2.setGroupDividerEnabled.add(fragmentBuilder_BindCreditCardFragment);
        getIsDocumentClassIndexFieldString getisdocumentclassindexfieldstring = this.presenter;
        if (getisdocumentclassindexfieldstring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getisdocumentclassindexfieldstring.MediaBrowserCompat$ItemReceiver(this);
        getIsDocumentClassIndexFieldString getisdocumentclassindexfieldstring2 = this.presenter;
        if (getisdocumentclassindexfieldstring2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (getisdocumentclassindexfieldstring2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getisdocumentclassindexfieldstring2.RatingCompat.AlertController$RecycleListView();
        }
        LinkedListMultimap.C35754.C35761 r1 = getisdocumentclassindexfieldstring2.read;
        getIsDocumentClassIndexFieldString getisdocumentclassindexfieldstring3 = getisdocumentclassindexfieldstring2;
        FundFactSheetActivity getisdocumentclassindexfieldstring_mediabrowsercompat_searchresultreceiver = new C4593x5d42664(getisdocumentclassindexfieldstring3);
        FundFactSheetActivity getisdocumentclassindexfieldstring_mediabrowsercompat_mediaitem = new getIsDocumentClassIndexFieldString$MediaBrowserCompat$MediaItem(getisdocumentclassindexfieldstring3);
        onGetStartedClick.write((Object) getisdocumentclassindexfieldstring_mediabrowsercompat_searchresultreceiver, "onSuccess");
        onGetStartedClick.write((Object) getisdocumentclassindexfieldstring_mediabrowsercompat_mediaitem, "onError");
        r1.MediaBrowserCompat$ItemReceiver(r1.read, getisdocumentclassindexfieldstring_mediabrowsercompat_searchresultreceiver, getisdocumentclassindexfieldstring_mediabrowsercompat_mediaitem, new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver(), new C3585x9589b984(r1));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.auto_my_insurance_navigation_title));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        NestedScrollView nestedScrollView = this.nsvInsurancePortfolio;
        if (nestedScrollView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nsvInsurancePortfolio");
        }
        nestedScrollView.setVisibility(0);
        ConstraintLayout constraintLayout = this.csLayoutEmptyPolicy;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("csLayoutEmptyPolicy");
        }
        constraintLayout.setVisibility(8);
    }

    public final void IconCompatParcelizer() {
        NestedScrollView nestedScrollView = this.nsvInsurancePortfolio;
        if (nestedScrollView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nsvInsurancePortfolio");
        }
        nestedScrollView.setVisibility(8);
        ConstraintLayout constraintLayout = this.csLayoutEmptyPolicy;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("csLayoutEmptyPolicy");
        }
        constraintLayout.setVisibility(0);
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsController.ReportUploaderHandlingExceptionCheck reportUploaderHandlingExceptionCheck) {
        onGetStartedClick.write((Object) reportUploaderHandlingExceptionCheck, "display");
        ConstraintLayout constraintLayout = this.csLayoutPolicyHeaderSection;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("csLayoutPolicyHeaderSection");
        }
        constraintLayout.setVisibility(0);
        TextView textView = this.tvPolicyHeaderLabel;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPolicyHeaderLabel");
        }
        textView.setText(reportUploaderHandlingExceptionCheck.read);
        TextView textView2 = this.tvPolicyHeader;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPolicyHeader");
        }
        textView2.setText(reportUploaderHandlingExceptionCheck.MediaDescriptionCompat);
        TextView textView3 = this.tvSumAssured;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSumAssured");
        }
        textView3.setText(reportUploaderHandlingExceptionCheck.MediaBrowserCompat$MediaItem);
        TextView textView4 = this.tvPaymentPlan;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPaymentPlan");
        }
        textView4.setText(reportUploaderHandlingExceptionCheck.MediaBrowserCompat$ItemReceiver);
        TextView textView5 = this.tvPremiumAmount;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPremiumAmount");
        }
        textView5.setText(reportUploaderHandlingExceptionCheck.IconCompatParcelizer);
        TextView textView6 = this.tvEffectiveDate;
        if (textView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvEffectiveDate");
        }
        textView6.setText(reportUploaderHandlingExceptionCheck.write);
        TextView textView7 = this.tvEndDate;
        if (textView7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvEndDate");
        }
        textView7.setText(reportUploaderHandlingExceptionCheck.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void read(CrashlyticsController.InvalidPartFileFilter invalidPartFileFilter) {
        onGetStartedClick.write((Object) invalidPartFileFilter, "display");
        ConstraintLayout constraintLayout = this.csLayoutPolicyHeaderSection;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("csLayoutPolicyHeaderSection");
        }
        constraintLayout.setVisibility(8);
        TextView textView = this.tvSumAssured;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSumAssured");
        }
        textView.setText(invalidPartFileFilter.read);
        TextView textView2 = this.tvPaymentPlan;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPaymentPlan");
        }
        textView2.setText(invalidPartFileFilter.IconCompatParcelizer);
        TextView textView3 = this.tvPremiumAmount;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPremiumAmount");
        }
        textView3.setText(invalidPartFileFilter.MediaBrowserCompat$ItemReceiver);
        TextView textView4 = this.tvEffectiveDate;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvEffectiveDate");
        }
        textView4.setText(invalidPartFileFilter.write);
        TextView textView5 = this.tvEndDate;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvEndDate");
        }
        textView5.setText(invalidPartFileFilter.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsController.LogFileDirectoryProvider logFileDirectoryProvider) {
        onGetStartedClick.write((Object) logFileDirectoryProvider, "display");
        LinearLayout linearLayout = this.llLayoutPaymentSection;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llLayoutPaymentSection");
        }
        linearLayout.setVisibility(0);
        ConstraintLayout constraintLayout = this.caLayoutPaymentCarSection;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("caLayoutPaymentCarSection");
        }
        constraintLayout.setVisibility(0);
        TextView textView = this.tvPolicyRenewal;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPolicyRenewal");
        }
        textView.setText(logFileDirectoryProvider.MediaBrowserCompat$SearchResultReceiver);
        TextView textView2 = this.tvInsuranceType;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvInsuranceType");
        }
        textView2.setText(logFileDirectoryProvider.IconCompatParcelizer);
        TextView textView3 = this.tvCarRepairType;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCarRepairType");
        }
        textView3.setText(logFileDirectoryProvider.MediaBrowserCompat$ItemReceiver);
        TextView textView4 = this.tvNewSumAssured;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvNewSumAssured");
        }
        textView4.setText(logFileDirectoryProvider.MediaMetadataCompat);
        TextView textView5 = this.tvPremium;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPremium");
        }
        textView5.setText(logFileDirectoryProvider.RatingCompat);
        TextView textView6 = this.tvDueDate;
        if (textView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDueDate");
        }
        textView6.setText(logFileDirectoryProvider.write);
        TextView textView7 = this.tvDueAmount;
        if (textView7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDueAmount");
        }
        textView7.setText(logFileDirectoryProvider.read);
        TextView textView8 = this.tvPaymentDisclaimer;
        if (textView8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPaymentDisclaimer");
        }
        textView8.setText(logFileDirectoryProvider.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void IconCompatParcelizer(getLogFileDir getlogfiledir) {
        onGetStartedClick.write((Object) getlogfiledir, "display");
        LinearLayout linearLayout = this.llLayoutPaymentSection;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llLayoutPaymentSection");
        }
        linearLayout.setVisibility(0);
        ConstraintLayout constraintLayout = this.caLayoutPaymentCarSection;
        if (constraintLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("caLayoutPaymentCarSection");
        }
        constraintLayout.setVisibility(8);
        TextView textView = this.tvDueDate;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDueDate");
        }
        textView.setText(getlogfiledir.write);
        TextView textView2 = this.tvDueAmount;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDueAmount");
        }
        textView2.setText(getlogfiledir.MediaBrowserCompat$ItemReceiver);
        TextView textView3 = this.tvPaymentDisclaimer;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPaymentDisclaimer");
        }
        textView3.setText(getlogfiledir.read);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        LinearLayout linearLayout = this.llLayoutPaymentSection;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llLayoutPaymentSection");
        }
        linearLayout.setVisibility(8);
    }

    public final void IconCompatParcelizer(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, String str, jsonFromMapEntryString jsonfrommapentrystring) {
        onGetStartedClick.write((Object) exception, "display");
        onGetStartedClick.write((Object) jsonfrommapentrystring, "paymentFlowType");
        Intent write = PartnerBillPaymentInputActivity.write(this, exception, str, jsonfrommapentrystring);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, write).read();
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

    public final void read(lambda$processSetComponents$1 lambda_processsetcomponents_1, jsonFromMapEntryString jsonfrommapentrystring) {
        onGetStartedClick.write((Object) lambda_processsetcomponents_1, "display");
        onGetStartedClick.write((Object) jsonfrommapentrystring, "paymentFlowType");
        CcSofCreditCardOnlyActivity$MediaBrowserCompat$ItemReceiver ccSofCreditCardOnlyActivity$MediaBrowserCompat$ItemReceiver = CcSofCreditCardOnlyActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) lambda_processsetcomponents_1, "purchaseSourceOfFundDisplay");
        onGetStartedClick.write((Object) jsonfrommapentrystring, "paymentFlowType");
        Intent putExtra = new Intent(context, CcSofCreditCardOnlyActivity.class).putExtra("EXTRA_PURCHASE_SOURCE_FUND_DISPLAY", lambda_processsetcomponents_1);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, CcSofCre…chaseSourceOfFundDisplay)");
        Intent putExtra2 = putExtra.putExtra("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE", jsonfrommapentrystring.ordinal());
        onGetStartedClick.IconCompatParcelizer((Object) putExtra2, "putExtra(key, value?.ordinal ?: -1)");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, putExtra2).read();
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

    public final void IconCompatParcelizer(lambda$processSetComponents$1 lambda_processsetcomponents_1, String str, jsonFromMapEntryString jsonfrommapentrystring) {
        onGetStartedClick.write((Object) lambda_processsetcomponents_1, "display");
        onGetStartedClick.write((Object) jsonfrommapentrystring, "paymentFlowType");
        CcSofHybridActivity.read read2 = CcSofHybridActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) lambda_processsetcomponents_1, "purchaseSourceOfFundDisplay");
        onGetStartedClick.write((Object) jsonfrommapentrystring, "paymentFlowType");
        Intent putExtra = new Intent(context, CcSofHybridActivity.class).putExtra("EXTRA_PURCHASE_SOURCE_FUND_DISPLAY", lambda_processsetcomponents_1).putExtra("EXTRA_BILL_PAYMENT_SUBTYPE", str);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, CcSofHyb…SUBTYPE, firebaseSubType)");
        Intent putExtra2 = putExtra.putExtra("com.scb.phone.EXTRA_PAYMENT_FLOW_TYPE", jsonfrommapentrystring.ordinal());
        onGetStartedClick.IconCompatParcelizer((Object) putExtra2, "putExtra(key, value?.ordinal ?: -1)");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read3 = setTapText.write(this, putExtra2).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read3.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write() {
        getIsDocumentClassIndexFieldString getisdocumentclassindexfieldstring = this.presenter;
        if (getisdocumentclassindexfieldstring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getisdocumentclassindexfieldstring.MediaBrowserCompat$ItemReceiver(R.string.error_generic_resource, access$2300.write.JUST_DISMISS);
    }

    public final void read() {
        PageIndicatorView pageIndicatorView = this.pivPolicyCardIndicator;
        if (pageIndicatorView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("pivPolicyCardIndicator");
        }
        pageIndicatorView.setVisibility(8);
    }

    public final void IconCompatParcelizer(int i) {
        PageIndicatorView pageIndicatorView = this.pivPolicyCardIndicator;
        if (pageIndicatorView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("pivPolicyCardIndicator");
        }
        pageIndicatorView.setCount(i);
        PageIndicatorView pageIndicatorView2 = this.pivPolicyCardIndicator;
        if (pageIndicatorView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("pivPolicyCardIndicator");
        }
        pageIndicatorView2.setVisibility(0);
    }

    public final void read(CrashlyticsCore crashlyticsCore) {
        onGetStartedClick.write((Object) crashlyticsCore, "insuranceInfoDisplay");
        getIsDocumentClassIndexFieldString getisdocumentclassindexfieldstring = this.presenter;
        if (getisdocumentclassindexfieldstring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getisdocumentclassindexfieldstring.read(crashlyticsCore);
    }

    public final void read(int i) {
        PageIndicatorView pageIndicatorView = this.pivPolicyCardIndicator;
        if (pageIndicatorView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("pivPolicyCardIndicator");
        }
        if (pageIndicatorView.getVisibility() == 0) {
            PageIndicatorView pageIndicatorView2 = this.pivPolicyCardIndicator;
            if (pageIndicatorView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("pivPolicyCardIndicator");
            }
            pageIndicatorView2.setSelection(i);
        }
        getIsDocumentClassIndexFieldString getisdocumentclassindexfieldstring = this.presenter;
        if (getisdocumentclassindexfieldstring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CrashlyticsController.SessionPartFileFilter sessionPartFileFilter = ((PolicyCardAdapter) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver()).read.get(i);
        onGetStartedClick.IconCompatParcelizer((Object) sessionPartFileFilter, "policyInfoList[position]");
        getisdocumentclassindexfieldstring.MediaBrowserCompat$ItemReceiver(sessionPartFileFilter);
    }

    public final void onDestroy() {
        super.onDestroy();
        getIsDocumentClassIndexFieldString getisdocumentclassindexfieldstring = this.presenter;
        if (getisdocumentclassindexfieldstring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getisdocumentclassindexfieldstring.onDestroy();
    }

    @OnClick
    public final void onClickPay() {
        String str;
        getIsDocumentClassIndexFieldString getisdocumentclassindexfieldstring = this.presenter;
        if (getisdocumentclassindexfieldstring == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CrashlyticsController.SessionPartFileFilter sessionPartFileFilter = getisdocumentclassindexfieldstring.IconCompatParcelizer;
        String str2 = null;
        if (sessionPartFileFilter != null) {
            str = sessionPartFileFilter.read;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        CrashlyticsController.SessionPartFileFilter sessionPartFileFilter2 = getisdocumentclassindexfieldstring.IconCompatParcelizer;
        if (sessionPartFileFilter2 != null) {
            str2 = sessionPartFileFilter2.MediaBrowserCompat$ItemReceiver;
        }
        if (str2 != null) {
            str3 = str2;
        }
        CustomConcurrentHashMap.WeakEntry weakEntry = new CustomConcurrentHashMap.WeakEntry(str, str3);
        LinkedListMultimap.C35754.C35761 r4 = getisdocumentclassindexfieldstring.read;
        getIsDocumentClassIndexFieldString getisdocumentclassindexfieldstring2 = getisdocumentclassindexfieldstring;
        FundFactSheetActivity getisdocumentclassindexfieldstring_mediabrowsercompat_customactionresultreceiver = new C9975x7cd9f783(getisdocumentclassindexfieldstring2);
        FundFactSheetActivity write = new getIsDocumentClassIndexFieldString.write(getisdocumentclassindexfieldstring2);
        onGetStartedClick.write((Object) weakEntry, "request");
        onGetStartedClick.write((Object) getisdocumentclassindexfieldstring_mediabrowsercompat_customactionresultreceiver, "onSuccess");
        onGetStartedClick.write((Object) write, "onError");
        r4.MediaBrowserCompat$ItemReceiver(r4.MediaBrowserCompat$CustomActionResultReceiver, getisdocumentclassindexfieldstring_mediabrowsercompat_customactionresultreceiver, write, new setTabTextColors.read(weakEntry), new LinkedListMultimap.C35754.C35761.IconCompatParcelizer(r4));
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<PolicyCardAdapter> {
        public static final read IconCompatParcelizer = new read();

        read() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new PolicyCardAdapter(new ArrayList());
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<CrashlyticsCore> list) {
        onGetStartedClick.write((Object) list, "display");
        InsurersAdapter insurersAdapter = (InsurersAdapter) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        onGetStartedClick.write((Object) list, "list");
        insurersAdapter.MediaBrowserCompat$ItemReceiver.clear();
        insurersAdapter.MediaBrowserCompat$ItemReceiver.addAll(list);
        insurersAdapter.IconCompatParcelizer.write();
    }

    public final void write(List<CrashlyticsController.SessionPartFileFilter> list) {
        onGetStartedClick.write((Object) list, "policySelect");
        PolicyCardAdapter policyCardAdapter = (PolicyCardAdapter) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
        onGetStartedClick.write((Object) list, "list");
        policyCardAdapter.read.clear();
        policyCardAdapter.read.addAll(list);
        policyCardAdapter.IconCompatParcelizer.write();
        RecyclerView recyclerView = this.rvPolicyCard;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvPolicyCard");
        }
        RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = recyclerView.AppCompatActivity;
        if (recyclerView$MediaBrowserCompat$SearchResultReceiver != null) {
            recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(0);
        }
        PageIndicatorView pageIndicatorView = this.pivPolicyCardIndicator;
        if (pageIndicatorView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("pivPolicyCardIndicator");
        }
        if (pageIndicatorView.getVisibility() == 0) {
            PageIndicatorView pageIndicatorView2 = this.pivPolicyCardIndicator;
            if (pageIndicatorView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("pivPolicyCardIndicator");
            }
            FragmentBuilder_BindOccupationInfoFragment fragmentBuilder_BindOccupationInfoFragment = pageIndicatorView2.write.read;
            if (fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver == null) {
                fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindOthersTabFragment();
            }
            FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment = fragmentBuilder_BindOccupationInfoFragment.MediaBrowserCompat$ItemReceiver;
            fragmentBuilder_BindOthersTabFragment.MediaMetadataCompat = false;
            fragmentBuilder_BindOthersTabFragment.MediaBrowserCompat$MediaItem = -1;
            fragmentBuilder_BindOthersTabFragment.AppCompatActivity = -1;
            fragmentBuilder_BindOthersTabFragment.AppCompatDialogFragment = -1;
            pageIndicatorView2.write.IconCompatParcelizer.write();
            PageIndicatorView pageIndicatorView3 = this.pivPolicyCardIndicator;
            if (pageIndicatorView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("pivPolicyCardIndicator");
            }
            pageIndicatorView3.setSelected(0);
        }
    }
}
