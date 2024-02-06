package p040o;

import java.util.List;
import p040o.ConstructorConstructor;
import p040o.StreetViewPanorama;
import p040o.access$2300;

/* renamed from: o.ConstructorConstructor$6$MediaBrowserCompat$ItemReceiver */
public final class ConstructorConstructor$6$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanorama.OnStreetViewPanoramaLongClickListener>> {
    private /* synthetic */ ConstructorConstructor.C32066 MediaBrowserCompat$CustomActionResultReceiver;

    private ConstructorConstructor$6$MediaBrowserCompat$ItemReceiver(ConstructorConstructor.C32066 r1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final /* synthetic */ void onNext(Object obj) {
        List list = (List) obj;
        if ((this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat != null) && list != null) {
            ConstructorConstructor.C32066.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            int unused = this.MediaBrowserCompat$CustomActionResultReceiver.write = list.size();
            this.MediaBrowserCompat$CustomActionResultReceiver.read.write("DISPLAY_ISSUE_CHEQUE");
            this.MediaBrowserCompat$CustomActionResultReceiver.read.IconCompatParcelizer(new C3211xc959795f(this.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    public final void onError(Throwable th) {
        ConstructorConstructor.C32066.write(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
