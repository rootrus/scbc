package p040o;

import android.content.Context;
import p040o.loadInBackground;

/* renamed from: o.getUsable */
public interface getUsable {

    /* renamed from: o.getUsable$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void MediaBrowserCompat$ItemReceiver(String str, String str2);
    }

    /* renamed from: o.getUsable$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(String str);

        void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3);

        void MediaBrowserCompat$CustomActionResultReceiver(access$2100 access_2100);

        void MediaBrowserCompat$MediaItem(String str);

        void read(String str);

        void write(String str);
    }

    loadInBackground MediaBrowserCompat$CustomActionResultReceiver(Context context, loadInBackground.write write);
}
