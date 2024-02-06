package p040o;

import com.scb.phone.presentation.presenter.emailverification.EmailOtpPresenter;
import p040o.getUsable;
import p040o.writeUInt64NoTag;
import p040o.zzbc;

/* renamed from: o.setLowContrastBackground */
public final /* synthetic */ class setLowContrastBackground implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ EmailOtpPresenter.write MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ zzbc.zze write;

    public /* synthetic */ setLowContrastBackground(EmailOtpPresenter.write write2, zzbc.zze zze) {
        this.MediaBrowserCompat$ItemReceiver = write2;
        this.write = zze;
    }

    public final void IconCompatParcelizer(Object obj) {
        EmailOtpPresenter.write write2 = this.MediaBrowserCompat$ItemReceiver;
        ((getUsable.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(EmailOtpPresenter.this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(this.write));
    }
}
