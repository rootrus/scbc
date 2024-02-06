package com.scb.phone.p035di;

import android.app.Activity;
import com.scb.phone.view.activity.cardmanagement.ExportCardStatementActivity;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.ActivityBuilder_BindExportCardStatementActivity */
public abstract class ActivityBuilder_BindExportCardStatementActivity {

    /* renamed from: com.scb.phone.di.ActivityBuilder_BindExportCardStatementActivity$write */
    public interface write extends MileageQuantitySelectionActivity_ViewBinding<ExportCardStatementActivity> {

        /* renamed from: com.scb.phone.di.ActivityBuilder_BindExportCardStatementActivity$write$IconCompatParcelizer */
        public static abstract class IconCompatParcelizer extends C1241xc75ead43<ExportCardStatementActivity> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Activity> MediaBrowserCompat$ItemReceiver(write.IconCompatParcelizer iconCompatParcelizer);
}
