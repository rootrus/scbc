package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setOnUs1 */
public final /* synthetic */ class setOnUs1 implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setCurrentSession write;

    public /* synthetic */ setOnUs1(setCurrentSession setcurrentsession) {
        this.write = setcurrentsession;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getPiggybackDocument) obj).read(this.write);
    }
}
