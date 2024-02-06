package p040o;

import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;
import com.scb.phone.view.custom.common.EditTextDecorator;

/* renamed from: o.onDetectTips */
public final /* synthetic */ class onDetectTips implements EditTextDecorator.IconCompatParcelizer {
    private final /* synthetic */ MwBusinessDetailsActivity IconCompatParcelizer;

    public /* synthetic */ onDetectTips(MwBusinessDetailsActivity mwBusinessDetailsActivity) {
        this.IconCompatParcelizer = mwBusinessDetailsActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.IconCompatParcelizer.Keep.onNext(Boolean.valueOf(z));
    }
}
