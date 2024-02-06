package p040o;

import p040o.FieldNamingPolicy;
import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.FieldNamingPolicy$1$MediaSessionCompat$Token */
public final class FieldNamingPolicy$1$MediaSessionCompat$Token<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.write> {
    private /* synthetic */ FieldNamingPolicy.C33421 IconCompatParcelizer;
    private /* synthetic */ Integer MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ int read;

    public FieldNamingPolicy$1$MediaSessionCompat$Token(FieldNamingPolicy.C33421 r1, Integer num, int i) {
        this.IconCompatParcelizer = r1;
        this.MediaBrowserCompat$ItemReceiver = num;
        this.read = i;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName.write write = (getFirstName.write) obj;
        FieldNamingPolicy.C33421 r0 = this.IconCompatParcelizer;
        Integer num = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) num, "redeemPoint");
        write.RatingCompat(FieldNamingPolicy.C33421.write(r0, num.intValue(), this.read));
        write.read();
    }
}
