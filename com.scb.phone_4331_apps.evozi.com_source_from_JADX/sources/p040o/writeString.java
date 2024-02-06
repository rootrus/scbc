package p040o;

import com.scb.phone.view.fragment.hml.C5995xd770688e;

/* renamed from: o.writeString */
public final /* synthetic */ class writeString implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C5995xd770688e IconCompatParcelizer;

    public /* synthetic */ writeString(C5995xd770688e hmlNTBDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.IconCompatParcelizer = hmlNTBDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object write(Object obj) {
        C5995xd770688e hmlNTBDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer;
        OECF_sRGB oECF_sRGB = (OECF_sRGB) obj;
        OECF_sRGB oECF_sRGB2 = hmlNTBDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver.read.write;
        if (oECF_sRGB2 != null) {
            oECF_sRGB2.Keep = oECF_sRGB.Keep;
            oECF_sRGB2.MediaBrowserCompat$SearchResultReceiver = oECF_sRGB.MediaBrowserCompat$SearchResultReceiver;
            hmlNTBDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$CustomActionResultReceiver(oECF_sRGB2);
        }
        return hmlNTBDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.write(oECF_sRGB);
    }
}
