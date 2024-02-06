package p040o;

/* renamed from: o.FragmentBuilder_BindManagePromptpayLandingFragment */
public enum FragmentBuilder_BindManagePromptpayLandingFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    NETWORK_GENERIC_ERROR("General Network Error. No response or before request", 10000),
    NETWORK_NULL_BODY("A network response returned without a body when one was expected.", 10001),
    NETWORK_200("Successful network response.", 10200),
    NETWORK_409("409 Conflict network response.", 10409),
    SOCKET_TIMEOUT("A socket timed out.", 10410),
    NETWORK_STATE_CHANGE("Network connectivity has changed.", 10411),
    NULL_NETWORK_CONTROLLER("Network Controller was null.", 10412),
    ERROR_UPDATING_NETWORK_STATE("There was an error updating state with new network status.", 10013),
    NO_INTERNET("No internet available.", 10014);
    
    public final int code;
    private final String message;

    private FragmentBuilder_BindManagePromptpayLandingFragment(String str, int i) {
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
