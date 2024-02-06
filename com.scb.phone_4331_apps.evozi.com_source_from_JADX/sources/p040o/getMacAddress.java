package p040o;

import p040o.writeUInt64NoTag;
import p040o.zzct;

/* renamed from: o.getMacAddress */
public final class getMacAddress extends writeUInt64NoTag<IPassportExtractorListener> {
    /* access modifiers changed from: private */
    public final setItemIconTintList write;

    /* renamed from: o.getMacAddress$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<IPassportExtractorListener> {
        private /* synthetic */ getMacAddress IconCompatParcelizer;

        public write(getMacAddress getmacaddress) {
            this.IconCompatParcelizer = getmacaddress;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            IPassportExtractorListener iPassportExtractorListener = (IPassportExtractorListener) obj;
            String str = this.IconCompatParcelizer.write.read.MediaBrowserCompat$SearchResultReceiver() == zzct.zza.BUSINESS_OWNER ? "business_owner" : "consumer";
            onGetStartedClick.IconCompatParcelizer((Object) str, "Utilities.getCustomerTyp…peCase.getCustomerType())");
            iPassportExtractorListener.write(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getMacAddress(setItemIconTintList setitemicontintlist, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) setitemicontintlist, "getCustomerTypeCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.write = setitemicontintlist;
    }
}
