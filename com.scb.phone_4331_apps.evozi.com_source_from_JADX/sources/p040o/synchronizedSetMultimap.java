package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p040o.SignedBytes;

/* renamed from: o.synchronizedSetMultimap */
public final class synchronizedSetMultimap extends SignedBytes.LexicographicalComparator {
    public boolean IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver;
    public boolean read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public synchronizedSetMultimap(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
    }

    /* renamed from: o.synchronizedSetMultimap$read */
    public static final class read<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable valueOf = Integer.valueOf(((access$1900) t).MediaBrowserCompat$MediaItem);
            Comparable valueOf2 = Integer.valueOf(((access$1900) t2).MediaBrowserCompat$MediaItem);
            if (valueOf == valueOf2) {
                return 0;
            }
            if (valueOf == null) {
                return -1;
            }
            if (valueOf2 == null) {
                return 1;
            }
            return valueOf.compareTo(valueOf2);
        }
    }

    /* renamed from: o.synchronizedSetMultimap$write */
    public static final class write<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable valueOf = Integer.valueOf(((doOpenSession) t).read);
            Comparable valueOf2 = Integer.valueOf(((doOpenSession) t2).read);
            if (valueOf == valueOf2) {
                return 0;
            }
            if (valueOf == null) {
                return -1;
            }
            if (valueOf2 == null) {
                return 1;
            }
            return valueOf.compareTo(valueOf2);
        }
    }

    public static doOpenSession read(LtfSummaryAdapter$ParentViewHolder ltfSummaryAdapter$ParentViewHolder) {
        int i = ltfSummaryAdapter$ParentViewHolder.read;
        String str = ltfSummaryAdapter$ParentViewHolder.MediaBrowserCompat$ItemReceiver;
        int i2 = ltfSummaryAdapter$ParentViewHolder.write;
        Iterable<UnselectedTileAdapter$Holder> iterable = ltfSummaryAdapter$ParentViewHolder.IconCompatParcelizer;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (UnselectedTileAdapter$Holder unselectedTileAdapter$Holder : iterable) {
            arrayList.add(new doCloseSessions(unselectedTileAdapter$Holder.read, unselectedTileAdapter$Holder.IconCompatParcelizer, unselectedTileAdapter$Holder.write, unselectedTileAdapter$Holder.MediaBrowserCompat$ItemReceiver));
        }
        return new doOpenSession(i, str, i2, (List) arrayList);
    }
}
