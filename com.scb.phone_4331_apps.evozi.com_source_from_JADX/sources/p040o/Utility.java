package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.Utility */
public final /* synthetic */ class Utility implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX read;

    public /* synthetic */ Utility(getPosX getposx) {
        this.read = getposx;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPosX getposx = this.read;
        RttiJsonPassport rttiJsonPassport = (RttiJsonPassport) obj;
        rttiJsonPassport.MediaBrowserCompat$CustomActionResultReceiver(getposx.IconCompatParcelizer);
        rttiJsonPassport.IconCompatParcelizer(getposx.IconCompatParcelizer);
        rttiJsonPassport.MediaMetadataCompat(getposx.IconCompatParcelizer);
        rttiJsonPassport.MediaBrowserCompat$ItemReceiver(getposx.IconCompatParcelizer);
        rttiJsonPassport.write(getposx.IconCompatParcelizer);
        rttiJsonPassport.read(getposx.IconCompatParcelizer);
        rttiJsonPassport.MediaBrowserCompat$SearchResultReceiver(getposx.IconCompatParcelizer);
        rttiJsonPassport.MediaDescriptionCompat(getposx.IconCompatParcelizer);
    }
}
