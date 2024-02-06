package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import p040o.AutoValue_CrashlyticsReport_Session_Event;
import p040o.GoogleMap;

/* renamed from: o.AutoValue_CrashlyticsReport_Session_Event$1$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3070x8778b3c implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        onGetStartedClick.write((Object) parcel, "in");
        return new Parcelable((isSimulator) parcel.readParcelable(AutoValue_CrashlyticsReport_Session_Event.C30691.class.getClassLoader()), (GoogleMap.OnCameraIdleListener) parcel.readParcelable(AutoValue_CrashlyticsReport_Session_Event.C30691.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0) {
            public static final Parcelable.Creator CREATOR = new C3070x8778b3c();
            public final GoogleMap.OnCameraIdleListener IconCompatParcelizer;
            public final isSimulator MediaBrowserCompat$CustomActionResultReceiver;
            public final boolean MediaBrowserCompat$ItemReceiver;
            public final String RatingCompat;
            public final String read;
            public final String write;

            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C30691)) {
                    return false;
                }
                C30691 r3 = (C30691) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) r3.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && this.MediaBrowserCompat$ItemReceiver == r3.MediaBrowserCompat$ItemReceiver;
            }

            public final int hashCode() {
                isSimulator issimulator = this.MediaBrowserCompat$CustomActionResultReceiver;
                int i = 0;
                int hashCode = issimulator != null ? issimulator.hashCode() : 0;
                GoogleMap.OnCameraIdleListener onCameraIdleListener = this.IconCompatParcelizer;
                int hashCode2 = onCameraIdleListener != null ? onCameraIdleListener.hashCode() : 0;
                String str = this.RatingCompat;
                int hashCode3 = str != null ? str.hashCode() : 0;
                String str2 = this.write;
                int hashCode4 = str2 != null ? str2.hashCode() : 0;
                String str3 = this.read;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                boolean z = this.MediaBrowserCompat$ItemReceiver;
                if (z) {
                    z = true;
                }
                return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + (z ? 1 : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("PrepaidCashOutReviewDisplay(prepaidCardDisplay=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", prepaidCashOutVerification=");
                sb.append(this.IconCompatParcelizer);
                sb.append(", toAccountNumber=");
                sb.append(this.RatingCompat);
                sb.append(", amount=");
                sb.append(this.write);
                sb.append(", note=");
                sb.append(this.read);
                sb.append(", shouldDisplayLogo=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(")");
                return sb.toString();
            }

            public final void writeToParcel(Parcel parcel, int i) {
                onGetStartedClick.write((Object) parcel, "parcel");
                parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
                parcel.writeParcelable(this.IconCompatParcelizer, i);
                parcel.writeString(this.RatingCompat);
                parcel.writeString(this.write);
                parcel.writeString(this.read);
                parcel.writeInt(this.MediaBrowserCompat$ItemReceiver ? 1 : 0);
            }

            {
                onGetStartedClick.write((Object) r2, "prepaidCardDisplay");
                onGetStartedClick.write((Object) r3, "prepaidCashOutVerification");
                onGetStartedClick.write((Object) r4, "toAccountNumber");
                onGetStartedClick.write((Object) r5, "amount");
                onGetStartedClick.write((Object) r6, "note");
                this.MediaBrowserCompat$CustomActionResultReceiver = r2;
                this.IconCompatParcelizer = r3;
                this.RatingCompat = r4;
                this.write = r5;
                this.read = r6;
                this.MediaBrowserCompat$ItemReceiver = r7;
            }
        };
    }

    public final Object[] newArray(int i) {
        return new AutoValue_CrashlyticsReport_Session_Event.C30691[i];
    }
}
