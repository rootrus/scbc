package p040o;

import com.scb.phone.presentation.presenter.investment.accountdetail.ScbsAccountDetailPresenter;
import p040o.access$2300;
import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.setDocumentNote */
public final /* synthetic */ class setDocumentNote implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ScbsAccountDetailPresenter MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ setDocumentNote(ScbsAccountDetailPresenter scbsAccountDetailPresenter, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = scbsAccountDetailPresenter;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        ScbsAccountDetailPresenter scbsAccountDetailPresenter = this.MediaBrowserCompat$ItemReceiver;
        ((getMicrAmount.read) obj).write(scbsAccountDetailPresenter.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS));
    }
}
