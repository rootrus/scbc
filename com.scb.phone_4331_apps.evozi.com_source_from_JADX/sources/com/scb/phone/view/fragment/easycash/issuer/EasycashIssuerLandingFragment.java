package com.scb.phone.view.fragment.easycash.issuer;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.easycash.LendingIssuerAdapter;
import com.scb.phone.view.custom.RectangleRelativeLayout;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.easycash.EasycashContactInformationFragment;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.RegistrationService;
import p040o.RegistrationWithApiAuthService;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.access$2300;
import p040o.calculateUsedDiskSpaceInBytes;
import p040o.forEachClear;
import p040o.getBarCodeResults;
import p040o.getConsentContent;

public class EasycashIssuerLandingFragment extends BreadcrumbFragment implements CheckExtractActivity_MembersInjector.ExpandedMenuView {
    private IOrientationGuidanceCalculator IconCompatParcelizer;
    @BindView
    Button addIssuerButton;
    @HmlPinActivity
    public getBarCodeResults easycashIssuerLandingPresenter;
    @BindView
    RectangleRelativeLayout issuerErrorCard;
    @BindView
    public RecyclerView issuerRecyclerView;
    @HmlPinActivity
    public forEachClear tracker;

    public final int ParcelableVolumeInfo() {
        return 1;
    }

    public boolean setHasDecor() {
        return true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87022131493929, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.easycashIssuerLandingPresenter.MediaBrowserCompat$ItemReceiver(this);
        getBarCodeResults getbarcoderesults = this.easycashIssuerLandingPresenter;
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.IconCompatParcelizer;
        String read = iOrientationGuidanceCalculator != null ? iOrientationGuidanceCalculator.read() : null;
        if (getArguments() != null && getArguments().getBoolean("IS_HML_ISSUER_FLAG", false)) {
            z = true;
        }
        getbarcoderesults.MediaBrowserCompat$ItemReceiver(read, Boolean.valueOf(z));
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.addIssuerButton.setEnabled(z);
    }

    public final void MediaBrowserCompat$ItemReceiver(List<calculateUsedDiskSpaceInBytes> list) {
        this.issuerErrorCard.setVisibility(8);
        this.issuerRecyclerView.setVisibility(0);
        getContext();
        this.issuerRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.issuerRecyclerView.setNestedScrollingEnabled(false);
        this.issuerRecyclerView.setAdapter(new LendingIssuerAdapter(list, new RegistrationWithApiAuthService(this)));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        access$2200 access_2200 = new access$2200();
        access_2200.IconCompatParcelizer = getString(R.string.error_generic_resource);
        access$2300 access_2300 = new access$2300();
        access_2300.read = access$2300.write.JUST_DISMISS;
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.ok);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        write(access_2200);
    }

    public final void IconCompatParcelizer() {
        this.issuerErrorCard.setVisibility(0);
    }

    public final /* synthetic */ void IconCompatParcelizer(String str) {
        this.issuerRecyclerView.setVisibility(8);
        write(str);
    }

    /* access modifiers changed from: protected */
    public void write(String str) {
        this.easycashIssuerLandingPresenter.MediaBrowserCompat$CustomActionResultReceiver(str, this.IconCompatParcelizer.read());
    }

    public final void write() {
        getBarCodeResults getbarcoderesults = this.easycashIssuerLandingPresenter;
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.IconCompatParcelizer;
        String read = iOrientationGuidanceCalculator != null ? iOrientationGuidanceCalculator.read() : null;
        boolean z = false;
        if (getArguments() != null && getArguments().getBoolean("IS_HML_ISSUER_FLAG", false)) {
            z = true;
        }
        getbarcoderesults.MediaBrowserCompat$ItemReceiver(read, Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onIssuerErrorClick() {
        this.issuerErrorCard.setVisibility(8);
        write();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void addIssuerClick() {
        MediaDescriptionCompat();
    }

    /* access modifiers changed from: protected */
    public void MediaDescriptionCompat() {
        this.MediaMetadataCompat.IconCompatParcelizer(this, new EasycashIssuerInputFragment());
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void nextButtonClick() {
        MediaMetadataCompat();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.easycashIssuerLandingPresenter.read.write.MediaBrowserCompat$ItemReceiver();
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.occupation_info_title);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOrientationGuidanceCalculator) {
            this.IconCompatParcelizer = (IOrientationGuidanceCalculator) context;
        }
    }

    public void onDestroy() {
        this.tracker = null;
        this.IconCompatParcelizer = null;
        super.onDestroy();
    }

    public static /* synthetic */ void write(EasycashIssuerLandingFragment easycashIssuerLandingFragment, String str) {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(easycashIssuerLandingFragment.getContext()).IconCompatParcelizer(easycashIssuerLandingFragment.getString(R.string.delete_title_dialog)).MediaBrowserCompat$ItemReceiver(easycashIssuerLandingFragment.getString(R.string.delete_text_dialog));
        CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.delete_button), new RegistrationService(easycashIssuerLandingFragment, str));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), getConsentContent.read).show();
    }

    /* access modifiers changed from: protected */
    public void MediaMetadataCompat() {
        this.easycashIssuerLandingPresenter.read.write.MediaBrowserCompat$ItemReceiver();
        if (!(this.IconCompatParcelizer == null || this.issuerRecyclerView.MediaDescriptionCompat == null)) {
            this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", this.IconCompatParcelizer.write()));
            this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("issuer", this.issuerRecyclerView.MediaDescriptionCompat.IconCompatParcelizer() > 0 ? "Yes" : "No"));
            forEachClear foreachclear = this.tracker;
            if (getActivity() != null) {
                foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_issuers");
            }
        }
        this.MediaMetadataCompat.IconCompatParcelizer(this, EasycashContactInformationFragment.write());
    }
}
