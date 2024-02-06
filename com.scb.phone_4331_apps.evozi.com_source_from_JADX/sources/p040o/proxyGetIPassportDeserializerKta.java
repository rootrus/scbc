package p040o;

import com.google.zxing.WriterException;
import java.util.Map;
import p040o.CrashlyticsController;

/* renamed from: o.proxyGetIPassportDeserializerKta */
public interface proxyGetIPassportDeserializerKta extends CheckCaptureModule_GetIExtractionServerRttiFactory {
    void IconCompatParcelizer(CrashlyticsController.C322115 r1);

    void MediaBrowserCompat$MediaItem();

    void MediaMetadataCompat();

    /* renamed from: o.proxyGetIPassportDeserializerKta$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements getIIdDeserializerOnDevice {
        private final getAnisotropy MediaBrowserCompat$ItemReceiver = new getAnisotropy();

        public final rsnScriptSetVarI write(String str, rsnIncAllocationCreateTyped rsnincallocationcreatetyped, int i, int i2, Map<rsnIncObjDestroy, ?> map) throws WriterException {
            if (rsnincallocationcreatetyped == rsnIncAllocationCreateTyped.UPC_A) {
                getAnisotropy getanisotropy = this.MediaBrowserCompat$ItemReceiver;
                StringBuilder sb = new StringBuilder("0");
                sb.append(str);
                return getanisotropy.write(sb.toString(), rsnIncAllocationCreateTyped.EAN_13, i, i2, map);
            }
            StringBuilder sb2 = new StringBuilder("Can only encode UPC-A, but got ");
            sb2.append(rsnincallocationcreatetyped);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
