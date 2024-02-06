package p040o;

import java.util.ArrayList;
import p040o.writeUInt64NoTag;

/* renamed from: o.dumpBitmapSize */
public final /* synthetic */ class dumpBitmapSize implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ listNativeSessionFileDirectories IconCompatParcelizer;
    private final /* synthetic */ CustomAdvertisingIdClient read;

    public /* synthetic */ dumpBitmapSize(CustomAdvertisingIdClient customAdvertisingIdClient, listNativeSessionFileDirectories listnativesessionfiledirectories) {
        this.read = customAdvertisingIdClient;
        this.IconCompatParcelizer = listnativesessionfiledirectories;
    }

    public final void IconCompatParcelizer(Object obj) {
        CustomAdvertisingIdClient customAdvertisingIdClient = this.read;
        listNativeSessionFileDirectories listnativesessionfiledirectories = this.IconCompatParcelizer;
        ((LookAndFeelParameters_Factory) obj).write(customAdvertisingIdClient.read.get(listnativesessionfiledirectories.read.read), new ArrayList(listnativesessionfiledirectories.read.IconCompatParcelizer.values()), getPageID$MediaBrowserCompat$ItemReceiver.EDUCATION_LEVEL);
    }
}
