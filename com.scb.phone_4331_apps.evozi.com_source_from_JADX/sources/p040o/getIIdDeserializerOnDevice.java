package p040o;

import com.google.zxing.WriterException;
import java.util.List;
import java.util.Map;
import p040o.C3080xc2f5febc;
import p040o.ComponentDiscovery;

/* renamed from: o.getIIdDeserializerOnDevice */
public interface getIIdDeserializerOnDevice {

    /* renamed from: o.getIIdDeserializerOnDevice$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(boolean z);

        void MediaBrowserCompat$CustomActionResultReceiver(C3080xc2f5febc.C30811 r1, jsonFromMapEntryString jsonfrommapentrystring);

        void MediaBrowserCompat$CustomActionResultReceiver(boolean z);

        void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3, String str4, String str5);

        void MediaBrowserCompat$ItemReceiver(ComponentDiscoveryService componentDiscoveryService, String str);

        void MediaBrowserCompat$ItemReceiver(boolean z);

        void MediaBrowserCompat$ItemReceiver(boolean z, boolean z2, int i);

        void read();

        void read(boolean z);

        void write(List<ComponentDiscovery.RegistrarNameRetriever> list, Integer num);

        void write(boolean z);
    }

    rsnScriptSetVarI write(String str, rsnIncAllocationCreateTyped rsnincallocationcreatetyped, int i, int i2, Map<rsnIncObjDestroy, ?> map) throws WriterException;
}
