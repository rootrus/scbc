package p040o;

@Deprecated
/* renamed from: o.BondSelectionListAdapter$BondViewHolder_ViewBinding */
public final class BondSelectionListAdapter$BondViewHolder_ViewBinding implements ThemesActivity, FacebookConsentDeepLinkActivity {
    private final read read;
    private final ThirdPartyConsentActivity write;

    /* renamed from: o.BondSelectionListAdapter$BondViewHolder_ViewBinding$read */
    public enum read {
        SECURITYLEVEL_DEFAULT,
        SECURITYLEVEL_IE_MEDIUM
    }

    private BondSelectionListAdapter$BondViewHolder_ViewBinding(read read2) {
        this.read = read2;
        this.write = new BondSelectionListAdapter$BondViewHolder((String[]) null, read2);
    }

    public BondSelectionListAdapter$BondViewHolder_ViewBinding() {
        this(read.SECURITYLEVEL_DEFAULT);
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.ThirdPartyConsentActivity MediaBrowserCompat$CustomActionResultReceiver(p040o.AmountDetailsSuccessAdapter$SuccessRow_ViewBinding r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0022
            java.lang.String r1 = "http.protocol.cookie-datepatterns"
            java.lang.Object r3 = r3.IconCompatParcelizer(r1)
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x001a
            int r0 = r3.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            r0 = r3
            java.lang.String[] r0 = (java.lang.String[]) r0
        L_0x001a:
            o.BondSelectionListAdapter$BondViewHolder r3 = new o.BondSelectionListAdapter$BondViewHolder
            o.BondSelectionListAdapter$BondViewHolder_ViewBinding$read r1 = r2.read
            r3.<init>(r0, r1)
            return r3
        L_0x0022:
            o.BondSelectionListAdapter$BondViewHolder r3 = new o.BondSelectionListAdapter$BondViewHolder
            o.BondSelectionListAdapter$BondViewHolder_ViewBinding$read r1 = r2.read
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.BondSelectionListAdapter$BondViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(o.AmountDetailsSuccessAdapter$SuccessRow_ViewBinding):o.ThirdPartyConsentActivity");
    }

    public final ThirdPartyConsentActivity MediaBrowserCompat$CustomActionResultReceiver(CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        return this.write;
    }
}
