package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import com.scb.phone.data.network.service.ChubbService;
import p040o.ImmutableSortedSet;

/* renamed from: o.ManageRecipientGroupActivity */
public final class ManageRecipientGroupActivity implements Parcelable {
    public static final Parcelable.Creator<ManageRecipientGroupActivity> CREATOR = new Parcelable.Creator<ManageRecipientGroupActivity>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ManageRecipientGroupActivity(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ManageRecipientGroupActivity[i];
        }
    };
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public int write;

    public final int describeContents() {
        return 0;
    }

    /* synthetic */ ManageRecipientGroupActivity(Parcel parcel, byte b) {
        this(parcel);
    }

    public ManageRecipientGroupActivity(String str, String str2, String str3, String str4) {
        this.write = (int) (System.nanoTime() & 2147483647L);
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.read = str4;
    }

    private ManageRecipientGroupActivity(Parcel parcel) {
        this.write = (int) (System.nanoTime() & 2147483647L);
        String[] strArr = new String[4];
        parcel.readStringArray(strArr);
        this.IconCompatParcelizer = strArr[0];
        this.MediaBrowserCompat$ItemReceiver = strArr[1];
        this.MediaBrowserCompat$CustomActionResultReceiver = strArr[2];
        this.read = strArr[3];
        this.write = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(new String[]{this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.read});
        parcel.writeInt(this.write);
    }

    /* renamed from: o.ManageRecipientGroupActivity$write */
    public static class write implements elementSet {
        public AccountChangeEvent IconCompatParcelizer;
        private ChubbService read;

        public write() {
        }

        @HmlPinActivity
        public write(ChubbService chubbService, AccountChangeEvent accountChangeEvent) {
            this.read = chubbService;
            this.IconCompatParcelizer = accountChangeEvent;
        }

        public final DebitCardResetOtpActivity<removeLocationUpdates> MediaBrowserCompat$CustomActionResultReceiver(ImmutableSortedSet.Builder builder) {
            return this.read.chubbConfirm(builder).map(zzgo.read).map(new zzgq(this));
        }
    }
}
