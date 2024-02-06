package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.hml.C5985x82597580;
import p040o.BeginSignInRequest;
import p040o.zzbo;
import p040o.zzdy;

/* renamed from: o.writeLong */
public final /* synthetic */ class writeLong implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C5985x82597580 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ writeLong(C5985x82597580 hmlDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$ItemReceiver = hmlDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object write(Object obj) {
        int i;
        SimpleColorFilter simpleColorFilter = (SimpleColorFilter) ((SingleDataEntity) obj).getData();
        zzdy.zzc zzc = null;
        if (simpleColorFilter == null) {
            return null;
        }
        setHeight setheight = new setHeight();
        zzbo.zza write = BeginSignInRequest.GoogleIdTokenRequestOptions.Builder.write(simpleColorFilter.MediaBrowserCompat$ItemReceiver);
        zzbo.zza write2 = BeginSignInRequest.GoogleIdTokenRequestOptions.Builder.write(simpleColorFilter.IconCompatParcelizer);
        invalidate invalidate = simpleColorFilter.write;
        if (invalidate != null) {
            zzc = new zzdy.zzc();
            zzc.write = invalidate.read;
            zzc.MediaBrowserCompat$CustomActionResultReceiver = invalidate.MediaBrowserCompat$ItemReceiver;
            zzc.MediaBrowserCompat$ItemReceiver = invalidate.MediaBrowserCompat$CustomActionResultReceiver;
            zzc.IconCompatParcelizer = invalidate.write.write;
        }
        applyDashPatternIfNeeded applydashpatternifneeded = simpleColorFilter.MediaBrowserCompat$CustomActionResultReceiver;
        if (applydashpatternifneeded != null) {
            i = applydashpatternifneeded.read;
        } else {
            i = 0;
        }
        setheight.MediaBrowserCompat$ItemReceiver = write;
        setheight.MediaBrowserCompat$CustomActionResultReceiver = i;
        setheight.MediaDescriptionCompat = write2;
        setheight.write = zzc;
        setheight.read = simpleColorFilter.read;
        return setheight;
    }
}
