package p040o;

/* renamed from: o.FragmentBuilder_BindSuccessFragment */
public enum FragmentBuilder_BindSuccessFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    INIT_ERROR("There was an error constructing the pokerchip. The chip will not show.", 100000),
    ATTACH_TO_WINDOW_ERROR("There was an error attaching the poker chip to the window.", 100001),
    DETACH_FROM_WINDOW_ERROR_REMOVE("There was an error removing the pokerchip from the window.", 100002),
    DETACH_FROM_WINDOW_ERROR_REMOVE_IMMEDIATELY("There was an error immediately removing the pokerchip from the window.", 100003),
    SET_ACTIVITY_ERROR("There was an error setting the pokerchip activity.", 100004),
    DESTROY_ERROR("There was an error destroying the pokerchip.", 100005),
    TRANSITION_ERROR("There was an error transitioning the pokerchip ui to a new mode.", 100006),
    LOADING_ERROR("There was an error showing the pokerchip loading ui.", 100007),
    VISIBLE_ERROR("There was an error setting the pokerchip's visibility.", 100008),
    SHOW_INVALID_ERROR("There was an error showing the invalid activity.", 100009),
    SHOW_PERMISSION_ERROR("There was an error showing the request permission activity.", 100010),
    CREATE_ERROR("There was an error creating the pokerchip.", 100011),
    TAP_ERROR("There was an error tapping the pokerchip.", 100012),
    LONG_TAP_ERROR("There was an error long tapping the pokerchip.", 100013),
    REQUEST_PERMISSION_ERROR("There was an error requesting pokerchip permissions.", 100014);
    
    private final int code;
    private final String logMessage;

    private FragmentBuilder_BindSuccessFragment(String str, int i) {
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
