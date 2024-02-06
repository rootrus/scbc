package p040o;

/* renamed from: o.FragmentBuilder_BindManageEmailVerificationFragment */
public enum FragmentBuilder_BindManageEmailVerificationFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    ERROR_MISSING_INTERACTION_PATH("Interaction Path is null.", 24000),
    ERROR_BUILDING_URI("Error creating interaction URI.", 24001),
    ERROR_INVALID_INTERACTION_URI("The provided interaction URI is not valid. Schema is missing.", 24002),
    ERROR_INTERACTION_RESPONSE_WAS_NULL("Interaction response was null.", 24003),
    ERROR_INTERACTION_RESPONSE_PATH_WAS_NULL("Interaction response path was null.", 24004),
    ERROR_INTERACTION_REQUEST_IS_NULL("Interaction request can not be null.", 24005),
    ERROR_RESPONSE_CODE_VALUE_IS_NULL("Response code request value can not be null.", 24006),
    ERROR_WONT_SEND_REQUEST_IN_ADMIN_MODE("The ONE SDK can't send request  as the SDK is in Admin mode, not validated or the preview mode panel is on screen.", 24007),
    ERROR_RESPONSE_CODE_PATH_IS_NULL("Response code path should not be empty.", 24008),
    ERROR_LOADING_CONTEXT("There was an error loading interaction context.", 24009),
    ASSIGNING_PATH_ON_WRONG_THREAD("An interaction path can only be assigned to an object while on the main thread.", 24010),
    INVALID_INTERACTION_PATH_ASSIGNMENT("The requested interaction assignment is invalid. Is an object null?", 24011),
    INVALID_INTERACTION_PATH("The provided Interaction Path is invalid.\nThere is a 2000 max character limit and certain characters are invalid.", 24012),
    ATTEMPTED_EXCLUDE_NULL_VIEW("A request to exclude a view from automatic interaction detection\nwas requested but the view was null.", 24013),
    EXCLUDING_OBJECT_ON_WRONG_THREAD("An object can only be excluded from automatic interaction tracking while on the main thread.", 24014),
    ERROR_MISSING_CALLBACK("OneCallback was null.", 24015),
    SEND_OUTBOUND_INVALID_URL("A request to send an outbound link was requested but the\nprovided URL was invalid. Null and Empty URLs are\nnot allowed and the URL must be correctly specified.", 24016),
    SEND_OUTBOUND_INVALID_URI("A request to send an outbound link was requested but the\nprovided URI was invalid. Null and Empty URIs are\nnot allowed and the URI must be correctly specified.", 24017),
    SEND_OUTBOUND_INVALID_URI_SCHEME("A request to send an outbound link was requested but the\nprovided URI has an unsupported scheme. Http and Https\nare the only supported schemes at the moment.", 24018),
    PROCESS_DEEP_LINK_INVALID_URI("A request to process an outbound URI was requested but the\nprovided URI is either null or empty.", 24019);
    
    public final int code;
    public final String message;

    private FragmentBuilder_BindManageEmailVerificationFragment(String str, int i) {
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
