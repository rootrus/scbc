package p040o;

import p040o.ExtractorResponse;
import p040o.writeUInt64NoTag;

/* renamed from: o.getModelType$MediaBrowserCompat$ItemReceiver */
public final class getModelType$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.read> {
    private /* synthetic */ getModelType read;

    public getModelType$MediaBrowserCompat$ItemReceiver(getModelType getmodeltype) {
        this.read = getmodeltype;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ExtractorResponse.read read2 = (ExtractorResponse.read) obj;
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getModelType.MediaBrowserCompat$CustomActionResultReceiver(this.read), (Object) createId.PAPER.name())) {
            read2.MediaBrowserCompat$ItemReceiver();
        } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getModelType.MediaBrowserCompat$CustomActionResultReceiver(this.read), (Object) createId.EMAIL.name())) {
            read2.write();
        }
    }
}
