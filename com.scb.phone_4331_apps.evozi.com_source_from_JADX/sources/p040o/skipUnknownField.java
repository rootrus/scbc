package p040o;

import p040o.zzcz;
import p040o.zzjx;

/* renamed from: o.skipUnknownField */
public final /* synthetic */ class skipUnknownField implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ skipUnknownField read = new skipUnknownField();

    private /* synthetic */ skipUnknownField() {
    }

    public final Object write(Object obj) {
        zzjx.zza.zzb zzb;
        BaseAnimatableValue baseAnimatableValue = (BaseAnimatableValue) obj;
        if (baseAnimatableValue.MediaBrowserCompat$ItemReceiver == null) {
            zzb = zzjx.zza.zzb.GENERAL;
        } else {
            zzb = zzjx.zza.zzb.valueOf(baseAnimatableValue.MediaBrowserCompat$ItemReceiver);
        }
        return new ActivityTransitionResult(zzb, zzcz.zzc.valueOf(baseAnimatableValue.read), baseAnimatableValue.IconCompatParcelizer);
    }
}
