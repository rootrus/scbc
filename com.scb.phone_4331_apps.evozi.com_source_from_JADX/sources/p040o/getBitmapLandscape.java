package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getBitmapLandscape */
public final /* synthetic */ class getBitmapLandscape implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX$MediaBrowserCompat$CustomActionResultReceiver write;

    public /* synthetic */ getBitmapLandscape(getPosX$MediaBrowserCompat$CustomActionResultReceiver getposx_mediabrowsercompat_customactionresultreceiver) {
        this.write = getposx_mediabrowsercompat_customactionresultreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPosX$MediaBrowserCompat$CustomActionResultReceiver getposx_mediabrowsercompat_customactionresultreceiver = this.write;
        RttiJsonPassport rttiJsonPassport = (RttiJsonPassport) obj;
        rttiJsonPassport.write(getposx_mediabrowsercompat_customactionresultreceiver.read.IconCompatParcelizer.write);
        getPosX.MediaBrowserCompat$SearchResultReceiver(getposx_mediabrowsercompat_customactionresultreceiver.read);
        rttiJsonPassport.read();
    }
}
