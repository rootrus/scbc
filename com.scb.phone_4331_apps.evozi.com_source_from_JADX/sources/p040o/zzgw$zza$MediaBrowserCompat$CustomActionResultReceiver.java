package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.LottieDrawable;
import p040o.setInstanceIdProvider;

/* renamed from: o.zzgw$zza$MediaBrowserCompat$CustomActionResultReceiver */
final class zzgw$zza$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzgw$zza$MediaBrowserCompat$CustomActionResultReceiver write = new zzgw$zza$MediaBrowserCompat$CustomActionResultReceiver();

    zzgw$zza$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "entity");
        LottieDrawable.C361915 r6 = (LottieDrawable.C361915) singleDataEntity.getData();
        Iterable<debug> write2 = HmlNTBBusinessURLInformationActivity.write(r6.write, new LottieDrawable$15$MediaBrowserCompat$ItemReceiver());
        onGetStartedClick.write((Object) write2, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(write2 instanceof Collection ? ((Collection) write2).size() : 10);
        for (debug write3 : write2) {
            arrayList.add(LottieDrawable.C361915.write(write3));
        }
        String str = r6.MediaBrowserCompat$CustomActionResultReceiver;
        setInstanceIdProvider.read read = new setInstanceIdProvider.read((byte) 0);
        read.MediaBrowserCompat$ItemReceiver = r6.IconCompatParcelizer.write;
        read.read = r6.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        setInstanceIdProvider setinstanceidprovider = new setInstanceIdProvider(read, (byte) 0);
        onGetStartedClick.IconCompatParcelizer((Object) setinstanceidprovider, "Remark.newBuilder()\n    …                 .build()");
        return new getMaxUserProperties((List) arrayList, str, setinstanceidprovider);
    }
}
