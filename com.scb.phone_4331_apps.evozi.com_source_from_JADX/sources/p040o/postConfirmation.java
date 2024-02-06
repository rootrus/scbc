package p040o;

import p040o.verifyReferral;

/* renamed from: o.postConfirmation */
public final /* synthetic */ class postConfirmation implements verifyReferral.IconCompatParcelizer {
    private final /* synthetic */ getRow MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ postConfirmation(getRow getrow) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getrow;
    }

    public final void IconCompatParcelizer() {
        getRow getrow = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getrow.RatingCompat != null) {
            getrow.RatingCompat.aj_();
        }
    }
}
