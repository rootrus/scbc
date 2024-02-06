package p040o;

import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.eL */
public final /* synthetic */ class C4346eL implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4353eU IconCompatParcelizer;

    public /* synthetic */ C4346eL(C4353eU eUVar) {
        this.IconCompatParcelizer = eUVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4353eU eUVar = this.IconCompatParcelizer;
        ((LocalProjectProvider.C69364) obj).read(eUVar.MediaMetadataCompat && eUVar.MediaDescriptionCompat);
    }
}
