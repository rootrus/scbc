package p040o;

/* renamed from: o.FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment */
public enum FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    MISSING_PREVIEW_ID_FOR_MONITOR("The preview or workspace snapshot is missing for monitor URL.", 21000),
    MISSING_WORKSPACE_ID_FOR_MONITOR("The  workspace id is missing for monitor URL.", 21001),
    LOAD_RELEASES_ERROR_GENERIC("There was an error loading workspace release data", 21002),
    NULL_CONTEXT("Context is required to perform a preview view action.", 21003),
    CONTEXT_NOT_ACTIVITY("Activity is needed for UI. Context is not activity.", 21004),
    PANEL_INIT_ERROR("There was an error creating the views for Preview Panel", 21005),
    SET_MONITOR_URL_ERROR("There was an error setting the monitor url.", 21006),
    DESTROY_ERROR("There was an error destroying the preview panel.", 21007),
    SET_TID_ERROR("There was an error setting the preview TID.", 21008),
    SET_VISIBLE_INFO_ERROR("There was an error setting preview view data", 21009),
    SET_MODE_ERROR("There was an error setting preview mode ui.", 21010),
    SET_LAUNCHPAD_ERROR("There was an error setting the launchpad data.", 21011),
    SET_LIVE_ERROR("There was an error setting the live data.", 21012),
    HIDE_ERROR("There was an error hiding preview.", 21013),
    SHOW_LOADING_ERROR("There was an error showing preview.", 21014);
    
    private final int code;
    private final String logMessage;

    private FragmentBuilder_BindMerchantWalletOutgoingTransactionFragment(String str, int i) {
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
