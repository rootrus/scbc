package p040o;

import android.text.TextUtils;
import p040o.FragmentBuilder_BindEditFavouriteFragment;
import retrofit2.Response;

/* renamed from: o.MurmurHash3 */
public final /* synthetic */ class MurmurHash3 implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindEditFavouriteFragment.C65275 read;

    public /* synthetic */ MurmurHash3(FragmentBuilder_BindEditFavouriteFragment.C65275 r1) {
        this.read = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver = this.read.read;
        String str = ((Response) obj).headers().get("Api-Auth");
        if (!TextUtils.isEmpty(str)) {
            count_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = str;
        }
    }
}
