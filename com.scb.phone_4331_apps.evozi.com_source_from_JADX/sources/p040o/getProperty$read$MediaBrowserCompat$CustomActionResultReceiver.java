package p040o;

import p040o.access$2300;
import p040o.getProperty;
import p040o.writeUInt64NoTag;

/* renamed from: o.getProperty$read$MediaBrowserCompat$CustomActionResultReceiver */
public final class getProperty$read$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Void> {
    private /* synthetic */ getProperty.read read;

    getProperty$read$MediaBrowserCompat$CustomActionResultReceiver(getProperty.read read2) {
        this.read = read2;
    }

    public final void onComplete() {
        super.onComplete();
        getProperty.write(this.read.MediaBrowserCompat$CustomActionResultReceiver);
        getProperty getproperty = this.read.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4632x455e6129.read;
        if (getproperty.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getproperty.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
