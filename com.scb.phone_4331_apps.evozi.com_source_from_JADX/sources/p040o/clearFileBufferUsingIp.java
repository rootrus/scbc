package p040o;

import p040o.setDomain;
import p040o.writeUInt64NoTag;

/* renamed from: o.clearFileBufferUsingIp */
public final /* synthetic */ class clearFileBufferUsingIp implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setDomain.read write;

    public /* synthetic */ clearFileBufferUsingIp(setDomain.read read) {
        this.write = read;
    }

    public final void IconCompatParcelizer(Object obj) {
        setDomain.read read = this.write;
        ExtractionParameters_Factory extractionParameters_Factory = (ExtractionParameters_Factory) obj;
        extractionParameters_Factory.MediaBrowserCompat$CustomActionResultReceiver(setDomain.this.MediaBrowserCompat$ItemReceiver, setDomain.this.MediaDescriptionCompat.read.MediaBrowserCompat$SearchResultReceiver());
        extractionParameters_Factory.MediaBrowserCompat$CustomActionResultReceiver(false);
    }
}
