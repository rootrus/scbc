package p040o;

/* renamed from: o.FragmentBuilder_BindManageNotificationFragment */
public enum FragmentBuilder_BindManageNotificationFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    SEND_INTERACTION(AlertController$RecycleListView.MediaBrowserCompat$MediaItem, 30000),
    RECEIVE_INTERACTION(AlertController$RecycleListView.MediaMetadataCompat, 30001),
    SEND_TOUCHPOINT_PROPERTIES(AlertController$RecycleListView.MediaBrowserCompat$MediaItem, 30002),
    RECEIVE_TOUCHPOINT_PROPERTIES(AlertController$RecycleListView.MediaMetadataCompat, 30003),
    SEND_OFFLINE_INTERACTION(AlertController$RecycleListView.MediaBrowserCompat$MediaItem, 30004),
    RECEIVE_OFFLINE_INTERACTION(AlertController$RecycleListView.MediaMetadataCompat, 30005),
    SEND_POINT(AlertController$RecycleListView.MediaBrowserCompat$MediaItem, 30006),
    RECEIVE_POINT(AlertController$RecycleListView.MediaMetadataCompat, 30007),
    SEND_INTERACTION_PROPERTIES(AlertController$RecycleListView.MediaBrowserCompat$MediaItem, 30008),
    RECEIVE_INTERACTION_PROPERTIES(AlertController$RecycleListView.MediaMetadataCompat, 30009),
    SEND_PUSH_TOKEN(AlertController$RecycleListView.MediaBrowserCompat$MediaItem, 30010),
    RECEIVE_PUSH_TOKEN(AlertController$RecycleListView.MediaMetadataCompat, 30011),
    SEND_OPTIMIZATION_RESPONSE(AlertController$RecycleListView.MediaBrowserCompat$MediaItem, 30012),
    RECEIVE_OPTIMIZATION_RESPONSE(AlertController$RecycleListView.MediaMetadataCompat, 30013),
    ERROR_RETRIEVING_DEVICE_INFO("There was an error retrieving device information: %s", 30014),
    DEVICE_INFO_CONTEXT_NULL("No context available to retrieve device info.", 30015),
    SEND_APP_INSTALL_ERROR("Error sending the app install interaction.", 30016),
    OFFLINE_INTERACTION_HOST_MISSING("Host missing for offline interaction request.", 30017),
    INTERACTION_PATH_INCLUDED_TOUCHPOINT("sendInteraction was called with an interactionPath prefixed with a touchpoint, which will cause Configuration touchpoint to be ignored.", 30018),
    SEND_INTERACTION_IGNORED_API_ERROR(AlertController$RecycleListView.write("sendInteraction", "apiError"), 30019),
    SEND_INTERACTION_IGNORED_SDK_ERROR(AlertController$RecycleListView.write("sendInteraction", "sdkError"), 30020),
    SEND_PROPERTIES_IGNORED_SDK_ERROR(AlertController$RecycleListView.write("sendProperties", "apiError"), 30021),
    SEND_PROPERTIES_IGNORED_API_ERROR(AlertController$RecycleListView.write("sendProperties", "sdkError"), 30022),
    SEND_RESPONSE_CODE_IGNORED_SDK_ERROR(AlertController$RecycleListView.write("sendResponseCode", "apiError"), 30023),
    SEND_RESPONSE_CODE_IGNORED_API_ERROR(AlertController$RecycleListView.write("sendResponseCode", "sdkError"), 30024);
    
    private final int code;
    private final String logMessage;

    private FragmentBuilder_BindManageNotificationFragment(String str, int i) {
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
