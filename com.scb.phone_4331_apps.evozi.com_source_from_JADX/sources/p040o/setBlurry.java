package p040o;

import com.scb.phone.presentation.presenter.emailverification.EmailOtpPresenter;
import p040o.getUsable;
import p040o.writeUInt64NoTag;

/* renamed from: o.setBlurry */
public final /* synthetic */ class setBlurry implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ EmailOtpPresenter.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setBlurry(EmailOtpPresenter.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getUsable.IconCompatParcelizer) obj).write(EmailOtpPresenter.this.read);
    }
}
