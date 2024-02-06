package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.CrashlyticsBackgroundWorker;

/* renamed from: o.Onboarding */
public class Onboarding implements Parcelable {
    public static final Parcelable.Creator<Onboarding> CREATOR = new Parcelable.Creator<Onboarding>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Onboarding(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Onboarding[i];
        }
    };
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String write;

    public int describeContents() {
        return 0;
    }

    /* renamed from: o.Onboarding$1 */
    public final class C37171 implements Parcelable {
        public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
        public String MediaBrowserCompat$ItemReceiver;
        public CrashlyticsBackgroundWorker.C32142 read;
        public String write;

        /* renamed from: o.Onboarding$1$IconCompatParcelizer */
        public static final class IconCompatParcelizer implements Parcelable.Creator {
            public final Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "in");
                return new C37171(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (CrashlyticsBackgroundWorker.C32142) CrashlyticsBackgroundWorker.C32142.CREATOR.createFromParcel(parcel) : null);
            }

            public final Object[] newArray(int i) {
                return new C37171[i];
            }
        }

        /* renamed from: o.Onboarding$1$read */
        public static final class read {
            public String MediaBrowserCompat$CustomActionResultReceiver;
            public CrashlyticsBackgroundWorker.C32142 read;
            public String write;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37171)) {
                return false;
            }
            C37171 r3 = (C37171) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.write;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            CrashlyticsBackgroundWorker.C32142 r3 = this.read;
            if (r3 != null) {
                i = r3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashLendingIntroductionDisplay(imagePath=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", introductionHtml=");
            sb.append(this.write);
            sb.append(", consentDocument=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.write);
            CrashlyticsBackgroundWorker.C32142 r4 = this.read;
            if (r4 != null) {
                parcel.writeInt(1);
                r4.writeToParcel(parcel, 0);
                return;
            }
            parcel.writeInt(0);
        }

        public C37171(String str, String str2, CrashlyticsBackgroundWorker.C32142 r3) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.write = str2;
            this.read = r3;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C37171(read read2) {
            this(read2.write, read2.MediaBrowserCompat$CustomActionResultReceiver, read2.read);
            onGetStartedClick.write((Object) read2, "builder");
        }
    }

    /* renamed from: o.Onboarding$3 */
    public final class C37193 implements Parcelable {
        public static final Parcelable.Creator<C37193> CREATOR = new Parcelable.Creator<C37193>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C37193(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C37193[i];
            }
        };
        public List<doOnboarding> read;

        public final int describeContents() {
            return 0;
        }

        public /* synthetic */ C37193(Onboarding$3$MediaBrowserCompat$ItemReceiver onboarding$3$MediaBrowserCompat$ItemReceiver, byte b) {
            this(onboarding$3$MediaBrowserCompat$ItemReceiver);
        }

        public C37193() {
        }

        protected C37193(Parcel parcel) {
            this.read = parcel.createTypedArrayList(doOnboarding.CREATOR);
        }

        private C37193(Onboarding$3$MediaBrowserCompat$ItemReceiver onboarding$3$MediaBrowserCompat$ItemReceiver) {
            this.read = onboarding$3$MediaBrowserCompat$ItemReceiver.write;
        }

        public static Onboarding$3$MediaBrowserCompat$ItemReceiver write() {
            return new Onboarding$3$MediaBrowserCompat$ItemReceiver((byte) 0);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.read);
        }
    }

    public Onboarding() {
    }

    public static Onboarding MediaBrowserCompat$CustomActionResultReceiver() {
        return new Onboarding();
    }

    public Onboarding(Parcel parcel) {
        this.write = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
