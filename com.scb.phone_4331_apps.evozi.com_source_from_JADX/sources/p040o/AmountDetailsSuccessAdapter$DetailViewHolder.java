package p040o;

import java.util.BitSet;

/* renamed from: o.AmountDetailsSuccessAdapter$DetailViewHolder */
public final class AmountDetailsSuccessAdapter$DetailViewHolder {
    public static final AmountDetailsSuccessAdapter$DetailViewHolder read = new AmountDetailsSuccessAdapter$DetailViewHolder();

    private static boolean IconCompatParcelizer(char c) {
        return c == ' ' || c == 9 || c == 13 || c == 10;
    }

    public static BitSet IconCompatParcelizer(int... iArr) {
        BitSet bitSet = new BitSet();
        for (int i : iArr) {
            bitSet.set(i);
        }
        return bitSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r3 == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r0.length() <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r0.append(' ');
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String write(p040o.DepositTransactionAdapter$ChildViewHolder_ViewBinding r6, p040o.RadioButtonGroupAdapter$RadioButtonViewGroup r7, java.util.BitSet r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0005:
            r1 = 1
            r2 = 0
            r3 = r2
        L_0x0008:
            int r4 = r7.write
            int r5 = r7.read
            if (r4 < r5) goto L_0x0010
            r4 = r1
            goto L_0x0011
        L_0x0010:
            r4 = r2
        L_0x0011:
            if (r4 != 0) goto L_0x003d
            int r4 = r7.write
            char r4 = r6.charAt(r4)
            if (r8 == 0) goto L_0x0021
            boolean r5 = r8.get(r4)
            if (r5 != 0) goto L_0x003d
        L_0x0021:
            boolean r4 = IconCompatParcelizer((char) r4)
            if (r4 == 0) goto L_0x002c
            read(r6, r7)
            r3 = r1
            goto L_0x0008
        L_0x002c:
            if (r3 == 0) goto L_0x0039
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0039
            r1 = 32
            r0.append(r1)
        L_0x0039:
            IconCompatParcelizer(r6, r7, r8, r0)
            goto L_0x0005
        L_0x003d:
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AmountDetailsSuccessAdapter$DetailViewHolder.write(o.DepositTransactionAdapter$ChildViewHolder_ViewBinding, o.RadioButtonGroupAdapter$RadioButtonViewGroup, java.util.BitSet):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r4 != '\"') goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r3 == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r0.length() <= 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r0.append(' ');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        read(r6, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r3 == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        if (r0.length() <= 0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        r0.append(' ');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        read(r6, r7, r8, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String MediaBrowserCompat$CustomActionResultReceiver(p040o.DepositTransactionAdapter$ChildViewHolder_ViewBinding r6, p040o.RadioButtonGroupAdapter$RadioButtonViewGroup r7, java.util.BitSet r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0005:
            r1 = 1
            r2 = 0
            r3 = r2
        L_0x0008:
            int r4 = r7.write
            int r5 = r7.read
            if (r4 < r5) goto L_0x0010
            r4 = r1
            goto L_0x0011
        L_0x0010:
            r4 = r2
        L_0x0011:
            if (r4 != 0) goto L_0x0050
            int r4 = r7.write
            char r4 = r6.charAt(r4)
            if (r8 == 0) goto L_0x0021
            boolean r5 = r8.get(r4)
            if (r5 != 0) goto L_0x0050
        L_0x0021:
            boolean r5 = IconCompatParcelizer((char) r4)
            if (r5 == 0) goto L_0x002c
            read(r6, r7)
            r3 = r1
            goto L_0x0008
        L_0x002c:
            r1 = 34
            r2 = 32
            if (r4 != r1) goto L_0x0041
            if (r3 == 0) goto L_0x003d
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x003d
            r0.append(r2)
        L_0x003d:
            read(r6, r7, r0)
            goto L_0x0005
        L_0x0041:
            if (r3 == 0) goto L_0x004c
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x004c
            r0.append(r2)
        L_0x004c:
            read(r6, r7, r8, r0)
            goto L_0x0005
        L_0x0050:
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AmountDetailsSuccessAdapter$DetailViewHolder.MediaBrowserCompat$CustomActionResultReceiver(o.DepositTransactionAdapter$ChildViewHolder_ViewBinding, o.RadioButtonGroupAdapter$RadioButtonViewGroup, java.util.BitSet):java.lang.String");
    }

    private static void IconCompatParcelizer(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup, BitSet bitSet, StringBuilder sb) {
        int i = radioButtonGroupAdapter$RadioButtonViewGroup.write;
        int i2 = radioButtonGroupAdapter$RadioButtonViewGroup.read;
        for (int i3 = radioButtonGroupAdapter$RadioButtonViewGroup.write; i3 < i2; i3++) {
            char charAt = depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(i3);
            if ((bitSet != null && bitSet.get(charAt)) || IconCompatParcelizer(charAt)) {
                break;
            }
            i++;
            sb.append(charAt);
        }
        radioButtonGroupAdapter$RadioButtonViewGroup.write(i);
    }

    private static void read(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup, StringBuilder sb) {
        if (!(radioButtonGroupAdapter$RadioButtonViewGroup.write >= radioButtonGroupAdapter$RadioButtonViewGroup.read)) {
            int i = radioButtonGroupAdapter$RadioButtonViewGroup.write;
            int i2 = radioButtonGroupAdapter$RadioButtonViewGroup.write;
            int i3 = radioButtonGroupAdapter$RadioButtonViewGroup.read;
            if (depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(i) == '\"') {
                int i4 = i + 1;
                int i5 = i2 + 1;
                boolean z = false;
                while (true) {
                    if (i5 >= i3) {
                        break;
                    }
                    char charAt = depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(i5);
                    if (z) {
                        if (!(charAt == '\"' || charAt == '\\')) {
                            sb.append('\\');
                        }
                        sb.append(charAt);
                        z = false;
                    } else if (charAt == '\"') {
                        i4++;
                        break;
                    } else if (charAt == '\\') {
                        z = true;
                    } else if (!(charAt == 13 || charAt == 10)) {
                        sb.append(charAt);
                    }
                    i5++;
                    i4++;
                }
                radioButtonGroupAdapter$RadioButtonViewGroup.write(i4);
            }
        }
    }

    private static void read(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup, BitSet bitSet, StringBuilder sb) {
        int i = radioButtonGroupAdapter$RadioButtonViewGroup.write;
        int i2 = radioButtonGroupAdapter$RadioButtonViewGroup.read;
        for (int i3 = radioButtonGroupAdapter$RadioButtonViewGroup.write; i3 < i2; i3++) {
            char charAt = depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(i3);
            if ((bitSet != null && bitSet.get(charAt)) || IconCompatParcelizer(charAt) || charAt == '\"') {
                break;
            }
            i++;
            sb.append(charAt);
        }
        radioButtonGroupAdapter$RadioButtonViewGroup.write(i);
    }

    public static void read(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup) {
        int i = radioButtonGroupAdapter$RadioButtonViewGroup.write;
        int i2 = radioButtonGroupAdapter$RadioButtonViewGroup.write;
        int i3 = radioButtonGroupAdapter$RadioButtonViewGroup.read;
        while (i2 < i3 && IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(i2))) {
            i++;
            i2++;
        }
        radioButtonGroupAdapter$RadioButtonViewGroup.write(i);
    }
}
