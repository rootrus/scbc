package p040o;

import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;
import com.scb.phone.view.custom.common.EditTextDecorator;

/* renamed from: o.onInterruptError */
public final /* synthetic */ class onInterruptError implements EditTextDecorator.IconCompatParcelizer {
    private final /* synthetic */ MwBusinessDetailsActivity write;

    public /* synthetic */ onInterruptError(MwBusinessDetailsActivity mwBusinessDetailsActivity) {
        this.write = mwBusinessDetailsActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.write.MediaBrowserCompat$SearchResultReceiver.onNext(Boolean.valueOf(z));
    }
}
