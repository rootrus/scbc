package p040o;

import java.util.List;
import p040o.zzl;

/* renamed from: o.HexDumpUtils */
public final /* synthetic */ class HexDumpUtils implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C6514xb47b5894 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ HexDumpUtils(C6514xb47b5894 fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object write(Object obj) {
        invalidateText invalidatetext = (invalidateText) obj;
        setGoogleIdTokenRequestOptions setgoogleidtokenrequestoptions = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) invalidatetext, "staticTileListEntity");
        List<PlacePhotoMetadataResult> read = setgoogleidtokenrequestoptions.MediaBrowserCompat$ItemReceiver.read(invalidatetext.read);
        onGetStartedClick.IconCompatParcelizer((Object) read, "staticTileEntityMapper.t…leListEntity.staticTiles)");
        return new zzl.zzb(read);
    }
}
