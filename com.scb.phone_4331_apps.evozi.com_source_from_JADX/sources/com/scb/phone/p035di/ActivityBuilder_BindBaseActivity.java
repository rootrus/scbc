package com.scb.phone.p035di;

import android.app.Activity;
import com.scb.phone.view.activity.BaseActivity;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.ActivityBuilder_BindBaseActivity */
public abstract class ActivityBuilder_BindBaseActivity {

    /* renamed from: com.scb.phone.di.ActivityBuilder_BindBaseActivity$read */
    public interface read extends MileageQuantitySelectionActivity_ViewBinding<BaseActivity> {

        /* renamed from: com.scb.phone.di.ActivityBuilder_BindBaseActivity$read$IconCompatParcelizer */
        public static abstract class IconCompatParcelizer extends C1241xc75ead43<BaseActivity> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Activity> IconCompatParcelizer(read.IconCompatParcelizer iconCompatParcelizer);
}
