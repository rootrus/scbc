package p040o;

/* renamed from: o.FragmentBuilder_BindMailingAddressDetailsFragment */
public enum FragmentBuilder_BindMailingAddressDetailsFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    NO_TOUCHPOINT_CONFIGURED("A touchpoint was not configured during initialization\n or is not in the state tree.", 20000),
    NO_WORKSPACE_SKIP_CREATE_TOUCHPOINT("No workspace ID set. Skipping create touchpoint.", 20001),
    NO_THINSTANCE_CONFIGURED("A Thinstance was not configured during initialization\n or is not in the state tree.", 20002),
    NO_WORKSPACE_CONFIGURED("A workspace was not set. Check initialization parameters.", 20003),
    INVALID_CONFIGURATION("Invalid initialization parameters.\n  The SDK has been initialized with invalid parameters.\n  Please review the parameters used to initialize the SDK.", 20004),
    NO_APPLICATION_CONTEXT_FOUND("Application context was not found. Could not initialize Thunderhead SDK.", 20005),
    TOUCHPOINT_NAME_COULD_NOT_BE_COMPUTED("A touchpoint name could not be computed during initialization.", 20007),
    THUNDERHEAD_INITIALIZED("Thunderhead Initialized.", 20006),
    MISSING_PARAMETERS("Missing initialization parameters.\n The SDK has not been initialized with valid parameters.", 20008),
    ONE_INIT_NOTIFICATION_ERROR("Unknown notification type.", 20009),
    ERROR_FETCHING_WORKSPACE("Error retrieving workspace after login.", 20010),
    ERROR_CREATING_TOUCHPOINT("Error attempting to create touchpoint if not exists.", 20011),
    ERROR_UPDATING_CONFIGURATION("There was an error dispatching configuration updates.", 20012);
    
    public final int code;
    public final String logMessage;

    private FragmentBuilder_BindMailingAddressDetailsFragment(String str, int i) {
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
