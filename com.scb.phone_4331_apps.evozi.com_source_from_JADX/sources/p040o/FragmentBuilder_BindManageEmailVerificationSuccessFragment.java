package p040o;

/* renamed from: o.FragmentBuilder_BindManageEmailVerificationSuccessFragment */
public enum FragmentBuilder_BindManageEmailVerificationSuccessFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    FIREBASE_NOT_FOUND("Firebase not detected. Messaging functionality will be impacted.", 14000),
    CLOUD_MESSAGING_ACTION_RECEIVED("Cloud Messaging action received.", 14001),
    CLOUD_MESSAGE_PARSE_ERROR("Unable to parse cloud message content.", 14002),
    DEFAULT_MESSAGING_INIT("Initialized messaging with defaults.", 14003),
    CHANNEL_MESSAGING_INIT("Initialized messaging for api 26+.", 14004),
    INIT_ERROR("There was an error running the messaging initialization strategies.", 14005),
    CONTEXT_REQUIRED("Context is required for messaging.", 14006),
    NULL_TOKEN("Attempted to set a null messaging token.", 14007),
    SAVE_TOKEN_NULL_ONE("Attempted to save token but ONE was null.", 14008),
    TOKEN_SENT_TO_ONE("Messaging token sent to ONE. %s", 14009),
    TOKEN_SAVED_IN_PREFERENCES("Messaging token saved in preferences. %s", 14010),
    TOKEN_RETRIEVED_FROM_PREFERENCES("Messaging token retrieved from preferences. %s", 14011),
    TOKEN_FROM_PREFERENCES_NULL("Messaging token from preferences was null.", 14012),
    MISSING_APP_ICON("Can't create notification: app icon wasn't specified.", 14013),
    NULL_MESSAGING_SERVICE("Messaging service was null.", 14014),
    NULL_MESSAGE_INTENT("Null Firebase Message/Intent.", 14015),
    ERROR_SENDING_PUSH_TOKEN_TO_ONE("An error occurred while trying to send the push token to the ONE API.", 14016),
    ERROR_ON_NEW_TOKEN_RECEIVED("An error occurred when a new token was received. Saving locally only.", 14017),
    ERROR_ON_NEW_TOKEN_RECEIVED_SECOND_TRY("An error occurred when a new token was received. Tried to save locally twice.", 14018),
    NON_ADAPTIVE_SMALL_ICON_NOT_SET("Non Adaptive Icon is not set. Android Api 26 push notifications will not be shown if this is not set. Please set via One#setMessageConfig. See https://issuetracker.google.com/issues/68716460", 14019),
    CANNOT_USE_APP_ICON("Cannot create or use the Application's Icon for push notification.", 14020),
    GET_ERROR("There was an error constructing Messages api.", 14021),
    SHOW_ERROR("There was an error showing a notification.", 14022),
    NULL_MANAGER("The Message Manager was null.", 14023),
    PREFERENCES_NULL("Thunderhead Preferences were null for a messaging operation.", 14024),
    SAVE_TOKEN_ERROR("There was an error saving a Messaging token.", 14025),
    GET_TOKEN_ERROR("There was an error getting a Messaging token.", 14026),
    ENABLE_MESSAGING_ERROR("There was an error enabling/disabling messaging.", 14027),
    NULL_KEY("The key could not be computed to save 'push token sent'.", 14028),
    ERROR_PERSISTING_TOKEN("There was an error persisting the 'push token'.", 14029),
    TOKEN_RECIEVED_FROM_FIREBASE("Token received from firebase: %s", 14037),
    MESSAGE_RECIEVED_FROM_FIREBASE("Message received from firebase.", 14030),
    TOKEN_RECIEVED_FROM_API("Token received from api: %s", 14031),
    TOKEN_RECIEVED_FROM_CLOUD_MESSAGE_MANAGER("Token received from cloud message manager: %s", 14032),
    STORE_MESSAGING_ENABLED("Stored Messaging enabled as: %s", 14033),
    GET_MESSAGING_TOKEN_SENT("Retrieved messaging token sent: %s %s %s", 14034),
    SET_MESSAGING_TOKEN_SENT("Set messaging token sent: %s %s", 14035),
    UPDATE_SAME_TOKEN("Updated messaging token is the same. Token will not be sent.", 14036);
    
    private final int code;
    private final String message;

    private FragmentBuilder_BindManageEmailVerificationSuccessFragment(String str, int i) {
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
