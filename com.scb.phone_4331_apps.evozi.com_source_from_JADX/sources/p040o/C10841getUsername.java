package p040o;

import kotlin.TypeCastException;
import p040o.writeUInt64NoTag;
import p040o.zzjx;

/* renamed from: o.getUsername  reason: case insensitive filesystem */
public final class C10841getUsername extends writeUInt64NoTag<LookAndFeelParameters> {
    public final setCompatHoveredFocusedTranslationZ IconCompatParcelizer;
    public final getStartFinalizer read;
    public final TabLayout write;

    /* renamed from: o.getUsername$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<LookAndFeelParameters> {
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ C10841getUsername write;

        public write(C10841getUsername getusername, String str) {
            this.write = getusername;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LookAndFeelParameters) obj).IconCompatParcelizer(C10841getUsername.read(this.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C10841getUsername(RegularImmutableBiMap regularImmutableBiMap, getStartFinalizer getstartfinalizer, setCompatHoveredFocusedTranslationZ setcompathoveredfocusedtranslationz, TabLayout tabLayout) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) getstartfinalizer, "getNTBUserInfoUseCase");
        onGetStartedClick.write((Object) setcompathoveredfocusedtranslationz, "savePromoCodeCase");
        onGetStartedClick.write((Object) tabLayout, "hmlSetCustomerTypeCase");
        this.read = getstartfinalizer;
        this.IconCompatParcelizer = setcompathoveredfocusedtranslationz;
        this.write = tabLayout;
    }

    /* access modifiers changed from: private */
    public static zzjx.zza.zzb read(String str) {
        zzjx.zza.zzb zzb;
        if (str != null) {
            if (str != null) {
                try {
                    String upperCase = str.toUpperCase();
                    onGetStartedClick.IconCompatParcelizer((Object) upperCase, "(this as java.lang.String).toUpperCase()");
                    zzb = zzjx.zza.zzb.valueOf(upperCase);
                } catch (IllegalArgumentException unused) {
                    zzb = zzjx.zza.zzb.GENERAL;
                }
                if (zzb != null) {
                    return zzb;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return zzjx.zza.zzb.GENERAL;
    }
}
