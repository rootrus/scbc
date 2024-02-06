package p040o;

import com.scb.phone.domain.interactor.PinCase;
import p040o.C4400fO;
import p040o.writeUInt64NoTag;

/* renamed from: o.ew */
public final /* synthetic */ class C9920ew implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4400fO.C44024 IconCompatParcelizer;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ C9920ew(C4400fO.C44024 r1, Throwable th) {
        this.IconCompatParcelizer = r1;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4400fO.C44024 r0 = this.IconCompatParcelizer;
        Throwable th = this.read;
        C4400fO.MediaBrowserCompat$CustomActionResultReceiver(C4400fO.this);
        ((getBlackStreakCount) obj).IconCompatParcelizer(((PinCase.PinIncorrectException) th).MediaBrowserCompat$CustomActionResultReceiver);
    }
}
