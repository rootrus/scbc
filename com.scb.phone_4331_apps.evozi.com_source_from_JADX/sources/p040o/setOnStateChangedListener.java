package p040o;

import android.content.Context;
import com.scb.phone.R;
import com.scb.phone.view.activity.investment.assessment.RiskAssessmentSuccessActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import java.lang.ref.WeakReference;

/* renamed from: o.setOnStateChangedListener */
public final class setOnStateChangedListener {
    /* access modifiers changed from: private */
    public static final String[] IconCompatParcelizer = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static HistoryAdapter$GroupFooterViewHolder read;

    public static void IconCompatParcelizer(RiskAssessmentSuccessActivity riskAssessmentSuccessActivity, populateEventDeviceData populateeventdevicedata, boolean z) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(riskAssessmentSuccessActivity, IconCompatParcelizer)) {
            riskAssessmentSuccessActivity.IconCompatParcelizer(populateeventdevicedata, z);
            return;
        }
        read = new IconCompatParcelizer(riskAssessmentSuccessActivity, populateeventdevicedata, z, (byte) 0);
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(riskAssessmentSuccessActivity, IconCompatParcelizer)) {
            HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = read;
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onShowRationale", new Object[0]);
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) riskAssessmentSuccessActivity);
            String string = IconCompatParcelizer2.read.getString(R.string.permission_storage_title);
            if (!(string == null || string.length() == 0)) {
                IconCompatParcelizer2.mTitleTextView.setVisibility(0);
                IconCompatParcelizer2.mTitleTextView.setText(string);
            }
            String string2 = IconCompatParcelizer2.read.getString(R.string.permission_storage);
            if (true ^ (string2 == null || string2.length() == 0)) {
                IconCompatParcelizer2.mTextTextView.setVisibility(0);
                IconCompatParcelizer2.mTextTextView.setText(string2);
            }
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.permission_allow), new setMinimumTileDpi(historyAdapter$GroupFooterViewHolder));
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.permission_deny), new setPanLimit(historyAdapter$GroupFooterViewHolder)).show();
            return;
        }
        AppCompatRatingBar.write(riskAssessmentSuccessActivity, IconCompatParcelizer, 51);
    }

    /* renamed from: o.setOnStateChangedListener$IconCompatParcelizer */
    static final class IconCompatParcelizer implements HistoryAdapter$GroupFooterViewHolder {
        private final populateEventDeviceData IconCompatParcelizer;
        private final WeakReference<RiskAssessmentSuccessActivity> MediaBrowserCompat$CustomActionResultReceiver;
        private final boolean read;

        /* synthetic */ IconCompatParcelizer(RiskAssessmentSuccessActivity riskAssessmentSuccessActivity, populateEventDeviceData populateeventdevicedata, boolean z, byte b) {
            this(riskAssessmentSuccessActivity, populateeventdevicedata, z);
        }

        private IconCompatParcelizer(RiskAssessmentSuccessActivity riskAssessmentSuccessActivity, populateEventDeviceData populateeventdevicedata, boolean z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(riskAssessmentSuccessActivity);
            this.IconCompatParcelizer = populateeventdevicedata;
            this.read = z;
        }

        public final void write() {
            RiskAssessmentSuccessActivity riskAssessmentSuccessActivity = this.MediaBrowserCompat$CustomActionResultReceiver.get();
            if (riskAssessmentSuccessActivity != null) {
                AppCompatRatingBar.write(riskAssessmentSuccessActivity, setOnStateChangedListener.IconCompatParcelizer, 51);
            }
        }

        public final void read() {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.get() != null) {
                RiskAssessmentSuccessActivity.m2938x50fd9e4a();
            }
        }

        public final void IconCompatParcelizer() {
            RiskAssessmentSuccessActivity riskAssessmentSuccessActivity = this.MediaBrowserCompat$CustomActionResultReceiver.get();
            if (riskAssessmentSuccessActivity != null) {
                riskAssessmentSuccessActivity.IconCompatParcelizer(this.IconCompatParcelizer, this.read);
            }
        }
    }
}
