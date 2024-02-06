package p040o;

import java.util.List;
import p040o.HintRequest;
import p040o.zzca;

/* renamed from: o.isWearable */
public final /* synthetic */ class isWearable implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C6514xb47b5894 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ isWearable(C6514xb47b5894 fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object write(Object obj) {
        getTextInternal gettextinternal = (getTextInternal) obj;
        HintRequest.Builder builder = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) gettextinternal, "etbCheckActiveCASAEntity");
        boolean z = gettextinternal.IconCompatParcelizer;
        List<PlacePhotoMetadataResult> read = builder.write.read(gettextinternal.MediaBrowserCompat$CustomActionResultReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) read, "staticTileEntityMapper.t…veCASAEntity.staticTiles)");
        return new zzca.zza(z, read);
    }
}
