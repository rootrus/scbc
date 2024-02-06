package p040o;

import com.scb.phone.domain.interactor.PinCase;
import p040o.CameraPosition;

/* renamed from: o.fJ */
public final /* synthetic */ class C9931fJ implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String read;
    private final /* synthetic */ C4400fO write;

    public /* synthetic */ C9931fJ(C4400fO fOVar, String str, String str2) {
        this.write = fOVar;
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }

    public final Object write(Object obj) {
        C4400fO fOVar = this.write;
        String str = this.read;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        PinCase pinCase = fOVar.read;
        return DebitCardResetOtpActivity.fromCallable(new zoom(pinCase, str, str2)).map(new CameraPosition.Builder(pinCase)).flatMap(new center(pinCase));
    }
}
