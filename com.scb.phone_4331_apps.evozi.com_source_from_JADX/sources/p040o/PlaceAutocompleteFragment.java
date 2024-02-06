package p040o;

import java.util.NoSuchElementException;

/* renamed from: o.PlaceAutocompleteFragment */
public enum PlaceAutocompleteFragment {
    UNKNOWN(""),
    APP_OUTDATED("426"),
    DEVICE_IS_REGISTERED("1000"),
    DEVICE_NOT_FOUND("1017"),
    PIN_LOCKED_MAX_TRIALS("1020"),
    PRE_REGISTERED("1031"),
    PRE_REGISTERED_WITH_ACTIVATION_PERIOD_EXPIRED("1034"),
    PIN_LOCKED("1036"),
    PROFILE_NOT_FOUND("2026"),
    SERVER_ERROR("1999"),
    SYSTEM_MAINTENANCE("900"),
    NTB("1088"),
    NO_MOBILE_NUMBER_TO_REGISTER("1060"),
    PIN_LOCKED_JURISTIC("3036"),
    PROFILE_IS_BLOCKED("3100"),
    DEVICE_IS_SWITCHED("3101"),
    PROFILE_IS_UNSUBSCRIBE("3102"),
    INVALID_CUSTOMER_TYPE_CODE("3103"),
    EASY_APP_TERMS_AND_CONDITIONS_NOT_ACCEPTED("3018"),
    NTB_PIN_DISABLED("1089"),
    NTB_PIN_DISABLED_ALT("1087"),
    PROFILE_IS_ON_HOLD("1019"),
    JAILBREAK("5001");
    
    public String code;

    private PlaceAutocompleteFragment(String str) {
        this.code = str;
    }

    public static PlaceAutocompleteFragment MediaBrowserCompat$ItemReceiver(String str) {
        isSupportFragmentClass issupportfragmentclass;
        show IconCompatParcelizer = show.IconCompatParcelizer((T[]) values());
        show show = new show(IconCompatParcelizer.write, new getNextTransition(IconCompatParcelizer.IconCompatParcelizer, new applyNonNullHeader$MediaBrowserCompat$CustomActionResultReceiver(str)));
        if (show.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        if (!(issupportfragmentclass.IconCompatParcelizer != null)) {
            return UNKNOWN;
        }
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            return (PlaceAutocompleteFragment) t;
        }
        throw new NoSuchElementException("No value present");
    }
}
