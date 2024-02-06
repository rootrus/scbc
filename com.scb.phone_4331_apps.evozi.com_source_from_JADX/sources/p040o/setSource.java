package p040o;

import p040o.getProject;
import p040o.writeUInt64NoTag;

/* renamed from: o.setSource */
public final /* synthetic */ class setSource implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getErr read;

    public /* synthetic */ setSource(getErr geterr) {
        this.read = geterr;
    }

    public final void IconCompatParcelizer(Object obj) {
        getErr geterr = this.read;
        getProject.read read2 = (getProject.read) obj;
        read2.write(read2.write() && (geterr.read || geterr.IconCompatParcelizer || geterr.MediaBrowserCompat$SearchResultReceiver || geterr.MediaMetadataCompat));
    }
}
