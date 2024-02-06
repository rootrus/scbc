package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.setDataFormat */
public final /* synthetic */ class setDataFormat implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getCpuArchitectureInt read;

    public /* synthetic */ setDataFormat(getCpuArchitectureInt getcpuarchitectureint) {
        this.read = getcpuarchitectureint;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.Keep) obj).write(this.read);
    }
}
