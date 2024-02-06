package p040o;

/* renamed from: o.FragmentBuilder_BindModifyQuickPromptPayFragment */
public enum FragmentBuilder_BindModifyQuickPromptPayFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    ACTIVITY_CREATE_ERROR("There was an error dispatching activity create to store.", 150001),
    ACTIVITY_START_ERROR("There was an error dispatching activity start to store.", 150002),
    ACTIVITY_RESUME_ERROR("There was an error dispatching activity resume to store.", 150003),
    ACTIVITY_PAUSE_ERROR("There was an error dispatching activity pause to store.", 150004),
    ACTIVITY_STOP_ERROR("There was an error dispatching activity stop to store.", 150005),
    ACTIVITY_DESTROY_ERROR("There was an error dispatching activity destroy to store.", 150006),
    UPDATE_ACTIVITY_LIFECYCLE_ERROR("There was an error updating the activity lifecycle.", 150007);
    
    private final int code;
    private final String message;

    private FragmentBuilder_BindModifyQuickPromptPayFragment(String str, int i) {
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
