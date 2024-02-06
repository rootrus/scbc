package com.scb.phone.view.fragment.deposit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.common.internal.ImagesContract;
import com.pdfview.PDFView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import java.io.File;
import p040o.DGER;
import p040o.HmlPinActivity;
import p040o.IdParameters_Factory;
import p040o.access$2300;
import p040o.getOutputNames;
import p040o.getOutputNames$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.verifyReferral;

public final class DepositMarketConductFragment extends BaseFragment implements IdParameters_Factory, verifyReferral.write {
    public static final DepositMarketConductFragment$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = new DepositMarketConductFragment$MediaBrowserCompat$ItemReceiver((byte) 0);
    @HmlPinActivity
    public getOutputNames depositMarketDetailPresenter;
    @BindView
    public PDFView pdfView;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86672131493894, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        getOutputNames getoutputnames = this.depositMarketDetailPresenter;
        if (getoutputnames == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("depositMarketDetailPresenter");
        }
        getoutputnames.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(ImagesContract.URL)) == null) {
            getOutputNames getoutputnames2 = this.depositMarketDetailPresenter;
            if (getoutputnames2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("depositMarketDetailPresenter");
            }
            if (getoutputnames2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getoutputnames2.RatingCompat.AlertController$RecycleListView();
            }
            getoutputnames2.write.read();
            getoutputnames2.write.IconCompatParcelizer(new getOutputNames$MediaBrowserCompat$CustomActionResultReceiver(getoutputnames2));
            return inflate;
        }
        getOutputNames getoutputnames3 = this.depositMarketDetailPresenter;
        if (getoutputnames3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("depositMarketDetailPresenter");
        }
        onGetStartedClick.IconCompatParcelizer((Object) string, "it");
        getoutputnames3.MediaBrowserCompat$ItemReceiver(string);
        return inflate;
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        PDFView pDFView = this.pdfView;
        if (pDFView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("pdfView");
        }
        onGetStartedClick.write((Object) str, "filePath");
        pDFView.MediaBrowserCompat$CustomActionResultReceiver = new File(str);
        File file = pDFView.MediaBrowserCompat$CustomActionResultReceiver;
        if (file == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        DGER IconCompatParcelizer2 = DGER.IconCompatParcelizer(file.getPath());
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "ImageSource.uri(mfile!!.path)");
        pDFView.setRegionDecoderFactory(new PDFView.write(pDFView));
        pDFView.setImage(IconCompatParcelizer2);
    }

    public final void write() {
        getOutputNames getoutputnames = this.depositMarketDetailPresenter;
        if (getoutputnames == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("depositMarketDetailPresenter");
        }
        getoutputnames.MediaBrowserCompat$ItemReceiver(R.string.error_generic_resource, access$2300.write.NAVIGATE_BACK);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        getOutputNames getoutputnames = this.depositMarketDetailPresenter;
        if (getoutputnames == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("depositMarketDetailPresenter");
        }
        getoutputnames.onDestroy();
    }
}
