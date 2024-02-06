package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDataFormat */
public final /* synthetic */ class getDataFormat implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setBearing IconCompatParcelizer;
    private final /* synthetic */ getMappingFileId read;
    private final /* synthetic */ getInputDocShortEdge write;

    public /* synthetic */ getDataFormat(getInputDocShortEdge getinputdocshortedge, setBearing setbearing, getMappingFileId getmappingfileid) {
        this.write = getinputdocshortedge;
        this.IconCompatParcelizer = setbearing;
        this.read = getmappingfileid;
    }

    public final void IconCompatParcelizer(Object obj) {
        setBearing setbearing = this.IconCompatParcelizer;
        ((CheckExtractActivity_MembersInjector.Keep) obj).IconCompatParcelizer(new submitTask(setbearing.write, setbearing.MediaBrowserCompat$ItemReceiver, this.read));
    }
}
