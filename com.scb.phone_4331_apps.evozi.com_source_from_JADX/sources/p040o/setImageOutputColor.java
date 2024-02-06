package p040o;

import p040o.AnalyticsReceiver;

/* renamed from: o.setImageOutputColor */
public final /* synthetic */ class setImageOutputColor {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[AnalyticsReceiver.CrashlyticsOriginEventListener.values().length];
        write = iArr;
        iArr[AnalyticsReceiver.CrashlyticsOriginEventListener.BUSINESS_NAME.ordinal()] = 1;
        write[AnalyticsReceiver.CrashlyticsOriginEventListener.NUMBER_OF_EMPLOYEES.ordinal()] = 2;
        write[AnalyticsReceiver.CrashlyticsOriginEventListener.SPOUSE_FIRST_NAME.ordinal()] = 3;
        write[AnalyticsReceiver.CrashlyticsOriginEventListener.SPOUSE_LAST_NAME.ordinal()] = 4;
        write[AnalyticsReceiver.CrashlyticsOriginEventListener.SPOUSE_NATIONAL_ID.ordinal()] = 5;
        write[AnalyticsReceiver.CrashlyticsOriginEventListener.MARITAL_STATUS.ordinal()] = 6;
        write[AnalyticsReceiver.CrashlyticsOriginEventListener.SPOUSE_TITLE.ordinal()] = 7;
        write[AnalyticsReceiver.CrashlyticsOriginEventListener.YEAR_MONTH_IN_BUSINESS.ordinal()] = 8;
        int[] iArr2 = new int[AnalyticsReceiver.CrashlyticsOriginEventListener.values().length];
        read = iArr2;
        iArr2[AnalyticsReceiver.CrashlyticsOriginEventListener.NUMBER_OF_EMPLOYEES.ordinal()] = 1;
        int[] iArr3 = new int[AnalyticsReceiver.CrashlyticsOriginEventListener.values().length];
        IconCompatParcelizer = iArr3;
        iArr3[AnalyticsReceiver.CrashlyticsOriginEventListener.BUSINESS_NAME.ordinal()] = 1;
        IconCompatParcelizer[AnalyticsReceiver.CrashlyticsOriginEventListener.YEAR_MONTH_IN_BUSINESS.ordinal()] = 2;
        IconCompatParcelizer[AnalyticsReceiver.CrashlyticsOriginEventListener.NUMBER_OF_EMPLOYEES.ordinal()] = 3;
        IconCompatParcelizer[AnalyticsReceiver.CrashlyticsOriginEventListener.MARITAL_STATUS.ordinal()] = 4;
        IconCompatParcelizer[AnalyticsReceiver.CrashlyticsOriginEventListener.SPOUSE_NATIONAL_ID.ordinal()] = 5;
        IconCompatParcelizer[AnalyticsReceiver.CrashlyticsOriginEventListener.SPOUSE_TITLE.ordinal()] = 6;
        IconCompatParcelizer[AnalyticsReceiver.CrashlyticsOriginEventListener.SPOUSE_FIRST_NAME.ordinal()] = 7;
        IconCompatParcelizer[AnalyticsReceiver.CrashlyticsOriginEventListener.SPOUSE_LAST_NAME.ordinal()] = 8;
    }
}
