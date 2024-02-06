package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.AutoValue_CrashlyticsReport_FilesPayload;

/* renamed from: o.ByteStreams */
public final /* synthetic */ class ByteStreams implements findFragmentByWho {
    public static final /* synthetic */ ByteStreams read = new ByteStreams();

    private /* synthetic */ ByteStreams() {
    }

    /* renamed from: o.ByteStreams$ByteArrayDataOutputStream */
    public final class ByteArrayDataOutputStream extends constrainedListMultimap {
        @HmlPinActivity
        public ByteArrayDataOutputStream(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }
    }

    /* renamed from: o.ByteStreams$ByteArrayDataInputStream */
    public final class ByteArrayDataInputStream extends constrainedListMultimap {
        @HmlPinActivity
        public ByteArrayDataInputStream(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }

        public static setOrgId IconCompatParcelizer(isMyLocationEnabled ismylocationenabled, String str) {
            String str2;
            if (ismylocationenabled == null) {
                return null;
            }
            setOrgId MediaBrowserCompat$CustomActionResultReceiver = setOrgId.MediaBrowserCompat$CustomActionResultReceiver();
            "en".equals(str);
            "en".equals(str);
            MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = ismylocationenabled.MediaDescriptionCompat;
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = ismylocationenabled.MediaBrowserCompat$CustomActionResultReceiver;
            if (ismylocationenabled.MediaBrowserCompat$ItemReceiver == null || ismylocationenabled.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                str2 = "";
            } else {
                str2 = ismylocationenabled.MediaBrowserCompat$ItemReceiver;
            }
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = str2;
            MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = ismylocationenabled.IconCompatParcelizer;
            MediaBrowserCompat$CustomActionResultReceiver.read = ismylocationenabled.read;
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
    }

    public final Object IconCompatParcelizer(Object obj) {
        return Integer.valueOf(((AutoValue_CrashlyticsReport_FilesPayload.C30601) obj).MediaDescriptionCompat);
    }
}
