package p039io.realm;

import p039io.realm.internal.OsObjectSchemaInfo;
import p039io.realm.internal.OsSchemaInfo;
import p040o.HmlNTBLoanReviewActivity;

/* renamed from: io.realm.com_scb_phone_data_entity_billpayment_RealmStringRealmProxy$MediaBrowserCompat$ItemReceiver */
final class C9654xbbda94b8 extends HmlNTBLoanReviewActivity {
    long MediaBrowserCompat$CustomActionResultReceiver;
    long read;

    C9654xbbda94b8(OsSchemaInfo osSchemaInfo) {
        super(1);
        OsObjectSchemaInfo osObjectSchemaInfo = new OsObjectSchemaInfo(OsSchemaInfo.nativeGetObjectSchemaInfo(osSchemaInfo.IconCompatParcelizer, "RealmString"));
        this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver("creditCardCategory", "creditCardCategory", osObjectSchemaInfo);
        this.read = OsObjectSchemaInfo.nativeGetMaxColumnIndex(osObjectSchemaInfo.write);
    }
}
