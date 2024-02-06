package p040o;

import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;
import com.scb.phone.view.custom.common.EditTextDecorator;

/* renamed from: o.PaFaceLogger */
public final /* synthetic */ class PaFaceLogger implements EditTextDecorator.IconCompatParcelizer {
    private final /* synthetic */ MwBusinessDetailsActivity IconCompatParcelizer;

    public /* synthetic */ PaFaceLogger(MwBusinessDetailsActivity mwBusinessDetailsActivity) {
        this.IconCompatParcelizer = mwBusinessDetailsActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.IconCompatParcelizer.PlaybackStateCompat.onNext(Boolean.valueOf(z));
    }
}
