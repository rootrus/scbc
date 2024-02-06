package p040o;

import p040o.CrashlyticsReport;

/* renamed from: o.getImageBitmap */
public final /* synthetic */ class getImageBitmap implements findFragmentByWho {
    private final /* synthetic */ setBasicSettingsProfileUsed IconCompatParcelizer;

    public /* synthetic */ getImageBitmap(setBasicSettingsProfileUsed setbasicsettingsprofileused) {
        this.IconCompatParcelizer = setbasicsettingsprofileused;
    }

    public final Object IconCompatParcelizer(Object obj) {
        getResourcePackageName getresourcepackagename = (getResourcePackageName) obj;
        CrashlyticsReport.Session.Device write = CrashlyticsReport.Session.Device.write();
        write.MediaBrowserCompat$ItemReceiver = getresourcepackagename.ParcelableVolumeInfo;
        write.Keep = getresourcepackagename.MediaSessionCompat$Token;
        write.f2695x50fd9e4a = getresourcepackagename.MediaBrowserCompat$MediaItem;
        write.MediaSessionCompat$Token = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(getresourcepackagename.MediaBrowserCompat$MediaItem, false);
        return write;
    }
}
