package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getHoldSteadyDelay */
public final /* synthetic */ class getHoldSteadyDelay implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getSteadyMessage read;

    public /* synthetic */ getHoldSteadyDelay(getSteadyMessage getsteadymessage) {
        this.read = getsteadymessage;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        getMicrAmount$MediaBrowserCompat$SearchResultReceiver getmicramount_mediabrowsercompat_searchresultreceiver = (getMicrAmount$MediaBrowserCompat$SearchResultReceiver) obj;
        zzwi write = this.read.read.MediaBrowserCompat$ItemReceiver.write();
        if (write != null) {
            str = write.MediaDescriptionCompat;
        } else {
            str = null;
        }
        getmicramount_mediabrowsercompat_searchresultreceiver.write(str);
    }
}
