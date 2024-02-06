package p040o;

import java.util.List;

/* renamed from: o.defaultSettings$MediaBrowserCompat$CustomActionResultReceiver */
public final class defaultSettings$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzvr> {
    final /* synthetic */ defaultSettings MediaBrowserCompat$CustomActionResultReceiver;

    private defaultSettings$MediaBrowserCompat$CustomActionResultReceiver(defaultSettings defaultsettings) {
        this.MediaBrowserCompat$CustomActionResultReceiver = defaultsettings;
    }

    public /* synthetic */ defaultSettings$MediaBrowserCompat$CustomActionResultReceiver(defaultSettings defaultsettings, byte b) {
        this(defaultsettings);
    }

    public final /* synthetic */ void onNext(Object obj) {
        zzvr zzvr = (zzvr) obj;
        boolean unused = this.MediaBrowserCompat$CustomActionResultReceiver.write = false;
        boolean z = true;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat != null) {
            defaultSettings defaultsettings = this.MediaBrowserCompat$CustomActionResultReceiver;
            entriesOnlyOnLeft unused2 = defaultsettings.read;
            List unused3 = defaultsettings.IconCompatParcelizer = entriesOnlyOnLeft.MediaBrowserCompat$ItemReceiver(zzvr.MediaBrowserCompat$CustomActionResultReceiver, new Report(this));
            defaultSettings defaultsettings2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            getCustomHeaders getcustomheaders = new getCustomHeaders(this);
            if (defaultsettings2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getcustomheaders.IconCompatParcelizer(defaultsettings2.RatingCompat);
            }
        }
    }

    public final void onComplete() {
        defaultSettings.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        defaultSettings.write(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void onError(Throwable th) {
        boolean unused = this.MediaBrowserCompat$CustomActionResultReceiver.write = false;
        boolean z = true;
        if ((this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat != null) && !this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            defaultSettings.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            defaultSettings defaultsettings = this.MediaBrowserCompat$CustomActionResultReceiver;
            NativeSessionReport nativeSessionReport = NativeSessionReport.write;
            if (defaultsettings.RatingCompat == null) {
                z = false;
            }
            if (z) {
                nativeSessionReport.IconCompatParcelizer(defaultsettings.RatingCompat);
            }
        }
    }
}
