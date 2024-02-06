package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.promptpay.PromptPayQRSuccessFragment;
import java.lang.ref.WeakReference;
import p040o.C10100p;

/* renamed from: o.ActivityBuilder_ContributeMwBankAccountActivity */
public final class ActivityBuilder_ContributeMwBankAccountActivity {
    /* access modifiers changed from: private */
    public static final String[] IconCompatParcelizer = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void IconCompatParcelizer(PromptPayQRSuccessFragment promptPayQRSuccessFragment) {
        boolean z = false;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(promptPayQRSuccessFragment.requireActivity(), IconCompatParcelizer)) {
            C10100p.C5120a aVar = promptPayQRSuccessFragment.promptPayQRSuccessPresenter;
            C4922kz kzVar = new C4922kz(aVar, true);
            if (aVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                kzVar.IconCompatParcelizer(aVar.RatingCompat);
            }
        } else if (ProxySourceAdapter$ItemViewHolder.write(promptPayQRSuccessFragment, IconCompatParcelizer)) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(promptPayQRSuccessFragment, (byte) 0);
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onShowRationale", new Object[0]);
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(promptPayQRSuccessFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_storage_title).IconCompatParcelizer((int) R.string.permission_storage);
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.permission_allow), new ActivityBuilder_ContributeManagePromptpaySuccessActivity(iconCompatParcelizer));
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.permission_deny), new ActivityBuilder_ContributeManagePromptpayActivity(iconCompatParcelizer)).show();
        } else {
            promptPayQRSuccessFragment.requestPermissions(IconCompatParcelizer, 44);
        }
    }

    /* renamed from: o.ActivityBuilder_ContributeMwBankAccountActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer implements HistoryAdapter$GroupFooterViewHolder_ViewBinding {
        private final WeakReference<PromptPayQRSuccessFragment> MediaBrowserCompat$CustomActionResultReceiver;

        /* synthetic */ IconCompatParcelizer(PromptPayQRSuccessFragment promptPayQRSuccessFragment, byte b) {
            this(promptPayQRSuccessFragment);
        }

        private IconCompatParcelizer(PromptPayQRSuccessFragment promptPayQRSuccessFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(promptPayQRSuccessFragment);
        }

        public final void write() {
            PromptPayQRSuccessFragment promptPayQRSuccessFragment = this.MediaBrowserCompat$CustomActionResultReceiver.get();
            if (promptPayQRSuccessFragment != null) {
                promptPayQRSuccessFragment.requestPermissions(ActivityBuilder_ContributeMwBankAccountActivity.IconCompatParcelizer, 44);
            }
        }

        public final void read() {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.get() != null) {
                PromptPayQRSuccessFragment.write();
            }
        }
    }
}
