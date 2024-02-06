package p040o;

/* renamed from: o.FragmentBuilder_BindMailingAddressReviewFragment */
public enum FragmentBuilder_BindMailingAddressReviewFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    UNSAFE_TO_USE_SIGNPOST("Signpost cannot be used on this platform.", 15000),
    LOAD_REMEMBER_ME_FAILURE("There was an error loading remember me.", 15001),
    SAVE_REMEMBER_ME_FAILURE("There was an error saving remember me.", 15002),
    LOGIN_NULL_STORE("The Store was null.", 15003),
    AUTO_LOGIN_FAILURE("There was an error attempting to auto login in a design time user.", 15004),
    MISSING_USERNAME_OR_PASSWORD("Username or Password is missing. Can not store", 15005),
    PERFORM_LOGIN_FAILURE("There was an error attempting to perform login.", 15006),
    ERROR_CLEARING_SAVED_CREDENTIALS_ON_FAILED_LOGIN("There was an error deleting stored credentials on failed login attempt.", 15007),
    VERSION_4_CREDENTIALS_FOUND("Version 4 Admin Client Credentials Found. Attempting to migrate:\nUser: %s\nPass: %s", 15008),
    VERSION_4_CREDENTIALS_MIGRATED("Version 4 Credentials have been migrated version 5.", 15009),
    VERSION_4_CREDENTIALS_REMOVED("Version 4 existing credentials have been removed.", 15010),
    SHARED_PREFERENCES_CREDENTIALS_MIGRATION_FAILED("An error occurred while migrating shared preferences credentials.No further migrations will be run.", 15011),
    VERSION_5_REMEMBER_ME_FOUND("Version 5 Remember Me found. Attempting to migrate: %s", 15012),
    VERSION_6_REMEMBER_ME_FOUND("Version 6 Remember Me found for\nsitekey: %s\nhost: %s\nSkipping Migration.", 15013),
    VERSION_5_REMEMBER_ME_MIGRATED("Version 5 Remember Me have been migrated to version 6", 15014),
    SHARED_PREFERENCES_REMEMBER_ME_MIGRATION_FAILED("An error occurred while migrating shared preferences Remember me.No further migrations will be run.", 15015),
    VERSION_5_CREDENTIALS_FOUND("Version 5 Admin Client Credentials List Found. Attempting to migrate.", 15016),
    VERSION_5_CREDENTIALS_MIGRATED("Version 5 Credentials have been migrated version 6.", 15017),
    VERSION_5_CREDENTIALS_REMOVED("Version 5 existing credentials have been removed.", 15018);
    
    public final int code;
    public final String message;

    private FragmentBuilder_BindMailingAddressReviewFragment(String str, int i) {
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
