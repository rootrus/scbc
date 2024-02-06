package p040o;

import p040o.zzcz;

/* renamed from: o.FragmentBuilder_PhotoTakingDetailsFragment */
public final class FragmentBuilder_PhotoTakingDetailsFragment {
    public static zzcz.zzf.zza MediaBrowserCompat$CustomActionResultReceiver(IntegerKeyframeAnimation integerKeyframeAnimation) {
        onGetStartedClick.write((Object) integerKeyframeAnimation, "entity");
        boolean z = false;
        boolean z2 = integerKeyframeAnimation.MediaBrowserCompat$ItemReceiver == 1;
        Integer num = integerKeyframeAnimation.IconCompatParcelizer;
        if (num != null && num.intValue() == 1) {
            z = true;
        }
        String str = integerKeyframeAnimation.read;
        if (str == null) {
            str = zzcz$zzf$zza$MediaBrowserCompat$CustomActionResultReceiver.NO_VALUE.type;
        }
        return new zzcz.zzf.zza(z2, z, zzcz$zzf$zza$MediaBrowserCompat$CustomActionResultReceiver.valueOf(str));
    }
}
