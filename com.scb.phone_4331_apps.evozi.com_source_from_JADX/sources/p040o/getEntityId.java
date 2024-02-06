package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getEntityId */
public final /* synthetic */ class getEntityId implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ KotlinDetector write;

    public /* synthetic */ getEntityId(KotlinDetector kotlinDetector) {
        this.write = kotlinDetector;
    }

    public final void IconCompatParcelizer(Object obj) {
        KotlinDetector kotlinDetector = this.write;
        getAddress5 getaddress5 = (getAddress5) obj;
        getaddress5.AppCompatActivity();
        getaddress5.setItemInvoker();
        getaddress5.setContentView();
        String str = kotlinDetector.IconCompatParcelizer.setShortcut;
        if (str != null && str.endsWith("SPD")) {
            getaddress5.write(kotlinDetector.write.MediaBrowserCompat$SearchResultReceiver);
        } else {
            getaddress5.write(kotlinDetector.write.write, kotlinDetector.write.MediaMetadataCompat, kotlinDetector.write.read, kotlinDetector.write.MediaBrowserCompat$CustomActionResultReceiver, kotlinDetector.write.IconCompatParcelizer);
        }
    }
}
