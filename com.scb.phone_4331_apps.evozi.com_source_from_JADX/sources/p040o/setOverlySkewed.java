package p040o;

import com.scb.phone.presentation.presenter.emailverification.ManageEmailInputPresenter;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.setOverlySkewed */
public final /* synthetic */ class setOverlySkewed implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ManageEmailInputPresenter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ setOverlySkewed(ManageEmailInputPresenter manageEmailInputPresenter, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = manageEmailInputPresenter;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        ManageEmailInputPresenter manageEmailInputPresenter = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getRestrictiveEndorsementPresent) obj).write(manageEmailInputPresenter.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.JUST_DISMISS));
    }
}
