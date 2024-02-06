package p040o;

import java.util.ArrayList;
import p040o.writeUInt64NoTag;

/* renamed from: o.getInterimImageFileFormat */
public final /* synthetic */ class getInterimImageFileFormat implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ listNativeSessionFileDirectories MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CustomAdvertisingIdClient read;

    public /* synthetic */ getInterimImageFileFormat(CustomAdvertisingIdClient customAdvertisingIdClient, listNativeSessionFileDirectories listnativesessionfiledirectories) {
        this.read = customAdvertisingIdClient;
        this.MediaBrowserCompat$CustomActionResultReceiver = listnativesessionfiledirectories;
    }

    public final void IconCompatParcelizer(Object obj) {
        CustomAdvertisingIdClient customAdvertisingIdClient = this.read;
        listNativeSessionFileDirectories listnativesessionfiledirectories = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((LookAndFeelParameters_Factory) obj).write(customAdvertisingIdClient.f2846x50fd9e4a.get(listnativesessionfiledirectories.write.read), new ArrayList(listnativesessionfiledirectories.write.IconCompatParcelizer.values()), getPageID$MediaBrowserCompat$ItemReceiver.RESIDENCE_TYPE);
    }
}
