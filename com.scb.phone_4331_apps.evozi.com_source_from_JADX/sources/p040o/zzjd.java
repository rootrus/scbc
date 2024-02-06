package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.zziu;

/* renamed from: o.zzjd */
public final /* synthetic */ class zzjd implements DirectDebitDeepLinkActivity {
    public /* synthetic */ zzjd(C6457xf27f1ecf emailMeVerificationCodeUseCase$EmailVerificationCodeNotSendException) {
    }

    public final Object write(Object obj) {
        typefaceForStyle typefaceforstyle = (typefaceForStyle) obj;
        onGetStartedClick.write((Object) typefaceforstyle, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        zzui zzui = new zzui(typefaceforstyle.MediaBrowserCompat$ItemReceiver, typefaceforstyle.MediaBrowserCompat$SearchResultReceiver);
        String str = typefaceforstyle.MediaBrowserCompat$CustomActionResultReceiver;
        zzui zzui2 = new zzui(typefaceforstyle.read, typefaceforstyle.IconCompatParcelizer);
        Iterable<ImageAssetManager> iterable = typefaceforstyle.write;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (ImageAssetManager imageAssetManager : iterable) {
            arrayList.add(new zziu.zzd(new zzui(imageAssetManager.MediaBrowserCompat$ItemReceiver, imageAssetManager.MediaBrowserCompat$CustomActionResultReceiver), imageAssetManager.read));
        }
        return new idealIntArraySize(zzui, str, zzui2, (List) arrayList);
    }
}
