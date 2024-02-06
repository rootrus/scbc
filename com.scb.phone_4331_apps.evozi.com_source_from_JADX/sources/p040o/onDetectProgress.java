package p040o;

import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;
import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.onDetectProgress */
public final /* synthetic */ class onDetectProgress implements getRangeIndex$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ MwBusinessDetailsActivity IconCompatParcelizer;

    public /* synthetic */ onDetectProgress(MwBusinessDetailsActivity mwBusinessDetailsActivity) {
        this.IconCompatParcelizer = mwBusinessDetailsActivity;
    }

    public final void write(Object obj) {
        MwBusinessDetailsActivity mwBusinessDetailsActivity = this.IconCompatParcelizer;
        AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder crashlyticsReportFilesPayloadFileEncoder = (AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder) obj;
        mwBusinessDetailsActivity.MediaSessionCompat$Token.read(crashlyticsReportFilesPayloadFileEncoder);
        mwBusinessDetailsActivity.MediaMetadataCompat.onNext(isSupportFragmentClass.read(crashlyticsReportFilesPayloadFileEncoder));
        if (mwBusinessDetailsActivity.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver) {
            mwBusinessDetailsActivity.MediaSessionCompat$Token.read((getNdkPayload) null);
            mwBusinessDetailsActivity.spinnerSubCategory.setSelection(0);
            mwBusinessDetailsActivity.AlertController$RecycleListView.onNext(isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver());
        }
    }
}
