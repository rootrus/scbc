package p040o;

import com.scb.phone.presentation.presenter.emailverification.ManageEmailInputPresenter;
import p040o.writeUInt64NoTag;

/* renamed from: o.setUndersaturated */
public final /* synthetic */ class setUndersaturated implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ManageEmailInputPresenter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ boolean read;

    public /* synthetic */ setUndersaturated(ManageEmailInputPresenter manageEmailInputPresenter, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = manageEmailInputPresenter;
        this.read = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ManageEmailInputPresenter manageEmailInputPresenter = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getRestrictiveEndorsementPresent) obj).IconCompatParcelizer(manageEmailInputPresenter.MediaBrowserCompat$ItemReceiver, this.read);
    }
}
