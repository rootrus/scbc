package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.PlaceAutocomplete;
import p040o.zzge;

/* renamed from: o.registerReleaseEvent */
public final /* synthetic */ class registerReleaseEvent implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ zzge.zzg IconCompatParcelizer;

    public /* synthetic */ registerReleaseEvent(zzge.zzg zzg) {
        this.IconCompatParcelizer = zzg;
    }

    public final Object write(Object obj) {
        String str;
        KeepForSdkWithMembers keepForSdkWithMembers = this.IconCompatParcelizer.write;
        JsonDataException jsonDataException = (JsonDataException) ((SingleDataEntity) obj).getData();
        String str2 = jsonDataException.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 == null || str2.length() == 0) {
            str = keepForSdkWithMembers.MediaBrowserCompat$CustomActionResultReceiver.write;
        } else {
            str = jsonDataException.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return new PlaceAutocomplete.IntentBuilder(str);
    }
}
