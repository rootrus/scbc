package p040o;

import android.content.Context;
import com.scb.phone.R;
import com.scb.phone.view.activity.cardmanagement.SaveSlipBaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import java.lang.ref.WeakReference;

/* renamed from: o.jb */
public final class C7183jb {
    /* access modifiers changed from: private */
    public static final String[] read = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static <T> void IconCompatParcelizer(SaveSlipBaseActivity<T> saveSlipBaseActivity) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(saveSlipBaseActivity, read)) {
            saveSlipBaseActivity.AppCompatDelegateImpl$ListMenuDecorView();
        } else if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(saveSlipBaseActivity, read)) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(saveSlipBaseActivity, (byte) 0);
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) saveSlipBaseActivity);
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
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.permission_allow), new C7161iQ(iconCompatParcelizer));
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.permission_deny), new C7164iT(iconCompatParcelizer)).show();
        } else {
            AppCompatRatingBar.write(saveSlipBaseActivity, read, 54);
        }
    }

    public static <T> void write(SaveSlipBaseActivity<T> saveSlipBaseActivity, int i, int[] iArr) {
        if (i != 54) {
            return;
        }
        if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            saveSlipBaseActivity.AppCompatDelegateImpl$ListMenuDecorView();
        } else if (!ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(saveSlipBaseActivity, read)) {
            SaveSlipBaseActivity.setContentView();
        } else {
            SaveSlipBaseActivity.AppCompatActivity();
        }
    }

    /* renamed from: o.jb$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements HistoryAdapter$GroupFooterViewHolder_ViewBinding {
        private final WeakReference<SaveSlipBaseActivity<T>> write;

        /* synthetic */ IconCompatParcelizer(SaveSlipBaseActivity saveSlipBaseActivity, byte b) {
            this(saveSlipBaseActivity);
        }

        private IconCompatParcelizer(SaveSlipBaseActivity<T> saveSlipBaseActivity) {
            this.write = new WeakReference<>(saveSlipBaseActivity);
        }

        public final void write() {
            SaveSlipBaseActivity saveSlipBaseActivity = this.write.get();
            if (saveSlipBaseActivity != null) {
                AppCompatRatingBar.write(saveSlipBaseActivity, C7183jb.read, 54);
            }
        }

        public final void read() {
            if (this.write.get() != null) {
                SaveSlipBaseActivity.AppCompatActivity();
            }
        }
    }
}
