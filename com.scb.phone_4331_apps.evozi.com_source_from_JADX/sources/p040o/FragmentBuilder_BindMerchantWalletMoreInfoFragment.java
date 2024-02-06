package p040o;

/* renamed from: o.FragmentBuilder_BindMerchantWalletMoreInfoFragment */
public enum FragmentBuilder_BindMerchantWalletMoreInfoFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    NULL_CONTEXT("Context was null when attempting to retrieve Thunderhead Shared Preferences", 70000),
    NULL_SHARED_PREFERENCES("Thunderhead Shared Preferences could not be retrieved.", 70001),
    NULL_SHARED_PREFERENCES_QUERY("Thunderhead Shared Preferences could not be retrieved for query operation.", 70002),
    NULL_SHARED_PREFERENCES_EDIT("Thunderhead Shared Preferences could not be retrieved for edit operation.", 70003),
    LOAD_ERROR("There was an error loading Thunderhead Shared Preferences in another thread.", 70004),
    NULL_KEY("The remember me key was null for current sitekey and host.", 70005),
    REMOVE_ERROR("There was an error removing a key in Thunderhead Shared Preferences.", 70006);
    
    private final int code;
    private final String logMessage;

    private FragmentBuilder_BindMerchantWalletMoreInfoFragment(String str, int i) {
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
        sb.append("\n        CodelessCode: {\n            code: ");
        sb.append(this.code);
        sb.append(",\n            i18nKey: ");
        sb.append(name());
        sb.append("\n        }\n    ");
        return GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(sb.toString());
    }
}
