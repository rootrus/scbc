package com.scb.phone.view.fragment.easycash.loaninformation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.easycash.CustomDeltaSlider;
import com.scb.phone.view.custom.easycash.CustomDeltaSlider$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.easycash.CustomDeltaSliderPressed;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import java.util.List;
import java.util.Locale;
import p040o.AnalyticsConnectorReceiver;
import p040o.C10155t;
import p040o.C2985A;
import p040o.C3308D;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CustomConcurrentHashMap;
import p040o.DeepLinkModule_AddAccountConsentDeepLinkActivity;
import p040o.ForgotPinRepository;
import p040o.HmlPinActivity;
import p040o.LinkedHashMultimap;
import p040o.RestrictedComponentContainer;
import p040o.ZSYR2K;
import p040o.access$1400;
import p040o.endAdUnitExposure;
import p040o.forEachClear;
import p040o.getTimeOutParameters;
import p040o.onGetStartedClick;
import p040o.onUpdate;
import p040o.publish;
import p040o.setImageBitmapInternal;
import p040o.setImageMetaData;
import p040o.setProcessor$MediaBrowserCompat$CustomActionResultReceiver;

public class EasycashFeaturesMHMCInformationFragment extends BaseFeaturesLoanInformationFragment<CustomDeltaSliderPressed> implements CheckExtractActivity_MembersInjector.setItemInvoker {
    @BindView
    protected CustomSeparatedViews costOverview;
    @BindView
    protected CustomEasyCashSectionLabel headerCostOverview;
    @BindView
    protected CustomEasyCashSectionLabel headerLoanInformation;
    @BindView
    protected CustomSeparatedViews loanInformation;
    @HmlPinActivity
    public setImageBitmapInternal presenter;
    @BindView
    protected Button recalculateButton;

    public static EasycashFeaturesMHMCInformationFragment MediaBrowserCompat$MediaItem() {
        return new EasycashFeaturesMHMCInformationFragment();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        setImageBitmapInternal setimagebitmapinternal = this.presenter;
        if (setimagebitmapinternal.RatingCompat != null) {
            setimagebitmapinternal.RatingCompat.AlertController$RecycleListView();
        }
        LinkedHashMultimap.SetDecorator setDecorator = setimagebitmapinternal.MediaBrowserCompat$ItemReceiver;
        C3308D d = new C3308D(setimagebitmapinternal);
        C2985A a = new C2985A(setimagebitmapinternal);
        onGetStartedClick.write((Object) d, "onSuccess");
        onGetStartedClick.write((Object) a, "onError");
        onGetStartedClick.write((Object) "MHMC", "request");
        setDecorator.IconCompatParcelizer(setDecorator.write, d, a, new setProcessor$MediaBrowserCompat$CustomActionResultReceiver("MHMC"));
        this.recalculateButton.setVisibility(0);
        this.durationSection.setText(getString(R.string.easycash_mhmc_feature_information_duration_header));
    }

