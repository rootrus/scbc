package p040o;

/* renamed from: o.AccountRemarkViewHolder_ViewBinding */
public final class AccountRemarkViewHolder_ViewBinding extends AccountDebitSelectorViewHolder {
    public static final Object read = new Object();
    public static final Object write = new Object();
    String IconCompatParcelizer;
    String MediaBrowserCompat$CustomActionResultReceiver;
    private Object MediaBrowserCompat$SearchResultReceiver;

    public AccountRemarkViewHolder_ViewBinding(String str, String str2, Object obj) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaBrowserCompat$SearchResultReceiver = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r0 = r4.MediaBrowserCompat$SearchResultReceiver;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r0 = r4.IconCompatParcelizer;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p040o.AccountRemarkViewHolder_ViewBinding
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            o.AccountRemarkViewHolder_ViewBinding r5 = (p040o.AccountRemarkViewHolder_ViewBinding) r5
            java.lang.String r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = r5.MediaBrowserCompat$CustomActionResultReceiver
            boolean r0 = r0.equals(r2)
            r2 = 1
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r4.IconCompatParcelizer
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = r5.IconCompatParcelizer
            if (r0 != 0) goto L_0x0037
            goto L_0x0024
        L_0x001c:
            java.lang.String r3 = r5.IconCompatParcelizer
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0037
        L_0x0024:
            java.lang.Object r0 = r4.MediaBrowserCompat$SearchResultReceiver
            if (r0 != 0) goto L_0x002d
            java.lang.Object r0 = r5.MediaBrowserCompat$SearchResultReceiver
            if (r0 != 0) goto L_0x0037
            goto L_0x0035
        L_0x002d:
            java.lang.Object r3 = r5.MediaBrowserCompat$SearchResultReceiver
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0037
        L_0x0035:
            r0 = r2
            goto L_0x0038
        L_0x0037:
            r0 = r1
        L_0x0038:
            if (r0 == 0) goto L_0x0041
            boolean r5 = r4.IconCompatParcelizer(r5)
            if (r5 == 0) goto L_0x0041
            r1 = r2
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AccountRemarkViewHolder_ViewBinding.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.MediaBrowserCompat$CustomActionResultReceiver.hashCode();
        String str = this.IconCompatParcelizer;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        Object obj = this.MediaBrowserCompat$SearchResultReceiver;
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
