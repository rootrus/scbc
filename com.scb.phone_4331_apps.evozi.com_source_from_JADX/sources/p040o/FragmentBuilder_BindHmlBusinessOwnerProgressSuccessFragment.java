package p040o;

/* renamed from: o.FragmentBuilder_BindHmlBusinessOwnerProgressSuccessFragment */
public final class FragmentBuilder_BindHmlBusinessOwnerProgressSuccessFragment implements FragmentBuilder_BindHmlETBManageEmailVerificationFragment {
    /* JADX WARNING: type inference failed for: r15v0, types: [java.util.List, java.util.List<android.view.View>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<android.view.View> read(java.util.List<android.view.View> r15) {
        /*
            r14 = this;
            if (r15 == 0) goto L_0x00f9
            int r0 = r15.size()
            if (r0 == 0) goto L_0x00f9
            int r0 = r15.size()
            android.view.View[] r1 = new android.view.View[r0]
            int r2 = r15.size()
            int[] r3 = new int[r2]
            r4 = 0
            r5 = r4
        L_0x0016:
            int r6 = r15.size()
            r7 = 1
            if (r5 >= r6) goto L_0x00c1
            java.lang.Object r6 = r15.get(r5)
            android.view.View r6 = (android.view.View) r6
        L_0x0023:
            android.view.ViewParent r8 = r6.getParent()
            if (r8 == 0) goto L_0x0062
            android.view.ViewParent r8 = r6.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0062
            android.view.View r8 = r6.getRootView()
            android.view.ViewParent r9 = r6.getParent()
            if (r8 == r9) goto L_0x0062
            android.view.ViewParent r8 = r6.getParent()
            android.view.View r8 = (android.view.View) r8
            r9 = r4
        L_0x0042:
            int r10 = r15.size()
            if (r9 >= r10) goto L_0x005b
            if (r9 == r5) goto L_0x0058
            java.lang.Object r10 = r15.get(r9)
            android.view.View r10 = (android.view.View) r10
            if (r10 != r8) goto L_0x0058
            r8 = r3[r5]
            int r8 = r8 + r7
            r3[r5] = r8
            goto L_0x005b
        L_0x0058:
            int r9 = r9 + 1
            goto L_0x0042
        L_0x005b:
            android.view.ViewParent r6 = r6.getParent()
            android.view.View r6 = (android.view.View) r6
            goto L_0x0023
        L_0x0062:
            r6 = r4
        L_0x0063:
            if (r6 >= r5) goto L_0x00bd
            r8 = r3[r6]
            r9 = r3[r5]
            if (r8 != r9) goto L_0x00ba
            java.lang.Object r8 = r15.get(r6)
            android.view.View r8 = (android.view.View) r8
            java.lang.Object r9 = r15.get(r5)
            android.view.View r9 = (android.view.View) r9
            r10 = r3[r6]
            r11 = r4
        L_0x007a:
            if (r11 >= r10) goto L_0x00a7
            android.view.ViewParent r12 = r8.getParent()
            android.view.ViewParent r13 = r9.getParent()
            if (r12 != r13) goto L_0x0098
            android.view.ViewParent r10 = r8.getParent()
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            int r9 = r10.indexOfChild(r9)
            int r8 = r10.indexOfChild(r8)
            if (r9 >= r8) goto L_0x00a7
            r8 = r7
            goto L_0x00a8
        L_0x0098:
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            android.view.ViewParent r9 = r9.getParent()
            android.view.View r9 = (android.view.View) r9
            int r11 = r11 + 1
            goto L_0x007a
        L_0x00a7:
            r8 = r4
        L_0x00a8:
            if (r8 == 0) goto L_0x00ba
            java.lang.Object r8 = r15.get(r5)
            android.view.View r8 = (android.view.View) r8
            java.lang.Object r9 = r15.get(r6)
            r15.set(r5, r9)
            r15.set(r6, r8)
        L_0x00ba:
            int r6 = r6 + 1
            goto L_0x0063
        L_0x00bd:
            int r5 = r5 + 1
            goto L_0x0016
        L_0x00c1:
            r5 = r3[r4]
            r6 = r4
        L_0x00c4:
            if (r6 >= r2) goto L_0x00cf
            r8 = r3[r6]
            if (r8 <= r5) goto L_0x00cc
            r5 = r3[r6]
        L_0x00cc:
            int r6 = r6 + 1
            goto L_0x00c4
        L_0x00cf:
            if (r5 < 0) goto L_0x00f4
            int r6 = r2 + -1
        L_0x00d3:
            if (r6 < 0) goto L_0x00f1
            r8 = r3[r6]
            r9 = -1
            if (r8 != r9) goto L_0x00db
            goto L_0x00ee
        L_0x00db:
            r8 = r3[r6]
            if (r8 != r5) goto L_0x00ee
            int r8 = r0 + -1
            int r8 = r8 - r4
            java.lang.Object r10 = r15.get(r6)
            android.view.View r10 = (android.view.View) r10
            r1[r8] = r10
            r3[r6] = r9
            int r4 = r4 + 1
        L_0x00ee:
            int r6 = r6 + -1
            goto L_0x00d3
        L_0x00f1:
            int r5 = r5 + -1
            goto L_0x00cf
        L_0x00f4:
            java.util.List r15 = java.util.Arrays.asList(r1)
            return r15
        L_0x00f9:
            java.util.List r15 = java.util.Collections.emptyList()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindHmlBusinessOwnerProgressSuccessFragment.read(java.util.List):java.util.List");
    }
}
