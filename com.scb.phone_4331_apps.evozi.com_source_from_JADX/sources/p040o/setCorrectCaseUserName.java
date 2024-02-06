package p040o;

import kotlin.TypeCastException;
import p040o.zzjx;

/* renamed from: o.setCorrectCaseUserName */
public final class setCorrectCaseUserName extends setDocumentID<PassportCaptureModule_GetIPassportDetectorFactory> {
    public final TabLayout MediaBrowserCompat$ItemReceiver;
    public final setCompatHoveredFocusedTranslationZ read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setCorrectCaseUserName(RegularImmutableBiMap regularImmutableBiMap, getStartFinalizer getstartfinalizer, setCompatHoveredFocusedTranslationZ setcompathoveredfocusedtranslationz, TabLayout tabLayout) {
        super(regularImmutableBiMap, getstartfinalizer, tabLayout);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) getstartfinalizer, "getNTBUserInfoUseCase");
        onGetStartedClick.write((Object) setcompathoveredfocusedtranslationz, "savePromoCodeCase");
        onGetStartedClick.write((Object) tabLayout, "hmlSetCustomerTypeCase");
        this.read = setcompathoveredfocusedtranslationz;
        this.MediaBrowserCompat$ItemReceiver = tabLayout;
    }

    /* access modifiers changed from: private */
    public static zzjx.zza.zzb MediaBrowserCompat$CustomActionResultReceiver(String str) {
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
