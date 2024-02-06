package p040o;

/* renamed from: o.FragmentBuilder_BindSmeLoanStatusFragment */
public enum FragmentBuilder_BindSmeLoanStatusFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    MISSING_TARGET_URL("A target url for %s response has not been provided.", 160000),
    NULL_CONTEXT("An attempt to open a positive response target url failed as context was null.", 160001),
    FULLSCREEN_EMPTY_IMAGE_URL("An attempt was made to show a full screen notification but the image url was empty.", 160002),
    MINI_NOTIFICATION_MESSAGE_EMPTY("An attempt was made to show a mini notification but the message text was empty.", 160003),
    UNKNOWN_NOTIFICATION_TYPE("Failed to create notification. Unknown or empty content type: ", 160004),
    NOTIFICATION_MISSING_MIMETYPE("Failed to create notification. Content mimeType field should not be empty.", 160005),
    OPEN_URL_NULL_RESPONSE("An attempt was made to open an optimization response target url but the response was null.", 160006),
    NO_DEFAULT_POSITIVE_RESPONSE_FROM_SERVER("The server did not send the default positive response for an optimization.\nPlease contact support.", 160007);
    
    private final int code;
    private final String message;

    private FragmentBuilder_BindSmeLoanStatusFragment(String str, int i) {
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
