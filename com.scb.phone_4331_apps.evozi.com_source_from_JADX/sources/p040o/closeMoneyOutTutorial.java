package p040o;

/* renamed from: o.closeMoneyOutTutorial */
public enum closeMoneyOutTutorial implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    DISPATCH_ERROR;
    
    private final int code;
    private final String logMessage;

    private closeMoneyOutTutorial() {
        this.logMessage = r3;
        this.code = 27000;
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
