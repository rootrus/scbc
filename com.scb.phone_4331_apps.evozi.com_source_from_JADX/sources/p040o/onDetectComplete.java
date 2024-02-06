package p040o;

import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;
import com.scb.phone.view.custom.common.EditTextDecorator;

/* renamed from: o.onDetectComplete */
public final /* synthetic */ class onDetectComplete implements EditTextDecorator.IconCompatParcelizer {
    private final /* synthetic */ MwBusinessDetailsActivity read;

    public /* synthetic */ onDetectComplete(MwBusinessDetailsActivity mwBusinessDetailsActivity) {
        this.read = mwBusinessDetailsActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.read.MediaSessionCompat$ResultReceiverWrapper.onNext(Boolean.valueOf(z));
    }
}
