package p040o;

import com.scb.phone.domain.interactor.PinCase;

/* renamed from: o.fF */
public final /* synthetic */ class C9929fF implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C4400fO write;

    public /* synthetic */ C9929fF(C4400fO fOVar, String str) {
        this.write = fOVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final Object write(Object obj) {
        C4400fO fOVar = this.write;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        PinCase pinCase = fOVar.read;
        return DebitCardResetOtpActivity.fromCallable(new Cap(pinCase, str)).map(new fillColor(pinCase)).flatMap(new ButtCap(pinCase));
    }
}
