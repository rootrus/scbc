package p040o;

import p040o.PhenotypeFlag;
import p040o.writeUInt64NoTag;

/* renamed from: o.DocumentCaptureExperience$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3325x3fea8922<V> implements writeUInt64NoTag.IconCompatParcelizer<C7141hv> {
    private /* synthetic */ String IconCompatParcelizer;
    private /* synthetic */ DocumentCaptureExperience write;

    public C3325x3fea8922(DocumentCaptureExperience documentCaptureExperience, String str) {
        this.write = documentCaptureExperience;
        this.IconCompatParcelizer = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        boolean z;
        C7141hv hvVar = (C7141hv) obj;
        PhenotypeFlag.zza read = this.write.read;
        String str = this.IconCompatParcelizer;
        if (str == null) {
            z = false;
        } else {
            z = read.IconCompatParcelizer.matcher(str).matches();
        }
        hvVar.IconCompatParcelizer(z);
    }
}
