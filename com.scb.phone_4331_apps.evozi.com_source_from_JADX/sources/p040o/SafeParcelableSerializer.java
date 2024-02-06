package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.LottieCompositionFactory;

/* renamed from: o.SafeParcelableSerializer */
public final /* synthetic */ class SafeParcelableSerializer implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ SafeParcelableSerializer write = new SafeParcelableSerializer();

    private /* synthetic */ SafeParcelableSerializer() {
    }

    public final Object write(Object obj) {
        return (LottieCompositionFactory.C36042) ((SingleDataEntity) obj).getData();
    }
}
