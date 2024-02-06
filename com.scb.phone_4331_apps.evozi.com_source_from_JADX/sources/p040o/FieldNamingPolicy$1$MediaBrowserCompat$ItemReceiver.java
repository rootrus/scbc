package p040o;

import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.FieldNamingPolicy$1$MediaBrowserCompat$ItemReceiver */
public final class FieldNamingPolicy$1$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.write> {
    private /* synthetic */ intoSet IconCompatParcelizer;

    public FieldNamingPolicy$1$MediaBrowserCompat$ItemReceiver(intoSet intoset) {
        this.IconCompatParcelizer = intoset;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName.write write = (getFirstName.write) obj;
        CharSequence charSequence = this.IconCompatParcelizer.write;
        if (charSequence == null || charSequence.length() == 0) {
            write.IconCompatParcelizer();
            return;
        }
        String str = this.IconCompatParcelizer.write;
        onGetStartedClick.IconCompatParcelizer((Object) str, "product.condition");
        write.write(str);
    }
}
