package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.zzfy;
import p040o.zziu;
import p040o.zzjx;

/* renamed from: o.ProxyRequest */
public final class ProxyRequest extends getSignInClient {

    /* renamed from: o.ProxyRequest$Builder */
    public final class Builder implements OPRStatusRewardsLandingActivity_ViewBinding<C6457xf27f1ecf> {
        private static final Builder read = new Builder();

        public static Builder write() {
            return read;
        }

        public final /* synthetic */ Object get() {
            return new C6457xf27f1ecf();
        }
    }

    private final zziu.zzb MediaBrowserCompat$ItemReceiver(FontAssetManager fontAssetManager) {
        zzjx.zze.zzb zzb;
        String str = fontAssetManager.read;
        String str2 = fontAssetManager.write;
        String str3 = fontAssetManager.IconCompatParcelizer;
        Iterable<setVertex> iterable = fontAssetManager.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (setVertex setvertex : iterable) {
            onGetStartedClick.write((Object) setvertex, "entity");
            arrayList.add(new zzjx.zzc(setvertex.MediaBrowserCompat$ItemReceiver, setvertex.MediaBrowserCompat$CustomActionResultReceiver));
        }
        List list = (List) arrayList;
        DocumentData documentData = fontAssetManager.MediaBrowserCompat$CustomActionResultReceiver;
        if (documentData != null) {
            zzb = read(documentData);
        } else {
            zzb = null;
        }
        return new zziu.zzb(str, str2, str3, list, zzb);
    }

    private static zzjx.zze.zzb read(DocumentData documentData) {
        String str = documentData.write;
        Iterable<setVertex> iterable = documentData.read;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (setVertex setvertex : iterable) {
            onGetStartedClick.write((Object) setvertex, "entity");
            arrayList.add(new zzjx.zzc(setvertex.MediaBrowserCompat$ItemReceiver, setvertex.MediaBrowserCompat$CustomActionResultReceiver));
        }
        return new zzjx.zze.zzb(str, (List) arrayList);
    }

    public final zzfy.zzg write(getMatrixForRepeater getmatrixforrepeater) {
        String str;
        String str2;
        getMatrixForRepeater getmatrixforrepeater2 = getmatrixforrepeater;
        onGetStartedClick.write((Object) getmatrixforrepeater2, "entity");
        setIsDiscrete setisdiscrete = getmatrixforrepeater2.IconCompatParcelizer;
        String str3 = null;
        if (setisdiscrete != null) {
            str = setisdiscrete.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str = null;
        }
        setIsDiscrete setisdiscrete2 = getmatrixforrepeater2.IconCompatParcelizer;
        if (setisdiscrete2 != null) {
            str2 = setisdiscrete2.read;
        } else {
            str2 = null;
        }
        FontCharacter fontCharacter = getmatrixforrepeater2.MediaBrowserCompat$CustomActionResultReceiver;
        getInterpolatedCurrentKeyframeProgress getinterpolatedcurrentkeyframeprogress = fontCharacter.IconCompatParcelizer;
        if (getinterpolatedcurrentkeyframeprogress != null) {
            str3 = getinterpolatedcurrentkeyframeprogress.MediaBrowserCompat$ItemReceiver;
        }
        String str4 = str3;
        String str5 = fontCharacter.RatingCompat;
        String str6 = fontCharacter.read;
        boolean MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) DiskLruCache.VERSION_1, (Object) fontCharacter.MediaBrowserCompat$CustomActionResultReceiver);
        double d = fontCharacter.MediaDescriptionCompat;
        double d2 = fontCharacter.write;
        double d3 = fontCharacter.MediaMetadataCompat;
        Iterable<FontAssetManager> iterable = fontCharacter.MediaBrowserCompat$ItemReceiver;
        int i = 10;
        String str7 = str;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (FontAssetManager MediaBrowserCompat$ItemReceiver2 : iterable) {
            arrayList.add(MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2));
        }
        return new zzfy.zzg(str7, str2, new zzjx.zzd.zza(str4, str5, str6, MediaBrowserCompat$ItemReceiver, d, d2, d3, (List) arrayList, IconCompatParcelizer(fontCharacter.MediaBrowserCompat$SearchResultReceiver)));
    }
}
