package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.transferandpay.cardlessatm.CardlessSuccessfulRequestFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.ActivityBuilder_ScbsOnboardingTcActivity */
public final class ActivityBuilder_ScbsOnboardingTcActivity {
    /* access modifiers changed from: private */
    public static final String[] IconCompatParcelizer = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static HistoryAdapter$GroupFooterViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public static void read(CardlessSuccessfulRequestFragment cardlessSuccessfulRequestFragment, parseEventExecution parseeventexecution) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(cardlessSuccessfulRequestFragment.requireActivity(), IconCompatParcelizer)) {
            cardlessSuccessfulRequestFragment.write(parseeventexecution);
            return;
        }
        MediaBrowserCompat$CustomActionResultReceiver = new write(cardlessSuccessfulRequestFragment, parseeventexecution, (byte) 0);
        if (ProxySourceAdapter$ItemViewHolder.write(cardlessSuccessfulRequestFragment, IconCompatParcelizer)) {
            HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = MediaBrowserCompat$CustomActionResultReceiver;
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onShowRationale", new Object[0]);
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(cardlessSuccessfulRequestFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_storage_title).IconCompatParcelizer((int) R.string.permission_storage);
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.permission_allow), new ActivityBuilder_OnboardingTcScbsOtpActivity(historyAdapter$GroupFooterViewHolder));
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.permission_deny), new ActivityBuilder_OnboardingSuccessActivity(historyAdapter$GroupFooterViewHolder)).show();
            return;
        }
        cardlessSuccessfulRequestFragment.requestPermissions(IconCompatParcelizer, 9);
    }

    public static void read(CardlessSuccessfulRequestFragment cardlessSuccessfulRequestFragment, int i, int[] iArr) {
        if (i == 9) {
            if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = MediaBrowserCompat$CustomActionResultReceiver;
                if (historyAdapter$GroupFooterViewHolder != null) {
                    historyAdapter$GroupFooterViewHolder.IconCompatParcelizer();
                }
            } else if (!ProxySourceAdapter$ItemViewHolder.write(cardlessSuccessfulRequestFragment, IconCompatParcelizer)) {
                CardlessSuccessfulRequestFragment.MediaDescriptionCompat();
            } else {
                CardlessSuccessfulRequestFragment.MediaBrowserCompat$MediaItem();
            }
            MediaBrowserCompat$CustomActionResultReceiver = null;
        }
    }

    /* renamed from: o.ActivityBuilder_ScbsOnboardingTcActivity$write */
    static final class write implements HistoryAdapter$GroupFooterViewHolder {
        private final WeakReference<CardlessSuccessfulRequestFragment> IconCompatParcelizer;
        private final parseEventExecution MediaBrowserCompat$ItemReceiver;

        /* synthetic */ write(CardlessSuccessfulRequestFragment cardlessSuccessfulRequestFragment, parseEventExecution parseeventexecution, byte b) {
            this(cardlessSuccessfulRequestFragment, parseeventexecution);
        }

        private write(CardlessSuccessfulRequestFragment cardlessSuccessfulRequestFragment, parseEventExecution parseeventexecution) {
            this.IconCompatParcelizer = new WeakReference<>(cardlessSuccessfulRequestFragment);
            this.MediaBrowserCompat$ItemReceiver = parseeventexecution;
        }

        public final void write() {
            CardlessSuccessfulRequestFragment cardlessSuccessfulRequestFragment = this.IconCompatParcelizer.get();
            if (cardlessSuccessfulRequestFragment != null) {
                cardlessSuccessfulRequestFragment.requestPermissions(ActivityBuilder_ScbsOnboardingTcActivity.IconCompatParcelizer, 9);
            }
        }

        public final void read() {
            if (this.IconCompatParcelizer.get() != null) {
                CardlessSuccessfulRequestFragment.MediaBrowserCompat$MediaItem();
            }
        }

        public final void IconCompatParcelizer() {
            CardlessSuccessfulRequestFragment cardlessSuccessfulRequestFragment = this.IconCompatParcelizer.get();
            if (cardlessSuccessfulRequestFragment != null) {
                cardlessSuccessfulRequestFragment.write(this.MediaBrowserCompat$ItemReceiver);
            }
        }
    }
}
