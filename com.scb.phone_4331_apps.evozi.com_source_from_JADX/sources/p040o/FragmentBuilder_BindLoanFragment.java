package p040o;

/* renamed from: o.FragmentBuilder_BindLoanFragment */
public enum FragmentBuilder_BindLoanFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    INVALID_KEY_FOR_OPERATION("An invalid key, %s, was used for operation: %s", 500000),
    DONE_WAITING_FOR_SERVER("Done waiting for interaction map request from remote data store to finish.", 500001),
    LONG_FETCH_FINISHED_UPDATING_CACHE("A long server request for interaction map has finished. Updating cache.", 500002),
    SERVER_FETCH_ERROR("An error occurred fetching interaction map. %s", 500003),
    UNKNOWN_FETCH_ERROR("An unknown error occurred fetching interaction map from remote data store.", 500004),
    LOAD_INTERACTIONS_FAILURE("An error occurred loading interaction map from local data store. %s", 500005),
    LOAD_INTERACTIONS_SUCCESS("Successfully loaded allowed interaction map from local data store.", 500006),
    FETCH_NOT_CHANGED("Successfully fetched interaction map from remote data store. There is no change. Using local data store.", 500007),
    FETCH_CHANGED("Successfully fetched interaction map from remote data store. Updating local data store.", 500008),
    PERSIST_FAILURE("There was an error persisting fetched interaction map to local data store. %s", 500009),
    PERSIST_SUCCESS("Successfully persisted fetched interaction map to local data store.", 500010),
    SERVER_FAILURE("Cannot retrieve the interaction map for the space: %s, and touchpoint: %s. due to an error: %s", 500012),
    SERVER_SUCCESS_CACHE("Remote data store request for interaction map returned 'not changed'. eTag: %s", 500013),
    SERVER_SUCCESS("Interaction map retrieved for space: %s, touchpoint: %s. \neTag: %s \nAllowedInteractions: %s", 500014),
    APP_INSTALL_NOT_ALLOWED("App install interaction is not allowed. To allow please refer to ONE documentation.", 500015),
    DENIED_INTERACTION("Cannot send an automatic interaction request for interaction path %s, type: %s, because the interaction is not found in the interaction map for the given space: %s, and touchpoint: %s.", 500016),
    DENIED_OFFLINE_INTERACTION("Cannot send an automatic offline Interaction Request for interaction path %s, type: %s, because the interaction is not found in the interaction map for the given space, %s, and touchpoint: %s", 500017),
    DENIED_OFFLINE_PROPERTIES_DATABASE("An automatic offline properties save request, %s, was denied as it is not in the interaction map list.", 500018),
    DENIED_OFFLINE_INTERACTION_DATABASE("An automatic offline interaction save request, %s,\nwas denied as it is not in the interaction map list.", 500019),
    SERVER_JSON_PARSE_ERROR("There was an error parsing the json response for interaction map.", 500020),
    ERROR_CHECKING_ALLOWED("There was an error checking if an automatic interaction, %s, is in the interaction map. %s", 500021),
    FETCH_EMPTY("Interaction map does not contain any interactions, no interactions will be tracked. Interactions with at least one point need to be created in ONE for tracking to work.", 500022);
    
    private final int code;
    private final String logMessage;

    private FragmentBuilder_BindLoanFragment(String str, int i) {
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
        sb.append("\n        AllowedInteractionsCode: {\n            code: ");
        sb.append(this.code);
        sb.append(",\n            i18nKey: ");
        sb.append(name());
        sb.append("\n        }\n    ");
        return GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(sb.toString());
    }
}
