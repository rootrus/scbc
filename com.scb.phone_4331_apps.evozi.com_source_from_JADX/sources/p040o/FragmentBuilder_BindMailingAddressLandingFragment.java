package p040o;

/* renamed from: o.FragmentBuilder_BindMailingAddressLandingFragment */
public enum FragmentBuilder_BindMailingAddressLandingFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    ERROR_ENCRYPTING_VALUE("Error encrypting value.", 23000),
    ERROR_DECRYPTING_VALUE("Error decrypting encrypted value.", 23001),
    ERROR_INIT_HASH_UTIL("Error performing init of AuthHashUtil.", 23002),
    PREFERENCES_NULL("Preferences are null.", 23003);
    
    private final int code;
    private final String message;

    private FragmentBuilder_BindMailingAddressLandingFragment(String str, int i) {
        this.message = str;
        this.code = i;
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.message;
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
