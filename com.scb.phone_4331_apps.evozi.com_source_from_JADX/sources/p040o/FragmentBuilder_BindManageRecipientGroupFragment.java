package p040o;

/* renamed from: o.FragmentBuilder_BindManageRecipientGroupFragment */
public enum FragmentBuilder_BindManageRecipientGroupFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    OFFLINE_REQUEST_TOUCHPOINT_CONFLICT("Offline Interaction Request contains a touchpoint which conflicts with database touchpoint.", 40000),
    ERROR_CONVERTING_ENTITY("There was an error converting an offline interaction entity.", 40001);
    
    private final int code;
    private final String logMessage;

    private FragmentBuilder_BindManageRecipientGroupFragment(String str, int i) {
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
