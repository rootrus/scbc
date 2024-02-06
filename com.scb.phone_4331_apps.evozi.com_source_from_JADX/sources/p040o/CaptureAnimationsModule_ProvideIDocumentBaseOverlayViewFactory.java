package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.CaptureAnimationsModule_ProvideIDocumentBaseOverlayViewFactory */
public final /* synthetic */ class CaptureAnimationsModule_ProvideIDocumentBaseOverlayViewFactory implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CaptureMessage MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ boolean MediaBrowserCompat$MediaItem;
    private final /* synthetic */ boolean MediaDescriptionCompat;
    private final /* synthetic */ boolean MediaMetadataCompat;
    private final /* synthetic */ boolean read;
    private final /* synthetic */ boolean write;

    public /* synthetic */ CaptureAnimationsModule_ProvideIDocumentBaseOverlayViewFactory(CaptureMessage captureMessage, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.MediaBrowserCompat$ItemReceiver = captureMessage;
        this.write = z;
        this.read = z2;
        this.IconCompatParcelizer = z3;
        this.MediaBrowserCompat$CustomActionResultReceiver = z4;
        this.MediaDescriptionCompat = z5;
        this.MediaMetadataCompat = z6;
        this.MediaBrowserCompat$MediaItem = z7;
    }

    public final void IconCompatParcelizer(Object obj) {
        CaptureMessage captureMessage = this.MediaBrowserCompat$ItemReceiver;
        boolean z = this.write;
        boolean z2 = this.read;
        boolean z3 = this.IconCompatParcelizer;
        boolean z4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z5 = this.MediaDescriptionCompat;
        boolean z6 = this.MediaMetadataCompat;
        boolean z7 = this.MediaBrowserCompat$MediaItem;
        if (!z) {
            captureMessage.MediaBrowserCompat$ItemReceiver(captureMessage.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(Iterables$3$MediaBrowserCompat$MediaItem.onboarding_input_address_error_title, Iterables$3$MediaBrowserCompat$MediaItem.onboarding_input_address_thanon_is_not_allowed));
        } else if (!z2) {
            captureMessage.MediaBrowserCompat$ItemReceiver(captureMessage.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(Iterables$3$MediaBrowserCompat$MediaItem.onboarding_input_address_error_title, Iterables$3$MediaBrowserCompat$MediaItem.onboarding_input_address_soi_is_not_allowed));
        } else if (!z3) {
            captureMessage.MediaBrowserCompat$ItemReceiver(captureMessage.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(Iterables$3$MediaBrowserCompat$MediaItem.onboarding_input_address_error_title, Iterables$3$MediaBrowserCompat$MediaItem.onboarding_input_address_moo_is_not_allowed));
        } else if (!z4) {
            captureMessage.MediaBrowserCompat$ItemReceiver(captureMessage.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(Iterables$3$MediaBrowserCompat$MediaItem.onboarding_input_address_error_title, Iterables$3$MediaBrowserCompat$MediaItem.onboarding_input_address_village_is_not_allowed));
        } else if (!z5) {
            captureMessage.MediaBrowserCompat$ItemReceiver(captureMessage.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(Iterables$3$MediaBrowserCompat$MediaItem.onboarding_input_address_error_title, Iterables$3$MediaBrowserCompat$MediaItem.onboarding_input_address_floor_is_not_allowed));
        } else if (!z6) {
            captureMessage.MediaBrowserCompat$ItemReceiver(captureMessage.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(Iterables$3$MediaBrowserCompat$MediaItem.onboarding_input_address_error_title, Iterables$3$MediaBrowserCompat$MediaItem.onboarding_input_address_unit_is_not_allowed));
        } else if (!z7) {
            captureMessage.MediaBrowserCompat$ItemReceiver(captureMessage.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(Iterables$3$MediaBrowserCompat$MediaItem.onboarding_input_address_error_title, Iterables$3$MediaBrowserCompat$MediaItem.onboarding_input_address_house_no_is_not_allowed));
        }
    }
}
