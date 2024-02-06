package com.scb.phone.view.fragment.prelogin.quicktopup;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import p040o.C4455gM;
import p040o.HmlPinActivity;
import p040o.getDocumentSkew;
import p040o.getICheckDeserializerRtti;

public class SetupQuickTopUpFragment extends QuickTopUpFragment implements getDocumentSkew.write {
    @HmlPinActivity
    public C4455gM setupQuickTopUpPresenter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89262131494153, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.setupQuickTopUpPresenter.MediaBrowserCompat$ItemReceiver(this);
        MediaBrowserCompat$SearchResultReceiver();
        super.setTransitioning();
        ParcelableVolumeInfo(getString(R.string.setup_quick_top_up));
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        RatingCompat();
        this.setupQuickTopUpPresenter.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$SearchResultReceiver);
    }

    public void onDestroy() {
        this.setupQuickTopUpPresenter.onDestroy();
        super.onDestroy();
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ParcelableVolumeInfo(getString(R.string.setup_quick_top_up));
    }

    public final void read(int i) {
        if (this.MediaMetadataCompat != i) {
            this.MediaMetadataCompat = i;
            super.read(i);
            this.setupQuickTopUpPresenter.MediaBrowserCompat$ItemReceiver(i);
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onContinueButtonClick() {
        if ((this.mAmountValueEditText.getText() != null || this.MediaBrowserCompat$MediaItem.write() != -1) && this.mReferenceTextView.getText() != null && this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            if (this.mAmountValueEditText.getVisibility() != 0 && this.MediaBrowserCompat$MediaItem != null) {
                this.IconCompatParcelizer = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver().doubleValue();
            } else if (!TextUtils.isEmpty(this.mAmountValueEditText.getText())) {
                this.IconCompatParcelizer = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.mAmountValueEditText.getText().toString()).doubleValue();
            } else {
                this.IconCompatParcelizer = 0.0d;
            }
            this.setupQuickTopUpPresenter.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.setupQuickTopUpPresenter.write((int) R.string.biller_not_found);
    }
}
