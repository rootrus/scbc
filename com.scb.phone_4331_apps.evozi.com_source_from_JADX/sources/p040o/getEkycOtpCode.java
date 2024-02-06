package p040o;

import com.scb.phone.view.fragment.additionaldocument.DocumentUploadFragment;
import java.util.Arrays;

/* renamed from: o.getEkycOtpCode */
public final class getEkycOtpCode {
    private static final String[] IconCompatParcelizer = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    private static final String[] read = {"android.permission.CAMERA"};
    private static final String[] write = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    public static final void read(DocumentUploadFragment documentUploadFragment) {
        onGetStartedClick.write((Object) documentUploadFragment, "$this$navigateToTakePhotoWithPermissionCheck");
        String[] strArr = read;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(documentUploadFragment.requireActivity(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            documentUploadFragment.MediaSessionCompat$QueueItem();
        } else {
            documentUploadFragment.requestPermissions(read, 13);
        }
    }

    public static final void MediaBrowserCompat$ItemReceiver(DocumentUploadFragment documentUploadFragment) {
        onGetStartedClick.write((Object) documentUploadFragment, "$this$navigateToUploadPhotoWithPermissionCheck");
        String[] strArr = write;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(documentUploadFragment.requireActivity(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            documentUploadFragment.mo35905x50fd9e4a();
        } else {
            documentUploadFragment.requestPermissions(write, 14);
        }
    }

    public static final void write(DocumentUploadFragment documentUploadFragment) {
        onGetStartedClick.write((Object) documentUploadFragment, "$this$navigateToChooseFileWithPermissionCheck");
        String[] strArr = IconCompatParcelizer;
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(documentUploadFragment.requireActivity(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            documentUploadFragment.MediaSessionCompat$Token();
        } else {
            documentUploadFragment.requestPermissions(IconCompatParcelizer, 12);
        }
    }

    public static final void IconCompatParcelizer(DocumentUploadFragment documentUploadFragment, int i, int[] iArr) {
        onGetStartedClick.write((Object) documentUploadFragment, "$this$onRequestPermissionsResult");
        onGetStartedClick.write((Object) iArr, "grantResults");
        switch (i) {
            case 12:
                if (ProxySourceAdapter$ItemViewHolder.write(Arrays.copyOf(iArr, iArr.length))) {
                    documentUploadFragment.MediaSessionCompat$Token();
                    return;
                }
                return;
            case 13:
                if (ProxySourceAdapter$ItemViewHolder.write(Arrays.copyOf(iArr, iArr.length))) {
                    documentUploadFragment.MediaSessionCompat$QueueItem();
                    return;
                }
                return;
            case 14:
                if (ProxySourceAdapter$ItemViewHolder.write(Arrays.copyOf(iArr, iArr.length))) {
                    documentUploadFragment.mo35905x50fd9e4a();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
