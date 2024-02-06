package com.scb.phone.view.fragment.hml;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlSelectedOfferReviewActivity;
import com.scb.phone.view.adapter.hml.HmlOutcomeCounterAdapter;
import com.scb.phone.view.custom.common.CustomDialog;
import com.squareup.picasso.Picasso;
import p040o.ActivityBuilder_BindCreditCardDetailActivity;
import p040o.ActivityBuilder_BindCustomizeYourPageActivity;
import p040o.ActivityBuilder_BindDeejungAboutActivity;
import p040o.ActivityBuilder_BindDeejungInstallmentsConfirmationActivity;
import p040o.ActivityBuilder_BindDeejungInstallmentsReviewActivity;
import p040o.CrashlyticsController;
import p040o.FragmentBuilder_BindCardlessWithdrawAmountFragment;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.HmlPinActivity;
import p040o.ImageService;
import p040o.PassportCaptureModule;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.access$2300;
import p040o.createPropertyInfo;
import p040o.getRegion;
import p040o.handleUncaughtException;
import p040o.setDataType;
import p040o.setDocumentLevelError;
import p040o.verifyRestrictions;

public class HmlOutcomeCounterOfferFragment extends HmlBaseOutcomeFragment implements PassportCaptureModule.C6976c {
    private C6009x7f2cab88 IconCompatParcelizer = new ActivityBuilder_BindCreditCardDetailActivity(this);
    private FragmentBuilder_BindCardlessWithdrawAmountFragment MediaBrowserCompat$CustomActionResultReceiver = new ActivityBuilder_BindDeejungAboutActivity(this);
    @BindView
    public TextView dateText;
    @BindView
    public ImageView headerBackground;
    @BindView
    public TextView hourRemarkText;
    @HmlPinActivity
    public createPropertyInfo presenter;
    @BindView
    public RecyclerView recyclerView;

    @OnClick
    public void onButtonReturnHomeClicked(View view) {
        createPropertyInfo createpropertyinfo = this.presenter;
        getRegion getregion = getRegion.read;
        if (createpropertyinfo.RatingCompat != null) {
            getregion.IconCompatParcelizer(createpropertyinfo.RatingCompat);
        }
    }

    @OnClick
    public void onButtonDeclineAllClicked(View view) {
        createPropertyInfo createpropertyinfo = this.presenter;
        setDataType setdatatype = setDataType.MediaBrowserCompat$ItemReceiver;
        if (createpropertyinfo.RatingCompat != null) {
            setdatatype.IconCompatParcelizer(createpropertyinfo.RatingCompat);
        }
    }

    @OnClick
    public void onContactCallCenter(View view) {
        createPropertyInfo createpropertyinfo = this.presenter;
        setDocumentLevelError setdocumentlevelerror = setDocumentLevelError.read;
        if (createpropertyinfo.RatingCompat != null) {
            setdocumentlevelerror.IconCompatParcelizer(createpropertyinfo.RatingCompat);
        }
    }

    public static HmlOutcomeCounterOfferFragment IconCompatParcelizer(handleUncaughtException handleuncaughtexception) {
        return write(handleuncaughtexception, false);
    }

