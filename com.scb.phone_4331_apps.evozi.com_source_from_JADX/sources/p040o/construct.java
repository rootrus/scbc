package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.scb.phone.data.entity.transfer.SingleDataEntity;
import org.threeten.p041bp.OffsetDateTime;
import p040o.TouchPointInstructionActivity;

/* renamed from: o.construct */
public final class construct implements Parcelable {
    public static final Parcelable.Creator<construct> CREATOR = new construct$MediaBrowserCompat$ItemReceiver();
    @SerializedName("conversionType")
    public final String IconCompatParcelizer;
    @SerializedName("currency")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cardRefNo")
    private final String write;

    public final int describeContents() {
        return 0;
    }

    public construct(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) str2, "conversionType");
        onGetStartedClick.write((Object) str3, "currency");
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public construct(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "source"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
            java.lang.String r0 = r4.readString()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x000e
            r0 = r1
        L_0x000e:
            java.lang.String r2 = r4.readString()
            if (r2 != 0) goto L_0x0015
            r2 = r1
        L_0x0015:
            java.lang.String r4 = r4.readString()
            if (r4 == 0) goto L_0x001c
            r1 = r4
        L_0x001c:
            r3.<init>(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.construct.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.construct$write */
    public static final class write implements findFragmentByWho {
        private final /* synthetic */ setTax MediaBrowserCompat$CustomActionResultReceiver;

        private write() {
        }

        public /* synthetic */ write(setTax settax) {
            this.MediaBrowserCompat$CustomActionResultReceiver = settax;
        }

        public final Object IconCompatParcelizer(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            TouchPointInstructionActivity.IconCompatParcelizer iconCompatParcelizer = new TouchPointInstructionActivity.IconCompatParcelizer();
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = singleDataEntity.getStatus() == null ? null : singleDataEntity.getStatus().write();
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = singleDataEntity.getStatus() == null ? null : singleDataEntity.getStatus().IconCompatParcelizer();
            boolean z = true;
            if (((encodedHost) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver != 1) {
                z = false;
            }
            iconCompatParcelizer.read = z;
            iconCompatParcelizer.write = ((encodedHost) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver;
            singleDataEntity.getData();
            iconCompatParcelizer.IconCompatParcelizer = FragmentBuilder_BindSummaryFragment.write(((encodedHost) singleDataEntity.getData()).read, (OffsetDateTime) null);
            iconCompatParcelizer.RatingCompat = ((encodedHost) singleDataEntity.getData()).IconCompatParcelizer;
            return iconCompatParcelizer;
        }
    }
}
