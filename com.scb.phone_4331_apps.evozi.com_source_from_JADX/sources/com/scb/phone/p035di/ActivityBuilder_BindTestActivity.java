package com.scb.phone.p035di;

import android.app.Activity;
import com.scb.phone.TestActivity;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.ActivityBuilder_BindTestActivity */
public abstract class ActivityBuilder_BindTestActivity {

    /* renamed from: com.scb.phone.di.ActivityBuilder_BindTestActivity$write */
    public interface write extends MileageQuantitySelectionActivity_ViewBinding<TestActivity> {

        /* renamed from: com.scb.phone.di.ActivityBuilder_BindTestActivity$write$read */
        public static abstract class read extends C1241xc75ead43<TestActivity> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Activity> IconCompatParcelizer(write.read read);
}
