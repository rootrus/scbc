package p040o;

/* renamed from: o.FragmentBuilder_BindMerchantWalletTransactionFragment */
public enum FragmentBuilder_BindMerchantWalletTransactionFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    SECURITY_UPDATE_SSL_FAILURE("Unable to update platform SSL security.", 13000),
    SECURITY_UPDATE_SSL_FAILURE_NO_CONTEXT("Unable to update platform SSL security. No context available.", 13001),
    SECURITY_UPDATE_SSL_PROVIDER_FAILURE("Unable to update platform SSL security. Provider failure.", 13002),
    SECURITY_UPDATE_SSL_NO_PROVIDER("Unable to update platform SSL security. Provider not available.", 13003),
    SECURITY_UPDATE_SSL_THREAD_FAILURE("Unable to update platform SSL security. Post to thread failed.", 13004);
    
    private final int code;
    private final String message;

    private FragmentBuilder_BindMerchantWalletTransactionFragment(String str, int i) {
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
        sb.append(getClass().getSimpleName());
        sb.append(": {");
        sb.append("message='");
        sb.append(this.message);
        sb.append('\'');
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", i18nKey='");
        sb.append(name());
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
