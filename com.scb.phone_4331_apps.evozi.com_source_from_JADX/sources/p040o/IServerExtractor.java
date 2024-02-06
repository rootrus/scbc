package p040o;

import android.content.Context;
import com.scb.phone.view.activity.BaseActivity;
import p040o.CheckCaptureModule;

/* renamed from: o.IServerExtractor */
public final class IServerExtractor implements MileageQuantitySelectionActivity<BaseActivity> {
    public static void write(BaseActivity baseActivity, getSessionAppSize getsessionappsize) {
        baseActivity.sessionHandlerPresenter = getsessionappsize;
    }

    public static void IconCompatParcelizer(BaseActivity baseActivity, CheckCaptureModule.KtaExceptionResponseDeserializer ktaExceptionResponseDeserializer) {
        baseActivity.inAppUpdateHelper = ktaExceptionResponseDeserializer;
    }

    public static void IconCompatParcelizer(BaseActivity baseActivity, getKernelIDDst getkerneliddst) {
        baseActivity.scbAnalytics = getkerneliddst;
    }

    public static void read(BaseActivity baseActivity, Context context) {
        baseActivity.context = context;
    }
}
