package p040o;

import java.util.Enumeration;
import java.util.Hashtable;

/* renamed from: o.InvestmentDetailsFundListAdapter$ItemViewHolder_ViewBinding */
public abstract class InvestmentDetailsFundListAdapter$ItemViewHolder_ViewBinding implements DividendSummaryAdapter$ParentViewHolder {
    public static Hashtable MediaBrowserCompat$ItemReceiver(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0074 A[LOOP:0: B:10:0x003d->B:33:0x0074, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0073 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean write(p040o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r11, p040o.DividendSummaryAdapter$ParentViewHolder_ViewBinding r12) {
        /*
            r10 = this;
            o.DividendSummaryAdapter$ChildViewHolder_ViewBinding[] r11 = r11.MediaBrowserCompat$CustomActionResultReceiver
            int r0 = r11.length
            o.DividendSummaryAdapter$ChildViewHolder_ViewBinding[] r1 = new p040o.DividendSummaryAdapter$ChildViewHolder_ViewBinding[r0]
            r2 = 0
            java.lang.System.arraycopy(r11, r2, r1, r2, r0)
            o.DividendSummaryAdapter$ChildViewHolder_ViewBinding[] r11 = r12.MediaBrowserCompat$CustomActionResultReceiver
            int r12 = r11.length
            o.DividendSummaryAdapter$ChildViewHolder_ViewBinding[] r3 = new p040o.DividendSummaryAdapter$ChildViewHolder_ViewBinding[r12]
            java.lang.System.arraycopy(r11, r2, r3, r2, r12)
            if (r0 == r12) goto L_0x0014
            return r2
        L_0x0014:
            r11 = r1[r2]
            o.InvestmentDetailsFundListAdapter$ItemViewHolder r11 = r11.MediaBrowserCompat$ItemReceiver()
            r4 = 1
            if (r11 == 0) goto L_0x003b
            r11 = r3[r2]
            o.InvestmentDetailsFundListAdapter$ItemViewHolder r11 = r11.MediaBrowserCompat$ItemReceiver()
            if (r11 == 0) goto L_0x003b
            r11 = r1[r2]
            o.InvestmentDetailsFundListAdapter$ItemViewHolder r11 = r11.MediaBrowserCompat$ItemReceiver()
            o.HmlBusinessInfoAdapter$BankAccountViewHolder r11 = r11.IconCompatParcelizer
            r5 = r3[r2]
            o.InvestmentDetailsFundListAdapter$ItemViewHolder r5 = r5.MediaBrowserCompat$ItemReceiver()
            o.HmlBusinessInfoAdapter$BankAccountViewHolder r5 = r5.IconCompatParcelizer
            boolean r11 = r11.equals(r5)
            r11 = r11 ^ r4
            goto L_0x003c
        L_0x003b:
            r11 = r2
        L_0x003c:
            r5 = r2
        L_0x003d:
            if (r5 == r0) goto L_0x0077
            r6 = r1[r5]
            r7 = 0
            if (r11 == 0) goto L_0x005a
            int r8 = r12 + -1
        L_0x0046:
            if (r8 < 0) goto L_0x0070
            r9 = r3[r8]
            if (r9 == 0) goto L_0x0057
            r9 = r3[r8]
            boolean r9 = p040o.LtfSummaryAdapter$ParentViewHolder.MediaBrowserCompat$ItemReceiver((p040o.DividendSummaryAdapter$ChildViewHolder_ViewBinding) r6, (p040o.DividendSummaryAdapter$ChildViewHolder_ViewBinding) r9)
            if (r9 == 0) goto L_0x0057
            r3[r8] = r7
            goto L_0x006b
        L_0x0057:
            int r8 = r8 + -1
            goto L_0x0046
        L_0x005a:
            r8 = r2
        L_0x005b:
            if (r8 == r12) goto L_0x0070
            r9 = r3[r8]
            if (r9 == 0) goto L_0x006d
            r9 = r3[r8]
            boolean r9 = p040o.LtfSummaryAdapter$ParentViewHolder.MediaBrowserCompat$ItemReceiver((p040o.DividendSummaryAdapter$ChildViewHolder_ViewBinding) r6, (p040o.DividendSummaryAdapter$ChildViewHolder_ViewBinding) r9)
            if (r9 == 0) goto L_0x006d
            r3[r8] = r7
        L_0x006b:
            r6 = r4
            goto L_0x0071
        L_0x006d:
            int r8 = r8 + 1
            goto L_0x005b
        L_0x0070:
            r6 = r2
        L_0x0071:
            if (r6 != 0) goto L_0x0074
            return r2
        L_0x0074:
            int r5 = r5 + 1
            goto L_0x003d
        L_0x0077:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.InvestmentDetailsFundListAdapter$ItemViewHolder_ViewBinding.write(o.DividendSummaryAdapter$ParentViewHolder_ViewBinding, o.DividendSummaryAdapter$ParentViewHolder_ViewBinding):boolean");
    }

    public final int read(DividendSummaryAdapter$ParentViewHolder_ViewBinding dividendSummaryAdapter$ParentViewHolder_ViewBinding) {
        DividendSummaryAdapter$ChildViewHolder_ViewBinding[] dividendSummaryAdapter$ChildViewHolder_ViewBindingArr = dividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
        int length = dividendSummaryAdapter$ChildViewHolder_ViewBindingArr.length;
        DividendSummaryAdapter$ChildViewHolder_ViewBinding[] dividendSummaryAdapter$ChildViewHolder_ViewBindingArr2 = new DividendSummaryAdapter$ChildViewHolder_ViewBinding[length];
        System.arraycopy(dividendSummaryAdapter$ChildViewHolder_ViewBindingArr, 0, dividendSummaryAdapter$ChildViewHolder_ViewBindingArr2, 0, length);
        int i = 0;
        for (int i2 = 0; i2 != length; i2++) {
            boolean z = true;
            if (dividendSummaryAdapter$ChildViewHolder_ViewBindingArr2[i2].IconCompatParcelizer.IconCompatParcelizer.size() <= 1) {
                z = false;
            }
            if (z) {
                InvestmentDetailsFundListAdapter$ItemViewHolder[] IconCompatParcelizer = dividendSummaryAdapter$ChildViewHolder_ViewBindingArr2[i2].IconCompatParcelizer();
                for (int i3 = 0; i3 != IconCompatParcelizer.length; i3++) {
                    i = (i ^ IconCompatParcelizer[i3].IconCompatParcelizer.hashCode()) ^ LtfSummaryAdapter$ParentViewHolder.IconCompatParcelizer(LtfSummaryAdapter$ParentViewHolder.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer[i3].write)).hashCode();
                }
            } else {
                i = (i ^ dividendSummaryAdapter$ChildViewHolder_ViewBindingArr2[i2].MediaBrowserCompat$ItemReceiver().IconCompatParcelizer.hashCode()) ^ LtfSummaryAdapter$ParentViewHolder.IconCompatParcelizer(LtfSummaryAdapter$ParentViewHolder.MediaBrowserCompat$CustomActionResultReceiver(dividendSummaryAdapter$ChildViewHolder_ViewBindingArr2[i2].MediaBrowserCompat$ItemReceiver().write)).hashCode();
            }
        }
        return i;
    }
}
