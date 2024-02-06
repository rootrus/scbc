package p040o;

/* renamed from: o.HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$CustomActionResultReceiver */
enum C1203xdb38585a {
    TYPED_REALM,
    DYNAMIC_REALM;

    static C1203xdb38585a MediaBrowserCompat$ItemReceiver(Class<? extends HmlEtbConfirmationOtpActivity> cls) {
        if (cls == HmlLaserIdAboutActivity.class) {
            return TYPED_REALM;
        }
        if (cls == HmlETBReviewActivity.class) {
            return DYNAMIC_REALM;
        }
        throw new IllegalArgumentException("The type of Realm class must be Realm or DynamicRealm.");
    }
}
