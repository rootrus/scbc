package p039io.realm.internal;

import java.util.Locale;
import org.jmrtd.cbeff.ISO781611;
import p040o.HmlNTBAdditionalDocumentActivity_ViewBinding;
import p040o.HmlNTBMonthlyIncomeAboutActivity;
import p040o.HmlNTBOperatingAccountActivity;

/* renamed from: io.realm.internal.Property */
public class Property implements HmlNTBMonthlyIncomeAboutActivity {
    private static final long MediaBrowserCompat$ItemReceiver = nativeGetFinalizerPtr();
    public long MediaBrowserCompat$CustomActionResultReceiver;

    static native long nativeCreatePersistedProperty(String str, int i, boolean z, boolean z2);

    public static native long nativeGetColumnIndex(long j);

    private static native long nativeGetFinalizerPtr();

    public static native String nativeGetLinkedObjectName(long j);

    public static native int nativeGetType(long j);

    public Property(long j) {
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
        new NativeObjectReference(HmlNTBOperatingAccountActivity.write, this, HmlNTBOperatingAccountActivity.read);
    }

    /* renamed from: io.realm.internal.Property$4 */
    static /* synthetic */ class C63034 {
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.HmlNTBAdditionalDocumentActivity_ViewBinding[] r0 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.OBJECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.LIST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.LINKING_OBJECTS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.INTEGER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x003e }
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.STRING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.BINARY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.DATE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x006c }
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.FLOAT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0084 }
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.INTEGER_LIST     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0090 }
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.BOOLEAN_LIST     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x009c }
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.STRING_LIST     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x00a8 }
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.BINARY_LIST     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x00b4 }
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.DATE_LIST     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x00c0 }
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.FLOAT_LIST     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x00cc }
                o.HmlNTBAdditionalDocumentActivity_ViewBinding r1 = p040o.HmlNTBAdditionalDocumentActivity_ViewBinding.DOUBLE_LIST     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p039io.realm.internal.Property.C63034.<clinit>():void");
        }
    }

    static int write(HmlNTBAdditionalDocumentActivity_ViewBinding hmlNTBAdditionalDocumentActivity_ViewBinding, boolean z) {
        int i = 0;
        switch (C63034.write[hmlNTBAdditionalDocumentActivity_ViewBinding.ordinal()]) {
            case 1:
                return 71;
            case 2:
                return 135;
            case 3:
                return 136;
            case 4:
                break;
            case 5:
                i = 1;
                break;
            case 6:
                i = 2;
                break;
            case 7:
                i = 3;
                break;
            case 8:
                i = 4;
                break;
            case 9:
                i = 5;
                break;
            case 10:
                i = 6;
                break;
            case 11:
                i = 128;
                break;
            case 12:
                i = 129;
                break;
            case 13:
                i = ISO781611.BIOMETRIC_SUBTYPE_TAG;
                break;
            case 14:
                i = 131;
                break;
            case 15:
                i = 132;
                break;
            case 16:
                i = 133;
                break;
            case 17:
                i = 134;
                break;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported filed type: '%s'.", new Object[]{hmlNTBAdditionalDocumentActivity_ViewBinding.name()}));
        }
        return i | 64;
    }

    public static HmlNTBAdditionalDocumentActivity_ViewBinding write(int i) {
        int i2 = i & -65;
        switch (i2) {
            case 0:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.INTEGER;
            case 1:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.BOOLEAN;
            case 2:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.STRING;
            case 3:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.BINARY;
            case 4:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.DATE;
            case 5:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.FLOAT;
            case 6:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.DOUBLE;
            case 7:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.OBJECT;
            default:
                switch (i2) {
                    case 128:
                        return HmlNTBAdditionalDocumentActivity_ViewBinding.INTEGER_LIST;
                    case 129:
                        return HmlNTBAdditionalDocumentActivity_ViewBinding.BOOLEAN_LIST;
                    case ISO781611.BIOMETRIC_SUBTYPE_TAG /*130*/:
                        return HmlNTBAdditionalDocumentActivity_ViewBinding.STRING_LIST;
                    case 131:
                        return HmlNTBAdditionalDocumentActivity_ViewBinding.BINARY_LIST;
                    case 132:
                        return HmlNTBAdditionalDocumentActivity_ViewBinding.DATE_LIST;
                    case 133:
                        return HmlNTBAdditionalDocumentActivity_ViewBinding.FLOAT_LIST;
                    case 134:
                        return HmlNTBAdditionalDocumentActivity_ViewBinding.DOUBLE_LIST;
                    case 135:
                        return HmlNTBAdditionalDocumentActivity_ViewBinding.LIST;
                    case 136:
                        return HmlNTBAdditionalDocumentActivity_ViewBinding.LINKING_OBJECTS;
                    default:
                        throw new IllegalArgumentException(String.format(Locale.US, "Unsupported property type: '%d'", new Object[]{Integer.valueOf(i)}));
                }
        }
    }

    public final long MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final long read() {
        return MediaBrowserCompat$ItemReceiver;
    }
}
