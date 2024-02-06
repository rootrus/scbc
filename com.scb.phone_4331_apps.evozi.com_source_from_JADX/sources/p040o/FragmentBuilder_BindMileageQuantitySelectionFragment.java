package p040o;

/* renamed from: o.FragmentBuilder_BindMileageQuantitySelectionFragment */
public enum FragmentBuilder_BindMileageQuantitySelectionFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    RETROFIT2_ERROR("A retrofit2 error occurred.", 11000),
    MISSING_THINSTANCE("Missing Thinstance to configure retrofit.", 11001);
    
    private final int code;
    private final String message;

    private FragmentBuilder_BindMileageQuantitySelectionFragment(String str, int i) {
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
