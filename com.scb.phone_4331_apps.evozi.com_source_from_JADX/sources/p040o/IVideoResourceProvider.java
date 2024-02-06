package p040o;

import p040o.C4124by;
import p040o.writeUInt64NoTag;

/* renamed from: o.IVideoResourceProvider */
public final /* synthetic */ class IVideoResourceProvider implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getAssetProvider IconCompatParcelizer;
    private final /* synthetic */ boolean write;

    public /* synthetic */ IVideoResourceProvider(getAssetProvider getassetprovider, boolean z) {
        this.IconCompatParcelizer = getassetprovider;
        this.write = z;
    }

    /* renamed from: o.IVideoResourceProvider$StorageType */
    public final /* synthetic */ class StorageType implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ C4124by write;

        public /* synthetic */ StorageType(C4124by byVar) {
            this.write = byVar;
        }

        public final void IconCompatParcelizer(Object obj) {
            C4124by byVar = this.write;
            getExtractFaceImage getextractfaceimage = (getExtractFaceImage) obj;
            if (byVar.write != null) {
                int i = C4124by.C41254.MediaBrowserCompat$CustomActionResultReceiver[byVar.write.ordinal()];
                if (i == 1) {
                    getextractfaceimage.read("first_step");
                } else if (i == 2 || i == 3) {
                    getextractfaceimage.read("second_step");
                } else if (i == 4) {
                    getextractfaceimage.read("third_step");
                } else if (i == 5) {
                    getextractfaceimage.read("complete");
                }
            }
        }
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C7512tW) obj).MediaBrowserCompat$ItemReceiver(this.write && this.IconCompatParcelizer.IconCompatParcelizer);
    }
}
