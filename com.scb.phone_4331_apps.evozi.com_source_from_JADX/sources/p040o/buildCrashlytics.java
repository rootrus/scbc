package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.buildCrashlytics */
public final class buildCrashlytics extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<buildCrashlytics> CREATOR = new IconCompatParcelizer();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;

    public final int describeContents() {
        return 0;
    }

    public buildCrashlytics(String str, String str2) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public buildCrashlytics(Parcel parcel) {
        this(parcel.readString(), parcel.readString());
        onGetStartedClick.write((Object) parcel, "source");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.buildCrashlytics$write */
    public static final class write implements findFragmentByWho {
        private final /* synthetic */ requestEmail write;

        private write() {
        }

        public /* synthetic */ write(requestEmail requestemail) {
            this.write = requestemail;
        }

        public final Object IconCompatParcelizer(Object obj) {
            return this.write.MediaBrowserCompat$CustomActionResultReceiver((getMaskPath) obj);
        }
    }

    /* renamed from: o.buildCrashlytics$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator<buildCrashlytics> {
        IconCompatParcelizer() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "source");
            return new buildCrashlytics(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new buildCrashlytics[i];
        }
    }
}
