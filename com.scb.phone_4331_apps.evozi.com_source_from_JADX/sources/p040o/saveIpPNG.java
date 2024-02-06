package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.saveIpPNG */
public final /* synthetic */ class saveIpPNG implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getNonFatalSessionFilesDir MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ KofaxWebServiceObjectBase read;

    public /* synthetic */ saveIpPNG(KofaxWebServiceObjectBase kofaxWebServiceObjectBase, getNonFatalSessionFilesDir getnonfatalsessionfilesdir) {
        this.read = kofaxWebServiceObjectBase;
        this.MediaBrowserCompat$CustomActionResultReceiver = getnonfatalsessionfilesdir;
    }

    public final void IconCompatParcelizer(Object obj) {
        KofaxWebServiceObjectBase kofaxWebServiceObjectBase = this.read;
        getNonFatalSessionFilesDir getnonfatalsessionfilesdir = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((C6978x206b8e03) obj).MediaBrowserCompat$CustomActionResultReceiver(getnonfatalsessionfilesdir.write, kofaxWebServiceObjectBase.write.read(getnonfatalsessionfilesdir.read, getnonfatalsessionfilesdir.MediaBrowserCompat$CustomActionResultReceiver), kofaxWebServiceObjectBase.write.read(getnonfatalsessionfilesdir.read, kofaxWebServiceObjectBase.IconCompatParcelizer.read.MediaBrowserCompat$SearchResultReceiver()));
    }
}
