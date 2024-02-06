package p040o;

import java.util.List;
import p040o.RegularImmutableMap;
import p040o.access$2300;

/* renamed from: o.nativeGetDocument$MediaBrowserCompat$ItemReceiver */
public final class nativeGetDocument$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getStrokeJointType> {
    private /* synthetic */ nativeGetDocument read;

    private nativeGetDocument$MediaBrowserCompat$ItemReceiver(nativeGetDocument nativegetdocument) {
        this.read = nativegetdocument;
    }

    public /* synthetic */ nativeGetDocument$MediaBrowserCompat$ItemReceiver(nativeGetDocument nativegetdocument, byte b) {
        this(nativegetdocument);
    }

    public final /* synthetic */ void onNext(Object obj) {
        getStrokeJointType getstrokejointtype = (getStrokeJointType) obj;
        super.onNext(getstrokejointtype);
        List<setSnippet> list = getstrokejointtype.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            RegularImmutableMap.NonTerminalEntry unused = this.read.read;
            List<Out> MediaBrowserCompat$ItemReceiver = RegularImmutableMap.NonTerminalEntry.MediaBrowserCompat$ItemReceiver(list, new adornProjectedBoundary(this.read.read));
            nativeGetDocument nativegetdocument = this.read;
            XVrsFARDetector xVrsFARDetector = new XVrsFARDetector(MediaBrowserCompat$ItemReceiver);
            if (nativegetdocument.RatingCompat != null) {
                xVrsFARDetector.IconCompatParcelizer(nativegetdocument.RatingCompat);
            }
        }
    }

    public final void onError(Throwable th) {
        super.onError(th);
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final void onComplete() {
        super.onComplete();
        nativeGetDocument.write(this.read);
    }
}
