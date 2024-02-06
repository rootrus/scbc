package p040o;

/* renamed from: o.onCoachMarkClicked */
public enum onCoachMarkClicked implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    CLASS_CAST_EXCEPTION("Attempted to invoke Thunk<T> but T was wrong type.", 80000),
    THUNK_MIDDLEWARE_ERROR("There was an error dispatching a Thunk<T>.", 80001);
    
    private final int code;
    private final String logMessage;

    private onCoachMarkClicked(String str, int i) {
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
