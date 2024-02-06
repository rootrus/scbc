package com.scb.phone.view.fragment.additionaldocument;

import android.os.Bundle;
import android.view.View;
import com.scb.phone.view.activity.BaseActivity;
import p040o.Futures;
import p040o.IOrientationGuidanceCalculator;
import p040o.ZSYR2K;
import p040o.ZTBSV;
import p040o.forEachClear;
import p040o.getSettings;
import p040o.onGetStartedClick;

final class DocumentUploadFragment$MediaSessionCompat$ResultReceiverWrapper implements View.OnClickListener {
    private /* synthetic */ DocumentUploadFragment read;
    private /* synthetic */ Futures.ListenableFutureAdapter.C34161 write;

    DocumentUploadFragment$MediaSessionCompat$ResultReceiverWrapper(DocumentUploadFragment documentUploadFragment, Futures.ListenableFutureAdapter.C34161 r2) {
        this.read = documentUploadFragment;
        this.write = r2;
    }

    public final void onClick(View view) {
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.read.IconCompatParcelizer;
        if (iOrientationGuidanceCalculator != null) {
            getSettings getsettings = this.read.presenter;
            if (getsettings == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            Bundle arguments = this.read.getArguments();
            boolean z = false;
            boolean z2 = arguments != null ? arguments.getBoolean("com.scb.phone.IS_REQUIRE_ISSUER_FLAG", false) : false;
            String read2 = iOrientationGuidanceCalculator.read();
            String MediaBrowserCompat$SearchResultReceiver = iOrientationGuidanceCalculator.MediaBrowserCompat$SearchResultReceiver();
            String write2 = iOrientationGuidanceCalculator.write();
            if (getsettings.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getsettings.RatingCompat.AlertController$RecycleListView();
            }
            getsettings.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(read2, MediaBrowserCompat$SearchResultReceiver, write2);
            getsettings.MediaMetadataCompat.IconCompatParcelizer(new getSettings.AppCompatDialogFragment(getsettings, z2));
        }
        forEachClear foreachclear = this.read.tracker;
        if (foreachclear == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        foreachclear.MediaBrowserCompat$ItemReceiver(new ZSYR2K("ID_photo_attachment", this.write.MediaBrowserCompat$CustomActionResultReceiver.isEmpty() ? "Yes" : "No"));
        DocumentUploadFragment documentUploadFragment = this.read;
        forEachClear foreachclear2 = documentUploadFragment.tracker;
        if (foreachclear2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        ZTBSV ztbsv = foreachclear2;
        if (documentUploadFragment.getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) documentUploadFragment.getActivity()).scbAnalytics, "apply_loan_document");
        }
    }
}
