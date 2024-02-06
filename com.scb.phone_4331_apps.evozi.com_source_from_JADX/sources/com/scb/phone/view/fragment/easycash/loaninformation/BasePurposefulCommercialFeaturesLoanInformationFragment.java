package com.scb.phone.view.fragment.easycash.loaninformation;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomCreditCardPageSelector;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsBackgroundWorker;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.forEachClear;
import p040o.getRtpSubscriptionRecommandedBiller;
import p040o.writeUInt64NoTag;

public class BasePurposefulCommercialFeaturesLoanInformationFragment extends BreadcrumbFragment implements CheckExtractActivity_MembersInjector.IconCompatParcelizer {
    protected getRtpSubscriptionRecommandedBiller IconCompatParcelizer;
    protected IOrientationGuidanceCalculator MediaBrowserCompat$CustomActionResultReceiver;
    private writeUInt64NoTag MediaBrowserCompat$MediaItem;
    @BindView
    protected TextInputLayout amountInputLayout;
    @BindView
    protected CustomCreditCardPageSelector cardSelector;
    @BindView
    protected CustomSeparatedViews detail;
    @BindView
    protected LinearLayout detailSection;
    @BindView
    protected RecyclerView durationRecyclerView;
    @BindView
    protected CustomEasyCashSectionLabel durationSection;
    @BindView
    protected Button nextButton;
    @BindView
    protected TextView rateDisclaimer;
    @HmlPinActivity
    public forEachClear tracker;

    public final int ParcelableVolumeInfo() {
        return 0;
    }

    public final boolean setHasDecor() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void write(writeUInt64NoTag writeuint64notag) {
        this.MediaBrowserCompat$MediaItem = writeuint64notag;
        writeuint64notag.MediaBrowserCompat$ItemReceiver(this);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOrientationGuidanceCalculator) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (IOrientationGuidanceCalculator) context;
        }
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.loan_info_title);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.cardSelector.setSelectedCard(i);
    }

    public final void write(double d) {
        this.IconCompatParcelizer.IconCompatParcelizer(Double.valueOf(d));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.IconCompatParcelizer.read();
    }

    public final void aI_() {
        this.detailSection.setVisibility(8);
        this.nextButton.setEnabled(false);
        this.rateDisclaimer.setVisibility(8);
    }

    public final void write(boolean z) {
        this.nextButton.setEnabled(z);
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.IconCompatParcelizer iconCompatParcelizer) {
        this.durationSection.setVisibility(0);
        this.durationRecyclerView.setVisibility(0);
        this.durationRecyclerView.setAdapter(iconCompatParcelizer);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsBackgroundWorker.C32164 r3) {
        this.detailSection.setVisibility(0);
        this.detail.IconCompatParcelizer(r3.IconCompatParcelizer, R.layout.f84732131493700);
    }

    public void onDestroy() {
        this.tracker = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.MediaBrowserCompat$MediaItem.onDestroy();
        super.onDestroy();
    }
}
