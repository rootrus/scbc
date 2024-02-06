package p040o;

import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;
import com.scb.phone.view.custom.common.EditTextDecorator;

/* renamed from: o.OnAbsListener */
public final /* synthetic */ class OnAbsListener implements EditTextDecorator.IconCompatParcelizer {
    private final /* synthetic */ MwBusinessDetailsActivity IconCompatParcelizer;

    public /* synthetic */ OnAbsListener(MwBusinessDetailsActivity mwBusinessDetailsActivity) {
        this.IconCompatParcelizer = mwBusinessDetailsActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.IconCompatParcelizer.setHasDecor.onNext(Boolean.valueOf(z));
    }
}