    public static HmlOutcomeCounterOfferFragment write(handleUncaughtException handleuncaughtexception, boolean z) {
        HmlOutcomeCounterOfferFragment hmlOutcomeCounterOfferFragment = new HmlOutcomeCounterOfferFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("HML_OUTCOME_COUNTER_EXTRA", handleuncaughtexception);
        bundle.putBoolean("HML_OUTCOME_IS_UPSELL_EXTRA", z);
        hmlOutcomeCounterOfferFragment.setArguments(bundle);
        return hmlOutcomeCounterOfferFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        handleUncaughtException handleuncaughtexception = null;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88012131494028, (ViewGroup) null, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        RecyclerView recyclerView2 = this.recyclerView;
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        this.recyclerView.setNestedScrollingEnabled(false);
        if (getArguments() != null) {
            handleuncaughtexception = (handleUncaughtException) getArguments().getParcelable("HML_OUTCOME_COUNTER_EXTRA");
        }
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        createPropertyInfo createpropertyinfo = this.presenter;
        createpropertyinfo.IconCompatParcelizer = handleuncaughtexception;
        verifyRestrictions verifyrestrictions = new verifyRestrictions(handleuncaughtexception);
        if (createpropertyinfo.RatingCompat != null) {
            verifyrestrictions.IconCompatParcelizer(createpropertyinfo.RatingCompat);
        }
        createPropertyInfo createpropertyinfo2 = this.presenter;
        ImageService.ImageDimension imageDimension = new ImageService.ImageDimension(createpropertyinfo2);
        if (createpropertyinfo2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            imageDimension.IconCompatParcelizer(createpropertyinfo2.RatingCompat);
        }
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(handleUncaughtException handleuncaughtexception) {
        this.recyclerView.setAdapter(new HmlOutcomeCounterAdapter(handleuncaughtexception.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer));
        this.dateText.setText(handleuncaughtexception.read);
        this.dateText.setVisibility(handleuncaughtexception.read == null ? 8 : 0);
        this.hourRemarkText.setText(handleuncaughtexception.IconCompatParcelizer);
        if (!TextUtils.isEmpty(handleuncaughtexception.MediaBrowserCompat$CustomActionResultReceiver) && getContext() != null) {
            Picasso.read().write(handleuncaughtexception.MediaBrowserCompat$CustomActionResultReceiver).IconCompatParcelizer((int) R.drawable.outcome_placeholder).read(this.headerBackground, (FragmentBuilder_BindEkycFragment) null);
        }
    }

    public final void write() {
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.hml_outcome_decline_dialog_title);
        access_2200.IconCompatParcelizer = getString(R.string.hml_outcome_decline_dialog_message);
        access$2300 access_2300 = new access$2300();
        ActivityBuilder_BindCustomizeYourPageActivity activityBuilder_BindCustomizeYourPageActivity = new ActivityBuilder_BindCustomizeYourPageActivity(this);
        access_2300.read = access$2300.write.CUSTOM;
        access_2300.MediaBrowserCompat$CustomActionResultReceiver = activityBuilder_BindCustomizeYourPageActivity;
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.hml_outcome_decline_dialog_confirm);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        access$2300 access_23002 = new access$2300();
        access_23002.read = access$2300.write.JUST_DISMISS;
        access_23002.MediaBrowserCompat$ItemReceiver = getString(R.string.hml_outcome_decline_dialog_cancel);
        access_2200.write = access_23002;
        write(access_2200);
    }

    public final /* synthetic */ void MediaBrowserCompat$SearchResultReceiver() {
        boolean z = true;
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", MediaBrowserCompat$CustomActionResultReceiver()), new ZSYR2K("button", "deny")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_selected_offer_review", zsyr2kArr);
        }
        createPropertyInfo createpropertyinfo = this.presenter;
        if (createpropertyinfo.RatingCompat == null) {
            z = false;
        }
        if (z) {
            createpropertyinfo.RatingCompat.AlertController$RecycleListView();
        }
        createpropertyinfo.MediaMetadataCompat.write(createpropertyinfo.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver("0", (String) null), new createPropertyInfo.read(createpropertyinfo, (byte) 0));
    }

    public final void read() {
        if (getActivity() != null) {
            getActivity().recreate();
        }
    }

    public final void write(String str) {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.auto_app_outcome_upselling_pop_up_warning_header)).MediaBrowserCompat$ItemReceiver(getString(R.string.auto_app_outcome_upselling_pop_up_warning_desc, str)).IconCompatParcelizer(getString(R.string.auto_app_outcome_upselling_pop_up_warning_confirm), new ActivityBuilder_BindDeejungInstallmentsReviewActivity(this, str)).MediaBrowserCompat$ItemReceiver(getString(R.string.auto_app_outcome_upselling_pop_up_warning_cancel), ActivityBuilder_BindDeejungInstallmentsConfirmationActivity.read).show();
    }

    public final void IconCompatParcelizer(String str) {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", MediaBrowserCompat$CustomActionResultReceiver()), new ZSYR2K("loan_type", str), new ZSYR2K("request_action", "adjusted_amount")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_application_outcome", zsyr2kArr);
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsController.C322720 r2) {
        HmlSelectedOfferReviewActivity.write(getContext(), r2);
    }

    public final void MediaBrowserCompat$ItemReceiver(Boolean bool) {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[2];
        zsyr2kArr[0] = new ZSYR2K("user_type", MediaBrowserCompat$CustomActionResultReceiver());
        zsyr2kArr[1] = new ZSYR2K("loan_type", bool.booleanValue() ? "business_owner" : "consumer");
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_selected_offer_review", zsyr2kArr);
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
