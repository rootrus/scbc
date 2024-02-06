package p040o;

import android.graphics.Bitmap;
import java.util.List;
import p040o.zzxc;

/* renamed from: o.IIdExtractor */
public interface IIdExtractor {

    /* renamed from: o.IIdExtractor$write */
    public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(String str);

        void IconCompatParcelizer(getBuildVersion getbuildversion);

        void MediaBrowserCompat$CustomActionResultReceiver(boolean z);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$SearchResultReceiver(String str);

        void read();

        void read(Bitmap bitmap);

        void read(String str);

        void write(String str);
    }

    BScanCNotificationDeepLinkActivity<zzxb> IconCompatParcelizer(String str, String str2, String str3, String str4, String str5, String str6);

    BScanCNotificationDeepLinkActivity<zzxe> MediaBrowserCompat$ItemReceiver();

    BScanCNotificationDeepLinkActivity<Boolean> MediaBrowserCompat$ItemReceiver(classify classify);

    BScanCNotificationDeepLinkActivity<zzxc.zzc> read(ComputingConcurrentHashMap computingConcurrentHashMap);

    void read();

    BScanCNotificationDeepLinkActivity<List<zzxc.zzb>> write(String str);
}
