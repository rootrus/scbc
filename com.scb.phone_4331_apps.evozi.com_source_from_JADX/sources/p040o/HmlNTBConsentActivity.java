package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p039io.realm.internal.OsObjectSchemaInfo;
import p039io.realm.internal.OsSchemaInfo;
import p039io.realm.internal.Row;
import p039io.realm.internal.Table;
import p039io.realm.internal.UncheckedRow;
import p039io.realm.internal.objectstore.OsObjectBuilder;
import p040o.HmlEtbConfirmationOtpActivity;

/* renamed from: o.HmlNTBConsentActivity */
public class HmlNTBConsentActivity extends setOnPageChangeListener implements HmlNTBReviewActivity {
    private static final OsObjectSchemaInfo write;
    C6890x2027e421 MediaBrowserCompat$CustomActionResultReceiver;
    HmlIssuerInputActivity<setOnPageChangeListener> read;

    public HmlNTBConsentActivity() {
        this.read.MediaDescriptionCompat = false;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.read == null) {
            HmlEtbConfirmationOtpActivity.write write2 = (HmlEtbConfirmationOtpActivity.write) HmlEtbConfirmationOtpActivity.read.get();
            this.MediaBrowserCompat$CustomActionResultReceiver = (C6890x2027e421) write2.IconCompatParcelizer;
            HmlIssuerInputActivity<setOnPageChangeListener> hmlIssuerInputActivity = new HmlIssuerInputActivity<>(this);
            this.read = hmlIssuerInputActivity;
            hmlIssuerInputActivity.MediaBrowserCompat$ItemReceiver = write2.MediaBrowserCompat$ItemReceiver;
            this.read.MediaMetadataCompat = write2.read;
            this.read.MediaBrowserCompat$CustomActionResultReceiver = write2.write;
        }
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        return this.read.MediaMetadataCompat.getString(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final String write() {
        this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        return this.read.MediaMetadataCompat.getString(this.MediaBrowserCompat$CustomActionResultReceiver.write);
    }

    public final void IconCompatParcelizer(String str) {
        if (!this.read.MediaDescriptionCompat) {
            this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
            this.read.MediaMetadataCompat.setString(this.MediaBrowserCompat$CustomActionResultReceiver.write, str);
        } else if (this.read.MediaBrowserCompat$CustomActionResultReceiver) {
            Row row = this.read.MediaMetadataCompat;
            row.getTable().IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.write, row.getIndex(), str);
        }
    }

    public final String IconCompatParcelizer() {
        this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        return this.read.MediaMetadataCompat.getString(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
    }

    public final String read() {
        this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        return this.read.MediaMetadataCompat.getString(this.MediaBrowserCompat$CustomActionResultReceiver.read);
    }

    public static OsObjectSchemaInfo MediaDescriptionCompat() {
        return write;
    }

    public static C6890x2027e421 write(OsSchemaInfo osSchemaInfo) {
        return new C6890x2027e421(osSchemaInfo);
    }

    public static setOnPageChangeListener read(HmlLaserIdAboutActivity hmlLaserIdAboutActivity, C6890x2027e421 hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver, setOnPageChangeListener setonpagechangelistener, Map<HmlNTBCaptureDocumentActivity, HmlNTBReviewActivity> map, Set<HmlETBSummaryActivity> set) {
        if (setonpagechangelistener instanceof HmlNTBReviewActivity) {
            HmlNTBReviewActivity hmlNTBReviewActivity = (HmlNTBReviewActivity) setonpagechangelistener;
            if (hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver != null) {
                HmlEtbConfirmationOtpActivity hmlEtbConfirmationOtpActivity = hmlNTBReviewActivity.aR_().MediaBrowserCompat$ItemReceiver;
                if (hmlEtbConfirmationOtpActivity.IconCompatParcelizer != hmlLaserIdAboutActivity.IconCompatParcelizer) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (hmlEtbConfirmationOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().equals(hmlLaserIdAboutActivity.MediaBrowserCompat$CustomActionResultReceiver())) {
                    return setonpagechangelistener;
                }
            }
        }
        HmlEtbConfirmationOtpActivity.read.get();
        HmlNTBReviewActivity hmlNTBReviewActivity2 = map.get(setonpagechangelistener);
        if (hmlNTBReviewActivity2 != null) {
            return (setOnPageChangeListener) hmlNTBReviewActivity2;
        }
        HmlNTBReviewActivity hmlNTBReviewActivity3 = map.get(setonpagechangelistener);
        if (hmlNTBReviewActivity3 != null) {
            return (setOnPageChangeListener) hmlNTBReviewActivity3;
        }
        HmlNTBDocumentUploadGuidelineActivity hmlNTBDocumentUploadGuidelineActivity = setonpagechangelistener;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(hmlLaserIdAboutActivity.MediaMetadataCompat.read(setOnPageChangeListener.class), hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, set);
        long j = hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        String MediaBrowserCompat$ItemReceiver = hmlNTBDocumentUploadGuidelineActivity.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver == null) {
            OsObjectBuilder.nativeAddNull(osObjectBuilder.MediaBrowserCompat$ItemReceiver, j);
        } else {
            OsObjectBuilder.nativeAddString(osObjectBuilder.MediaBrowserCompat$ItemReceiver, j, MediaBrowserCompat$ItemReceiver);
        }
        long j2 = hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.write;
        String write2 = hmlNTBDocumentUploadGuidelineActivity.write();
        if (write2 == null) {
            OsObjectBuilder.nativeAddNull(osObjectBuilder.MediaBrowserCompat$ItemReceiver, j2);
        } else {
            OsObjectBuilder.nativeAddString(osObjectBuilder.MediaBrowserCompat$ItemReceiver, j2, write2);
        }
        long j3 = hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        String IconCompatParcelizer = hmlNTBDocumentUploadGuidelineActivity.IconCompatParcelizer();
        if (IconCompatParcelizer == null) {
            OsObjectBuilder.nativeAddNull(osObjectBuilder.MediaBrowserCompat$ItemReceiver, j3);
        } else {
            OsObjectBuilder.nativeAddString(osObjectBuilder.MediaBrowserCompat$ItemReceiver, j3, IconCompatParcelizer);
        }
        long j4 = hmlNTBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver.read;
        String read2 = hmlNTBDocumentUploadGuidelineActivity.read();
        if (read2 == null) {
            OsObjectBuilder.nativeAddNull(osObjectBuilder.MediaBrowserCompat$ItemReceiver, j4);
        } else {
            OsObjectBuilder.nativeAddString(osObjectBuilder.MediaBrowserCompat$ItemReceiver, j4, read2);
        }
        UncheckedRow MediaBrowserCompat$ItemReceiver2 = osObjectBuilder.MediaBrowserCompat$ItemReceiver();
        HmlEtbConfirmationOtpActivity.write write3 = (HmlEtbConfirmationOtpActivity.write) HmlEtbConfirmationOtpActivity.read.get();
        HmlNTBLoanReviewActivity IconCompatParcelizer2 = hmlLaserIdAboutActivity.read().IconCompatParcelizer(setOnPageChangeListener.class);
        List<String> emptyList = Collections.emptyList();
        write3.MediaBrowserCompat$ItemReceiver = hmlLaserIdAboutActivity;
        write3.read = MediaBrowserCompat$ItemReceiver2;
        write3.IconCompatParcelizer = IconCompatParcelizer2;
        write3.write = false;
        write3.MediaBrowserCompat$CustomActionResultReceiver = emptyList;
        HmlNTBConsentActivity hmlNTBConsentActivity = new HmlNTBConsentActivity();
        write3.MediaBrowserCompat$ItemReceiver = null;
        write3.read = null;
        write3.IconCompatParcelizer = null;
        write3.write = false;
        write3.MediaBrowserCompat$CustomActionResultReceiver = null;
        map.put(setonpagechangelistener, hmlNTBConsentActivity);
        return hmlNTBConsentActivity;
    }

