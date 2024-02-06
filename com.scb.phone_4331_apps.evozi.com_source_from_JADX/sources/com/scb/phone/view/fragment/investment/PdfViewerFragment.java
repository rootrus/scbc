package com.scb.phone.view.fragment.investment;

import android.content.Context;
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
import com.scb.phone.view.fragment.BaseFragment;
import p040o.ActivityBuilder_BindInvestmentDetailsActivity;
import p040o.AlertController$RecycleListView;
import p040o.verifyReferral;

public class PdfViewerFragment extends BaseFragment implements verifyReferral.write {
    public write MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected Button buttonNext;
    @BindView
    protected FrameLayout pdfView;

    public interface write {
        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        void mo34028x50fd9e4a();

        void MediaSessionCompat$QueueItem();

        void MediaSessionCompat$Token();
    }

    public static PdfViewerFragment write(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("PDF_TITLE_VIWER", str);
        bundle.putString("PDF_URL", str2);
        bundle.putString("PDF_BUTTON_TEXT", str3);
        PdfViewerFragment pdfViewerFragment = new PdfViewerFragment();
        pdfViewerFragment.setArguments(bundle);
        return pdfViewerFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f92272131494454, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        super.setTransitioning();
        ParcelableVolumeInfo(getArguments().getString("PDF_TITLE_VIWER"));
        setActionBarVisibilityCallback();
        this.buttonNext.setText(getArguments().getString("PDF_BUTTON_TEXT"));
        String string = getArguments().getString("PDF_URL");
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token();
        AlertController$RecycleListView.IconCompatParcelizer(getContext(), this, (verifyReferral.IconCompatParcelizer) null, new ActivityBuilder_BindInvestmentDetailsActivity(this), this.pdfView, string);
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ParcelableVolumeInfo(getArguments().getString("PDF_TITLE_VIWER"));
        setActionBarVisibilityCallback();
    }

    @OnClick
    public void onNextButtonClick() {
        write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (write2 != null) {
            write2.MediaSessionCompat$QueueItem();
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof write) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (write) context;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }
}
