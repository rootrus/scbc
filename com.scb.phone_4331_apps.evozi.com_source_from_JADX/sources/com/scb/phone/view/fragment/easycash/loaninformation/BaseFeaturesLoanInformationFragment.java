package com.scb.phone.view.fragment.easycash.loaninformation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomDeltaSlider;
import com.scb.phone.view.custom.easycash.CustomDeltaSlider$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import p040o.AnalyticsConnectorReceiver;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsBackgroundWorker;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.dispatchCrashlyticsOriginEvent;
import p040o.forEachClear;
import p040o.getLegacySharedPrefs;
import p040o.getRtpSubscriptionRecommandedBiller;
import p040o.publish;
import p040o.resetPinVerifyByAtmCard;

public abstract class BaseFeaturesLoanInformationFragment<T extends CustomDeltaSlider> extends BreadcrumbFragment implements CheckExtractActivity_MembersInjector.setShortcut.read {
    protected T IconCompatParcelizer;
    IOrientationGuidanceCalculator MediaBrowserCompat$CustomActionResultReceiver;
    getRtpSubscriptionRecommandedBiller MediaDescriptionCompat;
    @BindView
    protected LinearLayout amountSliderContainer;
    @BindView
    protected CustomSeparatedViews detail;
    @BindView
    protected LinearLayout detailSection;
    @BindView
    protected RecyclerView durationRecyclerView;
    @BindView
    protected CustomEasyCashSectionLabel durationSection;
    @BindView
    protected CustomEasyCashSectionLabel headerDetail;
    @BindView
    protected LinearLayout moreLoanLink;
    @BindView
    protected Button nextButton;
    @HmlPinActivity
    public forEachClear tracker;

    public void IconCompatParcelizer() {
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(getLegacySharedPrefs getlegacysharedprefs) {
    }

    /* access modifiers changed from: protected */
    public abstract T MediaBrowserCompat$ItemReceiver();

    public final int ParcelableVolumeInfo() {
        return 0;
    }

    public final boolean setHasDecor() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void write(double d);

    /* access modifiers changed from: protected */
    public abstract void write(int i);

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86982131493925, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        T MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
        this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver;
        this.amountSliderContainer.addView(MediaBrowserCompat$ItemReceiver);
    }

    public void read(AnalyticsConnectorReceiver analyticsConnectorReceiver) {
        this.IconCompatParcelizer.read(new publish(analyticsConnectorReceiver), (CustomDeltaSlider$MediaBrowserCompat$ItemReceiver) new CustomDeltaSlider$MediaBrowserCompat$ItemReceiver() {
            public final void IconCompatParcelizer(double d) {
                BaseFeaturesLoanInformationFragment.this.write(d);
            }

            public final void MediaBrowserCompat$ItemReceiver(double d) {
                BaseFeaturesLoanInformationFragment.this.write(d);
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                BaseFeaturesLoanInformationFragment.this.write(d);
            }
        });
        write(analyticsConnectorReceiver.MediaBrowserCompat$CustomActionResultReceiver.doubleValue());
    }

    public final void MediaBrowserCompat$ItemReceiver(double d) {
        this.MediaDescriptionCompat.IconCompatParcelizer(Double.valueOf(d));
    }

    public final void read(dispatchCrashlyticsOriginEvent dispatchcrashlyticsoriginevent) {
        if (this.durationRecyclerView != null && this.durationSection != null) {
            getContext();
            this.durationRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            getRtpSubscriptionRecommandedBiller getrtpsubscriptionrecommandedbiller = new getRtpSubscriptionRecommandedBiller(dispatchcrashlyticsoriginevent, new resetPinVerifyByAtmCard(this, dispatchcrashlyticsoriginevent));
            this.MediaDescriptionCompat = getrtpsubscriptionrecommandedbiller;
            this.durationRecyclerView.setAdapter(getrtpsubscriptionrecommandedbiller);
            this.durationSection.setVisibility(0);
            this.durationRecyclerView.setVisibility(0);
        }
    }

    public final void read() {
        this.detailSection.setVisibility(8);
        this.nextButton.setEnabled(false);
    }

    public void MediaBrowserCompat$ItemReceiver(CrashlyticsBackgroundWorker.C32164 r3) {
        this.detailSection.setVisibility(0);
        this.detail.IconCompatParcelizer(r3.IconCompatParcelizer, R.layout.f84732131493700);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.nextButton.setEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaDescriptionCompat.read();
    }

    public String PlaybackStateCompat() {
        return getString(R.string.loan_info_title);
    }

    public final void write(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(str);
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
        super.onDestroy();
    }

    public final /* synthetic */ void read(dispatchCrashlyticsOriginEvent dispatchcrashlyticsoriginevent, int i) {
        write(dispatchcrashlyticsoriginevent.read.get(i).intValue());
    }
}