    public String toString() {
        if (!HmlNTBBusinessOccupationInfoActivity.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CodeDescriptionEntity = proxy[");
        sb.append("{header:");
        String str = "null";
        sb.append(MediaBrowserCompat$ItemReceiver() != null ? MediaBrowserCompat$ItemReceiver() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{code:");
        sb.append(write() != null ? write() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        sb.append(IconCompatParcelizer() != null ? IconCompatParcelizer() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{message:");
        if (read() != null) {
            str = read();
        }
        sb.append(str);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }

    public final HmlIssuerInputActivity<?> aR_() {
        return this.read;
    }

    public int hashCode() {
        String MediaBrowserCompat$CustomActionResultReceiver2 = this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        Table table = this.read.MediaMetadataCompat.getTable();
        String nativeGetName = table.nativeGetName(table.IconCompatParcelizer);
        long index = this.read.MediaMetadataCompat.getIndex();
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
        HmlNTBConsentActivity hmlNTBConsentActivity = (HmlNTBConsentActivity) obj;
        String MediaBrowserCompat$CustomActionResultReceiver2 = this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        String MediaBrowserCompat$CustomActionResultReceiver3 = hmlNTBConsentActivity.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 == null ? MediaBrowserCompat$CustomActionResultReceiver3 != null : !MediaBrowserCompat$CustomActionResultReceiver2.equals(MediaBrowserCompat$CustomActionResultReceiver3)) {
            return false;
        }
        Table table = this.read.MediaMetadataCompat.getTable();
        String nativeGetName = table.nativeGetName(table.IconCompatParcelizer);
        Table table2 = hmlNTBConsentActivity.read.MediaMetadataCompat.getTable();
        String nativeGetName2 = table2.nativeGetName(table2.IconCompatParcelizer);
        if (nativeGetName == null ? nativeGetName2 == null : nativeGetName.equals(nativeGetName2)) {
            return this.read.MediaMetadataCompat.getIndex() == hmlNTBConsentActivity.read.MediaMetadataCompat.getIndex();
        }
        return false;
    }

    static {
        OsObjectSchemaInfo.write write2 = new OsObjectSchemaInfo.write("CodeDescriptionEntity", 4);
        write2.MediaBrowserCompat$CustomActionResultReceiver("header", HmlNTBAdditionalDocumentActivity_ViewBinding.STRING);
        write2.MediaBrowserCompat$CustomActionResultReceiver("code", HmlNTBAdditionalDocumentActivity_ViewBinding.STRING);
        write2.MediaBrowserCompat$CustomActionResultReceiver("description", HmlNTBAdditionalDocumentActivity_ViewBinding.STRING);
        write2.MediaBrowserCompat$CustomActionResultReceiver(C8183f.f4230JO, HmlNTBAdditionalDocumentActivity_ViewBinding.STRING);
        write = write2.write();
    }
}
