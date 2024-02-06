package p040o;

import com.scb.phone.view.activity.AddressSearchActivity;
import com.scb.phone.view.activity.BaseReviewActivity;

/* renamed from: o.ZipInputStreamBundle */
public final class ZipInputStreamBundle implements MileageQuantitySelectionActivity<BaseReviewActivity> {

    /* renamed from: o.ZipInputStreamBundle$a */
    public final class C7092a implements MileageQuantitySelectionActivity<AddressSearchActivity> {
        public static void write(AddressSearchActivity addressSearchActivity, DefaultSettingsSpiCall defaultSettingsSpiCall) {
            addressSearchActivity.presenter = defaultSettingsSpiCall;
        }
    }

    public static void write(BaseReviewActivity baseReviewActivity, KtaBillExtractor ktaBillExtractor) {
        baseReviewActivity.presenter = ktaBillExtractor;
    }
}
