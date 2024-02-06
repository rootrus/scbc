package p040o;

/* renamed from: o.FragmentBuilder_BindPayNowReviewFragment */
public enum FragmentBuilder_BindPayNowReviewFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    ERROR_UPDATING_VIEWS;
    
    private final int code;
    private final String logMessage;

    private FragmentBuilder_BindPayNowReviewFragment() {
        this.logMessage = r3;
        this.code = 101000;
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
