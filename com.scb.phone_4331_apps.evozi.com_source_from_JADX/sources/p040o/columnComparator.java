package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.QueueFileLogStore;
import p040o.TreeBasedTable;
import p040o.zzm;

/* renamed from: o.columnComparator */
public final class columnComparator extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public columnComparator(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    public final getLogBytes IconCompatParcelizer(zzm.zzg zzg, boolean z) {
        List<? extends T> list;
        onGetStartedClick.write((Object) zzg, "model");
        int i = zzg.MediaDescriptionCompat;
        String str = zzg.MediaMetadataCompat;
        String str2 = zzg.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = zzg.MediaBrowserCompat$SearchResultReceiver;
        String MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(zzg.write, z);
        String str4 = zzg.IconCompatParcelizer;
        String str5 = zzg.read;
        zzm.zze zze = zzg.MediaBrowserCompat$MediaItem;
        int i2 = zze != null ? zze.IconCompatParcelizer : 0;
        if (zze != null) {
            list = zze.write;
        } else {
            list = null;
        }
        getLogBytes getlogbytes = new getLogBytes(i, str, str2, str3, MediaBrowserCompat$CustomActionResultReceiver, str4, str5, new QueueFileLogStore.C37461(i2, MediaBrowserCompat$ItemReceiver(list, new TreeBasedTable.Factory(new columnComparator$MediaBrowserCompat$CustomActionResultReceiver(this)))));
        getlogbytes.write = zzg.MediaBrowserCompat$ItemReceiver;
        return getlogbytes;
    }

    public final QueueFileLogStore.LogBytes read(CameraUpdateFactory cameraUpdateFactory) {
        Double d;
        OffsetDateTime offsetDateTime = null;
        String str = cameraUpdateFactory != null ? cameraUpdateFactory.MediaBrowserCompat$CustomActionResultReceiver : null;
        if (cameraUpdateFactory != null) {
            d = Double.valueOf(cameraUpdateFactory.MediaBrowserCompat$ItemReceiver);
        } else {
            d = null;
        }
        String write = write(d);
        String str2 = cameraUpdateFactory != null ? cameraUpdateFactory.write : null;
        if (cameraUpdateFactory != null) {
            offsetDateTime = cameraUpdateFactory.read;
        }
        return new QueueFileLogStore.LogBytes(str, write, str2, IconCompatParcelizer("dd MMM - HH:mm", offsetDateTime), false);
    }
}
