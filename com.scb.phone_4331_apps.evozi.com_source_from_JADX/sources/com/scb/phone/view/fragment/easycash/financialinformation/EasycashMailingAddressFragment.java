package com.scb.phone.view.fragment.easycash.financialinformation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.fragment.easycash.BaseBreadcrumbAddressFragment;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.C4219ct;
import p040o.C4223cy;
import p040o.IOrientationGuidanceCalculator;
import p040o.animateCamera;

public class EasycashMailingAddressFragment extends BaseBreadcrumbAddressFragment {
    private IOrientationGuidanceCalculator MediaBrowserCompat$CustomActionResultReceiver;

    public final int ParcelableVolumeInfo() {
        return 2;
    }

    public final boolean setHasDecor() {
        return true;
    }

    public static EasycashMailingAddressFragment IconCompatParcelizer(AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.view.fragment.easycash.financial_information.ADDRESS_DISPLAY", autoValue_CrashlyticsReport_CustomAttribute);
        EasycashMailingAddressFragment easycashMailingAddressFragment = new EasycashMailingAddressFragment();
        easycashMailingAddressFragment.setArguments(bundle);
        return easycashMailingAddressFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C4223cy cyVar = this.presenter;
        boolean z = true;
        C4219ct ctVar = new C4219ct(true);
        if (cyVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            ctVar.IconCompatParcelizer(cyVar.RatingCompat);
        }
        this.MediaDescriptionCompat = "TH";
        this.layoutCustomSpinner.setVisibility(8);
        this.textAddressTitle.setText(getString(R.string.easycash_contact_mailing_address_title));
        return onCreateView;
    }

    @OnClick
    public void onNextClick() {
        animateCamera animatecamera = new animateCamera();
        animatecamera.MediaBrowserCompat$SearchResultReceiver = this.houseNo.inputTextField.getText().toString().trim();
        animatecamera.MediaBrowserCompat$CustomActionResultReceiver = this.moo.inputTextField.getText().toString().trim();
        animatecamera.MediaBrowserCompat$MediaItem = this.roadTH.inputTextField.getText().toString().trim();
        animatecamera.MediaSessionCompat$QueueItem = this.floor.inputTextField.getText().toString().trim();
        animatecamera.PlaybackStateCompat$CustomAction = this.unit.inputTextField.getText().toString().trim();
        animatecamera.MediaSessionCompat$Token = this.village.inputTextField.getText().toString().trim();
        animatecamera.MediaDescriptionCompat = this.alley.inputTextField.getText().toString().trim();
        animatecamera.RatingCompat = this.provinceLabel.getText().toString().replaceAll("(^\\h*)|(\\h*$)", "");
        animatecamera.write = this.districtLabel.getText().toString().replaceAll("(^\\h*)|(\\h*$)", "");
        animatecamera.MediaBrowserCompat$ItemReceiver = this.subDistrictLabel.getText().toString().replaceAll("(^\\h*)|(\\h*$)", "");
        animatecamera.MediaSessionCompat$ResultReceiverWrapper = this.postalCodeLabel.getText().toString().replaceAll("(^\\h*)|(\\h*$)", "");
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(animatecamera);
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.easycash_contact_mailing_address_title);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOrientationGuidanceCalculator) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (IOrientationGuidanceCalculator) context;
        }
    }

    public void onDestroy() {
        this.MediaBrowserCompat$MediaItem = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
