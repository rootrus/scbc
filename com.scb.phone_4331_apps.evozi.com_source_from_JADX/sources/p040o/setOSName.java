package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setOSName */
public final /* synthetic */ class setOSName implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getTaskReturnValue read;

    public /* synthetic */ setOSName(getTaskReturnValue gettaskreturnvalue) {
        this.read = gettaskreturnvalue;
    }

    public final void IconCompatParcelizer(Object obj) {
        getTaskReturnValue.write(this.read, (getHighestVersion) obj);
    }
}
