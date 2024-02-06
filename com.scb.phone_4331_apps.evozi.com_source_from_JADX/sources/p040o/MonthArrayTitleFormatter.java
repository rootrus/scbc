package p040o;

import android.content.Context;
import com.scb.phone.R;
import com.scb.phone.view.activity.sme.gifting.GiftOpenSharingMomentActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import java.lang.ref.WeakReference;

/* renamed from: o.MonthArrayTitleFormatter */
public final class MonthArrayTitleFormatter {
    /* access modifiers changed from: private */
    public static final String[] MediaBrowserCompat$ItemReceiver = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void MediaBrowserCompat$CustomActionResultReceiver(GiftOpenSharingMomentActivity giftOpenSharingMomentActivity) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(giftOpenSharingMomentActivity, MediaBrowserCompat$ItemReceiver)) {
            giftOpenSharingMomentActivity.MediaSessionCompat$Token();
        } else if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(giftOpenSharingMomentActivity, MediaBrowserCompat$ItemReceiver)) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(giftOpenSharingMomentActivity, (byte) 0);
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) giftOpenSharingMomentActivity);
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
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.permission_allow), new CalendarWeekDayFormatter(iconCompatParcelizer));
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.permission_deny), new weekNumberDifference(iconCompatParcelizer)).show();
        } else {
            AppCompatRatingBar.write(giftOpenSharingMomentActivity, MediaBrowserCompat$ItemReceiver, 25);
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(GiftOpenSharingMomentActivity giftOpenSharingMomentActivity, int i, int[] iArr) {
        if (i != 25) {
            return;
        }
        if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            giftOpenSharingMomentActivity.MediaSessionCompat$Token();
        } else if (!ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(giftOpenSharingMomentActivity, MediaBrowserCompat$ItemReceiver)) {
            GiftOpenSharingMomentActivity.MediaSessionCompat$QueueItem();
        } else {
            GiftOpenSharingMomentActivity.MediaSessionCompat$ResultReceiverWrapper();
        }
    }

    /* renamed from: o.MonthArrayTitleFormatter$IconCompatParcelizer */
    static final class IconCompatParcelizer implements HistoryAdapter$GroupFooterViewHolder_ViewBinding {
        private final WeakReference<GiftOpenSharingMomentActivity> MediaBrowserCompat$ItemReceiver;

        /* synthetic */ IconCompatParcelizer(GiftOpenSharingMomentActivity giftOpenSharingMomentActivity, byte b) {
            this(giftOpenSharingMomentActivity);
        }

        private IconCompatParcelizer(GiftOpenSharingMomentActivity giftOpenSharingMomentActivity) {
            this.MediaBrowserCompat$ItemReceiver = new WeakReference<>(giftOpenSharingMomentActivity);
        }

        public final void write() {
            GiftOpenSharingMomentActivity giftOpenSharingMomentActivity = this.MediaBrowserCompat$ItemReceiver.get();
            if (giftOpenSharingMomentActivity != null) {
                AppCompatRatingBar.write(giftOpenSharingMomentActivity, MonthArrayTitleFormatter.MediaBrowserCompat$ItemReceiver, 25);
            }
        }

        public final void read() {
            if (this.MediaBrowserCompat$ItemReceiver.get() != null) {
                GiftOpenSharingMomentActivity.MediaSessionCompat$ResultReceiverWrapper();
            }
        }
    }
}
