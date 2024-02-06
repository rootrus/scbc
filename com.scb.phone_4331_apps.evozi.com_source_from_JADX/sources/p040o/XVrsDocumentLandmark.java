package p040o;

import java.util.List;
import p040o.CheckExtractActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.XVrsDocumentLandmark */
public final /* synthetic */ class XVrsDocumentLandmark implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getMetadataFile IconCompatParcelizer;
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.XVrsDocumentLandmark$LandmarkType */
    public final /* synthetic */ class LandmarkType implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ LandmarkType IconCompatParcelizer = new LandmarkType();

        private /* synthetic */ LandmarkType() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((CheckExtractActivity.IconCompatParcelizer) obj).write();
        }
    }

    public /* synthetic */ XVrsDocumentLandmark(List list, getMetadataFile getmetadatafile) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.IconCompatParcelizer = getmetadatafile;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer.write);
    }
}
