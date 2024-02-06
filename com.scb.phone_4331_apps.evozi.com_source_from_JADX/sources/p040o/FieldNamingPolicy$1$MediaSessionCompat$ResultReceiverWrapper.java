package p040o;

import java.text.NumberFormat;
import java.util.Locale;
import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.FieldNamingPolicy$1$MediaSessionCompat$ResultReceiverWrapper */
public final class FieldNamingPolicy$1$MediaSessionCompat$ResultReceiverWrapper<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.write> {
    private /* synthetic */ intoSet MediaBrowserCompat$CustomActionResultReceiver;

    public FieldNamingPolicy$1$MediaSessionCompat$ResultReceiverWrapper(intoSet intoset) {
        this.MediaBrowserCompat$CustomActionResultReceiver = intoset;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        String str;
        getFirstName.write write = (getFirstName.write) obj;
        intoSet intoset = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (intoset.MediaBrowserCompat$ItemReceiver == null) {
            str = "";
        } else {
            str = NumberFormat.getInstance(Locale.getDefault()).format(intoset.MediaBrowserCompat$ItemReceiver);
        }
        onGetStartedClick.IconCompatParcelizer((Object) str, "product.formattedCouponTimeLimit");
        write.MediaSessionCompat$Token(str);
    }
}
