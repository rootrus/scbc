package p040o;

/* renamed from: o.FragmentBuilder_BindLtfTabFragment */
public enum FragmentBuilder_BindLtfTabFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    OBJECT_TO_LIST_ERROR("Error converting Object to List<T>.", 16000),
    UNKNOWN_TYPE_TO_LIST("Unknown Type requested to be converted to List<T>.", 16001),
    NO_SUCH_METHOD("Did not find class method via reflection.", 16002),
    CLASS_NOT_FOUND("Did not find class via reflection.", 16003),
    CLASS_CAST_ERROR("Could not cast object.", 16007),
    ILLEGAL_ACCESS("Could not change member accessibility via reflection.", 16004),
    INVOCATION_ERROR("Could not execute method via reflection.", 16005),
    COULD_NOT_RETRIEVE_FRAGMENTS("Could not retrieve fragments.", 16006),
    NO_SUCH_FIELD("Could not find field via reflection.", 16008);
    
    private final int code;
    private final String logMessage;

    private FragmentBuilder_BindLtfTabFragment(String str, int i) {
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
