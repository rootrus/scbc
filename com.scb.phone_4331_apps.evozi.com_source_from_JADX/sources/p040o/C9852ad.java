package p040o;

import com.scb.phone.domain.interactor.PinCase;

/* renamed from: o.ad */
public final /* synthetic */ class C9852ad implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ OcrEventListener IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C9852ad(OcrEventListener ocrEventListener, String str) {
        this.IconCompatParcelizer = ocrEventListener;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final Object write(Object obj) {
        OcrEventListener ocrEventListener = this.IconCompatParcelizer;
        String str = this.MediaBrowserCompat$ItemReceiver;
        PinCase pinCase = ocrEventListener.IconCompatParcelizer;
        return DebitCardResetOtpActivity.fromCallable(new target(pinCase, str)).map(new CameraPosition(pinCase)).flatMap(new fromResource(pinCase)).doOnNext(new bearing(pinCase));
    }
}
