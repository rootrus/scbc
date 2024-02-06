package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CustomConcurrentHashMap;
import p040o.MaskKeyframeAnimation;
import p040o.zzcz;

/* renamed from: o.SmsRetrieverApi */
public final class SmsRetrieverApi extends getSignInClient {
    public static zzcz.zzg.write IconCompatParcelizer(propagateToChildren propagatetochildren) {
        String str = propagatetochildren.MediaBrowserCompat$CustomActionResultReceiver;
        return new zzcz.zzg.write(str != null ? Double.valueOf(Double.parseDouble(str)) : null, propagatetochildren.read, propagatetochildren.write, propagatetochildren.MediaBrowserCompat$ItemReceiver, 48);
    }

    public final zzcz.zzg MediaBrowserCompat$CustomActionResultReceiver(MaskKeyframeAnimation maskKeyframeAnimation, CustomConcurrentHashMap.Segment.ExpirationQueue.C32991 r20) {
        zzcz.zzb zzb;
        MaskKeyframeAnimation maskKeyframeAnimation2 = maskKeyframeAnimation;
        CustomConcurrentHashMap.Segment.ExpirationQueue.C32991 r1 = r20;
        onGetStartedClick.write((Object) maskKeyframeAnimation2, "entity");
        onGetStartedClick.write((Object) r1, "request");
        String str = r1.MediaBrowserCompat$ItemReceiver;
        double d = maskKeyframeAnimation2.MediaBrowserCompat$ItemReceiver;
        String str2 = maskKeyframeAnimation2.IconCompatParcelizer;
        MaskKeyframeAnimation$MediaBrowserCompat$ItemReceiver maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver = maskKeyframeAnimation2.write;
        String str3 = maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver.write;
        zzcz.zzg.write write = new zzcz.zzg.write(str3 != null ? Double.valueOf(Double.parseDouble(str3)) : null, maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem, maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver.read, Double.valueOf(Double.parseDouble(maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer)), Double.valueOf(Double.parseDouble(maskKeyframeAnimation$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver)));
        double d2 = maskKeyframeAnimation2.MediaBrowserCompat$CustomActionResultReceiver;
        OffsetDateTime write2 = FragmentBuilder_BindSummaryFragment.write(maskKeyframeAnimation2.MediaBrowserCompat$MediaItem, OffsetDateTime.now());
        if (write2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        onGetStartedClick.IconCompatParcelizer((Object) write2, "transformStringToDateTim…, OffsetDateTime.now())!!");
        Integer valueOf = Integer.valueOf(r1.read);
        String str4 = r1.IconCompatParcelizer;
        FusedLocationProviderClient IconCompatParcelizer = IconCompatParcelizer(maskKeyframeAnimation2.MediaBrowserCompat$SearchResultReceiver);
        Iterable<lerp> iterable = maskKeyframeAnimation2.MediaMetadataCompat;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (lerp read : iterable) {
            arrayList.add(getSignInClient.read(read));
        }
        List list = (List) arrayList;
        MaskKeyframeAnimation.IconCompatParcelizer iconCompatParcelizer = maskKeyframeAnimation2.read;
        if (iconCompatParcelizer != null) {
            zzb = new zzcz.zzb(iconCompatParcelizer.read, iconCompatParcelizer.write);
        } else {
            zzb = null;
        }
        return new zzcz.zzg(str, d, str2, write, d2, write2, valueOf, str4, IconCompatParcelizer, list, zzb);
    }
}
