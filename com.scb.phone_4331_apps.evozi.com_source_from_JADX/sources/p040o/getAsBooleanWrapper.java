package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getAsBooleanWrapper */
public final /* synthetic */ class getAsBooleanWrapper implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ lambda$of$1 read;

    public /* synthetic */ getAsBooleanWrapper(lambda$of$1 lambda_of_1) {
        this.read = lambda_of_1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((isOcrRead) obj).read(this.read);
    }
}
