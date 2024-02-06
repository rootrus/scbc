package com.scb.phone.view.fragment.debitcard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.debitcard.DebitCardRequestInputActivity;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.AlertController$RecycleListView;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule_GetIJsonExactionHelperKtaFactory;
import p040o.getRow;
import p040o.nativeAddElement;
import p040o.postConfirmation;
import p040o.verifyReferral;

public class DebitProductCatalogFragment extends BaseFragment implements IdCaptureModule_GetIJsonExactionHelperKtaFactory, verifyReferral.write {
    @BindView
    FrameLayout pdfView;
    @HmlPinActivity
    public getRow presenter;

    public static DebitProductCatalogFragment MediaBrowserCompat$CustomActionResultReceiver() {
        return new DebitProductCatalogFragment();
    }

    @OnClick
    public void nextButton(View view) {
        getRow getrow = this.presenter;
        nativeAddElement nativeaddelement = nativeAddElement.read;
        if (getrow.RatingCompat != null) {
            nativeaddelement.IconCompatParcelizer(getrow.RatingCompat);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86462131493873, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getRow getrow = this.presenter;
        if (getrow.RatingCompat != null) {
            getrow.RatingCompat.AlertController$RecycleListView();
        }
        getrow.write.MediaBrowserCompat$CustomActionResultReceiver();
        getrow.write.IconCompatParcelizer(new getRow.read(getrow, (byte) 0));
        return inflate;
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void write(String str) {
        AlertController$RecycleListView.IconCompatParcelizer(getContext(), this, (verifyReferral.IconCompatParcelizer) null, new postConfirmation(this.presenter), this.pdfView, str);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        DebitCardRequestInputActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
    }
}
