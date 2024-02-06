package com.scb.phone.view.fragment.easycash.loaninformation;

import android.os.Bundle;
import android.view.View;
import butterknife.OnClick;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.EasycashInputIncomeActivity;
import com.scb.phone.view.custom.easycash.CustomDeltaSlider;
import java.util.Locale;
import okhttp3.internal.cache.DiskLruCache;
import p040o.C3107B;
import p040o.DeepLinkModule_BScanCNotiDeepLinkActivity;
import p040o.DocumentDetectionSettings;
import p040o.HmlPinActivity;
import p040o.HorizontalGuidance;
import p040o.LexicographicalOrdering;
import p040o.LexicographicalOrdering$MediaBrowserCompat$ItemReceiver;
import p040o.ZSYR2K;
import p040o.clearBitmapWithoutRecycle;
import p040o.forEachClear;
import p040o.getDetectedItems$MediaBrowserCompat$ItemReceiver;
import p040o.getFirst;
import p040o.getFrameMetadata$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getLegacySharedPrefs;
import p040o.getLiveValue;
import p040o.getLongEdgeThreshold;
import p040o.getShortEdgeThreshold;
import p040o.newEntryArray;
import p040o.onGetStartedClick;
import p040o.setEdgeDetection;
import p040o.setFocus$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setMinFillFraction;
import p040o.setShortEdgeThreshold;
import p040o.setTargetFramePaddingPercent;
import p040o.setToleranceFraction;

public class EasycashFeaturesLoanInformationFragment extends BaseFeaturesLoanInformationFragment {
    @HmlPinActivity
    public clearBitmapWithoutRecycle presenter;

