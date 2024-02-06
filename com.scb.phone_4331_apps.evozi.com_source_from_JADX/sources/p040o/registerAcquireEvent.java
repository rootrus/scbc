package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.zzge;

/* renamed from: o.registerAcquireEvent */
public final /* synthetic */ class registerAcquireEvent implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ zzge.zzg IconCompatParcelizer;

    public /* synthetic */ registerAcquireEvent(zzge.zzg zzg) {
        this.IconCompatParcelizer = zzg;
    }

    public final Object write(Object obj) {
        String str;
        KeepForSdkWithMembers keepForSdkWithMembers = this.IconCompatParcelizer.write;
        JsonEncodingException jsonEncodingException = (JsonEncodingException) ((SingleDataEntity) obj).getData();
        String str2 = jsonEncodingException.MediaBrowserCompat$ItemReceiver;
        if (str2 == null || str2.length() == 0) {
            str = keepForSdkWithMembers.MediaBrowserCompat$CustomActionResultReceiver.write;
        } else {
            str = jsonEncodingException.MediaBrowserCompat$ItemReceiver;
        }
        return new getIndex(str);
    }
}
