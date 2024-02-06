package com.scb.phone.view.fragment.easycash.loaninformation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.EasycashInputIncomeActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.easycash.CustomCreditCardPageSelector;
import com.scb.phone.view.custom.easycash.CustomDeltaSlider;
import com.scb.phone.view.custom.easycash.CustomDeltaSlider$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import java.util.Locale;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AnalyticsConnectorReceiver;
import p040o.C10827Iterators;
import p040o.C6395xeeeefe7;
import p040o.CrashlyticsBackgroundWorker;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.Image;
import p040o.ZSYR2K;
import p040o.expireEntries;
import p040o.forEachClear;
import p040o.getLegacySharedPrefs;
import p040o.getMaxFillFraction;
import p040o.getMaxSkewAngle;
import p040o.newEntryArray;
import p040o.onGetStartedClick;
import p040o.publish;
import p040o.setFacing$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setMaxFillFraction;
import p040o.setMaxSkewAngle;
import p040o.setRequestedPreviewSize;
import p040o.subscribe;
import p040o.verifyByFace;
import p040o.verifyProfileByCreditCard;

public class EasycashFeaturesCardInformationFragment extends BreadcrumbFragment implements C6395xeeeefe7 {
    private CustomDeltaSlider IconCompatParcelizer;
    public IOrientationGuidanceCalculator MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public double MediaDescriptionCompat;
    @BindView
    protected LinearLayout amountSliderContainer;
    @BindView
    CustomCreditCardPageSelector cardSelector;
    @BindView
    protected CustomSeparatedViews detail;
    @BindView
    protected LinearLayout moreLoanLink;
    @HmlPinActivity
    public Image.FriendI presenter;
    @HmlPinActivity
    public forEachClear tracker;

    public final int ParcelableVolumeInfo() {
        return 0;
    }

    public final boolean setHasDecor() {
        return true;
    }

