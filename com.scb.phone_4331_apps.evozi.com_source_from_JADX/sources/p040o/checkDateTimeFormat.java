package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.checkDateTimeFormat */
public final /* synthetic */ class checkDateTimeFormat implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setDomain write;

    public /* synthetic */ checkDateTimeFormat(setDomain setdomain) {
        this.write = setdomain;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((ExtractionParameters_Factory) obj).read(this.write.MediaDescriptionCompat.read.MediaBrowserCompat$SearchResultReceiver());
    }
}
