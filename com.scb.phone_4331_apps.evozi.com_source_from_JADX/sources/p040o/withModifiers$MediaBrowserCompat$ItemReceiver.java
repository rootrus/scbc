package p040o;

import p040o.access$2300;

/* renamed from: o.withModifiers$MediaBrowserCompat$ItemReceiver */
public class withModifiers$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<checkLocationSettings> {
    private /* synthetic */ withModifiers MediaBrowserCompat$CustomActionResultReceiver;

    private withModifiers$MediaBrowserCompat$ItemReceiver(withModifiers withmodifiers) {
        this.MediaBrowserCompat$CustomActionResultReceiver = withmodifiers;
    }

    public /* synthetic */ withModifiers$MediaBrowserCompat$ItemReceiver(withModifiers withmodifiers, byte b) {
        this(withmodifiers);
    }

    public final /* synthetic */ void onNext(Object obj) {
        checkLocationSettings checklocationsettings = (checkLocationSettings) obj;
        super.onNext(checklocationsettings);
        isIntact unused = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.read.AppCompatActivity();
        boolean itemInvoker = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.read.setItemInvoker();
        ComponentRuntime$$Lambda$5 read = ComponentRuntime$$Lambda$5.read();
        read.MediaBrowserCompat$MediaItem = "ORDER_CHEQUE_FUNCTION";
        read.MediaDescriptionCompat = checklocationsettings.MediaMetadataCompat;
        read.MediaBrowserCompat$ItemReceiver = checklocationsettings.write;
        read.MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(checklocationsettings.MediaBrowserCompat$ItemReceiver, itemInvoker);
        read.read = isIntact.write(Double.valueOf(checklocationsettings.MediaBrowserCompat$CustomActionResultReceiver));
        read.write = checklocationsettings.read;
        read.IconCompatParcelizer = checklocationsettings.IconCompatParcelizer;
        withModifiers withmodifiers = this.MediaBrowserCompat$CustomActionResultReceiver;
        excludeClass excludeclass = new excludeClass(read);
        if (withmodifiers.RatingCompat != null) {
            excludeclass.IconCompatParcelizer(withmodifiers.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        super.MediaBrowserCompat$ItemReceiver();
        withModifiers.MediaMetadataCompat(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void onError(Throwable th) {
        super.onError(th);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final void onComplete() {
        super.onComplete();
        withModifiers.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
