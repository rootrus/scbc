package p040o;

import android.content.Context;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.ScanPaymentActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import java.lang.ref.WeakReference;

/* renamed from: o.setActiveTabAlpha */
public final class setActiveTabAlpha {
    /* access modifiers changed from: private */
    public static final String[] IconCompatParcelizer = {"android.permission.CAMERA"};
    private static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"android.permission.READ_EXTERNAL_STORAGE"};

    public static void read(ScanPaymentActivity scanPaymentActivity) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(scanPaymentActivity, IconCompatParcelizer)) {
            scanPaymentActivity.MediaSessionCompat$Token();
        } else if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(scanPaymentActivity, IconCompatParcelizer)) {
            read read2 = new read(scanPaymentActivity, (byte) 0);
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onShowRationale", new Object[0]);
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) scanPaymentActivity);
            String string = IconCompatParcelizer2.read.getString(R.string.permission_camera_title);
            if (!(string == null || string.length() == 0)) {
                IconCompatParcelizer2.mTitleTextView.setVisibility(0);
                IconCompatParcelizer2.mTitleTextView.setText(string);
            }
            String string2 = IconCompatParcelizer2.read.getString(R.string.permission_camera);
            if (true ^ (string2 == null || string2.length() == 0)) {
                IconCompatParcelizer2.mTextTextView.setVisibility(0);
                IconCompatParcelizer2.mTextTextView.setText(string2);
            }
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.permission_allow), new BottomBar(read2));
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.permission_deny), new setInteractiveAnimation(read2)).show();
        } else {
            AppCompatRatingBar.write(scanPaymentActivity, IconCompatParcelizer, 55);
        }
    }

    public static void IconCompatParcelizer(ScanPaymentActivity scanPaymentActivity) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(scanPaymentActivity, MediaBrowserCompat$CustomActionResultReceiver)) {
            scanPaymentActivity.MediaSessionCompat$ResultReceiverWrapper();
        } else {
            AppCompatRatingBar.write(scanPaymentActivity, MediaBrowserCompat$CustomActionResultReceiver, 56);
        }
    }

    public static void IconCompatParcelizer(ScanPaymentActivity scanPaymentActivity, int i, int[] iArr) {
        if (i != 55) {
            if (i == 56 && ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                scanPaymentActivity.MediaSessionCompat$ResultReceiverWrapper();
            }
        } else if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            scanPaymentActivity.MediaSessionCompat$Token();
        } else if (!ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(scanPaymentActivity, IconCompatParcelizer)) {
            ScanPaymentActivity.MediaSessionCompat$QueueItem();
        } else {
            ScanPaymentActivity.m3017x50fd9e4a();
        }
    }

    /* renamed from: o.setActiveTabAlpha$read */
    static final class read implements HistoryAdapter$GroupFooterViewHolder_ViewBinding {
        private final WeakReference<ScanPaymentActivity> read;

        /* synthetic */ read(ScanPaymentActivity scanPaymentActivity, byte b) {
            this(scanPaymentActivity);
        }

        private read(ScanPaymentActivity scanPaymentActivity) {
            this.read = new WeakReference<>(scanPaymentActivity);
        }

        public final void write() {
            ScanPaymentActivity scanPaymentActivity = this.read.get();
            if (scanPaymentActivity != null) {
                AppCompatRatingBar.write(scanPaymentActivity, setActiveTabAlpha.IconCompatParcelizer, 55);
            }
        }

        public final void read() {
            if (this.read.get() != null) {
                ScanPaymentActivity.m3017x50fd9e4a();
            }
        }
    }
}
