package p040o;

import com.scb.phone.domain.entity.mwpartner.EntityMappingException;

/* renamed from: o.zzge$zzf$MediaBrowserCompat$ItemReceiver */
final class zzge$zzf$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzge$zzf$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new zzge$zzf$MediaBrowserCompat$ItemReceiver();

    zzge$zzf$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        createFromParcel createfromparcel = (createFromParcel) obj;
        onGetStartedClick.write((Object) createfromparcel, "entity");
        onGetStartedClick.write((Object) createfromparcel, "$this$toDomain");
        onGetStartedClick.write((Object) createfromparcel, "entity");
        String str = createfromparcel.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            String str2 = createfromparcel.IconCompatParcelizer;
            if (str2 != null) {
                String str3 = createfromparcel.read;
                if (str3 != null) {
                    return new setPositionFromBounds(str, str2, str3);
                }
                throw new EntityMappingException("Some mandatory is missing.");
            }
            throw new EntityMappingException("Some mandatory is missing.");
        }
        throw new EntityMappingException("Some mandatory is missing.");
    }
}
