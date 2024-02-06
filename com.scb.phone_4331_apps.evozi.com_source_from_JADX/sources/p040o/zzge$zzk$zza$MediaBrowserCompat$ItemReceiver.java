package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.zzge;

/* renamed from: o.zzge$zzk$zza$MediaBrowserCompat$ItemReceiver */
final class zzge$zzk$zza$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzge.zzk.zza MediaBrowserCompat$ItemReceiver;

    zzge$zzk$zza$MediaBrowserCompat$ItemReceiver(zzge.zzk.zza zza) {
        this.MediaBrowserCompat$ItemReceiver = zza;
    }

    public final /* synthetic */ Object write(Object obj) {
        String str;
        Boolean bool;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        doFrame doframe = (doFrame) singleDataEntity.getData();
        Boolean bool2 = null;
        if (doframe != null) {
            str = doframe.read;
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (charSequence == null || GoodToKnowActivity.read(charSequence)) {
            if (doframe != null) {
                bool = doframe.IconCompatParcelizer;
            } else {
                bool = null;
            }
            return new resetMinMaxZoomPreference((String) null, bool);
        }
        String str2 = doframe != null ? doframe.read : null;
        if (doframe != null) {
            bool2 = doframe.IconCompatParcelizer;
        }
        return new resetMinMaxZoomPreference(str2, bool2);
    }
}
