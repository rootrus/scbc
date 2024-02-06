package p040o;

import android.content.Context;
import com.scb.phone.R;
import com.scb.phone.view.activity.etb.EtbSuccessActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import java.lang.ref.WeakReference;

/* renamed from: o.qq */
public final class C7404qq {
    private static HistoryAdapter$GroupFooterViewHolder MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public static final String[] read = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void write(EtbSuccessActivity etbSuccessActivity, boolean z) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(etbSuccessActivity, read)) {
            etbSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver(z);
            return;
        }
        MediaBrowserCompat$ItemReceiver = new read(etbSuccessActivity, z, (byte) 0);
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(etbSuccessActivity, read)) {
            HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = MediaBrowserCompat$ItemReceiver;
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onShowRationale", new Object[0]);
            CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) etbSuccessActivity);
            String string = IconCompatParcelizer.read.getString(R.string.permission_storage_title);
            if (!(string == null || string.length() == 0)) {
                IconCompatParcelizer.mTitleTextView.setVisibility(0);
                IconCompatParcelizer.mTitleTextView.setText(string);
            }
            String string2 = IconCompatParcelizer.read.getString(R.string.permission_storage);
            if (true ^ (string2 == null || string2.length() == 0)) {
                IconCompatParcelizer.mTextTextView.setVisibility(0);
                IconCompatParcelizer.mTextTextView.setText(string2);
            }
            CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.permission_allow), new C7388pu(historyAdapter$GroupFooterViewHolder));
            IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.permission_deny), new C7391px(historyAdapter$GroupFooterViewHolder)).show();
            return;
        }
        AppCompatRatingBar.write(etbSuccessActivity, read, 19);
    }

    public static void IconCompatParcelizer(EtbSuccessActivity etbSuccessActivity, int i, int[] iArr) {
        if (i == 19) {
            if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = MediaBrowserCompat$ItemReceiver;
                if (historyAdapter$GroupFooterViewHolder != null) {
                    historyAdapter$GroupFooterViewHolder.IconCompatParcelizer();
                }
            } else if (!ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(etbSuccessActivity, read)) {
                EtbSuccessActivity.MediaSessionCompat$ResultReceiverWrapper();
            } else {
                EtbSuccessActivity.MediaSessionCompat$QueueItem();
            }
            MediaBrowserCompat$ItemReceiver = null;
        }
    }

    /* renamed from: o.qq$read */
    static final class read implements HistoryAdapter$GroupFooterViewHolder {
        private final boolean MediaBrowserCompat$ItemReceiver;
        private final WeakReference<EtbSuccessActivity> read;

        /* synthetic */ read(EtbSuccessActivity etbSuccessActivity, boolean z, byte b) {
            this(etbSuccessActivity, z);
        }

        private read(EtbSuccessActivity etbSuccessActivity, boolean z) {
            this.read = new WeakReference<>(etbSuccessActivity);
            this.MediaBrowserCompat$ItemReceiver = z;
        }

        public final void write() {
            EtbSuccessActivity etbSuccessActivity = this.read.get();
            if (etbSuccessActivity != null) {
                AppCompatRatingBar.write(etbSuccessActivity, C7404qq.read, 19);
            }
        }

        public final void read() {
            if (this.read.get() != null) {
                EtbSuccessActivity.MediaSessionCompat$QueueItem();
            }
        }

        public final void IconCompatParcelizer() {
            EtbSuccessActivity etbSuccessActivity = this.read.get();
            if (etbSuccessActivity != null) {
                etbSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
            }
        }
    }
}
