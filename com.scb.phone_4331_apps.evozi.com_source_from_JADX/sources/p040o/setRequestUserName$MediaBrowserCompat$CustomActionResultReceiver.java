package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setRequestUserName$MediaBrowserCompat$CustomActionResultReceiver */
public final class setRequestUserName$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractor> {
    private /* synthetic */ populateFramesList IconCompatParcelizer;
    private /* synthetic */ setRequestUserName MediaBrowserCompat$CustomActionResultReceiver;

    public setRequestUserName$MediaBrowserCompat$CustomActionResultReceiver(populateFramesList populateframeslist, setRequestUserName setrequestusername) {
        this.IconCompatParcelizer = populateframeslist;
        this.MediaBrowserCompat$CustomActionResultReceiver = setrequestusername;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        PassportExtractor passportExtractor = (PassportExtractor) obj;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver.write.write.read() != null) {
            passportExtractor.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
        } else {
            passportExtractor.write(this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
        }
    }
}
