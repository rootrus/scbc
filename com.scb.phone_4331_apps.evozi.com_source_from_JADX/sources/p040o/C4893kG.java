package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.kG */
public final class C4893kG extends writeUInt64NoTag<C1321x96cee189> {
    final toLongArray IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.kG$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C1321x96cee189> {
        private /* synthetic */ C4893kG MediaBrowserCompat$CustomActionResultReceiver;

        public IconCompatParcelizer(C4893kG kGVar) {
            this.MediaBrowserCompat$CustomActionResultReceiver = kGVar;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            C1321x96cee189 getcarbonstripheight_mediabrowsercompat_customactionresultreceiver = (C1321x96cee189) obj;
            toLongArray tolongarray = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTermsAndConditionsType");
            }
            getcarbonstripheight_mediabrowsercompat_customactionresultreceiver.write(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(tolongarray, (String) null, str, (String) null, (String) null, false, false, (String) null, 72));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4893kG(RegularImmutableBiMap regularImmutableBiMap, toLongArray tolongarray) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) tolongarray, "termsAndConditionsMapper");
        this.IconCompatParcelizer = tolongarray;
    }
}
