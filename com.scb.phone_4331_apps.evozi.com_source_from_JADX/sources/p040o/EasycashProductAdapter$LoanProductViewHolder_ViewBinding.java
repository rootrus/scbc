package p040o;

/* renamed from: o.EasycashProductAdapter$LoanProductViewHolder_ViewBinding */
public abstract class EasycashProductAdapter$LoanProductViewHolder_ViewBinding extends MerchantWalletSelectorAdapter$ItemViewHolder_ViewBinding {
    public String IconCompatParcelizer = null;
    public String MediaBrowserCompat$CustomActionResultReceiver = null;
    public String write = null;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if ((r0 >= 'A' && r0 <= 'Z') != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EasycashProductAdapter$LoanProductViewHolder_ViewBinding(p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            r4.<init>(r5)
            r5 = 0
            r4.write = r5
            r4.IconCompatParcelizer = r5
            r4.MediaBrowserCompat$CustomActionResultReceiver = r5
            int r5 = r6.length()
            r0 = 2
            if (r5 != r0) goto L_0x00d0
            r5 = 0
            char r0 = r6.charAt(r5)
            r1 = 90
            r2 = 65
            r3 = 1
            if (r0 < r2) goto L_0x0021
            if (r0 > r1) goto L_0x0021
            r0 = r3
            goto L_0x0022
        L_0x0021:
            r0 = r5
        L_0x0022:
            if (r0 == 0) goto L_0x0032
            char r0 = r6.charAt(r3)
            if (r0 < r2) goto L_0x002e
            if (r0 > r1) goto L_0x002e
            r0 = r3
            goto L_0x002f
        L_0x002e:
            r0 = r5
        L_0x002f:
            if (r0 == 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r3 = r5
        L_0x0033:
            if (r3 == 0) goto L_0x00b9
            int r0 = r7.length()
            if (r0 == 0) goto L_0x00b1
            int r0 = r7.length()
            r1 = 9
            if (r0 > r1) goto L_0x0096
            int r0 = r8.length()
            r1 = 5
            if (r0 != r1) goto L_0x007b
        L_0x004a:
            int r0 = r8.length()
            if (r5 >= r0) goto L_0x0074
            char r0 = r8.charAt(r5)
            boolean r0 = java.lang.Character.isLetterOrDigit(r0)
            if (r0 == 0) goto L_0x005d
            int r5 = r5 + 1
            goto L_0x004a
        L_0x005d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Sequence number can only contain alphanumerics: "
            r5.append(r6)
            r5.append(r8)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L_0x0074:
            r4.write = r6
            r4.IconCompatParcelizer = r7
            r4.MediaBrowserCompat$CustomActionResultReceiver = r8
            return
        L_0x007b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Sequence number must have length 5, was "
            r5.append(r6)
            int r6 = r8.length()
            r5.append(r6)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L_0x0096:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Holder mnemonic too long, max=9, was "
            r5.append(r6)
            int r6 = r7.length()
            r5.append(r6)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L_0x00b1:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Holder mnemonic too short, must have at least one character"
            r5.<init>(r6)
            throw r5
        L_0x00b9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Unknown country code: "
            r5.append(r7)
            r5.append(r6)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L_0x00d0:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Country code length must be 2, was "
            r5.append(r7)
            int r6 = r6.length()
            r5.append(r6)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.EasycashProductAdapter$LoanProductViewHolder_ViewBinding.<init>(o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder, java.lang.String, java.lang.String, java.lang.String):void");
    }

    protected EasycashProductAdapter$LoanProductViewHolder_ViewBinding(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder, byte[] bArr) {
        super(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder);
        String str = new String(bArr);
        this.write = str.substring(0, 2);
        this.IconCompatParcelizer = str.substring(2, str.length() - 5);
        this.MediaBrowserCompat$CustomActionResultReceiver = str.substring(str.length() - 5);
    }

    public final String IconCompatParcelizer() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.write);
        sb.append("/");
        sb.append(this.IconCompatParcelizer);
        sb.append("/");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final byte[] MediaBrowserCompat$ItemReceiver() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.write);
        sb.append(this.IconCompatParcelizer);
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        return sb.toString().getBytes();
    }
}
