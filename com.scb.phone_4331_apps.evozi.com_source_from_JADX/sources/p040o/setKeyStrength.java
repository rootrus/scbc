package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import p040o.isTerminated;

/* renamed from: o.setKeyStrength */
public final class setKeyStrength extends constrainedListMultimap {
    @HmlPinActivity
    public setKeyStrength(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    public final List<isTerminated> MediaBrowserCompat$CustomActionResultReceiver(zzxj zzxj) {
        ArrayList arrayList = new ArrayList();
        String str = zzxj.write;
        isTerminated.write write = isTerminated.write();
        write.write = str;
        write.MediaBrowserCompat$SearchResultReceiver = 0;
        arrayList.add(0, new isTerminated(write, (byte) 0));
        arrayList.addAll(1, MediaBrowserCompat$CustomActionResultReceiver(zzxj.read, new getExpireAfterAccessNanos(this), getInitialCapacity.MediaBrowserCompat$CustomActionResultReceiver));
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final isTerminated write(zzxg zzxg) {
        String str;
        isTerminated.write write = isTerminated.write();
        write.read = zzxg.IconCompatParcelizer;
        write.MediaBrowserCompat$CustomActionResultReceiver = zzxg.MediaBrowserCompat$CustomActionResultReceiver;
        write.MediaBrowserCompat$ItemReceiver = zzxg.MediaDescriptionCompat;
        write.MediaDescriptionCompat = zzxg.MediaBrowserCompat$ItemReceiver;
        write.MediaMetadataCompat = write(Double.valueOf(zzxg.MediaBrowserCompat$SearchResultReceiver));
        write.RatingCompat = write(Double.valueOf(zzxg.write));
        write.MediaBrowserCompat$MediaItem = zzxg.RatingCompat;
        if (zzxg.read == null) {
            str = "";
        } else {
            str = IconCompatParcelizer("HH:mm", zzxg.read);
        }
        write.IconCompatParcelizer = str;
        return new isTerminated(write, (byte) 0);
    }
}
