package p040o;

import android.content.DialogInterface;
import p040o.setResultDeserializer;

/* renamed from: o.postPrivacyConsentInquiry */
public final /* synthetic */ class postPrivacyConsentInquiry implements DialogInterface.OnClickListener {
    private final /* synthetic */ setResultDeserializer.write IconCompatParcelizer;

    public /* synthetic */ postPrivacyConsentInquiry(setResultDeserializer.write write) {
        this.IconCompatParcelizer = write;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.IconCompatParcelizer.write();
    }
}