    public final void read(AnalyticsConnectorReceiver analyticsConnectorReceiver) {
        ((CustomDeltaSliderPressed) this.IconCompatParcelizer).read(new publish(analyticsConnectorReceiver), (CustomDeltaSlider$MediaBrowserCompat$ItemReceiver) new CustomDeltaSlider$MediaBrowserCompat$ItemReceiver() {
            public final void IconCompatParcelizer(double d) {
            }

            public final void MediaBrowserCompat$ItemReceiver(double d) {
                EasycashFeaturesMHMCInformationFragment.this.write(d);
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                EasycashFeaturesMHMCInformationFragment.this.MediaDescriptionCompat.IconCompatParcelizer(Double.valueOf(d));
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void write(double d) {
        setImageBitmapInternal setimagebitmapinternal = this.presenter;
        String MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver();
        setimagebitmapinternal.MediaBrowserCompat$SearchResultReceiver = String.format(Locale.getDefault(), "%.2f", new Object[]{Double.valueOf(d)});
        setimagebitmapinternal.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$SearchResultReceiver);
    }

    /* access modifiers changed from: protected */
    public final void write(int i) {
        setImageBitmapInternal setimagebitmapinternal = this.presenter;
        String MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver();
        setimagebitmapinternal.write = String.valueOf(i);
        setimagebitmapinternal.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$SearchResultReceiver);
    }

    public final void IconCompatParcelizer(String str) {
        this.MediaDescriptionCompat.write(str);
        this.durationRecyclerView.MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat.write());
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void recalculateButtonClick() {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.easycash_mhmc_feature_information_recalculate_title)).MediaBrowserCompat$ItemReceiver(getString(R.string.easycash_mhmc_feature_information_recalculate_content));
        CustomDialog IconCompatParcelizer = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ncb_conset_confirmation_popup_accept_confirm), new DeepLinkModule_AddAccountConsentDeepLinkActivity(this));
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.ncb_conset_confirmation_popup_cancel), ForgotPinRepository.MediaBrowserCompat$CustomActionResultReceiver).show();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void nextButtonClick() {
        String str;
        setImageBitmapInternal setimagebitmapinternal = this.presenter;
        String MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver();
        endAdUnitExposure endadunitexposure = setimagebitmapinternal.IconCompatParcelizer;
        if (!(endadunitexposure == null || endadunitexposure.MediaBrowserCompat$CustomActionResultReceiver == null || setimagebitmapinternal.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.isEmpty())) {
            if (setimagebitmapinternal.RatingCompat != null) {
                setimagebitmapinternal.RatingCompat.AlertController$RecycleListView();
            }
            LinkedHashMultimap.SetDecorator setDecorator = setimagebitmapinternal.MediaBrowserCompat$ItemReceiver;
            setImageMetaData setimagemetadata = new setImageMetaData(setimagebitmapinternal);
            C10155t tVar = new C10155t(setimagebitmapinternal);
            CustomConcurrentHashMap.EntrySet entrySet = new CustomConcurrentHashMap.EntrySet(setimagebitmapinternal.f2943x50fd9e4a, MediaBrowserCompat$SearchResultReceiver, setimagebitmapinternal.IconCompatParcelizer.IconCompatParcelizer, setimagebitmapinternal.write, setimagebitmapinternal.MediaBrowserCompat$SearchResultReceiver);
            onGetStartedClick.write((Object) setimagemetadata, "onSuccess");
            onGetStartedClick.write((Object) tVar, "onError");
            onGetStartedClick.write((Object) entrySet, "request");
            setDecorator.IconCompatParcelizer(setDecorator.IconCompatParcelizer, setimagemetadata, tVar, new onUpdate.IconCompatParcelizer(entrySet));
        }
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", this.MediaBrowserCompat$CustomActionResultReceiver.write()));
        forEachClear foreachclear = this.tracker;
        setImageBitmapInternal setimagebitmapinternal2 = this.presenter;
        endAdUnitExposure endadunitexposure2 = setimagebitmapinternal2.IconCompatParcelizer;
        if (endadunitexposure2 == null || endadunitexposure2.MediaBrowserCompat$CustomActionResultReceiver == null || setimagebitmapinternal2.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            str = null;
        } else {
            str = setimagebitmapinternal2.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.get(0).MediaBrowserCompat$ItemReceiver;
        }
        foreachclear.MediaBrowserCompat$ItemReceiver(new ZSYR2K("product_program", str));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("tenor", this.presenter.write));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("amount", this.presenter.MediaBrowserCompat$SearchResultReceiver));
        forEachClear foreachclear2 = this.tracker;
        if (getActivity() != null) {
            foreachclear2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_information");
        }
    }

    public final void IconCompatParcelizer(access$1400 access_1400) {
        this.detailSection.setVisibility(0);
        this.headerDetail.setText(getString(R.string.easycash_mhmc_feature_information_collateral_header));
        this.detail.IconCompatParcelizer(access_1400.read, R.layout.f84732131493700);
        this.headerLoanInformation.setVisibility(0);
        this.headerLoanInformation.setText(getString(R.string.easycash_mhmc_feature_information_loan_information));
        this.loanInformation.IconCompatParcelizer(access_1400.MediaBrowserCompat$ItemReceiver, R.layout.f84732131493700);
        this.headerCostOverview.setVisibility(0);
        this.headerCostOverview.setText(getString(R.string.easycash_mhmc_feature_information_loan_request));
        this.costOverview.IconCompatParcelizer(access_1400.IconCompatParcelizer, R.layout.f84732131493700);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<RestrictedComponentContainer> list) {
        this.loanInformation.IconCompatParcelizer(list, R.layout.f84732131493700);
    }

    public final void write() {
        getTimeOutParameters gettimeoutparameters = this.MediaMetadataCompat;
        C5940xfc71f797 easycashFeaturesLoanAccountFragment$MediaBrowserCompat$ItemReceiver = EasycashFeaturesLoanAccountFragment.IconCompatParcelizer;
        EasycashFeaturesLoanAccountFragment easycashFeaturesLoanAccountFragment = new EasycashFeaturesLoanAccountFragment();
        Bundle bundle = new Bundle();
        bundle.putString("com.scb.phone.view.activity.easycash.PRODUCT_PROGRAM", (String) null);
        easycashFeaturesLoanAccountFragment.setArguments(bundle);
        gettimeoutparameters.IconCompatParcelizer(this, easycashFeaturesLoanAccountFragment);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        ((CustomDeltaSliderPressed) this.IconCompatParcelizer).setNewActualValue(i);
    }

    public void onDestroyView() {
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.presenter.onDestroy();
        super.onDestroyView();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ CustomDeltaSlider MediaBrowserCompat$ItemReceiver() {
        return new CustomDeltaSliderPressed(getContext());
    }
}
