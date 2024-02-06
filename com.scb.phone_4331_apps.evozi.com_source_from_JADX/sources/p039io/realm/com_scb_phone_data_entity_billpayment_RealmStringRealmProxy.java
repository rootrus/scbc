package p039io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.scb.phone.data.entity.billpayment.RealmString;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p039io.realm.internal.OsObject;
import p039io.realm.internal.OsObjectSchemaInfo;
import p039io.realm.internal.OsSchemaInfo;
import p039io.realm.internal.OsSharedRealm;
import p039io.realm.internal.Row;
import p039io.realm.internal.Table;
import p039io.realm.internal.UncheckedRow;
import p039io.realm.internal.Util;
import p039io.realm.internal.objectstore.OsObjectBuilder;
import p040o.HmlETBSummaryActivity;
import p040o.HmlEtbConfirmationOtpActivity;
import p040o.HmlIssuerInputActivity;
import p040o.HmlLaserIdAboutActivity;
import p040o.HmlNTBAdditionalDocumentActivity_ViewBinding;
import p040o.HmlNTBBusinessOccupationInfoActivity;
import p040o.HmlNTBCaptureDocumentActivity;
import p040o.HmlNTBDocumentListActivity;
import p040o.HmlNTBLoanReviewActivity;
import p040o.HmlNTBReviewActivity;

/* renamed from: io.realm.com_scb_phone_data_entity_billpayment_RealmStringRealmProxy */
public class com_scb_phone_data_entity_billpayment_RealmStringRealmProxy extends RealmString implements HmlNTBReviewActivity, HmlNTBDocumentListActivity {
    private static final OsObjectSchemaInfo read;
    private HmlIssuerInputActivity<RealmString> MediaBrowserCompat$CustomActionResultReceiver;
    private C9654xbbda94b8 write;

    public static String getSimpleClassName() {
        return "RealmString";
    }

