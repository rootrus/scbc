package com.scb.phone.view.fragment.etb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import p040o.AlertController$RecycleListView;
import p040o.BarnsenShader;
import p040o.BarnsenShader$MediaBrowserCompat$ItemReceiver;
import p040o.C1346xf91fc122;
import p040o.DeepLinkModule_ContributeLoanDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.getExpirationYear$MediaBrowserCompat$ItemReceiver;
import p040o.verifyReferral;

public class ETBMarketConductDetailFragment extends BaseEtbFragment implements getExpirationYear$MediaBrowserCompat$ItemReceiver, verifyReferral.write, C1346xf91fc122 {
    @BindView
    public Button btnRead;
    @HmlPinActivity
    public BarnsenShader etbMarketConductDetailPresenter;
    @BindView
    FrameLayout viewContainer;

    public final int ParcelableVolumeInfo() {
        return 0;
    }

    @OnClick
    public void onReadButtonClick() {
    }

    public final boolean setHasDecor() {
        return false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f77772131493002, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.btnRead.setEnabled(false);
        this.etbMarketConductDetailPresenter.MediaBrowserCompat$ItemReceiver(this);
        BarnsenShader barnsenShader = this.etbMarketConductDetailPresenter;
        if (barnsenShader.RatingCompat != null) {
            barnsenShader.RatingCompat.AlertController$RecycleListView();
        }
        barnsenShader.IconCompatParcelizer.read();
        barnsenShader.IconCompatParcelizer.IconCompatParcelizer(new BarnsenShader$MediaBrowserCompat$ItemReceiver(barnsenShader, (byte) 0));
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setHasOptionsMenu(false);
    }

    public final void write(String str) {
        AlertController$RecycleListView.IconCompatParcelizer(getContext(), this, (verifyReferral.IconCompatParcelizer) null, new DeepLinkModule_ContributeLoanDeepLinkActivity(this), this.viewContainer, str);
        this.btnRead.setEnabled(true);
    }

    public void onDestroyView() {
        this.etbMarketConductDetailPresenter.onDestroy();
        if (this.viewContainer.getChildCount() > 0) {
            this.viewContainer.removeAllViews();
        }
        super.onDestroyView();
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.etb_product_catalog);
    }
}
