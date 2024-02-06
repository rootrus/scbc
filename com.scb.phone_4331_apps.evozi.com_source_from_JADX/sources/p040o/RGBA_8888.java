package p040o;

import java.util.HashMap;

/* renamed from: o.RGBA_8888 */
public final class RGBA_8888 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "GIF Control";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(1, "Delay");
        write.put(2, "Disposal Method");
        write.put(3, "User Input Flag");
        write.put(4, "Transparent Color Flag");
        write.put(5, "Transparent Color Index");
    }

    public RGBA_8888() {
        read((createCubemapFromCubeFaces) new MATRIX_3X3(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }

    /* renamed from: o.RGBA_8888$write */
    public enum write {
        NOT_SPECIFIED,
        DO_NOT_DISPOSE,
        RESTORE_TO_BACKGROUND_COLOR,
        RESTORE_TO_PREVIOUS,
        TO_BE_DEFINED,
        INVALID;

        public static write read(int i) {
            switch (i) {
                case 0:
                    return NOT_SPECIFIED;
                case 1:
                    return DO_NOT_DISPOSE;
                case 2:
                    return RESTORE_TO_BACKGROUND_COLOR;
                case 3:
                    return RESTORE_TO_PREVIOUS;
                case 4:
                case 5:
                case 6:
                case 7:
                    return TO_BE_DEFINED;
                default:
                    return INVALID;
            }
        }

        public final String toString() {
            switch (C12555.read[ordinal()]) {
                case 1:
                    return "Don't Dispose";
                case 2:
                    return "Invalid value";
                case 3:
                    return "Not Specified";
                case 4:
                    return "Restore to Background Color";
                case 5:
                    return "Restore to Previous";
                case 6:
                    return "To Be Defined";
                default:
                    return super.toString();
            }
        }
    }

    /* renamed from: o.RGBA_8888$5 */
    static /* synthetic */ class C12555 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.RGBA_8888$write[] r0 = p040o.RGBA_8888.write.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.RGBA_8888$write r1 = p040o.RGBA_8888.write.DO_NOT_DISPOSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.RGBA_8888$write r1 = p040o.RGBA_8888.write.INVALID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.RGBA_8888$write r1 = p040o.RGBA_8888.write.NOT_SPECIFIED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.RGBA_8888$write r1 = p040o.RGBA_8888.write.RESTORE_TO_BACKGROUND_COLOR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x003e }
                o.RGBA_8888$write r1 = p040o.RGBA_8888.write.RESTORE_TO_PREVIOUS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.RGBA_8888$write r1 = p040o.RGBA_8888.write.TO_BE_DEFINED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.RGBA_8888.C12555.<clinit>():void");
        }
    }
}
