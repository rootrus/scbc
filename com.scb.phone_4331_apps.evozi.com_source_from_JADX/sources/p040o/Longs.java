package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import p040o.CrashlyticsReport;

/* renamed from: o.Longs */
public final /* synthetic */ class Longs implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ Longs(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    /* renamed from: o.Longs$LongArrayAsList */
    public final class LongArrayAsList {
        public static ZSYR2K[] write(Map<String, String> map) {
            onGetStartedClick.write((Object) map, "params");
            Collection arrayList = new ArrayList(map.size());
            for (Map.Entry next : map.entrySet()) {
                arrayList.add(new ZSYR2K((String) next.getKey(), (String) next.getValue()));
            }
            Object[] array = ((List) arrayList).toArray(new ZSYR2K[0]);
            if (array != null) {
                return (ZSYR2K[]) array;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: o.Longs$LexicographicalComparator */
    public final class LexicographicalComparator extends constrainedListMultimap {
        @HmlPinActivity
        public LexicographicalComparator(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }
    }

    public final boolean write(Object obj) {
        CrashlyticsReport.FilesPayload.File.Builder builder = (CrashlyticsReport.FilesPayload.File.Builder) obj;
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            return true;
        }
        if (builder.MediaSessionCompat$ResultReceiverWrapper == null || builder.MediaSessionCompat$ResultReceiverWrapper == getShortName.TYPE_FIXED) {
            return false;
        }
        return true;
    }
}
