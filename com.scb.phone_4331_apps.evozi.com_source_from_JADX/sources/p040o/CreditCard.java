package p040o;

import java.util.List;
import p040o.CustomConcurrentHashMap;

/* renamed from: o.CreditCard */
public interface CreditCard extends CheckCaptureModule_GetICheckDeserializerRttiFactory {

    /* renamed from: o.CreditCard$1 */
    public interface C11681 extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$ItemReceiver();

        void read();

        void read(finalizePreviousNativeSession finalizepreviousnativesession);

        void write();

        void write(finalizePreviousNativeSession finalizepreviousnativesession);
    }

    void MediaBrowserCompat$CustomActionResultReceiver(CustomConcurrentHashMap.NullEntry nullEntry, int i, int i2);

    void read(List<String> list);

    void write(String str);

    void write(List<String> list);

    void write(boolean z);
}
