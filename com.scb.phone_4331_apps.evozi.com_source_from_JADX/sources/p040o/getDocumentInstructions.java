package p040o;

import com.scb.phone.view.fragment.donations.SharingMomentsPreviewFragment;

/* renamed from: o.getDocumentInstructions */
public final class getDocumentInstructions {
    private static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void MediaBrowserCompat$ItemReceiver(SharingMomentsPreviewFragment sharingMomentsPreviewFragment) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(sharingMomentsPreviewFragment.requireActivity(), MediaBrowserCompat$CustomActionResultReceiver)) {
            DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDonationsFoundationDetailsFragment((getDeviceFile) sharingMomentsPreviewFragment.getArguments().getParcelable("com.scb.phone.EXTRA_SHARING_PREVIEW_DISPLAY"), sharingMomentsPreviewFragment.getContext())).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new HmlConsentService(sharingMomentsPreviewFragment), new HmlDocumentUploadService(sharingMomentsPreviewFragment));
        } else {
            sharingMomentsPreviewFragment.requestPermissions(MediaBrowserCompat$CustomActionResultReceiver, 59);
        }
    }
}
