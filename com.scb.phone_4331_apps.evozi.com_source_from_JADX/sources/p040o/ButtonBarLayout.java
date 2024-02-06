package p040o;

import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: o.ButtonBarLayout */
public final class ButtonBarLayout {
    public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;

    static float[] write(float[] fArr, int i) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i, length);
                float[] fArr2 = new float[i];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static Path IconCompatParcelizer(String str) {
        Path path = new Path();
        ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] write = write(str);
        if (write == null) {
            return null;
        }
        try {
            ButtonBarLayout$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(write, path);
            return path;
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error in parsing ");
            sb.append(str);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public static ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] write(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 1;
        while (i2 < str.length()) {
            int IconCompatParcelizer = IconCompatParcelizer(str, i2);
            String trim = str.substring(i, IconCompatParcelizer).trim();
            if (trim.length() > 0) {
                arrayList.add(new ButtonBarLayout$MediaBrowserCompat$ItemReceiver(trim.charAt(0), MediaBrowserCompat$ItemReceiver(trim)));
            }
            i = IconCompatParcelizer;
            i2 = IconCompatParcelizer + 1;
        }
        if (i2 - i == 1 && i < str.length()) {
            arrayList.add(new ButtonBarLayout$MediaBrowserCompat$ItemReceiver(str.charAt(i), new float[0]));
        }
        return (ButtonBarLayout$MediaBrowserCompat$ItemReceiver[]) arrayList.toArray(new ButtonBarLayout$MediaBrowserCompat$ItemReceiver[arrayList.size()]);
    }

    public static ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] MediaBrowserCompat$ItemReceiver(ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] buttonBarLayout$MediaBrowserCompat$ItemReceiverArr) {
        if (buttonBarLayout$MediaBrowserCompat$ItemReceiverArr == null) {
            return null;
        }
        ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2 = new ButtonBarLayout$MediaBrowserCompat$ItemReceiver[buttonBarLayout$MediaBrowserCompat$ItemReceiverArr.length];
        for (int i = 0; i < buttonBarLayout$MediaBrowserCompat$ItemReceiverArr.length; i++) {
            buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2[i] = new ButtonBarLayout$MediaBrowserCompat$ItemReceiver(buttonBarLayout$MediaBrowserCompat$ItemReceiverArr[i]);
        }
        return buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2;
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] buttonBarLayout$MediaBrowserCompat$ItemReceiverArr, ButtonBarLayout$MediaBrowserCompat$ItemReceiver[] buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2) {
        if (buttonBarLayout$MediaBrowserCompat$ItemReceiverArr == null || buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2 == null || buttonBarLayout$MediaBrowserCompat$ItemReceiverArr.length != buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2.length) {
            return false;
        }
        for (int i = 0; i < buttonBarLayout$MediaBrowserCompat$ItemReceiverArr.length; i++) {
            if (buttonBarLayout$MediaBrowserCompat$ItemReceiverArr[i].MediaBrowserCompat$CustomActionResultReceiver != buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2[i].MediaBrowserCompat$CustomActionResultReceiver || buttonBarLayout$MediaBrowserCompat$ItemReceiverArr[i].MediaBrowserCompat$ItemReceiver.length != buttonBarLayout$MediaBrowserCompat$ItemReceiverArr2[i].MediaBrowserCompat$ItemReceiver.length) {
                return false;
            }
        }
        return true;
    }

    private static int IconCompatParcelizer(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        r9 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c A[Catch:{ NumberFormatException -> 0x007f }, LOOP:1: B:8:0x002b->B:28:0x005c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065 A[Catch:{ NumberFormatException -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075 A[Catch:{ NumberFormatException -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077 A[Catch:{ NumberFormatException -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x005f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float[] MediaBrowserCompat$ItemReceiver(java.lang.String r13) {
        /*
            r0 = 0
            char r1 = r13.charAt(r0)
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L_0x009c
            char r1 = r13.charAt(r0)
            r2 = 90
            if (r1 == r2) goto L_0x009c
            int r1 = r13.length()     // Catch:{ NumberFormatException -> 0x007f }
            float[] r1 = new float[r1]     // Catch:{ NumberFormatException -> 0x007f }
            o.ButtonBarLayout$MediaBrowserCompat$CustomActionResultReceiver r2 = new o.ButtonBarLayout$MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NumberFormatException -> 0x007f }
            r2.<init>()     // Catch:{ NumberFormatException -> 0x007f }
            int r3 = r13.length()     // Catch:{ NumberFormatException -> 0x007f }
            r4 = 1
            r6 = r0
            r5 = r4
        L_0x0023:
            if (r5 >= r3) goto L_0x007a
            r2.MediaBrowserCompat$ItemReceiver = r0     // Catch:{ NumberFormatException -> 0x007f }
            r8 = r0
            r9 = r8
            r10 = r9
            r7 = r5
        L_0x002b:
            int r11 = r13.length()     // Catch:{ NumberFormatException -> 0x007f }
            if (r7 >= r11) goto L_0x005f
            char r11 = r13.charAt(r7)     // Catch:{ NumberFormatException -> 0x007f }
            r12 = 32
            if (r11 == r12) goto L_0x0058
            r12 = 69
            if (r11 == r12) goto L_0x0056
            r12 = 101(0x65, float:1.42E-43)
            if (r11 == r12) goto L_0x0056
            switch(r11) {
                case 44: goto L_0x0058;
                case 45: goto L_0x004d;
                case 46: goto L_0x0045;
                default: goto L_0x0044;
            }     // Catch:{ NumberFormatException -> 0x007f }
        L_0x0044:
            goto L_0x0054
        L_0x0045:
            if (r8 != 0) goto L_0x004a
            r9 = r0
            r8 = r4
            goto L_0x005a
        L_0x004a:
            r2.MediaBrowserCompat$ItemReceiver = r4     // Catch:{ NumberFormatException -> 0x007f }
            goto L_0x0058
        L_0x004d:
            if (r7 == r5) goto L_0x0054
            if (r9 != 0) goto L_0x0054
            r2.MediaBrowserCompat$ItemReceiver = r4     // Catch:{ NumberFormatException -> 0x007f }
            goto L_0x0058
        L_0x0054:
            r9 = r0
            goto L_0x005a
        L_0x0056:
            r9 = r4
            goto L_0x005a
        L_0x0058:
            r9 = r0
            r10 = r4
        L_0x005a:
            if (r10 != 0) goto L_0x005f
            int r7 = r7 + 1
            goto L_0x002b
        L_0x005f:
            r2.MediaBrowserCompat$CustomActionResultReceiver = r7     // Catch:{ NumberFormatException -> 0x007f }
            int r7 = r2.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NumberFormatException -> 0x007f }
            if (r5 >= r7) goto L_0x0071
            java.lang.String r5 = r13.substring(r5, r7)     // Catch:{ NumberFormatException -> 0x007f }
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x007f }
            r1[r6] = r5     // Catch:{ NumberFormatException -> 0x007f }
            int r6 = r6 + 1
        L_0x0071:
            boolean r5 = r2.MediaBrowserCompat$ItemReceiver     // Catch:{ NumberFormatException -> 0x007f }
            if (r5 == 0) goto L_0x0077
            r5 = r7
            goto L_0x0023
        L_0x0077:
            int r5 = r7 + 1
            goto L_0x0023
        L_0x007a:
            float[] r13 = write(r1, r6)     // Catch:{ NumberFormatException -> 0x007f }
            return r13
        L_0x007f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "error in parsing \""
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = "\""
            r1.append(r13)
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r1 = r1.toString()
            r13.<init>(r1, r0)
            throw r13
        L_0x009c:
            float[] r13 = new float[r0]
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ButtonBarLayout.MediaBrowserCompat$ItemReceiver(java.lang.String):float[]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    static {
        /*
            o.TierPricingInstallmentAdapter$InstallmentViewHolder[] r0 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            $SwitchMap$org$threeten$bp$temporal$ChronoField = r0
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x001d }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x001d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0028 }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0028 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
        L_0x0028:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0033 }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x0033 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
            r2 = 4
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
        L_0x0033:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x003e }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x003e }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r2 = 5
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0049 }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r2 = 6
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0054 }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ERA     // Catch:{ NoSuchFieldError -> 0x0054 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
            r2 = 7
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ButtonBarLayout.<clinit>():void");
    }
}
