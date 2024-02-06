package p040o;

import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.access$2300;

/* renamed from: o.showFocusAreas$MediaBrowserCompat$ItemReceiver */
public class showFocusAreas$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setPanningGesturesEnabled> {
    private AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ showFocusAreas MediaMetadataCompat;
    private String read;
    private String write;

    public final /* synthetic */ void onNext(Object obj) {
        setUuidFromUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaMetadataCompat.read.MediaBrowserCompat$CustomActionResultReceiver((setPanningGesturesEnabled) obj, this.MediaBrowserCompat$ItemReceiver, this.write, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, this.read, this.MediaMetadataCompat.MediaBrowserCompat$MediaItem.IconCompatParcelizer.setItemInvoker());
        showFocusAreas.read(this.MediaMetadataCompat);
        boolean z = true;
        if (this.MediaMetadataCompat.RatingCompat != null) {
            showFocusAreas showfocusareas = this.MediaMetadataCompat;
            C10016ib ibVar = new C10016ib(MediaBrowserCompat$CustomActionResultReceiver2);
            if (showfocusareas.RatingCompat == null) {
                z = false;
            }
            if (z) {
                ibVar.IconCompatParcelizer(showfocusareas.RatingCompat);
            }
        }
    }

    public showFocusAreas$MediaBrowserCompat$ItemReceiver(showFocusAreas showfocusareas, AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 r2, String str, AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder builder, String str2, String str3) {
        this.MediaMetadataCompat = showfocusareas;
        this.MediaBrowserCompat$ItemReceiver = r2;
        this.write = str;
        this.IconCompatParcelizer = builder;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = str3;
    }

    public final void onError(Throwable th) {
        this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
