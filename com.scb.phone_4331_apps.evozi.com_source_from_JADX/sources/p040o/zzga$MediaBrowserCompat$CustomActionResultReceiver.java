package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.zzga$MediaBrowserCompat$CustomActionResultReceiver */
final class zzga$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzga MediaBrowserCompat$ItemReceiver;

    zzga$MediaBrowserCompat$CustomActionResultReceiver(zzga zzga) {
        this.MediaBrowserCompat$ItemReceiver = zzga;
    }

    public final /* synthetic */ Object write(Object obj) {
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "entity");
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "entity.data");
        encodedPassword encodedpassword = (encodedPassword) data;
        onGetStartedClick.write((Object) encodedpassword, "entity");
        return new zzxh(encodedpassword.read, encodedpassword.write, encodedpassword.MediaBrowserCompat$ItemReceiver, encodedpassword.IconCompatParcelizer, encodedpassword.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
