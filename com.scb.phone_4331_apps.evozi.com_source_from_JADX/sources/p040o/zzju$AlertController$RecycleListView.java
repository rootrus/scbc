package p040o;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.BaseKeyframeAnimation;
import p040o.zzcz;
import p040o.zzjx;
import p040o.zzkf;

/* renamed from: o.zzju$AlertController$RecycleListView */
final class zzju$AlertController$RecycleListView<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzju MediaBrowserCompat$CustomActionResultReceiver;

    zzju$AlertController$RecycleListView(zzju zzju) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzju;
    }

    public final /* synthetic */ Object write(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        ColorKeyframeAnimation colorKeyframeAnimation = (ColorKeyframeAnimation) obj;
        String str5 = "entity";
        onGetStartedClick.write((Object) colorKeyframeAnimation, str5);
        FragmentBuilder_HmlBusinessOwnerETBPersonalInfoFragment fragmentBuilder_HmlBusinessOwnerETBPersonalInfoFragment = this.MediaBrowserCompat$CustomActionResultReceiver.write;
        onGetStartedClick.write((Object) colorKeyframeAnimation, str5);
        getResolvedElement getresolvedelement = colorKeyframeAnimation.MediaDescriptionCompat;
        onGetStartedClick.write((Object) getresolvedelement, str5);
        isOperational isoperational = new isOperational(new zzjx.zzd(getresolvedelement.MediaBrowserCompat$ItemReceiver.write, getresolvedelement.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver));
        BaseKeyframeAnimation.AnimationListener animationListener = colorKeyframeAnimation.MediaBrowserCompat$ItemReceiver;
        setMapStyle setmapstyle = null;
        String str6 = animationListener != null ? animationListener.IconCompatParcelizer : null;
        if (animationListener != null) {
            str = animationListener.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str = null;
        }
        zzcz.zze zze = new zzcz.zze(str6, str);
        String str7 = colorKeyframeAnimation.read;
        getStyle getstyle = colorKeyframeAnimation.RatingCompat;
        if (getstyle != null) {
            str2 = getstyle.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str2 = null;
        }
        boolean MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str2, (Object) DiskLruCache.VERSION_1);
        if (getstyle != null) {
            str3 = getstyle.IconCompatParcelizer;
        } else {
            str3 = null;
        }
        boolean MediaBrowserCompat$ItemReceiver2 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str3, (Object) DiskLruCache.VERSION_1);
        if (getstyle != null) {
            str4 = getstyle.write;
        } else {
            str4 = null;
        }
        zzkf.zza zza = new zzkf.zza(Boolean.valueOf(MediaBrowserCompat$ItemReceiver), Boolean.valueOf(MediaBrowserCompat$ItemReceiver2), Boolean.valueOf(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str4, (Object) DiskLruCache.VERSION_1)));
        setDelegate setdelegate = colorKeyframeAnimation.write;
        zzjx.zza zza2 = new zzjx.zza(Boolean.valueOf(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) setdelegate != null ? setdelegate.IconCompatParcelizer : null, (Object) DiskLruCache.VERSION_1)), Boolean.valueOf(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) setdelegate != null ? setdelegate.read : null, (Object) DiskLruCache.VERSION_1)));
        Integer num = colorKeyframeAnimation.IconCompatParcelizer;
        AnimatableTextFrame animatableTextFrame = colorKeyframeAnimation.MediaMetadataCompat;
        if (animatableTextFrame != null) {
            setmapstyle = new setMapStyle(animatableTextFrame.write, animatableTextFrame.MediaBrowserCompat$ItemReceiver);
        }
        setMapStyle setmapstyle2 = setmapstyle;
        List<setValueCallback> list = colorKeyframeAnimation.MediaBrowserCompat$SearchResultReceiver;
        if (list == null) {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        onGetStartedClick.write((Object) list, str5);
        List arrayList = new ArrayList();
        for (setValueCallback next : list) {
            onGetStartedClick.write((Object) next, str5);
            arrayList.add(new zzcz.zzd(next.MediaBrowserCompat$ItemReceiver, next.read, next.write, next.MediaBrowserCompat$CustomActionResultReceiver, next.IconCompatParcelizer));
            str5 = str5;
        }
        return new zzcz.zzd.zza(isoperational, zze, str7, zza, zza2, num, setmapstyle2, arrayList, colorKeyframeAnimation.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
