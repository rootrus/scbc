package p040o;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.forEachClear */
public class forEachClear extends ZTBSV {
    public static final Parcelable.Creator<forEachClear> CREATOR = new Parcelable.Creator<forEachClear>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new forEachClear(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new forEachClear[i];
        }
    };
    public SharedPreferences IconCompatParcelizer;

    public int describeContents() {
        return 0;
    }

    @HmlPinActivity
    public forEachClear(SharedPreferences sharedPreferences) {
        this.IconCompatParcelizer = sharedPreferences;
        write();
    }

    protected forEachClear(Parcel parcel) {
        super(parcel);
    }

    public final void write() {
        String string = this.IconCompatParcelizer.getString("entry_point", (String) null);
        String string2 = this.IconCompatParcelizer.getString("product_type", (String) null);
        if (string != null) {
            read("entry_point", string);
        }
        if (string2 != null) {
            read("product_type", string2);
        }
    }

    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer.edit().remove("entry_point").apply();
        this.IconCompatParcelizer.edit().remove("product_type").apply();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (str != null) {
            MediaBrowserCompat$ItemReceiver(new ZSYR2K("repayment_method", "DIRECT_DEBIT".equals(str) ? "direct_debit" : "cash"));
        }
    }
}
