package p040o;

import com.google.zxing.WriterException;
import java.util.Map;
import p040o.EkycService;
import p040o.RenderScript;
import p040o.proxyGetIPassportDeserializerKta;

/* renamed from: o.rsnScriptBindAllocation */
public final class rsnScriptBindAllocation implements getIIdDeserializerOnDevice {

    /* renamed from: o.rsnScriptBindAllocation$3 */
    static /* synthetic */ class C14393 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.rsnIncAllocationCreateTyped[] r0 = p040o.rsnIncAllocationCreateTyped.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.rsnIncAllocationCreateTyped r1 = p040o.rsnIncAllocationCreateTyped.EAN_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.rsnIncAllocationCreateTyped r1 = p040o.rsnIncAllocationCreateTyped.UPC_E     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.rsnIncAllocationCreateTyped r1 = p040o.rsnIncAllocationCreateTyped.EAN_13     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.rsnIncAllocationCreateTyped r1 = p040o.rsnIncAllocationCreateTyped.UPC_A     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x003e }
                o.rsnIncAllocationCreateTyped r1 = p040o.rsnIncAllocationCreateTyped.QR_CODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.rsnIncAllocationCreateTyped r1 = p040o.rsnIncAllocationCreateTyped.CODE_39     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.rsnIncAllocationCreateTyped r1 = p040o.rsnIncAllocationCreateTyped.CODE_93     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.rsnIncAllocationCreateTyped r1 = p040o.rsnIncAllocationCreateTyped.CODE_128     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x006c }
                o.rsnIncAllocationCreateTyped r1 = p040o.rsnIncAllocationCreateTyped.ITF     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.rsnIncAllocationCreateTyped r1 = p040o.rsnIncAllocationCreateTyped.PDF_417     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0084 }
                o.rsnIncAllocationCreateTyped r1 = p040o.rsnIncAllocationCreateTyped.CODABAR     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0090 }
                o.rsnIncAllocationCreateTyped r1 = p040o.rsnIncAllocationCreateTyped.DATA_MATRIX     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x009c }
                o.rsnIncAllocationCreateTyped r1 = p040o.rsnIncAllocationCreateTyped.AZTEC     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.rsnScriptBindAllocation.C14393.<clinit>():void");
        }
    }

    public final rsnScriptSetVarI write(String str, rsnIncAllocationCreateTyped rsnincallocationcreatetyped, int i, int i2, Map<rsnIncObjDestroy, ?> map) throws WriterException {
        getIIdDeserializerOnDevice getiiddeserializerondevice;
        switch (C14393.read[rsnincallocationcreatetyped.ordinal()]) {
            case 1:
                getiiddeserializerondevice = new WRAP_NEAREST();
                break;
            case 2:
                getiiddeserializerondevice = new createFieldID();
                break;
            case 3:
                getiiddeserializerondevice = new getAnisotropy();
                break;
            case 4:
                getiiddeserializerondevice = new proxyGetIPassportDeserializerKta.IconCompatParcelizer();
                break;
            case 5:
                getiiddeserializerondevice = new C6504x8d64215a();
                break;
            case 6:
                getiiddeserializerondevice = new CLAMP_LINEAR();
                break;
            case 7:
                getiiddeserializerondevice = new CLAMP_NEAREST();
                break;
            case 8:
                getiiddeserializerondevice = new RenderScript.Priority();
                break;
            case 9:
                getiiddeserializerondevice = new MIRRORED_REPEAT_NEAREST();
                break;
            case 10:
                getiiddeserializerondevice = new EkycService.read();
                break;
            case 11:
                getiiddeserializerondevice = new RenderScript.RSMessageHandler();
                break;
            case 12:
                getiiddeserializerondevice = new C10882getLAR$MediaBrowserCompat$ItemReceiver();
                break;
            case 13:
                getiiddeserializerondevice = new CheckCaptureActivity();
                break;
            default:
                StringBuilder sb = new StringBuilder("No encoder available for format ");
                sb.append(rsnincallocationcreatetyped);
                throw new IllegalArgumentException(sb.toString());
        }
        return getiiddeserializerondevice.write(str, rsnincallocationcreatetyped, i, i2, map);
    }
}
