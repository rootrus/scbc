package p040o;

import p040o.ImageProcessor;
import p040o.IsgPassportDetector;

/* renamed from: o.IsgPassportDetector$a$MediaBrowserCompat$CustomActionResultReceiver */
public class C9771x3ae934ff extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<String> {
    final /* synthetic */ IsgPassportDetector.C3516a IconCompatParcelizer;

    private C9771x3ae934ff(IsgPassportDetector.C3516a aVar) {
        this.IconCompatParcelizer = aVar;
    }

    public /* synthetic */ C9771x3ae934ff(IsgPassportDetector.C3516a aVar, byte b) {
        this(aVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        super.onNext((String) obj);
        IsgPassportDetector.C3516a aVar = this.IconCompatParcelizer;
        C10100p pVar = C10100p.MediaBrowserCompat$ItemReceiver;
        if (aVar.RatingCompat != null) {
            pVar.IconCompatParcelizer(aVar.RatingCompat);
        }
    }

    static /* synthetic */ void IconCompatParcelizer(Check check) {
        check.aj_();
        check.IconCompatParcelizer();
    }

    public final void onError(Throwable th) {
        super.onError(th);
        IsgPassportDetector.C3516a aVar = this.IconCompatParcelizer;
        ImageProcessor.C3487d dVar = new ImageProcessor.C3487d(this, th);
        if (aVar.RatingCompat != null) {
            dVar.IconCompatParcelizer(aVar.RatingCompat);
        }
    }
}