    public static EasycashFeaturesCardInformationFragment IconCompatParcelizer(String str) {
        EasycashFeaturesCardInformationFragment easycashFeaturesCardInformationFragment = new EasycashFeaturesCardInformationFragment();
        Bundle bundle = new Bundle();
        bundle.putString("com.scb.phone.view.activity.easycash.MONTHLY_INCOME", str);
        easycashFeaturesCardInformationFragment.setArguments(bundle);
        return easycashFeaturesCardInformationFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86972131493924, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Image.FriendI friendI = this.presenter;
            String MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver();
            String string = arguments.getString("com.scb.phone.view.activity.easycash.MONTHLY_INCOME");
            String write = this.MediaBrowserCompat$CustomActionResultReceiver.write();
            if (friendI.RatingCompat != null) {
                z = true;
            }
            if (z) {
                friendI.RatingCompat.AlertController$RecycleListView();
            }
            C10827Iterators.C35478 r3 = friendI.IconCompatParcelizer;
            setMaxFillFraction setmaxfillfraction = new setMaxFillFraction(friendI, MediaBrowserCompat$SearchResultReceiver);
            getMaxFillFraction getmaxfillfraction = new getMaxFillFraction(friendI);
            newEntryArray newentryarray = new newEntryArray(MediaBrowserCompat$SearchResultReceiver, write.equalsIgnoreCase("REFERRAL_UNSECURED") ? DiskLruCache.VERSION_1 : "0", string);
            onGetStartedClick.write((Object) setmaxfillfraction, "cardOfferDisplay");
            onGetStartedClick.write((Object) getmaxfillfraction, "onError");
            onGetStartedClick.write((Object) newentryarray, "request");
            r3.MediaBrowserCompat$ItemReceiver(r3.IconCompatParcelizer, setmaxfillfraction, getmaxfillfraction, new setRequestedPreviewSize.read(newentryarray), new C10827Iterators.C35478.write(r3));
        }
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CustomDeltaSlider customDeltaSlider = new CustomDeltaSlider(getContext());
        this.IconCompatParcelizer = customDeltaSlider;
        this.amountSliderContainer.addView(customDeltaSlider);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(subscribe subscribe) {
        this.cardSelector.IconCompatParcelizer(subscribe, new ViewPager.MediaMetadataCompat() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                EasycashFeaturesCardInformationFragment.this.presenter.MediaBrowserCompat$CustomActionResultReceiver(i);
            }
        });
    }

    public final void write(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(str);
    }

    public final void read(int i) {
        this.cardSelector.setSelectedCard(i);
    }

    public final void read(AnalyticsConnectorReceiver analyticsConnectorReceiver) {
        this.IconCompatParcelizer.read(new publish(analyticsConnectorReceiver), (CustomDeltaSlider$MediaBrowserCompat$ItemReceiver) new CustomDeltaSlider$MediaBrowserCompat$ItemReceiver() {
            public final void IconCompatParcelizer(double d) {
            }

            public final void MediaBrowserCompat$ItemReceiver(double d) {
                EasycashFeaturesCardInformationFragment.this.presenter.MediaBrowserCompat$ItemReceiver(d);
                double unused = EasycashFeaturesCardInformationFragment.this.MediaDescriptionCompat = d;
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                EasycashFeaturesCardInformationFragment.this.presenter.MediaBrowserCompat$ItemReceiver(d);
                double unused = EasycashFeaturesCardInformationFragment.this.MediaDescriptionCompat = d;
            }
        });
        this.presenter.MediaBrowserCompat$ItemReceiver(analyticsConnectorReceiver.MediaBrowserCompat$CustomActionResultReceiver.doubleValue());
        this.MediaDescriptionCompat = analyticsConnectorReceiver.MediaBrowserCompat$CustomActionResultReceiver.doubleValue();
    }

    public final void IconCompatParcelizer() {
        this.moreLoanLink.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.moreLoanLink.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getLegacySharedPrefs getlegacysharedprefs) {
        EasycashInputIncomeActivity.MediaBrowserCompat$ItemReceiver(getActivity(), getlegacysharedprefs);
        getActivity().finish();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.MediaMetadataCompat.IconCompatParcelizer(this, EasycashFeaturesAccountDynamicFragment.MediaBrowserCompat$CustomActionResultReceiver());
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsBackgroundWorker.C32164 r3) {
        this.detail.IconCompatParcelizer(r3.IconCompatParcelizer, R.layout.f84732131493700);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onMoreOptionClick() {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.request_more_loan_link_title)).MediaBrowserCompat$ItemReceiver(getString(R.string.request_more_loan_link_text));
        CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.confirm), new verifyProfileByCreditCard(this));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), verifyByFace.MediaBrowserCompat$CustomActionResultReceiver).show();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void nextButtonClick() {
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", this.MediaBrowserCompat$CustomActionResultReceiver.write()));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("amount", String.format(Locale.getDefault(), "%.2f", new Object[]{Double.valueOf(this.MediaDescriptionCompat)})));
        forEachClear foreachclear = this.tracker;
        if (getActivity() != null) {
            foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_feature");
        }
        Image.FriendI friendI = this.presenter;
        String MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver();
        double d = this.MediaDescriptionCompat;
        if (friendI.RatingCompat != null) {
            friendI.RatingCompat.AlertController$RecycleListView();
        }
        C10827Iterators.C35478 r1 = friendI.IconCompatParcelizer;
        setMaxSkewAngle setmaxskewangle = new setMaxSkewAngle(friendI);
        getMaxSkewAngle getmaxskewangle = new getMaxSkewAngle(friendI);
        expireEntries expireentries = new expireEntries(MediaBrowserCompat$SearchResultReceiver, friendI.MediaDescriptionCompat.ParcelableVolumeInfo, friendI.MediaDescriptionCompat.f2817x50fd9e4a, friendI.MediaDescriptionCompat.MediaSessionCompat$QueueItem, friendI.MediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver, String.format("%.0f", new Object[]{Double.valueOf(d)}));
        onGetStartedClick.write((Object) setmaxskewangle, "onSuccess");
        onGetStartedClick.write((Object) getmaxskewangle, "onError");
        onGetStartedClick.write((Object) expireentries, "request");
        r1.IconCompatParcelizer(r1.read, setmaxskewangle, getmaxskewangle, new setFacing$MediaBrowserCompat$CustomActionResultReceiver(expireentries));
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.card_info_title);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOrientationGuidanceCalculator) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (IOrientationGuidanceCalculator) context;
        }
    }

    public void onDestroy() {
        this.tracker = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
