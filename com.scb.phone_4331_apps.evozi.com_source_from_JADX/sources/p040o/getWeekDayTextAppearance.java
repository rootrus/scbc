package p040o;

import android.content.Context;
import com.scb.phone.R;
import com.scb.phone.view.activity.mwpartner.MwCreateQrActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import java.lang.ref.WeakReference;
import p040o.C5465y;

/* renamed from: o.getWeekDayTextAppearance */
public final class getWeekDayTextAppearance {
    /* access modifiers changed from: private */
    public static final String[] MediaBrowserCompat$ItemReceiver = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static HistoryAdapter$GroupFooterViewHolder write;

    public static void write(MwCreateQrActivity mwCreateQrActivity, boolean z) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(mwCreateQrActivity, MediaBrowserCompat$ItemReceiver)) {
            mwCreateQrActivity.write(z);
            return;
        }
        write = new read(mwCreateQrActivity, z, (byte) 0);
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(mwCreateQrActivity, MediaBrowserCompat$ItemReceiver)) {
            HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = write;
            CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) mwCreateQrActivity);
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
            CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.permission_allow), new C5465y.C5468b(historyAdapter$GroupFooterViewHolder));
            IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.permission_deny), new C5465y.C5467a(historyAdapter$GroupFooterViewHolder)).show();
            return;
        }
        AppCompatRatingBar.write(mwCreateQrActivity, MediaBrowserCompat$ItemReceiver, 35);
    }

    public static void IconCompatParcelizer(MwCreateQrActivity mwCreateQrActivity, int i, int[] iArr) {
        if (i == 35) {
            if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = write;
                if (historyAdapter$GroupFooterViewHolder != null) {
                    historyAdapter$GroupFooterViewHolder.IconCompatParcelizer();
                }
            } else {
                ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(mwCreateQrActivity, MediaBrowserCompat$ItemReceiver);
            }
            write = null;
        }
    }

    /* renamed from: o.getWeekDayTextAppearance$read */
    static final class read implements HistoryAdapter$GroupFooterViewHolder {
        private final boolean MediaBrowserCompat$CustomActionResultReceiver;
        private final WeakReference<MwCreateQrActivity> read;

        /* synthetic */ read(MwCreateQrActivity mwCreateQrActivity, boolean z, byte b) {
            this(mwCreateQrActivity, z);
        }

        private read(MwCreateQrActivity mwCreateQrActivity, boolean z) {
            this.read = new WeakReference<>(mwCreateQrActivity);
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
        }

        public final void write() {
            MwCreateQrActivity mwCreateQrActivity = this.read.get();
            if (mwCreateQrActivity != null) {
                AppCompatRatingBar.write(mwCreateQrActivity, getWeekDayTextAppearance.MediaBrowserCompat$ItemReceiver, 35);
            }
        }

        public final void read() {
            if (this.read.get() == null) {
            }
        }

        public final void IconCompatParcelizer() {
            MwCreateQrActivity mwCreateQrActivity = this.read.get();
            if (mwCreateQrActivity != null) {
                mwCreateQrActivity.write(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
    }
}
