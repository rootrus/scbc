package p040o;

/* renamed from: o.FragmentBuilder_BindPrepaidCashOutInputFragment */
public enum FragmentBuilder_BindPrepaidCashOutInputFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    ERROR_UPDATING_ELEMENT_HIGHLIGHT_ON_POINT_DELETE("There was an error updating the selected element highlighting\nafter a point was deleted.", 130000),
    ERROR_UPDATING_ELEMENT_HIGHLIGHT_ON_GROUP_POINT_DELETE("There was an error updating the selected group element highlighting\nafter a point was deleted.", 130001),
    ERROR_CREATING_HIGHLIGHTER("There was an error creating the highlighter.", 130002),
    ERROR_DESTROYING_HIGHLIGHTER("There was an error destroying the highlighter.", 130003);
    
    private final int code;
    private final String logMessage;

    private FragmentBuilder_BindPrepaidCashOutInputFragment(String str, int i) {
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
