package p040o;

import p040o.CreditCard;
import p040o.writeUInt64NoTag;

/* renamed from: o.createImageRaw */
public final /* synthetic */ class createImageRaw implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ releaseFileBuffer write;

    public /* synthetic */ createImageRaw(releaseFileBuffer releasefilebuffer) {
        this.write = releasefilebuffer;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CreditCard.C11681) obj).read(this.write.read);
    }
}
