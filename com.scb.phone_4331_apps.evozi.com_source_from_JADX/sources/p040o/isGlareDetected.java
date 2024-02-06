package p040o;

import com.scb.phone.presentation.presenter.emailverification.EmailOtpPresenter;
import p040o.getUsable;
import p040o.writeUInt64NoTag;
import p040o.zzdy;

/* renamed from: o.isGlareDetected */
public final /* synthetic */ class isGlareDetected implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzdy.zzb IconCompatParcelizer;
    private final /* synthetic */ EmailOtpPresenter.read read;

    public /* synthetic */ isGlareDetected(EmailOtpPresenter.read read2, zzdy.zzb zzb) {
        this.read = read2;
        this.IconCompatParcelizer = zzb;
    }

    public final void IconCompatParcelizer(Object obj) {
        EmailOtpPresenter.read read2 = this.read;
        zzdy.zzb zzb = this.IconCompatParcelizer;
        ((getUsable.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(EmailOtpPresenter.this.read, zzb.IconCompatParcelizer, zzb.write);
    }
}
