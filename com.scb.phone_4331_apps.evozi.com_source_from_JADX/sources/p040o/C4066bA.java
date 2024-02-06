package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import java.io.File;
import p040o.getExtractSignatureImage;

/* renamed from: o.bA */
public abstract class C4066bA<View extends getExtractSignatureImage> extends writeUInt64NoTag<View> {
    public newLatLngBounds IconCompatParcelizer;
    private Tile read;
    public int write = 0;

    public abstract void MediaBrowserCompat$ItemReceiver(File file);

    public abstract void MediaMetadataCompat(Throwable th);

    public C4066bA(RegularImmutableBiMap regularImmutableBiMap, Tile tile) {
        super(regularImmutableBiMap);
        this.read = tile;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(newLatLngBounds newlatlngbounds) {
        this.IconCompatParcelizer = newlatlngbounds;
        if (newlatlngbounds != null) {
            boolean z = true;
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            InternalError internalError = new InternalError(this);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                internalError.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(getExtractSignatureImage getextractsignatureimage) {
        getextractsignatureimage.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
    }

    public void onDestroy() {
        this.IconCompatParcelizer = null;
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final String read(File file, String str) {
        String write2 = this.read.MediaBrowserCompat$CustomActionResultReceiver.write();
        onGetStartedClick.IconCompatParcelizer((Object) write2, "sessionRepositoryContractor.apiAuth");
        onGetStartedClick.write((Object) write2, C8183f.f4230JO);
        onGetStartedClick.write((Object) str, "secret");
        String MediaBrowserCompat$ItemReceiver = removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(write2, str);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "Utilities.hmacHash(message, secret)");
        onGetStartedClick.write((Object) file, "file");
        onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver, "secret");
        String read2 = removeIfFromRandomAccessList.read(file, MediaBrowserCompat$ItemReceiver, Boolean.TRUE);
        onGetStartedClick.IconCompatParcelizer((Object) read2, "Utilities.hmacHash(file, secret, hashBase64)");
        return read2;
    }
}
