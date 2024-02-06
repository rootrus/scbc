package p040o;

import java.util.List;
import p040o.SortedMaps;
import p040o.access$2300;

/* renamed from: o.setGuidingLine$MediaBrowserCompat$CustomActionResultReceiver */
final class setGuidingLine$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<addAllLocationRequests> {
    final /* synthetic */ setGuidingLine MediaBrowserCompat$ItemReceiver;

    private setGuidingLine$MediaBrowserCompat$CustomActionResultReceiver(setGuidingLine setguidingline) {
        this.MediaBrowserCompat$ItemReceiver = setguidingline;
    }

    /* synthetic */ setGuidingLine$MediaBrowserCompat$CustomActionResultReceiver(setGuidingLine setguidingline, byte b) {
        this(setguidingline);
    }

    public final /* synthetic */ void onNext(Object obj) {
        addAllLocationRequests addalllocationrequests = (addAllLocationRequests) obj;
        setGuidingLine.RatingCompat(this.MediaBrowserCompat$ItemReceiver);
        boolean z = true;
        if (this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) {
            setGuidingLine setguidingline = this.MediaBrowserCompat$ItemReceiver;
            determineFrom unused = setguidingline.MediaMetadataCompat = new determineFrom((List<waitForAutomaticDataCollectionEnabled>) SortedMaps.SortedMapDifferenceImpl.MediaBrowserCompat$ItemReceiver(addalllocationrequests.read, new C10904sortedMapDifference(setguidingline.f2942x50fd9e4a)));
            setGuidingLine setguidingline2 = this.MediaBrowserCompat$ItemReceiver;
            readBarcode readbarcode = new readBarcode(this);
            if (setguidingline2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                readbarcode.IconCompatParcelizer(setguidingline2.RatingCompat);
            }
        }
    }

    public final void onError(Throwable th) {
        setGuidingLine.read(this.MediaBrowserCompat$ItemReceiver);
        if (!this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }
}
