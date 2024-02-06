package p040o;

import com.google.android.gms.common.api.Api;

/* renamed from: o.HmlNdidNationalIdInputActivity */
public class HmlNdidNationalIdInputActivity extends HmlNTBOpenAccountPresenterModule {
    public static final int read(int i) {
        return i >= 0 ? i < 3 ? i + 1 : i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER : i;
    }
}
