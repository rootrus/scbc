package p040o;

import java.text.NumberFormat;
import java.util.Locale;
import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.FieldNamingPolicy$1$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3350xa3ed082e<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.write> {
    private /* synthetic */ intoSet IconCompatParcelizer;

    public C3350xa3ed082e(intoSet intoset) {
        this.IconCompatParcelizer = intoset;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName.write write = (getFirstName.write) obj;
        Integer num = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        if (num == null || num.intValue() == 0) {
            write.write();
            write.read();
            return;
        }
        String format = NumberFormat.getInstance(Locale.getDefault()).format(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) format, "product.formattedAvailability");
        write.read(format);
    }
}
