package p040o;

import p040o.IdParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.initializeFile */
public final /* synthetic */ class initializeFile implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeConfigureFromFile read;

    public /* synthetic */ initializeFile(nativeConfigureFromFile nativeconfigurefromfile) {
        this.read = nativeconfigurefromfile;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdParameters.C6915a) obj).IconCompatParcelizer(this.read.read);
    }
}
