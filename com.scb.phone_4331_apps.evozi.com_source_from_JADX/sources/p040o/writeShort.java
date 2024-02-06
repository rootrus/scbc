package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.LottieCompositionFactory;

/* renamed from: o.writeShort */
public final /* synthetic */ class writeShort implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ writeShort read = new writeShort();

    private /* synthetic */ writeShort() {
    }

    public final Object write(Object obj) {
        LottieCompositionFactory.C36064 r7 = (LottieCompositionFactory.C36064) ((SingleDataEntity) obj).getData();
        return new nextEntry(r7.MediaBrowserCompat$CustomActionResultReceiver, r7.write, r7.read, r7.MediaBrowserCompat$ItemReceiver, r7.IconCompatParcelizer);
    }
}