    com_scb_phone_data_entity_billpayment_RealmStringRealmProxy() {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = false;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            HmlEtbConfirmationOtpActivity.write write2 = (HmlEtbConfirmationOtpActivity.write) HmlEtbConfirmationOtpActivity.read.get();
            this.write = (C9654xbbda94b8) write2.IconCompatParcelizer;
            HmlIssuerInputActivity<RealmString> hmlIssuerInputActivity = new HmlIssuerInputActivity<>(this);
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlIssuerInputActivity;
            hmlIssuerInputActivity.MediaBrowserCompat$ItemReceiver = write2.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = write2.read;
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = write2.write;
        }
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat.getString(this.write.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void IconCompatParcelizer(String str) {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
            if (str == null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat.setNull(this.write.MediaBrowserCompat$CustomActionResultReceiver);
            } else {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat.setString(this.write.MediaBrowserCompat$CustomActionResultReceiver, str);
            }
        } else if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
            Row row = this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat;
            if (str == null) {
                Table table = row.getTable();
                long j = this.write.MediaBrowserCompat$CustomActionResultReceiver;
                long index = row.getIndex();
                OsSharedRealm osSharedRealm = table.write;
                if (osSharedRealm != null && !OsSharedRealm.nativeIsInTransaction(osSharedRealm.read)) {
                    Table.MediaBrowserCompat$CustomActionResultReceiver();
                }
                Table.nativeSetNull(table.IconCompatParcelizer, j, index, true);
                return;
            }
            row.getTable().IconCompatParcelizer(this.write.MediaBrowserCompat$CustomActionResultReceiver, row.getIndex(), str);
        }
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return read;
    }

    public static C9654xbbda94b8 createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new C9654xbbda94b8(osSchemaInfo);
    }

    public static RealmString createOrUpdateUsingJsonObject(HmlLaserIdAboutActivity hmlLaserIdAboutActivity, JSONObject jSONObject, boolean z) throws JSONException {
        RealmString realmString = (RealmString) hmlLaserIdAboutActivity.write(RealmString.class, Collections.emptyList());
        HmlNTBDocumentListActivity hmlNTBDocumentListActivity = realmString;
        if (jSONObject.has("creditCardCategory")) {
            if (jSONObject.isNull("creditCardCategory")) {
                hmlNTBDocumentListActivity.IconCompatParcelizer((String) null);
            } else {
                hmlNTBDocumentListActivity.IconCompatParcelizer(jSONObject.getString("creditCardCategory"));
            }
        }
        return realmString;
    }

    public static RealmString createUsingJsonStream(HmlLaserIdAboutActivity hmlLaserIdAboutActivity, JsonReader jsonReader) throws IOException {
        RealmString realmString = new RealmString();
        HmlNTBDocumentListActivity hmlNTBDocumentListActivity = realmString;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("creditCardCategory")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                hmlNTBDocumentListActivity.IconCompatParcelizer(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                hmlNTBDocumentListActivity.IconCompatParcelizer((String) null);
            }
        }
        jsonReader.endObject();
        return (RealmString) hmlLaserIdAboutActivity.MediaBrowserCompat$CustomActionResultReceiver(realmString, new HashMap(), Util.MediaBrowserCompat$ItemReceiver((T[]) new HmlETBSummaryActivity[0]));
    }

    public static RealmString copyOrUpdate(HmlLaserIdAboutActivity hmlLaserIdAboutActivity, C9654xbbda94b8 com_scb_phone_data_entity_billpayment_realmstringrealmproxy_mediabrowsercompat_itemreceiver, RealmString realmString, boolean z, Map<HmlNTBCaptureDocumentActivity, HmlNTBReviewActivity> map, Set<HmlETBSummaryActivity> set) {
        if (realmString instanceof HmlNTBReviewActivity) {
            HmlNTBReviewActivity hmlNTBReviewActivity = (HmlNTBReviewActivity) realmString;
            if (hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver != null) {
                HmlEtbConfirmationOtpActivity hmlEtbConfirmationOtpActivity = hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver;
                if (hmlEtbConfirmationOtpActivity.IconCompatParcelizer != hmlLaserIdAboutActivity.IconCompatParcelizer) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (hmlEtbConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().equals(hmlLaserIdAboutActivity.MediaBrowserCompat$CustomActionResultReceiver())) {
                    return realmString;
                }
            }
        }
        HmlEtbConfirmationOtpActivity.read.get();
        HmlNTBReviewActivity hmlNTBReviewActivity2 = map.get(realmString);
        if (hmlNTBReviewActivity2 != null) {
            return (RealmString) hmlNTBReviewActivity2;
        }
        return copy(hmlLaserIdAboutActivity, com_scb_phone_data_entity_billpayment_realmstringrealmproxy_mediabrowsercompat_itemreceiver, realmString, z, map, set);
    }

    public static RealmString copy(HmlLaserIdAboutActivity hmlLaserIdAboutActivity, C9654xbbda94b8 com_scb_phone_data_entity_billpayment_realmstringrealmproxy_mediabrowsercompat_itemreceiver, RealmString realmString, boolean z, Map<HmlNTBCaptureDocumentActivity, HmlNTBReviewActivity> map, Set<HmlETBSummaryActivity> set) {
        HmlNTBReviewActivity hmlNTBReviewActivity = map.get(realmString);
        if (hmlNTBReviewActivity != null) {
            return (RealmString) hmlNTBReviewActivity;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(hmlLaserIdAboutActivity.MediaMetadataCompat.read(RealmString.class), com_scb_phone_data_entity_billpayment_realmstringrealmproxy_mediabrowsercompat_itemreceiver.read, set);
        long j = com_scb_phone_data_entity_billpayment_realmstringrealmproxy_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        String MediaBrowserCompat$ItemReceiver = realmString.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver == null) {
            OsObjectBuilder.nativeAddNull(osObjectBuilder.MediaBrowserCompat$ItemReceiver, j);
        } else {
            OsObjectBuilder.nativeAddString(osObjectBuilder.MediaBrowserCompat$ItemReceiver, j, MediaBrowserCompat$ItemReceiver);
        }
        UncheckedRow MediaBrowserCompat$ItemReceiver2 = osObjectBuilder.MediaBrowserCompat$ItemReceiver();
        HmlEtbConfirmationOtpActivity.write write2 = (HmlEtbConfirmationOtpActivity.write) HmlEtbConfirmationOtpActivity.read.get();
        HmlNTBLoanReviewActivity IconCompatParcelizer = hmlLaserIdAboutActivity.read().IconCompatParcelizer(RealmString.class);
        List<String> emptyList = Collections.emptyList();
        write2.MediaBrowserCompat$ItemReceiver = hmlLaserIdAboutActivity;
        write2.read = MediaBrowserCompat$ItemReceiver2;
        write2.IconCompatParcelizer = IconCompatParcelizer;
        write2.write = false;
        write2.MediaBrowserCompat$CustomActionResultReceiver = emptyList;
        com_scb_phone_data_entity_billpayment_RealmStringRealmProxy com_scb_phone_data_entity_billpayment_realmstringrealmproxy = new com_scb_phone_data_entity_billpayment_RealmStringRealmProxy();
        write2.MediaBrowserCompat$ItemReceiver = null;
        write2.read = null;
        write2.IconCompatParcelizer = null;
        write2.write = false;
        write2.MediaBrowserCompat$CustomActionResultReceiver = null;
        map.put(realmString, com_scb_phone_data_entity_billpayment_realmstringrealmproxy);
        return com_scb_phone_data_entity_billpayment_realmstringrealmproxy;
    }

    public static long insert(HmlLaserIdAboutActivity hmlLaserIdAboutActivity, RealmString realmString, Map<HmlNTBCaptureDocumentActivity, Long> map) {
        if (realmString instanceof HmlNTBReviewActivity) {
            HmlNTBReviewActivity hmlNTBReviewActivity = (HmlNTBReviewActivity) realmString;
            if (hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver != null && hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver().equals(hmlLaserIdAboutActivity.MediaBrowserCompat$CustomActionResultReceiver())) {
                return hmlNTBReviewActivity.aR_().MediaMetadataCompat.getIndex();
            }
        }
        Table read2 = hmlLaserIdAboutActivity.MediaMetadataCompat.read(RealmString.class);
        long j = read2.IconCompatParcelizer;
        C9654xbbda94b8 com_scb_phone_data_entity_billpayment_realmstringrealmproxy_mediabrowsercompat_itemreceiver = (C9654xbbda94b8) hmlLaserIdAboutActivity.MediaMetadataCompat.IconCompatParcelizer(RealmString.class);
        long write2 = OsObject.write(read2);
        map.put(realmString, Long.valueOf(write2));
        String MediaBrowserCompat$ItemReceiver = realmString.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver != null) {
            Table.nativeSetString(j, com_scb_phone_data_entity_billpayment_realmstringrealmproxy_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver, write2, MediaBrowserCompat$ItemReceiver, false);
        }
        return write2;
    }

    public static void insert(HmlLaserIdAboutActivity hmlLaserIdAboutActivity, Iterator<? extends HmlNTBCaptureDocumentActivity> it, Map<HmlNTBCaptureDocumentActivity, Long> map) {
        Table read2 = hmlLaserIdAboutActivity.MediaMetadataCompat.read(RealmString.class);
        long j = read2.IconCompatParcelizer;
        C9654xbbda94b8 com_scb_phone_data_entity_billpayment_realmstringrealmproxy_mediabrowsercompat_itemreceiver = (C9654xbbda94b8) hmlLaserIdAboutActivity.MediaMetadataCompat.IconCompatParcelizer(RealmString.class);
        while (it.hasNext()) {
            RealmString realmString = (RealmString) it.next();
            if (!map.containsKey(realmString)) {
                if (realmString instanceof HmlNTBReviewActivity) {
                    HmlNTBReviewActivity hmlNTBReviewActivity = (HmlNTBReviewActivity) realmString;
                    if (hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver != null && hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver().equals(hmlLaserIdAboutActivity.MediaBrowserCompat$CustomActionResultReceiver())) {
                        map.put(realmString, Long.valueOf(hmlNTBReviewActivity.aR_().MediaMetadataCompat.getIndex()));
                    }
                }
                long write2 = OsObject.write(read2);
                map.put(realmString, Long.valueOf(write2));
                String MediaBrowserCompat$ItemReceiver = realmString.MediaBrowserCompat$ItemReceiver();
                if (MediaBrowserCompat$ItemReceiver != null) {
                    Table.nativeSetString(j, com_scb_phone_data_entity_billpayment_realmstringrealmproxy_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver, write2, MediaBrowserCompat$ItemReceiver, false);
                }
            }
        }
    }

    public static long insertOrUpdate(HmlLaserIdAboutActivity hmlLaserIdAboutActivity, RealmString realmString, Map<HmlNTBCaptureDocumentActivity, Long> map) {
        if (realmString instanceof HmlNTBReviewActivity) {
            HmlNTBReviewActivity hmlNTBReviewActivity = (HmlNTBReviewActivity) realmString;
            if (hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver != null && hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver().equals(hmlLaserIdAboutActivity.MediaBrowserCompat$CustomActionResultReceiver())) {
                return hmlNTBReviewActivity.aR_().MediaMetadataCompat.getIndex();
            }
        }
        Table read2 = hmlLaserIdAboutActivity.MediaMetadataCompat.read(RealmString.class);
        long j = read2.IconCompatParcelizer;
        C9654xbbda94b8 com_scb_phone_data_entity_billpayment_realmstringrealmproxy_mediabrowsercompat_itemreceiver = (C9654xbbda94b8) hmlLaserIdAboutActivity.MediaMetadataCompat.IconCompatParcelizer(RealmString.class);
        long write2 = OsObject.write(read2);
        map.put(realmString, Long.valueOf(write2));
        String MediaBrowserCompat$ItemReceiver = realmString.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver != null) {
            Table.nativeSetString(j, com_scb_phone_data_entity_billpayment_realmstringrealmproxy_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver, write2, MediaBrowserCompat$ItemReceiver, false);
        } else {
            Table.nativeSetNull(j, com_scb_phone_data_entity_billpayment_realmstringrealmproxy_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver, write2, false);
        }
        return write2;
    }

    public static void insertOrUpdate(HmlLaserIdAboutActivity hmlLaserIdAboutActivity, Iterator<? extends HmlNTBCaptureDocumentActivity> it, Map<HmlNTBCaptureDocumentActivity, Long> map) {
        Table read2 = hmlLaserIdAboutActivity.MediaMetadataCompat.read(RealmString.class);
        long j = read2.IconCompatParcelizer;
        C9654xbbda94b8 com_scb_phone_data_entity_billpayment_realmstringrealmproxy_mediabrowsercompat_itemreceiver = (C9654xbbda94b8) hmlLaserIdAboutActivity.MediaMetadataCompat.IconCompatParcelizer(RealmString.class);
        while (it.hasNext()) {
            RealmString realmString = (RealmString) it.next();
            if (!map.containsKey(realmString)) {
                if (realmString instanceof HmlNTBReviewActivity) {
                    HmlNTBReviewActivity hmlNTBReviewActivity = (HmlNTBReviewActivity) realmString;
                    if (hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver != null && hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver().equals(hmlLaserIdAboutActivity.MediaBrowserCompat$CustomActionResultReceiver())) {
                        map.put(realmString, Long.valueOf(hmlNTBReviewActivity.aR_().MediaMetadataCompat.getIndex()));
                    }
                }
                long write2 = OsObject.write(read2);
                map.put(realmString, Long.valueOf(write2));
                String MediaBrowserCompat$ItemReceiver = realmString.MediaBrowserCompat$ItemReceiver();
                if (MediaBrowserCompat$ItemReceiver != null) {
                    Table.nativeSetString(j, com_scb_phone_data_entity_billpayment_realmstringrealmproxy_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver, write2, MediaBrowserCompat$ItemReceiver, false);
                } else {
                    Table.nativeSetNull(j, com_scb_phone_data_entity_billpayment_realmstringrealmproxy_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver, write2, false);
                }
            }
        }
    }

    public static RealmString createDetachedCopy(RealmString realmString, int i, int i2, Map<HmlNTBCaptureDocumentActivity, HmlNTBReviewActivity.IconCompatParcelizer<HmlNTBCaptureDocumentActivity>> map) {
        RealmString realmString2;
        if (i > i2 || realmString == null) {
            return null;
        }
        HmlNTBReviewActivity.IconCompatParcelizer iconCompatParcelizer = map.get(realmString);
        if (iconCompatParcelizer == null) {
            realmString2 = new RealmString();
            map.put(realmString, new HmlNTBReviewActivity.IconCompatParcelizer(i, realmString2));
        } else if (i >= iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) {
            return (RealmString) iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = i;
            realmString2 = (RealmString) iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        }
        realmString2.IconCompatParcelizer(realmString.MediaBrowserCompat$ItemReceiver());
        return realmString2;
    }

    public String toString() {
        if (!HmlNTBBusinessOccupationInfoActivity.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RealmString = proxy[");
        sb.append("{creditCardCategory:");
        sb.append(MediaBrowserCompat$ItemReceiver() != null ? MediaBrowserCompat$ItemReceiver() : "null");
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }

    public final HmlIssuerInputActivity<?> aR_() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public int hashCode() {
        String MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        Table table = this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat.getTable();
        String nativeGetName = table.nativeGetName(table.IconCompatParcelizer);
        long index = this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat.getIndex();
        int i = 0;
        int hashCode = MediaBrowserCompat$CustomActionResultReceiver2 != null ? MediaBrowserCompat$CustomActionResultReceiver2.hashCode() : 0;
        if (nativeGetName != null) {
            i = nativeGetName.hashCode();
        }
        return ((((hashCode + 527) * 31) + i) * 31) + ((int) ((index >>> 32) ^ index));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_scb_phone_data_entity_billpayment_RealmStringRealmProxy com_scb_phone_data_entity_billpayment_realmstringrealmproxy = (com_scb_phone_data_entity_billpayment_RealmStringRealmProxy) obj;
        String MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        String MediaBrowserCompat$CustomActionResultReceiver3 = com_scb_phone_data_entity_billpayment_realmstringrealmproxy.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null ? MediaBrowserCompat$CustomActionResultReceiver3 != null : !MediaBrowserCompat$CustomActionResultReceiver2.equals(MediaBrowserCompat$CustomActionResultReceiver3)) {
            return false;
        }
        Table table = this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat.getTable();
        String nativeGetName = table.nativeGetName(table.IconCompatParcelizer);
        Table table2 = com_scb_phone_data_entity_billpayment_realmstringrealmproxy.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat.getTable();
        String nativeGetName2 = table2.nativeGetName(table2.IconCompatParcelizer);
        if (nativeGetName == null ? nativeGetName2 == null : nativeGetName.equals(nativeGetName2)) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat.getIndex() == com_scb_phone_data_entity_billpayment_realmstringrealmproxy.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat.getIndex();
        }
        return false;
    }

    static {
        OsObjectSchemaInfo.write write2 = new OsObjectSchemaInfo.write("RealmString", 1);
        write2.MediaBrowserCompat$CustomActionResultReceiver("creditCardCategory", HmlNTBAdditionalDocumentActivity_ViewBinding.STRING);
        read = write2.write();
    }
}
