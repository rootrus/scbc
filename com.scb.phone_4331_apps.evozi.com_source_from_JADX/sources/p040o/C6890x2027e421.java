package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import p039io.realm.internal.OsObjectSchemaInfo;
import p039io.realm.internal.OsSchemaInfo;

/* renamed from: o.HmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6890x2027e421 extends HmlNTBLoanReviewActivity {
    long IconCompatParcelizer;
    long MediaBrowserCompat$CustomActionResultReceiver;
    long MediaBrowserCompat$ItemReceiver;
    long read;
    long write;

    public /* synthetic */ C6890x2027e421() {
    }

    C6890x2027e421(OsSchemaInfo osSchemaInfo) {
        super(4);
        OsObjectSchemaInfo osObjectSchemaInfo = new OsObjectSchemaInfo(OsSchemaInfo.nativeGetObjectSchemaInfo(osSchemaInfo.IconCompatParcelizer, "CodeDescriptionEntity"));
        this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver("header", "header", osObjectSchemaInfo);
        this.write = MediaBrowserCompat$CustomActionResultReceiver("code", "code", osObjectSchemaInfo);
        this.IconCompatParcelizer = MediaBrowserCompat$CustomActionResultReceiver("description", "description", osObjectSchemaInfo);
        this.read = MediaBrowserCompat$CustomActionResultReceiver(C8183f.f4230JO, C8183f.f4230JO, osObjectSchemaInfo);
        this.MediaBrowserCompat$ItemReceiver = OsObjectSchemaInfo.nativeGetMaxColumnIndex(osObjectSchemaInfo.write);
    }
}
