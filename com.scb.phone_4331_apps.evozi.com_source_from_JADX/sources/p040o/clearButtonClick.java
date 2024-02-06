package p040o;

import kotlin.TypeCastException;
import p040o.MwReviewActivity;

/* renamed from: o.clearButtonClick */
public class clearButtonClick<E> extends showDialogDeletePinLocation<E> {
    /* access modifiers changed from: protected */
    public final boolean IconCompatParcelizer() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo42858x50fd9e4a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean MediaSessionCompat$ResultReceiverWrapper() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean write() {
        return true;
    }

    /* access modifiers changed from: protected */
    public Object write(E e) {
        MwShopTypeActivity_ViewBinding mwShopTypeActivity_ViewBinding;
        do {
            Object write = super.write(e);
            if (write == MwReviewActivity_ViewBinding.IconCompatParcelizer) {
                return MwReviewActivity_ViewBinding.IconCompatParcelizer;
            }
            if (write == MwReviewActivity_ViewBinding.write) {
                MwReviewActivity.IconCompatParcelizer iconCompatParcelizer = new MwReviewActivity.IconCompatParcelizer(e);
                onReturnHomeButtonClick MediaDescriptionCompat = MediaDescriptionCompat();
                while (true) {
                    Object MediaMetadataCompat = MediaDescriptionCompat.MediaMetadataCompat();
                    if (MediaMetadataCompat != null) {
                        NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = (NdidIdpShareSuccessActivity) MediaMetadataCompat;
                        if (!(ndidIdpShareSuccessActivity instanceof MwShopTypeActivity_ViewBinding)) {
                            if (ndidIdpShareSuccessActivity.read(iconCompatParcelizer, MediaDescriptionCompat)) {
                                MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer);
                                mwShopTypeActivity_ViewBinding = null;
                                break;
                            }
                        } else {
                            mwShopTypeActivity_ViewBinding = (MwShopTypeActivity_ViewBinding) ndidIdpShareSuccessActivity;
                            break;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                    }
                }
                if (mwShopTypeActivity_ViewBinding == null) {
                    return MwReviewActivity_ViewBinding.IconCompatParcelizer;
                }
            } else if (write instanceof MwShopAddressActivity) {
                return write;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid offerInternal result ");
                sb.append(write);
                throw new IllegalStateException(sb.toString().toString());
            }
        } while (!(mwShopTypeActivity_ViewBinding instanceof MwShopAddressActivity));
        return mwShopTypeActivity_ViewBinding;
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(MwReviewActivity.IconCompatParcelizer<? extends E> iconCompatParcelizer) {
        for (NdidIdpShareSuccessActivity write = NationalIdCameraActivity_ViewBinding.write(iconCompatParcelizer.MediaMetadataCompat()); write instanceof MwReviewActivity.IconCompatParcelizer; write = NationalIdCameraActivity_ViewBinding.write(write.MediaMetadataCompat())) {
            if (!write.aU_()) {
                write.MediaDescriptionCompat();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity) {
        onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "closed");
        NdidIdpShareSuccessActivity write = NationalIdCameraActivity_ViewBinding.write(ndidIdpShareSuccessActivity.MediaMetadataCompat());
        if (!(write instanceof MwReviewActivity.IconCompatParcelizer)) {
            write = null;
        }
        MwReviewActivity.IconCompatParcelizer iconCompatParcelizer = (MwReviewActivity.IconCompatParcelizer) write;
        if (iconCompatParcelizer != null) {
            MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer);
        }
    }
}
