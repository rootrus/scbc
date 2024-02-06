package com.scb.phone.view.fragment.easycash.loaninformation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.RestrictedComponentContainer;
import p040o.ZSYR2K;
import p040o.forEachClear;

public class EasycashHomeTopUpInfoCalculationFragment extends BreadcrumbFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    private IOrientationGuidanceCalculator MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected CustomSeparatedViews detail;
    @BindView
    protected CustomEasyCashSectionLabel headerDetail;
    @HmlPinActivity
    public forEachClear tracker;

    public final int ParcelableVolumeInfo() {
        return 0;
    }

    public final boolean setHasDecor() {
        return true;
    }

    public static EasycashHomeTopUpInfoCalculationFragment read(List<RestrictedComponentContainer> list) {
        EasycashHomeTopUpInfoCalculationFragment easycashHomeTopUpInfoCalculationFragment = new EasycashHomeTopUpInfoCalculationFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("com.scb.phone.view.activity.easycash.HOME_TOPUP_CALCULATION", new ArrayList(list));
        easycashHomeTopUpInfoCalculationFragment.setArguments(bundle);
        return easycashHomeTopUpInfoCalculationFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88132131494040, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("com.scb.phone.view.activity.easycash.HOME_TOPUP_CALCULATION");
            this.headerDetail.setText(getString(R.string.easycash_mhmc_feature_information_loan_request));
            this.detail.IconCompatParcelizer(parcelableArrayList, R.layout.f84732131493700);
        }
        return inflate;
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.loan_info_title);
    }

    @OnClick
    public void onNextButtonClick() {
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", this.MediaBrowserCompat$CustomActionResultReceiver.write()));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("product_program", this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver().AlertController$RecycleListView));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("tenor", String.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver)));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("amount", String.format(Locale.getDefault(), "%.2f", new Object[]{Double.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver().read)})));
        forEachClear foreachclear = this.tracker;
        if (getActivity() != null) {
            foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_information");
        }
        this.MediaMetadataCompat.IconCompatParcelizer(this, new EasycashLoanFeaturesAccountFragment());
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOrientationGuidanceCalculator) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (IOrientationGuidanceCalculator) context;
        }
    }
}
