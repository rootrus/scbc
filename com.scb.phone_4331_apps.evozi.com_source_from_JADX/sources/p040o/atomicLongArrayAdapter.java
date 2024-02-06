package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.atomicLongArrayAdapter */
public final /* synthetic */ class atomicLongArrayAdapter implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ lambda$of$1 read;

    public /* synthetic */ atomicLongArrayAdapter(lambda$of$1 lambda_of_1) {
        this.read = lambda_of_1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getEyes) obj).IconCompatParcelizer(this.read);
    }
}
