package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.easycash.BaseTakePhotoFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.JuristicService */
public final class JuristicService {
    /* access modifiers changed from: private */
    public static final String[] MediaBrowserCompat$ItemReceiver = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    /* access modifiers changed from: private */
    public static final String[] write = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    public static void MediaBrowserCompat$ItemReceiver(BaseTakePhotoFragment baseTakePhotoFragment) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(baseTakePhotoFragment.requireActivity(), MediaBrowserCompat$ItemReceiver)) {
            baseTakePhotoFragment.AppCompatDialogFragment();
        } else if (ProxySourceAdapter$ItemViewHolder.write(baseTakePhotoFragment, MediaBrowserCompat$ItemReceiver)) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(baseTakePhotoFragment, (byte) 0);
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(baseTakePhotoFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_camera_title).IconCompatParcelizer((int) R.string.permission_camera);
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.permission_allow), new getDocumentsWithDeepLinkListById(iconCompatParcelizer));
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.permission_deny), new getEducationLevels(iconCompatParcelizer)).show();
        } else {
            baseTakePhotoFragment.requestPermissions(MediaBrowserCompat$ItemReceiver, 4);
        }
    }

    public static void read(BaseTakePhotoFragment baseTakePhotoFragment) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(baseTakePhotoFragment.requireActivity(), write)) {
            baseTakePhotoFragment.AppCompatViewInflater();
        } else if (ProxySourceAdapter$ItemViewHolder.write(baseTakePhotoFragment, write)) {
            JuristicService$MediaBrowserCompat$ItemReceiver juristicService$MediaBrowserCompat$ItemReceiver = new JuristicService$MediaBrowserCompat$ItemReceiver(baseTakePhotoFragment, (byte) 0);
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(baseTakePhotoFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_storage_title).IconCompatParcelizer((int) R.string.permission_storage);
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.permission_allow), new getMaritalStatus(juristicService$MediaBrowserCompat$ItemReceiver));
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.permission_deny), new getNCBAcceptance(juristicService$MediaBrowserCompat$ItemReceiver)).show();
        } else {
            baseTakePhotoFragment.requestPermissions(write, 5);
        }
    }

    public static void write(BaseTakePhotoFragment baseTakePhotoFragment, int i, int[] iArr) {
        if (i != 4) {
            if (i != 5) {
                return;
            }
            if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                baseTakePhotoFragment.AppCompatViewInflater();
            } else if (!ProxySourceAdapter$ItemViewHolder.write(baseTakePhotoFragment, write)) {
                BaseTakePhotoFragment.ActionMenuItemView();
            } else {
                BaseTakePhotoFragment.setExpandedFormat();
            }
        } else if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            baseTakePhotoFragment.AppCompatDialogFragment();
        } else if (!ProxySourceAdapter$ItemViewHolder.write(baseTakePhotoFragment, MediaBrowserCompat$ItemReceiver)) {
            BaseTakePhotoFragment.setChecked();
        } else {
            BaseTakePhotoFragment.setCheckable();
        }
    }

    /* renamed from: o.JuristicService$IconCompatParcelizer */
    static final class IconCompatParcelizer implements HistoryAdapter$GroupFooterViewHolder_ViewBinding {
        private final WeakReference<BaseTakePhotoFragment> MediaBrowserCompat$CustomActionResultReceiver;

        /* synthetic */ IconCompatParcelizer(BaseTakePhotoFragment baseTakePhotoFragment, byte b) {
            this(baseTakePhotoFragment);
        }

        private IconCompatParcelizer(BaseTakePhotoFragment baseTakePhotoFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(baseTakePhotoFragment);
        }

        public final void write() {
            BaseTakePhotoFragment baseTakePhotoFragment = this.MediaBrowserCompat$CustomActionResultReceiver.get();
            if (baseTakePhotoFragment != null) {
                baseTakePhotoFragment.requestPermissions(JuristicService.MediaBrowserCompat$ItemReceiver, 4);
            }
        }

        public final void read() {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.get() != null) {
                BaseTakePhotoFragment.setCheckable();
            }
        }
    }
}
