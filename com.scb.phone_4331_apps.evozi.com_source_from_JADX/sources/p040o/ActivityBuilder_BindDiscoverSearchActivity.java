package p040o;

import com.scb.phone.view.fragment.hml.HmlDocumentListFragment;
import java.util.Arrays;

/* renamed from: o.ActivityBuilder_BindDiscoverSearchActivity */
public final class ActivityBuilder_BindDiscoverSearchActivity {
    private static final String[] IconCompatParcelizer = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    private static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"android.permission.CAMERA"};
    private static final String[] MediaBrowserCompat$ItemReceiver = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    private static final String[] read = {"android.permission.CAMERA"};
    private static final String[] write = {"android.permission.CAMERA"};

    public static final void IconCompatParcelizer(HmlDocumentListFragment hmlDocumentListFragment) {
        onGetStartedClick.write((Object) hmlDocumentListFragment, "$this$navigateToTakePhotoKofaxWithPermissionCheck");
        String[] strArr = MediaBrowserCompat$CustomActionResultReceiver;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(hmlDocumentListFragment.requireActivity(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            hmlDocumentListFragment.setShortcut();
        } else {
            hmlDocumentListFragment.requestPermissions(MediaBrowserCompat$CustomActionResultReceiver, 29);
        }
    }

    public static final void MediaBrowserCompat$ItemReceiver(HmlDocumentListFragment hmlDocumentListFragment) {
        onGetStartedClick.write((Object) hmlDocumentListFragment, "$this$navigateToKofaxInstructionWithPermissionCheck");
        String[] strArr = read;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(hmlDocumentListFragment.requireActivity(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            hmlDocumentListFragment.setItemInvoker();
        } else {
            hmlDocumentListFragment.requestPermissions(read, 27);
        }
    }

    public static final void read(HmlDocumentListFragment hmlDocumentListFragment) {
        onGetStartedClick.write((Object) hmlDocumentListFragment, "$this$navigateToKofaxTutorialWithPermissionCheck");
        String[] strArr = write;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(hmlDocumentListFragment.requireActivity(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            hmlDocumentListFragment.setPopupCallback();
        } else {
            hmlDocumentListFragment.requestPermissions(write, 28);
        }
    }

    public static final void write(HmlDocumentListFragment hmlDocumentListFragment) {
        onGetStartedClick.write((Object) hmlDocumentListFragment, "$this$navigateToUploadPhotoWithPermissionCheck");
        String[] strArr = MediaBrowserCompat$ItemReceiver;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(hmlDocumentListFragment.requireActivity(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            hmlDocumentListFragment.setTitle();
        } else {
            hmlDocumentListFragment.requestPermissions(MediaBrowserCompat$ItemReceiver, 30);
        }
    }

    public static final void MediaBrowserCompat$CustomActionResultReceiver(HmlDocumentListFragment hmlDocumentListFragment) {
        onGetStartedClick.write((Object) hmlDocumentListFragment, "$this$navigateToChooseFileWithPermissionCheck");
        String[] strArr = IconCompatParcelizer;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(hmlDocumentListFragment.requireActivity(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            hmlDocumentListFragment.setIcon();
        } else {
            hmlDocumentListFragment.requestPermissions(IconCompatParcelizer, 26);
        }
    }

    public static final void MediaBrowserCompat$CustomActionResultReceiver(HmlDocumentListFragment hmlDocumentListFragment, int i, int[] iArr) {
        onGetStartedClick.write((Object) hmlDocumentListFragment, "$this$onRequestPermissionsResult");
        onGetStartedClick.write((Object) iArr, "grantResults");
        switch (i) {
            case 26:
                if (ProxySourceAdapter$ItemViewHolder.write(Arrays.copyOf(iArr, iArr.length))) {
                    hmlDocumentListFragment.setIcon();
                    return;
                }
                return;
            case 27:
                if (ProxySourceAdapter$ItemViewHolder.write(Arrays.copyOf(iArr, iArr.length))) {
                    hmlDocumentListFragment.setItemInvoker();
                    return;
                }
                return;
            case 28:
                if (ProxySourceAdapter$ItemViewHolder.write(Arrays.copyOf(iArr, iArr.length))) {
                    hmlDocumentListFragment.setPopupCallback();
                    return;
                }
                return;
            case 29:
                if (ProxySourceAdapter$ItemViewHolder.write(Arrays.copyOf(iArr, iArr.length))) {
                    hmlDocumentListFragment.setShortcut();
                    return;
                }
                return;
            case 30:
                if (ProxySourceAdapter$ItemViewHolder.write(Arrays.copyOf(iArr, iArr.length))) {
                    hmlDocumentListFragment.setTitle();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
