package p040o;

import java.util.List;
import p040o.AbstractMapBasedMultiset;
import p040o.ImmutableAsList;

/* renamed from: o.useForNull */
public final /* synthetic */ class useForNull implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ skipNulls read;
    private final /* synthetic */ ImmutableAsList.SerializedForm write;

    public /* synthetic */ useForNull(skipNulls skipnulls, ImmutableAsList.SerializedForm serializedForm) {
        this.read = skipnulls;
        this.write = serializedForm;
    }

    public final void IconCompatParcelizer(Object obj) {
        skipNulls skipnulls = this.read;
        ImmutableAsList.SerializedForm serializedForm = this.write;
        zzum zzum = (zzum) obj;
        AbstractMapBasedMultiset.EntrySet.C30061 r0 = skipnulls.MediaBrowserCompat$CustomActionResultReceiver;
        String str = serializedForm.IconCompatParcelizer;
        if (str == null) {
            r0.MediaBrowserCompat$ItemReceiver.read((List<? extends inject_base64Decoder>) null);
            return;
        }
        boolean z = true;
        if (zzum == null || !GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(zzum.write, str, true)) {
            z = false;
        }
        if (!z) {
            r0.MediaBrowserCompat$ItemReceiver.read((List<? extends inject_base64Decoder>) null);
        }
    }
}
