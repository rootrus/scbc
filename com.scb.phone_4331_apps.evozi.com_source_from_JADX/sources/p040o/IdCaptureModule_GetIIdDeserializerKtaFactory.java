package p040o;

import com.kony.sdk.common.IdentityServiceException;
import java.util.List;

/* renamed from: o.IdCaptureModule_GetIIdDeserializerKtaFactory */
public interface IdCaptureModule_GetIIdDeserializerKtaFactory {

    /* renamed from: o.IdCaptureModule_GetIIdDeserializerKtaFactory$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(setCores setcores, boolean z);

        void write();

        void write(String str);
    }

    /* renamed from: o.IdCaptureModule_GetIIdDeserializerKtaFactory$write */
    public interface write {
        List<String> MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(String str, String str2);

        void onDestroy();

        void read(String str);

        void read(String str, int i);

        void read(read read);
    }

    void IconCompatParcelizer();

    void read(IdentityServiceException identityServiceException);
}
