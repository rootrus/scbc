package p040o;

/* renamed from: o.FragmentBuilder_BindMerchantWalletFragment */
public enum FragmentBuilder_BindMerchantWalletFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    NOTIFICATION_IN_PROGRESS("Notification is ready, but another one in progress. Dropping notification.", 18000),
    NOTIFICATION_ONGOING_AND_READY("Notification is ready and became ongoing. Posting show task. Removing from pendings.", 18001),
    NOTIFICATION_OUTDATED("Notification is ready, but is outdated. Dropping.", 18002),
    NOTIFICATION_NULL_PENDING("Notification \\\"null\\\" was set as pending.", 18003),
    NOTIFICATION_SHOWING_NULL("showNotification, Notification is \\\"null\\\".", 18004),
    NOTIFICATION_NULL_ACTIVITY("Notification Activity is null.", 18005),
    NOTIFICATION_SHOWING("Notification show task is Showing.", 18006),
    NOTIFICATION_CANCELLING_PENDING("Cancelling a pending notification.", 18007),
    NOTIFICATION_NO_ACTIVITY_FOUND("An external Optimization Response URL could not be opened as no activity can open a URL.", 18008);
    
    private final int code;
    private final String message;

    private FragmentBuilder_BindMerchantWalletFragment(String str, int i) {
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
