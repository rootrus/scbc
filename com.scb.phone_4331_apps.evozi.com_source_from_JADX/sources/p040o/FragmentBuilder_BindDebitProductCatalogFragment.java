package p040o;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.net.Uri;

/* renamed from: o.FragmentBuilder_BindDebitProductCatalogFragment */
public final /* synthetic */ class FragmentBuilder_BindDebitProductCatalogFragment implements BondDeepLinkActivity {
    private final /* synthetic */ ContentResolver IconCompatParcelizer;
    private final /* synthetic */ float MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ byte[] MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ int RatingCompat;
    private final /* synthetic */ Uri read;
    private final /* synthetic */ Resources write;

    public /* synthetic */ FragmentBuilder_BindDebitProductCatalogFragment(ContentResolver contentResolver, Uri uri, Resources resources, byte[] bArr, float f, int i) {
        this.IconCompatParcelizer = contentResolver;
        this.read = uri;
        this.write = resources;
        this.MediaBrowserCompat$ItemReceiver = bArr;
        this.MediaBrowserCompat$CustomActionResultReceiver = f;
        this.RatingCompat = i;
    }

    public final void read(AddAccountConsentDeepLinkActivity addAccountConsentDeepLinkActivity) {
        FragmentBuilder_BindDepositSelectorFragment.write(this.IconCompatParcelizer, this.read, this.write, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.RatingCompat, addAccountConsentDeepLinkActivity);
    }
}
