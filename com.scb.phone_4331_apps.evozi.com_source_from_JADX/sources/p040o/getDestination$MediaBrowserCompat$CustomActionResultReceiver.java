package p040o;

import p040o.CrashlyticsCore;
import p040o.getDeviceArchitecture;

/* renamed from: o.getDestination$MediaBrowserCompat$CustomActionResultReceiver */
public class getDestination$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<isLocationAvailable> {
    final /* synthetic */ getDestination MediaBrowserCompat$CustomActionResultReceiver;

    public getDestination$MediaBrowserCompat$CustomActionResultReceiver(getDestination getdestination) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getdestination;
    }

    public final /* synthetic */ void onNext(Object obj) {
        isLocationAvailable islocationavailable = (isLocationAvailable) obj;
        SingletonImmutableSet singletonImmutableSet = this.MediaBrowserCompat$CustomActionResultReceiver.write;
        LocationCallback MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        CrashlyticsCore.C32494.write write = CrashlyticsCore.C32494.write();
        write.IconCompatParcelizer = MediaBrowserCompat$CustomActionResultReceiver2;
        hasLocationAvailability haslocationavailability = islocationavailable.write;
        getDeviceArchitecture.read read = getDeviceArchitecture.read();
        read.MediaBrowserCompat$ItemReceiver = haslocationavailability.MediaBrowserCompat$CustomActionResultReceiver;
        read.read = haslocationavailability.MediaBrowserCompat$ItemReceiver;
        read.write = haslocationavailability.IconCompatParcelizer;
        boolean z = false;
        write.read = new getDeviceArchitecture(read, (byte) 0);
        write.MediaBrowserCompat$ItemReceiver = singletonImmutableSet.write(islocationavailable.MediaBrowserCompat$ItemReceiver, true);
        CrashlyticsCore.C32494 r6 = new CrashlyticsCore.C32494(write, (byte) 0);
        getDestination getdestination = this.MediaBrowserCompat$CustomActionResultReceiver;
        isMasked ismasked = new isMasked(r6);
        if (getdestination.RatingCompat != null) {
            z = true;
        }
        if (z) {
            ismasked.IconCompatParcelizer(getdestination.RatingCompat);
        }
    }

    static /* synthetic */ void write(CrashlyticsCore.C32494 r0, getHorizontalStreaks gethorizontalstreaks) {
        gethorizontalstreaks.aj_();
        gethorizontalstreaks.MediaBrowserCompat$ItemReceiver(r0);
    }

    public final void onError(Throwable th) {
        getDestination getdestination = this.MediaBrowserCompat$CustomActionResultReceiver;
        isBatchClassIndexField isbatchclassindexfield = new isBatchClassIndexField(this, th);
        if (getdestination.RatingCompat != null) {
            isbatchclassindexfield.IconCompatParcelizer(getdestination.RatingCompat);
        }
    }
}
