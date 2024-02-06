package p040o;

/* renamed from: o.FragmentBuilder_BindMailingAddressSuccessfulFragment */
public enum FragmentBuilder_BindMailingAddressSuccessfulFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    ERROR_INSERTING_PROPERTY_INTO_DATABASE("There was an error inserting a property into the Database.", 125000),
    ERROR_INSERTING_INTERACTION_INTO_DATABASE("There was an error inserting an interaction into the Database.", 125001),
    ERROR_UNABLE_TO_FIND_SITEKEY("Unable to load a sitekey.", 125002),
    ERROR_MIGRATING_DB("There was an error while performing the database migration.", 125003),
    ERROR_LOADING_FILE("An error occurred while trying to load the properties file.", 125004),
    ERROR_CLEARING_DB("An error occurred while trying to clear the database.", 125005),
    ERROR_PERFORMING_INSERT("An error occurred while trying to insert data into the database.", 125006),
    ERROR_LOADING_CURSOR("An error occurred trying to load data from the cursor.", 125007),
    ERROR_PROCESSING_OBJECT("Can't process single saved interactions and properties.", 125008),
    MISSING_DB_COLUMNS("Columns are missing from database. Need to migrate.", 125009),
    ERROR_UNABLE_TO_FIND_HOST("Unable to load host.", 125010),
    ERROR_UNABLE_TO_FIND_TOUCHPOINT("Unable to load touchpoint.", 125011),
    CREATE_SQLITE_THUNDERHEAD_DB("Creating Thunderhead Database.", 125012),
    CREATE_COMPLETE_SQLITE_THUNDERHEAD_DB("Creating Thunderhead Database complete.", 125013),
    NULL_SQLITE_THUNDERHEAD_DB_ONCREATE("SQLite db provided was null.", 125014),
    SQLITE_THUNDERHEAD_DB_ONCREATE_ERROR("There was an error attempting to create the Thunderhead SQLite Database.", 125015),
    NULL_SQLITE_THUNDERHEAD_DB_UPGRADE("SQLite db provided was null.", 125016),
    UNANTICIPATED_MIGRATION_STRATEGIES_FOUND("Unanticipated database migration strategies found.", 125017),
    MIGRATION_STRATEGY_FAILURE("There was an error running a database migration.", 125018),
    MIGRATE_DATABASE_STOP("Successfully migrated db from version %s to version %s.", 125019),
    V1_OFFLINE_INTERACTIONS_COUNT("Found %s V1 offline interactions.", 125020),
    MIGRATION_1_2_FILE_NOT_DELETED("Offline properties file was not deleted during migration: %s.", 125021),
    MIGRATION_1_2_FILE_DELETED("Offline properties file was deleted during migration: %s.", 125022),
    MIGRATE_START("Start DB Migration from %s to %s.", 125023),
    MIGRATE_STOP("Finished DB Migration from %s to %s.", 125024),
    MIGRATE_COLUMNS_START("Start table %s column migration from %s to %s.", 125040),
    MIGRATE_COLUMNS_STOP("Finished table %s column migration from %s to %s.", 1250125),
    MIGRATE_V1_OFFLINE_INTERACTIONS_START("Start migrating V1 Offline Interactions.", 125026),
    MIGRATE_V1_OFFLINE_INTERACTIONS_STOP("Stop migrating V1 Offline Interactions.", 125027),
    MIGRATE_V2_OFFLINE_INTERACTIONS_SITEKEY_HOST("The sitekey %s and host % will be used for V2 offline interactions migrations.", 125028),
    MIGRATE_V1_OFFLINE_PROPERTIES_START("Start migrating V1 Offline Properties.", 125029),
    MIGRATE_V1_OFFLINE_PROPERTIES_STOP("Stop migrating V1 Offline Properties.", 125030),
    MIGRATE_DATABASE_START("Start migration of db from version %s to version %s.", 125031),
    MIGRATE_V2_OFFLINE_INTERACTIONS_START("Start migrating V2 Offline Interactions.", 125032),
    MIGRATE_V2_OFFLINE_INTERACTIONS_STOP("Stop migrating V2 Offline Interactions.", 125033),
    MIGRATE_V3_OFFLINE_INTERACTIONS_SITEKEY_HOST_TOUCHPOINT("The sitekey %s and host % and tochpoint %s will be used for V3 offline interactions migrations.", 125034),
    V2_OFFLINE_INTERACTIONS_COUNT("Found %s V2 offline interactions.", 125035),
    ATTEMPT_VERSION_2_PROPERTIES_FIX_START("Start V2 Leftover properties fix.", 125036),
    ATTEMPT_VERSION_2_PROPERTIES_FIX_STOP("Stop V2 Leftover properties fix.", 125037),
    MIGRATE_V2_OFFLINE_INTERACTION_TOUCHPOINT("Attempted to migrate V2 Offline Interaction touchpoint but failed. Payload: %s", 125038),
    MIGRATE_V2_OFFLINE_PROPERTIES_TOUCHPOINT("Attempted to migrate V2 Offline Properties touchpoint but failed. Payload: %s", 125039);
    
    private final int code;
    private final String message;

    private FragmentBuilder_BindMailingAddressSuccessfulFragment(String str, int i) {
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
        sb.append('{');
        sb.append("message='");
        sb.append(this.message);
        sb.append("'");
        sb.append(", code=");
        sb.append(this.code);
        sb.append("}");
        return sb.toString();
    }
}
