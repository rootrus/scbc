package p040o;

import p040o.AnalyticsReceiver;

/* renamed from: o.identityHashCode */
public final /* synthetic */ class identityHashCode {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;
    public static final /* synthetic */ int[] read;

    static {
        int[] iArr = new int[AnalyticsReceiver.CrashlyticsOriginEventListener.values().length];
        MediaBrowserCompat$ItemReceiver = iArr;
        iArr[AnalyticsReceiver.CrashlyticsOriginEventListener.BUSINESS_INFORMATION.ordinal()] = 1;
        MediaBrowserCompat$ItemReceiver[AnalyticsReceiver.CrashlyticsOriginEventListener.MARITAL_INFORMATION.ordinal()] = 2;
        int[] iArr2 = new int[AnalyticsReceiver.CrashlyticsOriginEventListener.values().length];
        read = iArr2;
        iArr2[AnalyticsReceiver.CrashlyticsOriginEventListener.BUSINESS_NAME.ordinal()] = 1;
        read[AnalyticsReceiver.CrashlyticsOriginEventListener.NUMBER_OF_EMPLOYEES.ordinal()] = 2;
        read[AnalyticsReceiver.CrashlyticsOriginEventListener.YEAR_MONTH_IN_BUSINESS.ordinal()] = 3;
        int[] iArr3 = new int[AnalyticsReceiver.CrashlyticsOriginEventListener.values().length];
        IconCompatParcelizer = iArr3;
        iArr3[AnalyticsReceiver.CrashlyticsOriginEventListener.SPOUSE_NATIONAL_ID.ordinal()] = 1;
        IconCompatParcelizer[AnalyticsReceiver.CrashlyticsOriginEventListener.SPOUSE_FIRST_NAME.ordinal()] = 2;
        IconCompatParcelizer[AnalyticsReceiver.CrashlyticsOriginEventListener.SPOUSE_LAST_NAME.ordinal()] = 3;
        IconCompatParcelizer[AnalyticsReceiver.CrashlyticsOriginEventListener.SPOUSE_TITLE.ordinal()] = 4;
        IconCompatParcelizer[AnalyticsReceiver.CrashlyticsOriginEventListener.MARITAL_STATUS.ordinal()] = 5;
    }
}
