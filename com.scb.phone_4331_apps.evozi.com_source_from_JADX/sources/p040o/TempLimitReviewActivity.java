package p040o;

import android.content.SharedPreferences;

/* renamed from: o.TempLimitReviewActivity */
public final /* synthetic */ class TempLimitReviewActivity implements FragmentBuilder_BindIssuerSearchFragment {
    private final /* synthetic */ String read;

    public /* synthetic */ TempLimitReviewActivity(String str) {
        this.read = str;
    }

    public final Object read(Object obj) {
        return MyECouponActivity.IconCompatParcelizer(this.read, (SharedPreferences) obj);
    }
}
