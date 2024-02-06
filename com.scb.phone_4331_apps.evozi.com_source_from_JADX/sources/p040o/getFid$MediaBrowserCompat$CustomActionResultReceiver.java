package p040o;

import java.util.List;
import p040o.zzdy;

/* renamed from: o.getFid$MediaBrowserCompat$CustomActionResultReceiver */
public final class getFid$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<zzdy.zze>> {
    final /* synthetic */ getFid IconCompatParcelizer;

    private getFid$MediaBrowserCompat$CustomActionResultReceiver(getFid getfid) {
        this.IconCompatParcelizer = getfid;
    }

    public /* synthetic */ getFid$MediaBrowserCompat$CustomActionResultReceiver(getFid getfid, byte b) {
        this(getfid);
    }

    public final /* synthetic */ void onNext(Object obj) {
        getFid getfid = this.IconCompatParcelizer;
        RandomFidGenerator randomFidGenerator = new RandomFidGenerator(this, (List) obj);
        if (getfid.RatingCompat != null) {
            randomFidGenerator.IconCompatParcelizer(getfid.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        boolean z = true;
        if ((this.IconCompatParcelizer.RatingCompat != null) && !this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            getFid getfid = this.IconCompatParcelizer;
            FirebaseInstanceIdInternal firebaseInstanceIdInternal = FirebaseInstanceIdInternal.write;
            if (getfid.RatingCompat == null) {
                z = false;
            }
            if (z) {
                firebaseInstanceIdInternal.IconCompatParcelizer(getfid.RatingCompat);
            }
        }
    }
}
