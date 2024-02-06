package p040o;

import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;

/* renamed from: o.OnPaFaceDetectorListener */
public final /* synthetic */ class OnPaFaceDetectorListener implements getRangeIndex$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ MwBusinessDetailsActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ OnPaFaceDetectorListener(MwBusinessDetailsActivity mwBusinessDetailsActivity) {
        this.MediaBrowserCompat$ItemReceiver = mwBusinessDetailsActivity;
    }

    public final void write(Object obj) {
        MwBusinessDetailsActivity mwBusinessDetailsActivity = this.MediaBrowserCompat$ItemReceiver;
        getNdkPayload getndkpayload = (getNdkPayload) obj;
        mwBusinessDetailsActivity.MediaSessionCompat$Token.read(getndkpayload);
        mwBusinessDetailsActivity.AlertController$RecycleListView.onNext(isSupportFragmentClass.read(getndkpayload));
    }
}
