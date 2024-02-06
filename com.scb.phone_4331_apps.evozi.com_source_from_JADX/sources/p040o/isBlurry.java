package p040o;

import com.scb.phone.presentation.presenter.emailverification.EmailOtpPresenter$MediaBrowserCompat$ItemReceiver;
import p040o.getUsable;
import p040o.writeUInt64NoTag;

/* renamed from: o.isBlurry */
public final /* synthetic */ class isBlurry implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ EmailOtpPresenter$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ isBlurry(EmailOtpPresenter$MediaBrowserCompat$ItemReceiver emailOtpPresenter$MediaBrowserCompat$ItemReceiver) {
        this.read = emailOtpPresenter$MediaBrowserCompat$ItemReceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getUsable.IconCompatParcelizer) obj).read(this.read.MediaBrowserCompat$CustomActionResultReceiver.read);
    }
}
