package p040o;

import com.scb.phone.presentation.presenter.emailverification.EmailOtpPresenter;
import p040o.getUsable;
import p040o.writeUInt64NoTag;

/* renamed from: o.isShadowed */
public final /* synthetic */ class isShadowed implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ EmailOtpPresenter read;

    public /* synthetic */ isShadowed(EmailOtpPresenter emailOtpPresenter) {
        this.read = emailOtpPresenter;
    }

    public final void IconCompatParcelizer(Object obj) {
        EmailOtpPresenter emailOtpPresenter = this.read;
        ((getUsable.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(emailOtpPresenter.read, emailOtpPresenter.MediaDescriptionCompat, emailOtpPresenter.MediaBrowserCompat$SearchResultReceiver);
    }
}
