package com.scb.phone.view.fragment.easycash.loaninformation;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.easycash.CustomDeltaSlider;
import com.scb.phone.view.custom.easycash.CustomDeltaSlider$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import com.scb.phone.view.fragment.easycash.loaninformation.EasycashFeaturesAccountDynamicFragment;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p040o.AnalyticsConnectorReceiver;
import p040o.Barcode;
import p040o.Barcode$CalendarEvent$MediaBrowserCompat$ItemReceiver;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingSuccessActivity;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.LinkedHashMultimap;
import p040o.RestrictedComponentContainer;
import p040o.ZSYR2K;
import p040o.ZTBSV;
import p040o.access$1000;
import p040o.advance;
import p040o.advanceTo;
import p040o.forEachClear;
import p040o.getDeviceState;
import p040o.getRtpSubscriptionRecommandedBiller;
import p040o.onGetStartedClick;
import p040o.publish;
import p040o.setImageFileHeight;
import p040o.setImageFileHeight$MediaBrowserCompat$ItemReceiver;
import p040o.setImageFileHeight$MediaBrowserCompat$MediaItem;
import p040o.setImageFileHeight$MediaBrowserCompat$SearchResultReceiver;
import p040o.writeUInt64NoTag;
import p040o.zzfo;

public final class EasycashFeaturesMCMCInformationFragment extends BaseFeaturesLoanInformationFragment<CustomDeltaSlider> implements CheckExtractActivity_MembersInjector.setIcon {
    @BindView
    public CustomSeparatedViews costOverview;
    @BindView
    public CustomEasyCashSectionLabel headerCostOverview;
    @BindView
    public CustomEasyCashSectionLabel headerLoanInformation;
    @BindView
    public CustomSeparatedViews loanInformation;
    @HmlPinActivity
    public setImageFileHeight presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class write {
        public boolean MediaBrowserCompat$ItemReceiver;
        public boolean read;

        private write() {
        }

        public write(boolean z, boolean z2) {
            this.MediaBrowserCompat$ItemReceiver = z;
            this.read = z2;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        setImageFileHeight setimagefileheight = this.presenter;
        if (setimagefileheight == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setimagefileheight.MediaBrowserCompat$ItemReceiver(this);
        setImageFileHeight setimagefileheight2 = this.presenter;
        if (setimagefileheight2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (setimagefileheight2.RatingCompat != null) {
            setimagefileheight2.RatingCompat.AlertController$RecycleListView();
        }
        LinkedHashMultimap.C35651 r6 = setimagefileheight2.MediaBrowserCompat$SearchResultReceiver;
        FundFactSheetActivity ratingCompat = new setImageFileHeight.RatingCompat(setimagefileheight2);
        FundFactSheetActivity mediaDescriptionCompat = new setImageFileHeight.MediaDescriptionCompat(setimagefileheight2);
        onGetStartedClick.write((Object) ratingCompat, "onSuccess");
        onGetStartedClick.write((Object) mediaDescriptionCompat, "onError");
        onGetStartedClick.write((Object) "MCMC", "request");
        r6.IconCompatParcelizer(r6.MediaBrowserCompat$MediaItem, ratingCompat, mediaDescriptionCompat, new Barcode.Phone.write("MCMC"));
        CustomEasyCashSectionLabel customEasyCashSectionLabel = this.durationSection;
        if (customEasyCashSectionLabel != null) {
            customEasyCashSectionLabel.setText(getString(R.string.easycash_mhmc_feature_information_duration_header));
        }
        MediaBrowserCompat$CustomActionResultReceiver(false);
        read();
    }

    public static final class read implements CustomDeltaSlider$MediaBrowserCompat$ItemReceiver {
        private /* synthetic */ EasycashFeaturesMCMCInformationFragment MediaBrowserCompat$ItemReceiver;

        public final void IconCompatParcelizer(double d) {
        }

        read(EasycashFeaturesMCMCInformationFragment easycashFeaturesMCMCInformationFragment) {
            this.MediaBrowserCompat$ItemReceiver = easycashFeaturesMCMCInformationFragment;
        }

        public final void MediaBrowserCompat$ItemReceiver(double d) {
            this.MediaBrowserCompat$ItemReceiver.write(d);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
            this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat.IconCompatParcelizer(Double.valueOf(d));
        }
    }

    public final void read(AnalyticsConnectorReceiver analyticsConnectorReceiver) {
        onGetStartedClick.write((Object) analyticsConnectorReceiver, "viewDisplay");
        this.IconCompatParcelizer.read(new publish(analyticsConnectorReceiver), (CustomDeltaSlider$MediaBrowserCompat$ItemReceiver) new read(this));
    }

    /* access modifiers changed from: protected */
    public final void write(double d) {
        setImageFileHeight setimagefileheight = this.presenter;
        if (setimagefileheight == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
        Locale locale = Locale.getDefault();
        onGetStartedClick.IconCompatParcelizer((Object) locale, "Locale.getDefault()");
        boolean z = true;
        String format = String.format(locale, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(locale, format, *args)");
        setimagefileheight.IconCompatParcelizer = format;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setImageFileHeight.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver;
        if (setimagefileheight.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(setimagefileheight.RatingCompat);
        }
    }

    /* access modifiers changed from: protected */
    public final void write(int i) {
        setImageFileHeight setimagefileheight = this.presenter;
        if (setimagefileheight == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setimagefileheight.read = String.valueOf(i);
        boolean z = true;
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) setimagefileheight.read, (Object) "0")) {
            if (setimagefileheight.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setimagefileheight.RatingCompat.AlertController$RecycleListView();
            }
            LinkedHashMultimap.C35651 r8 = setimagefileheight.MediaBrowserCompat$SearchResultReceiver;
            FundFactSheetActivity write2 = new setImageFileHeight.write(setimagefileheight);
            FundFactSheetActivity setimagefileheight_mediabrowsercompat_itemreceiver = new setImageFileHeight$MediaBrowserCompat$ItemReceiver(setimagefileheight);
            advance advance = new advance(setimagefileheight.IconCompatParcelizer, setimagefileheight.read, setimagefileheight.MediaMetadataCompat, "MCMC");
            onGetStartedClick.write((Object) write2, "onSuccess");
            onGetStartedClick.write((Object) setimagefileheight_mediabrowsercompat_itemreceiver, "onError");
            onGetStartedClick.write((Object) advance, "request");
            r8.IconCompatParcelizer(r8.write, write2, setimagefileheight_mediabrowsercompat_itemreceiver, new Barcode$CalendarEvent$MediaBrowserCompat$ItemReceiver(advance));
        }
    }

    /* access modifiers changed from: protected */
    public final CustomDeltaSlider MediaBrowserCompat$ItemReceiver() {
        return new CustomDeltaSlider(getContext());
    }

    public final void write() {
        EasycashFeaturesAccountDynamicFragment.write write2 = EasycashFeaturesAccountDynamicFragment.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaMetadataCompat.IconCompatParcelizer(this, new EasycashFeaturesAccountDynamicFragment());
    }

    public final void read(String str) {
        this.MediaDescriptionCompat.write(str);
        RecyclerView recyclerView = this.durationRecyclerView;
        if (recyclerView != null) {
            getRtpSubscriptionRecommandedBiller getrtpsubscriptionrecommandedbiller = this.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) getrtpsubscriptionrecommandedbiller, "mRepaymentAdapter");
            recyclerView.MediaBrowserCompat$CustomActionResultReceiver(getrtpsubscriptionrecommandedbiller.write());
        }
    }

    public final void IconCompatParcelizer(access$1000 access_1000) {
        onGetStartedClick.write((Object) access_1000, "calculationDisplay");
        LinearLayout linearLayout = this.detailSection;
        onGetStartedClick.IconCompatParcelizer((Object) linearLayout, "detailSection");
        linearLayout.setVisibility(0);
        this.headerDetail.setText(getString(R.string.auto_mcmc_car_information_section_title));
        this.detail.IconCompatParcelizer(access_1000.read, R.layout.f84732131493700);
        CustomEasyCashSectionLabel customEasyCashSectionLabel = this.headerCostOverview;
        if (customEasyCashSectionLabel == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("headerCostOverview");
        }
        customEasyCashSectionLabel.setVisibility(0);
        CustomEasyCashSectionLabel customEasyCashSectionLabel2 = this.headerCostOverview;
        if (customEasyCashSectionLabel2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("headerCostOverview");
        }
        customEasyCashSectionLabel2.setText(getString(R.string.auto_mcmc_car_registration_section_title));
        CustomSeparatedViews customSeparatedViews = this.costOverview;
        if (customSeparatedViews == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("costOverview");
        }
        customSeparatedViews.IconCompatParcelizer(access_1000.IconCompatParcelizer, R.layout.f84732131493700);
    }

    public final void MediaBrowserCompat$ItemReceiver(List<RestrictedComponentContainer> list) {
        onGetStartedClick.write((Object) list, "loanInformationList");
        CustomEasyCashSectionLabel customEasyCashSectionLabel = this.headerLoanInformation;
        if (customEasyCashSectionLabel == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("headerLoanInformation");
        }
        customEasyCashSectionLabel.setVisibility(0);
        CustomEasyCashSectionLabel customEasyCashSectionLabel2 = this.headerLoanInformation;
        if (customEasyCashSectionLabel2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("headerLoanInformation");
        }
        customEasyCashSectionLabel2.setText(getString(R.string.easycash_summary_cost_overview_header));
        CustomSeparatedViews customSeparatedViews = this.loanInformation;
        if (customSeparatedViews == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("loanInformation");
        }
        customSeparatedViews.IconCompatParcelizer(list, R.layout.f84732131493700);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.IconCompatParcelizer.setNewActualValue(i);
    }

    @OnClick
    public final void nextButtonClick$app_prodRelease() {
        String str;
        forEachClear foreachclear = this.tracker;
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) iOrientationGuidanceCalculator, "easycashIntentInterface");
        foreachclear.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", iOrientationGuidanceCalculator.write()));
        forEachClear foreachclear2 = this.tracker;
        setImageFileHeight setimagefileheight = this.presenter;
        if (setimagefileheight == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getDeviceState getdevicestate = setimagefileheight.write;
        if (getdevicestate == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("display");
        }
        boolean z = false;
        if (getdevicestate.read.isEmpty()) {
            str = null;
        } else {
            getDeviceState getdevicestate2 = setimagefileheight.write;
            if (getdevicestate2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("display");
            }
            str = getdevicestate2.read.get(0).MediaBrowserCompat$ItemReceiver;
        }
        foreachclear2.MediaBrowserCompat$ItemReceiver(new ZSYR2K("product_program", str));
        forEachClear foreachclear3 = this.tracker;
        setImageFileHeight setimagefileheight2 = this.presenter;
        if (setimagefileheight2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        foreachclear3.MediaBrowserCompat$ItemReceiver(new ZSYR2K("amount", String.format(Locale.getDefault(), "%.2f", new Object[]{Double.valueOf(Double.parseDouble(setimagefileheight2.IconCompatParcelizer))})));
        forEachClear foreachclear4 = this.tracker;
        setImageFileHeight setimagefileheight3 = this.presenter;
        if (setimagefileheight3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        foreachclear4.MediaBrowserCompat$ItemReceiver(new ZSYR2K("tenor", setimagefileheight3.read));
        ZTBSV ztbsv = this.tracker;
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_feature");
        }
        setImageFileHeight setimagefileheight4 = this.presenter;
        if (setimagefileheight4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CharSequence charSequence = setimagefileheight4.MediaBrowserCompat$ItemReceiver;
        if (charSequence == null || charSequence.length() == 0) {
            CharSequence charSequence2 = setimagefileheight4.MediaBrowserCompat$MediaItem;
            if (charSequence2 == null || charSequence2.length() == 0) {
                return;
            }
        }
        if (setimagefileheight4.RatingCompat != null) {
            z = true;
        }
        if (z) {
            setimagefileheight4.RatingCompat.AlertController$RecycleListView();
        }
        LinkedHashMultimap.C35651 r1 = setimagefileheight4.MediaBrowserCompat$SearchResultReceiver;
        FundFactSheetActivity setimagefileheight_mediabrowsercompat_mediaitem = new setImageFileHeight$MediaBrowserCompat$MediaItem(setimagefileheight4);
        FundFactSheetActivity setimagefileheight_mediabrowsercompat_searchresultreceiver = new setImageFileHeight$MediaBrowserCompat$SearchResultReceiver(setimagefileheight4);
        String str2 = setimagefileheight4.MediaMetadataCompat;
        zzfo.zze zze = setimagefileheight4.MediaDescriptionCompat;
        if (zze == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rawMCMCLoan");
        }
        advanceTo advanceto = new advanceTo(str2, "MCMC", zze.IconCompatParcelizer, setimagefileheight4.read, setimagefileheight4.IconCompatParcelizer, setimagefileheight4.MediaBrowserCompat$MediaItem, setimagefileheight4.MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.write((Object) setimagefileheight_mediabrowsercompat_mediaitem, "onSuccess");
        onGetStartedClick.write((Object) setimagefileheight_mediabrowsercompat_searchresultreceiver, "onError");
        onGetStartedClick.write((Object) advanceto, "request");
        r1.IconCompatParcelizer(r1.MediaBrowserCompat$CustomActionResultReceiver, setimagefileheight_mediabrowsercompat_mediaitem, setimagefileheight_mediabrowsercompat_searchresultreceiver, new Barcode.Address.IconCompatParcelizer(advanceto));
    }

    public final void onDestroy() {
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        setImageFileHeight setimagefileheight = this.presenter;
        if (setimagefileheight == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setimagefileheight.onDestroy();
        super.onDestroy();
    }

    public static final EasycashFeaturesMCMCInformationFragment MediaBrowserCompat$SearchResultReceiver() {
        return new EasycashFeaturesMCMCInformationFragment();
    }
}
