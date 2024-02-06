package com.scb.phone.p035di;

import android.app.Activity;
import com.scb.phone.view.activity.transferandpay.ScanPaymentActivity;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.ActivityBuilder_BindScanPaymentActivity */
public abstract class ActivityBuilder_BindScanPaymentActivity {

    /* renamed from: com.scb.phone.di.ActivityBuilder_BindScanPaymentActivity$IconCompatParcelizer */
    public interface IconCompatParcelizer extends MileageQuantitySelectionActivity_ViewBinding<ScanPaymentActivity> {

        /* renamed from: com.scb.phone.di.ActivityBuilder_BindScanPaymentActivity$IconCompatParcelizer$write */
        public static abstract class write extends C1241xc75ead43<ScanPaymentActivity> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Activity> IconCompatParcelizer(IconCompatParcelizer.write write);
}
