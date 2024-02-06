package p040o;

import p040o.ExtractorResponse;
import p040o.writeUInt64NoTag;

/* renamed from: o.getModelType$MediaBrowserCompat$CustomActionResultReceiver */
public final class getModelType$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<ExtractorResponse.read> {
    private /* synthetic */ getModelType MediaBrowserCompat$ItemReceiver;

    public getModelType$MediaBrowserCompat$CustomActionResultReceiver(getModelType getmodeltype) {
        this.MediaBrowserCompat$ItemReceiver = getmodeltype;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ExtractorResponse.read read = (ExtractorResponse.read) obj;
        String MediaBrowserCompat$CustomActionResultReceiver = getModelType.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) MediaBrowserCompat$CustomActionResultReceiver, (Object) createId.EMAIL.name())) {
            getModelType getmodeltype = this.MediaBrowserCompat$ItemReceiver;
            getModelType.write(getmodeltype, getModelType.read(getmodeltype));
        } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) MediaBrowserCompat$CustomActionResultReceiver, (Object) createId.PAPER.name())) {
            read.read(getModelType.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver), getModelType.MediaBrowserCompat$SearchResultReceiver(this.MediaBrowserCompat$ItemReceiver), getModelType.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver), getModelType.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver), this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat);
        }
    }
}
