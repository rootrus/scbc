package p040o;

import com.scb.phone.presentation.presenter.emailverification.EmailOtpPresenter;
import p040o.getUsable;
import p040o.writeUInt64NoTag;

/* renamed from: o.isMissingBorders */
public final /* synthetic */ class isMissingBorders implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ EmailOtpPresenter.read MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ isMissingBorders(EmailOtpPresenter.read read) {
        this.MediaBrowserCompat$ItemReceiver = read;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getUsable.IconCompatParcelizer) obj).read(EmailOtpPresenter.this.read);
    }
}
