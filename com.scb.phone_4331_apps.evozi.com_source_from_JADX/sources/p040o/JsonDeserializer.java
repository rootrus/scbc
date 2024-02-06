package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.JsonDeserializer */
public final /* synthetic */ class JsonDeserializer implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C$Gson$Types MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getAction write;

    public /* synthetic */ JsonDeserializer(C$Gson$Types _gson_types, getAction getaction) {
        this.MediaBrowserCompat$CustomActionResultReceiver = _gson_types;
        this.write = getaction;
    }

    public final void IconCompatParcelizer(Object obj) {
        C$Gson$Types _gson_types = this.MediaBrowserCompat$CustomActionResultReceiver;
        getAction getaction = this.write;
        getMiddleName getmiddlename = (getMiddleName) obj;
        if (getaction != null) {
            getmiddlename.IconCompatParcelizer(getaction.RatingCompat);
        } else {
            getmiddlename.IconCompatParcelizer(_gson_types.MediaBrowserCompat$ItemReceiver.read.get(0).RatingCompat);
        }
    }
}
