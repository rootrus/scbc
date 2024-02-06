package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.SignedBytes;

/* renamed from: o.getExpireAfterWriteNanos */
public final class getExpireAfterWriteNanos extends constrainedListMultimap {
    final SignedBytes.LexicographicalComparator read;

    /* renamed from: o.getExpireAfterWriteNanos$read */
    public static final class read<T, R> implements findFragmentByWho<T, R> {
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ getExpireAfterWriteNanos read;

        public read(getExpireAfterWriteNanos getexpireafterwritenanos, String str) {
            this.read = getexpireafterwritenanos;
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final /* synthetic */ Object IconCompatParcelizer(Object obj) {
            String str;
            zzxf zzxf = (zzxf) obj;
            getExpireAfterWriteNanos getexpireafterwritenanos = this.read;
            onGetStartedClick.IconCompatParcelizer((Object) zzxf, "it");
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) zzxf, "domain");
            onGetStartedClick.write((Object) str2, "currentLanguage");
            int i = zzxf.RatingCompat;
            String str3 = zzxf.write;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "th", (Object) str2)) {
                str = zzxf.MediaMetadataCompat;
            } else {
                str = zzxf.MediaBrowserCompat$SearchResultReceiver;
            }
            return new startTask(i, str3, str, getexpireafterwritenanos.read.mo26549c_(zzxf.IconCompatParcelizer), zzxf.MediaBrowserCompat$ItemReceiver, zzxf.MediaBrowserCompat$CustomActionResultReceiver, zzxf.read);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getExpireAfterWriteNanos(Resources resources, SharedPreferences sharedPreferences, SignedBytes.LexicographicalComparator lexicographicalComparator) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) lexicographicalComparator, "baseAssetsDisplayMapper");
        this.read = lexicographicalComparator;
    }
}
