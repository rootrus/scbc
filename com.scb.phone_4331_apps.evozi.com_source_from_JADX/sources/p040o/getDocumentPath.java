package p040o;

import p040o.setDomain;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDocumentPath */
public final /* synthetic */ class getDocumentPath implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setDomain.write write;

    public /* synthetic */ getDocumentPath(setDomain.write write2) {
        this.write = write2;
    }

    public final void IconCompatParcelizer(Object obj) {
        setDomain.write write2 = this.write;
        ExtractionParameters_Factory extractionParameters_Factory = (ExtractionParameters_Factory) obj;
        extractionParameters_Factory.ActionMenuItemView();
        double unused = setDomain.this.MediaMetadataCompat = 0.0d;
        extractionParameters_Factory.setChecked();
        extractionParameters_Factory.setExpandedFormat();
        setDomain setdomain = setDomain.this;
        setdomain.IconCompatParcelizer(setdomain.MediaSessionCompat$QueueItem, 0);
        extractionParameters_Factory.MediaBrowserCompat$CustomActionResultReceiver(false);
        extractionParameters_Factory.MediaBrowserCompat$ItemReceiver();
    }
}
