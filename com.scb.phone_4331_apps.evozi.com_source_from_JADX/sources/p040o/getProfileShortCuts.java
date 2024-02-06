package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getProfileShortCuts */
public final class getProfileShortCuts extends addImage {

    /* renamed from: o.getProfileShortCuts$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<KtaPassportExtractor> {
        public static final read IconCompatParcelizer = new read();

        read() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((KtaPassportExtractor) obj).IconCompatParcelizer();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getProfileShortCuts(RegularImmutableBiMap regularImmutableBiMap, newHashSet newhashset, setItemIconTintList setitemicontintlist) {
        super(regularImmutableBiMap, newhashset, setitemicontintlist);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) newhashset, "loanReviewDetailsDisplayMapper");
        onGetStartedClick.write((Object) setitemicontintlist, "hmlGetCustomerTypeCase");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.IconCompatParcelizer;
        if (this.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
