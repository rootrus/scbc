package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.TextKeyframeAnimation;
import p040o.zzwb;

/* renamed from: o.ProxyApi */
public final class ProxyApi {
    public static final ProxyApi MediaBrowserCompat$ItemReceiver = new ProxyApi();

    private ProxyApi() {
    }

    /* renamed from: o.ProxyApi$ProxyResult */
    public final class ProxyResult implements OPRStatusRewardsLandingActivity_ViewBinding<ProxyRequest> {
        private static final ProxyResult MediaBrowserCompat$ItemReceiver = new ProxyResult();

        public static ProxyResult IconCompatParcelizer() {
            return MediaBrowserCompat$ItemReceiver;
        }

        public final /* synthetic */ Object get() {
            return new ProxyRequest();
        }
    }

    /* renamed from: o.ProxyApi$SpatulaHeaderResult */
    public final class SpatulaHeaderResult implements OPRStatusRewardsLandingActivity_ViewBinding<getSpatulaHeader> {
        private static final SpatulaHeaderResult MediaBrowserCompat$ItemReceiver = new SpatulaHeaderResult();

        public static SpatulaHeaderResult MediaBrowserCompat$ItemReceiver() {
            return MediaBrowserCompat$ItemReceiver;
        }

        public final /* synthetic */ Object get() {
            return new getSpatulaHeader();
        }
    }

    public static zzwb IconCompatParcelizer(TextKeyframeAnimation textKeyframeAnimation) {
        onGetStartedClick.write((Object) textKeyframeAnimation, "entity");
        String str = textKeyframeAnimation.IconCompatParcelizer;
        zzwb$MediaBrowserCompat$CustomActionResultReceiver zzwb_mediabrowsercompat_customactionresultreceiver = new zzwb$MediaBrowserCompat$CustomActionResultReceiver(textKeyframeAnimation.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer, textKeyframeAnimation.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        Iterable<TextKeyframeAnimation.write> iterable = textKeyframeAnimation.write;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (TextKeyframeAnimation.write write : iterable) {
            arrayList.add(new zzwb.read(write.MediaBrowserCompat$CustomActionResultReceiver, write.MediaBrowserCompat$ItemReceiver, write.read));
        }
        return new zzwb(zzwb_mediabrowsercompat_customactionresultreceiver, (List) arrayList, str);
    }
}
