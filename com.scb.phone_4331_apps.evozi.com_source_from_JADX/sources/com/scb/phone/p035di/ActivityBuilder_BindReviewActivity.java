package com.scb.phone.p035di;

import android.app.Activity;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.ActivityBuilder_BindReviewActivity */
public abstract class ActivityBuilder_BindReviewActivity {

    /* renamed from: com.scb.phone.di.ActivityBuilder_BindReviewActivity$IconCompatParcelizer */
    public interface IconCompatParcelizer extends MileageQuantitySelectionActivity_ViewBinding<ReviewActivity> {

        /* renamed from: com.scb.phone.di.ActivityBuilder_BindReviewActivity$IconCompatParcelizer$write */
        public static abstract class write extends C1241xc75ead43<ReviewActivity> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Activity> read(IconCompatParcelizer.write write);
}