    public static EasycashFeaturesLoanInformationFragment IconCompatParcelizer(String str) {
        EasycashFeaturesLoanInformationFragment easycashFeaturesLoanInformationFragment = new EasycashFeaturesLoanInformationFragment();
        Bundle bundle = new Bundle();
        bundle.putString("com.scb.phone.view.activity.easycash.MONTHLY_INCOME", str);
        easycashFeaturesLoanInformationFragment.setArguments(bundle);
        return easycashFeaturesLoanInformationFragment;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            clearBitmapWithoutRecycle clearbitmapwithoutrecycle = this.presenter;
            String write = this.MediaBrowserCompat$CustomActionResultReceiver.write();
            String MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver();
            String string = arguments.getString("com.scb.phone.view.activity.easycash.MONTHLY_INCOME");
            clearbitmapwithoutrecycle.MediaMetadataCompat = MediaBrowserCompat$SearchResultReceiver;
            if (clearbitmapwithoutrecycle.RatingCompat != null) {
                clearbitmapwithoutrecycle.RatingCompat.AlertController$RecycleListView();
            }
            LexicographicalOrdering lexicographicalOrdering = clearbitmapwithoutrecycle.IconCompatParcelizer;
            setTargetFramePaddingPercent settargetframepaddingpercent = new setTargetFramePaddingPercent(clearbitmapwithoutrecycle);
            C3107B b = new C3107B(clearbitmapwithoutrecycle);
            newEntryArray newentryarray = new newEntryArray(clearbitmapwithoutrecycle.MediaMetadataCompat, write.equalsIgnoreCase("REFERRAL_UNSECURED") ? DiskLruCache.VERSION_1 : "0", string);
            onGetStartedClick.write((Object) settargetframepaddingpercent, "loanDisplay");
            onGetStartedClick.write((Object) b, "onError");
            onGetStartedClick.write((Object) newentryarray, "request");
            lexicographicalOrdering.MediaBrowserCompat$ItemReceiver(lexicographicalOrdering.read, settargetframepaddingpercent, b, new getFrameMetadata$MediaBrowserCompat$CustomActionResultReceiver(newentryarray), new LexicographicalOrdering$MediaBrowserCompat$ItemReceiver(lexicographicalOrdering));
        }
    }

    /* access modifiers changed from: protected */
    public final void write(double d) {
        clearBitmapWithoutRecycle clearbitmapwithoutrecycle = this.presenter;
        clearbitmapwithoutrecycle.write = Double.valueOf(d);
        clearbitmapwithoutrecycle.read = -1;
        HorizontalGuidance horizontalGuidance = new HorizontalGuidance(clearbitmapwithoutrecycle);
        boolean z = true;
        if (clearbitmapwithoutrecycle.RatingCompat != null) {
            horizontalGuidance.IconCompatParcelizer(clearbitmapwithoutrecycle.RatingCompat);
        }
        getShortEdgeThreshold getshortedgethreshold = new getShortEdgeThreshold(d);
        if (clearbitmapwithoutrecycle.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getshortedgethreshold.IconCompatParcelizer(clearbitmapwithoutrecycle.RatingCompat);
        }
    }

    /* access modifiers changed from: protected */
    public final void write(int i) {
        clearBitmapWithoutRecycle clearbitmapwithoutrecycle = this.presenter;
        clearbitmapwithoutrecycle.read = i;
        HorizontalGuidance horizontalGuidance = new HorizontalGuidance(clearbitmapwithoutrecycle);
        boolean z = true;
        if (clearbitmapwithoutrecycle.RatingCompat != null) {
            horizontalGuidance.IconCompatParcelizer(clearbitmapwithoutrecycle.RatingCompat);
        }
        if (clearbitmapwithoutrecycle.RatingCompat == null) {
            z = false;
        }
        if (z) {
            clearbitmapwithoutrecycle.RatingCompat.AlertController$RecycleListView();
        }
        LexicographicalOrdering lexicographicalOrdering = clearbitmapwithoutrecycle.IconCompatParcelizer;
        setMinFillFraction setminfillfraction = new setMinFillFraction(clearbitmapwithoutrecycle);
        setEdgeDetection setedgedetection = new setEdgeDetection(clearbitmapwithoutrecycle);
        getFirst getfirst = new getFirst(clearbitmapwithoutrecycle.MediaMetadataCompat, clearbitmapwithoutrecycle.MediaDescriptionCompat.Keep, clearbitmapwithoutrecycle.MediaDescriptionCompat.PlaybackStateCompat, clearbitmapwithoutrecycle.MediaDescriptionCompat.AppCompatDelegateImpl$ListMenuDecorView, String.valueOf(clearbitmapwithoutrecycle.write), String.valueOf(clearbitmapwithoutrecycle.read));
        onGetStartedClick.write((Object) setminfillfraction, "calculationSummaryDisplay");
        onGetStartedClick.write((Object) setedgedetection, "onError");
        onGetStartedClick.write((Object) getfirst, "request");
        lexicographicalOrdering.MediaBrowserCompat$ItemReceiver(lexicographicalOrdering.write, setminfillfraction, setedgedetection, new setFocus$MediaBrowserCompat$CustomActionResultReceiver(getfirst), new LexicographicalOrdering.IconCompatParcelizer(lexicographicalOrdering));
    }

    /* access modifiers changed from: protected */
    public final CustomDeltaSlider MediaBrowserCompat$ItemReceiver() {
        return new CustomDeltaSlider(getContext());
    }

    public final void IconCompatParcelizer() {
        this.moreLoanLink.setVisibility(0);
        this.moreLoanLink.setOnClickListener(new DeepLinkModule_BScanCNotiDeepLinkActivity(this));
    }

    public final /* synthetic */ void MediaBrowserCompat$MediaItem() {
        clearBitmapWithoutRecycle clearbitmapwithoutrecycle = this.presenter;
        getLegacySharedPrefs MediaDescriptionCompat = this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat();
        if (clearbitmapwithoutrecycle.RatingCompat != null) {
            clearbitmapwithoutrecycle.RatingCompat.AlertController$RecycleListView();
        }
        clearbitmapwithoutrecycle.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(new getLongEdgeThreshold(clearbitmapwithoutrecycle, MediaDescriptionCompat), new setToleranceFraction(clearbitmapwithoutrecycle), clearbitmapwithoutrecycle.MediaMetadataCompat, "REFERRAL_UNSECURED");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getLegacySharedPrefs getlegacysharedprefs) {
        EasycashInputIncomeActivity.MediaBrowserCompat$ItemReceiver(getActivity(), getlegacysharedprefs);
        getActivity().finish();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void nextButtonClick() {
        clearBitmapWithoutRecycle clearbitmapwithoutrecycle = this.presenter;
        if (clearbitmapwithoutrecycle.RatingCompat != null) {
            clearbitmapwithoutrecycle.RatingCompat.AlertController$RecycleListView();
        }
        LexicographicalOrdering lexicographicalOrdering = clearbitmapwithoutrecycle.IconCompatParcelizer;
        DocumentDetectionSettings documentDetectionSettings = new DocumentDetectionSettings(clearbitmapwithoutrecycle);
        setShortEdgeThreshold setshortedgethreshold = new setShortEdgeThreshold(clearbitmapwithoutrecycle);
        getLiveValue getlivevalue = new getLiveValue(clearbitmapwithoutrecycle.MediaMetadataCompat, clearbitmapwithoutrecycle.MediaDescriptionCompat.Keep, clearbitmapwithoutrecycle.MediaDescriptionCompat.PlaybackStateCompat, clearbitmapwithoutrecycle.MediaDescriptionCompat.AppCompatDelegateImpl$ListMenuDecorView, clearbitmapwithoutrecycle.MediaDescriptionCompat.MediaSessionCompat$ResultReceiverWrapper, String.valueOf(clearbitmapwithoutrecycle.write), String.valueOf(clearbitmapwithoutrecycle.read));
        onGetStartedClick.write((Object) documentDetectionSettings, "onSuccess");
        onGetStartedClick.write((Object) setshortedgethreshold, "onError");
        onGetStartedClick.write((Object) getlivevalue, "request");
        lexicographicalOrdering.IconCompatParcelizer(lexicographicalOrdering.IconCompatParcelizer, documentDetectionSettings, setshortedgethreshold, new getDetectedItems$MediaBrowserCompat$ItemReceiver(getlivevalue));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", this.MediaBrowserCompat$CustomActionResultReceiver.write()));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("tenor", String.valueOf(this.presenter.read)));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("amount", String.format(Locale.getDefault(), "%.2f", new Object[]{this.presenter.write})));
        forEachClear foreachclear = this.tracker;
        if (getActivity() != null) {
            foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_feature");
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void write() {
        this.MediaMetadataCompat.IconCompatParcelizer(this, EasycashFeaturesAccountDynamicFragment.MediaBrowserCompat$CustomActionResultReceiver());
    }
}
