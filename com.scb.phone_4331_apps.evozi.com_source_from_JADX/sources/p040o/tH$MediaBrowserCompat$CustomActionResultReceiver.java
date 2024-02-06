package p040o;

import java.util.List;

/* renamed from: o.tH$MediaBrowserCompat$CustomActionResultReceiver */
public final class tH$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanoramaFragment>> {
    private /* synthetic */ C7500tH IconCompatParcelizer;

    private tH$MediaBrowserCompat$CustomActionResultReceiver(C7500tH tHVar) {
        this.IconCompatParcelizer = tHVar;
    }

    public /* synthetic */ tH$MediaBrowserCompat$CustomActionResultReceiver(C7500tH tHVar, byte b) {
        this(tHVar);
    }

    public final void onError(Throwable th) {
        C7500tH tHVar = this.IconCompatParcelizer;
        startActivityForResult_aroundBody8 startactivityforresult_aroundbody8 = startActivityForResult_aroundBody8.write;
        if (tHVar.RatingCompat != null) {
            startactivityforresult_aroundbody8.IconCompatParcelizer(tHVar.RatingCompat);
        }
    }

    public final /* synthetic */ void onNext(Object obj) {
        C7500tH tHVar = this.IconCompatParcelizer;
        startActivityForResult_aroundBody8 startactivityforresult_aroundbody8 = startActivityForResult_aroundBody8.write;
        if (tHVar.RatingCompat != null) {
            startactivityforresult_aroundbody8.IconCompatParcelizer(tHVar.RatingCompat);
        }
    }
}
