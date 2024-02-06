package p040o;

/* renamed from: o.FragmentBuilder_BindMileageConfirmRedemptionFragment */
public enum FragmentBuilder_BindMileageConfirmRedemptionFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    ERROR_CLEARING_SHARED_PREFERENCES_NAMED("There was an error clearing shared preferences: %s", 50000),
    NULL_PREFERENCES("Preferences were null: %s", 50001);
    
    private final int code;
    private final String message;

    private FragmentBuilder_BindMileageConfirmRedemptionFragment(String str, int i) {
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
