package com.kofax.kmc.kut.utilities;

import java.io.PrintStream;

public class Sizeof {

    /* renamed from: nT */
    private static SizeOfNewObject f711nT;

    /* renamed from: nU */
    private static final Runtime f712nU = Runtime.getRuntime();

    public enum ObjectDataTypes {
        DATA_TYPE_OBJECT_SHELL,
        DATA_TYPE_OBJECT_REF,
        DATA_TYPE_LONG_FIELD,
        DATA_TYPE_INT_FIELD,
        DATA_TYPE_SHORT_FIELD,
        DATA_TYPE_CHAR_FIELD,
        DATA_TYPE_BYTE_FIELD,
        DATA_TYPE_BOOLEAN_FIELD,
        DATA_TYPE_DOUBLE_FIELD,
        DATA_TYPE_FLOAT_FIELD,
        DATA_TYPE_APP_CREATED
    }

    public interface SizeOfNewObject {
        Object genNextNewObject();
    }

    /* renamed from: e */
    private static Object m519e(int i) {
        return f711nT.genNextNewObject();
    }

    public static void registerNewObjectListener(SizeOfNewObject sizeOfNewObject) {
        f711nT = sizeOfNewObject;
    }

    public static int computeObjectSize(ObjectDataTypes objectDataTypes, int i) throws Exception {
        int round;
        Object obj;
        synchronized (Sizeof.class) {
            m516aH();
            m518aJ();
            Object[] objArr = new Object[i];
            long j = 0;
            for (int i2 = -1; i2 < i; i2++) {
                switch (C04761.f713nV[objectDataTypes.ordinal()]) {
                    case 1:
                        obj = new Object();
                        break;
                    case 2:
                        obj = new Object();
                        break;
                    case 3:
                        obj = new Long((long) i2);
                        break;
                    case 4:
                        obj = Integer.valueOf(i2);
                        break;
                    case 5:
                        obj = new Short((short) i2);
                        break;
                    case 6:
                        obj = new Character((char) i2);
                        break;
                    case 7:
                        obj = new Byte((byte) i2);
                        break;
                    case 8:
                        obj = Boolean.TRUE;
                        break;
                    case 9:
                        obj = new Double((double) i2);
                        break;
                    case 10:
                        obj = new Float((float) i2);
                        break;
                    case 11:
                        obj = m519e(i2);
                        break;
                    default:
                        throw new UnsupportedOperationException("computeObjectSize method: unsupported Object Data Type");
                }
                if (i2 >= 0) {
                    objArr[i2] = obj;
                } else {
                    m516aH();
                    j = m518aJ();
                }
            }
            m516aH();
            long aJ = m518aJ();
            long j2 = aJ - j;
            round = Math.round(((float) j2) / ((float) i));
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("'before' heap: ");
            sb.append(j);
            sb.append(", 'after' heap: ");
            sb.append(aJ);
            printStream.println(sb.toString());
            PrintStream printStream2 = System.out;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("heap delta: ");
            sb2.append(j2);
            sb2.append(", {");
            sb2.append(objArr[0].getClass());
            sb2.append("} size = ");
            sb2.append(round);
            sb2.append(" bytes");
            printStream2.println(sb2.toString());
            for (int i3 = 0; i3 < i; i3++) {
                objArr[i3] = null;
            }
        }
        return round;
    }

    /* renamed from: com.kofax.kmc.kut.utilities.Sizeof$1 */
    static /* synthetic */ class C04761 {

        /* renamed from: nV */
        static final /* synthetic */ int[] f713nV;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.kofax.kmc.kut.utilities.Sizeof$ObjectDataTypes[] r0 = com.kofax.kmc.kut.utilities.Sizeof.ObjectDataTypes.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f713nV = r0
                com.kofax.kmc.kut.utilities.Sizeof$ObjectDataTypes r1 = com.kofax.kmc.kut.utilities.Sizeof.ObjectDataTypes.DATA_TYPE_OBJECT_SHELL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f713nV     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.kut.utilities.Sizeof$ObjectDataTypes r1 = com.kofax.kmc.kut.utilities.Sizeof.ObjectDataTypes.DATA_TYPE_OBJECT_REF     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f713nV     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.kmc.kut.utilities.Sizeof$ObjectDataTypes r1 = com.kofax.kmc.kut.utilities.Sizeof.ObjectDataTypes.DATA_TYPE_LONG_FIELD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f713nV     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.kofax.kmc.kut.utilities.Sizeof$ObjectDataTypes r1 = com.kofax.kmc.kut.utilities.Sizeof.ObjectDataTypes.DATA_TYPE_INT_FIELD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f713nV     // Catch:{ NoSuchFieldError -> 0x003e }
                com.kofax.kmc.kut.utilities.Sizeof$ObjectDataTypes r1 = com.kofax.kmc.kut.utilities.Sizeof.ObjectDataTypes.DATA_TYPE_SHORT_FIELD     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f713nV     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.kofax.kmc.kut.utilities.Sizeof$ObjectDataTypes r1 = com.kofax.kmc.kut.utilities.Sizeof.ObjectDataTypes.DATA_TYPE_CHAR_FIELD     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f713nV     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.kofax.kmc.kut.utilities.Sizeof$ObjectDataTypes r1 = com.kofax.kmc.kut.utilities.Sizeof.ObjectDataTypes.DATA_TYPE_BYTE_FIELD     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f713nV     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.kofax.kmc.kut.utilities.Sizeof$ObjectDataTypes r1 = com.kofax.kmc.kut.utilities.Sizeof.ObjectDataTypes.DATA_TYPE_BOOLEAN_FIELD     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f713nV     // Catch:{ NoSuchFieldError -> 0x006c }
                com.kofax.kmc.kut.utilities.Sizeof$ObjectDataTypes r1 = com.kofax.kmc.kut.utilities.Sizeof.ObjectDataTypes.DATA_TYPE_DOUBLE_FIELD     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f713nV     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.kofax.kmc.kut.utilities.Sizeof$ObjectDataTypes r1 = com.kofax.kmc.kut.utilities.Sizeof.ObjectDataTypes.DATA_TYPE_FLOAT_FIELD     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f713nV     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.kofax.kmc.kut.utilities.Sizeof$ObjectDataTypes r1 = com.kofax.kmc.kut.utilities.Sizeof.ObjectDataTypes.DATA_TYPE_APP_CREATED     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.kut.utilities.Sizeof.C04761.<clinit>():void");
        }
    }

    /* renamed from: aH */
    private static void m516aH() throws Exception {
        for (int i = 0; i < 4; i++) {
            m517aI();
        }
    }

    /* renamed from: aI */
    private static void m517aI() throws Exception {
        long aJ = m518aJ();
        long j = Long.MAX_VALUE;
        int i = 0;
        while (aJ < j && i < 500) {
            f712nU.runFinalization();
            f712nU.gc();
            Thread.yield();
            i++;
            long j2 = aJ;
            aJ = m518aJ();
            j = j2;
        }
    }

    /* renamed from: aJ */
    private static long m518aJ() {
        return f712nU.totalMemory() - f712nU.freeMemory();
    }
}
