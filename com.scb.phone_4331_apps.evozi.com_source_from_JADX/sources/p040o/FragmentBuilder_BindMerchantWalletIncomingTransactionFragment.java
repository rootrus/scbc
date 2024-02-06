package p040o;

/* renamed from: o.FragmentBuilder_BindMerchantWalletIncomingTransactionFragment */
public enum FragmentBuilder_BindMerchantWalletIncomingTransactionFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    OPT_OUT_TRUE_NETWORK_INTERCEPTED("Successfully intercepted network request when optOut = true.", 17000),
    OPT_OUT_NETWORK_ERROR("There was an error intercepting an outbound request within an optOut context.", 17001),
    LOAD_OPT_OUT_FAILURE("There was an error loading opt out.", 17002),
    SAVE_OPT_OUT_FAILURE("There was an error saving opt out.", 17003),
    OPT_OUT_NULL_ERROR("There was an error saving opt out.  Opt out is null.", 17004);
    
    private final int code;
    private final String logMessage;

    private FragmentBuilder_BindMerchantWalletIncomingTransactionFragment(String str, int i) {
        this.logMessage = str;
        this.code = i;
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.logMessage;
    }

    public final int IconCompatParcelizer() {
        return this.code;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n        ");
        sb.append(getClass().getSimpleName());
        sb.append(": {\n            code: ");
        sb.append(this.code);
        sb.append(",\n            i18nKey: ");
        sb.append(name());
        sb.append("\n        }\n    ");
        return GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(sb.toString());
    }
}
