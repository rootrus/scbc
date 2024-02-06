package p040o;

import java.util.ArrayList;
import p040o.writeUInt64NoTag;

/* renamed from: o.exifTimeToDate */
public final /* synthetic */ class exifTimeToDate implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CustomAdvertisingIdClient MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ listNativeSessionFileDirectories write;

    public /* synthetic */ exifTimeToDate(CustomAdvertisingIdClient customAdvertisingIdClient, listNativeSessionFileDirectories listnativesessionfiledirectories) {
        this.MediaBrowserCompat$ItemReceiver = customAdvertisingIdClient;
        this.write = listnativesessionfiledirectories;
    }

    public final void IconCompatParcelizer(Object obj) {
        CustomAdvertisingIdClient customAdvertisingIdClient = this.MediaBrowserCompat$ItemReceiver;
        listNativeSessionFileDirectories listnativesessionfiledirectories = this.write;
        ((LookAndFeelParameters_Factory) obj).write(customAdvertisingIdClient.MediaSessionCompat$Token.get(listnativesessionfiledirectories.IconCompatParcelizer.read), new ArrayList(listnativesessionfiledirectories.IconCompatParcelizer.IconCompatParcelizer.values()), getPageID$MediaBrowserCompat$ItemReceiver.MARITAL_STATUS);
    }
}
