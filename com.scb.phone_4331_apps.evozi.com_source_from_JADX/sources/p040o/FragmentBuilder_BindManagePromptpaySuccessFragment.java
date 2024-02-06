package p040o;

import com.google.android.gms.location.places.PlacesStatusCodes;

/* renamed from: o.FragmentBuilder_BindManagePromptpaySuccessFragment */
public enum FragmentBuilder_BindManagePromptpaySuccessFragment implements FragmentBuilder_BindMerchantWalletSelectorFragment {
    FAILED_TO_SAVE_TID("There was an error saving the TID.", 90000),
    ERROR_CLEARING_USER_PROFILE("There was an error clearing the user profile.", 90001),
    ERROR_LOADING_TID("There was an error loading the TID from storage.", PlacesStatusCodes.KEY_INVALID),
    APPEND_TID_INVALID_STATE("An attempt was made to append a TID to a URI but the SDK was in an invalid state.\nURI: %s\nTID: %s\nValidConfig: %s\nIsDesignTime: %s", PlacesStatusCodes.ACCESS_NOT_CONFIGURED);
    
    private final int code;
    private final String message;

    private FragmentBuilder_BindManagePromptpaySuccessFragment(String str, int i) {
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
