package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.FirebaseApp */
public final class FirebaseApp implements Parcelable {
    public static final Parcelable.Creator<FirebaseApp> CREATOR = new Parcelable.Creator<FirebaseApp>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FirebaseApp(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FirebaseApp[i];
        }
    };
    public boolean IconCompatParcelizer = false;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    private String MediaSessionCompat$QueueItem;
    private String RatingCompat;
    public String read;
    public String write;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: o.FirebaseApp$UiExecutor */
    public final class UiExecutor implements Parcelable {
        public static final Parcelable.Creator<UiExecutor> CREATOR = new IconCompatParcelizer();
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiExecutor)) {
                return false;
            }
            UiExecutor uiExecutor = (UiExecutor) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) uiExecutor.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) uiExecutor.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) uiExecutor.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StatusResponseDisplay(code=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", description=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", header=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public UiExecutor(String str, String str2, String str3) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        }

        public /* synthetic */ UiExecutor(String str, String str2) {
            this(str, str2, (String) null);
        }

        /* renamed from: o.FirebaseApp$UiExecutor$read */
        public static final class read implements findFragmentByWho {
            private final /* synthetic */ FundFactSheetActivity MediaBrowserCompat$CustomActionResultReceiver;

            private read() {
            }

            public read(FundFactSheetActivity fundFactSheetActivity) {
                this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity;
            }

            public final /* synthetic */ Object IconCompatParcelizer(Object obj) {
                return this.MediaBrowserCompat$CustomActionResultReceiver.invoke(obj);
            }
        }

        /* renamed from: o.FirebaseApp$UiExecutor$IconCompatParcelizer */
        public static final class IconCompatParcelizer implements Parcelable.Creator<UiExecutor> {
            IconCompatParcelizer() {
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                onGetStartedClick.write((Object) parcel, "source");
                return new UiExecutor(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new UiExecutor[i];
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public UiExecutor(Parcel parcel) {
            this(parcel.readString(), parcel.readString(), parcel.readString());
            onGetStartedClick.write((Object) parcel, "source");
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "dest");
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.FirebaseApp$GlobalBackgroundStateListener */
    public final class GlobalBackgroundStateListener implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C3373xeaea2806();
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$ItemReceiver;
        public String read;

        public GlobalBackgroundStateListener() {
            this((byte) 0);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            onGetStartedClick.write((Object) parcel, "parcel");
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.read);
            parcel.writeString(this.IconCompatParcelizer);
        }

        public GlobalBackgroundStateListener(String str, String str2, String str3) {
            this.MediaBrowserCompat$ItemReceiver = str;
            this.read = str2;
            this.IconCompatParcelizer = str3;
        }

        public /* synthetic */ GlobalBackgroundStateListener(byte b) {
            this((String) null, (String) null, (String) null);
        }
    }

    /* renamed from: o.FirebaseApp$BackgroundStateChangeListener */
    public final class BackgroundStateChangeListener {
        public List<FirebaseApp> IconCompatParcelizer;
        public Double MediaBrowserCompat$CustomActionResultReceiver;

        private BackgroundStateChangeListener(List<FirebaseApp> list) {
            this.IconCompatParcelizer = list;
            this.MediaBrowserCompat$CustomActionResultReceiver = Double.valueOf(0.0d);
        }

        public BackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
            this.IconCompatParcelizer = new ArrayList(backgroundStateChangeListener.IconCompatParcelizer);
            this.MediaBrowserCompat$CustomActionResultReceiver = backgroundStateChangeListener.MediaBrowserCompat$CustomActionResultReceiver;
        }

        public BackgroundStateChangeListener() {
            this((List<FirebaseApp>) new ArrayList());
        }
    }

    /* renamed from: o.FirebaseApp$UserUnlockReceiver */
    public final class UserUnlockReceiver implements Parcelable {
        public static final Parcelable.Creator<UserUnlockReceiver> CREATOR = new Parcelable.Creator<UserUnlockReceiver>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new UserUnlockReceiver(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new UserUnlockReceiver[i];
            }
        };
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public Double MediaBrowserCompat$SearchResultReceiver;
        public String MediaMetadataCompat;
        public String RatingCompat;
        public String read;
        public Double write;

        public final int describeContents() {
            return 0;
        }

        public UserUnlockReceiver() {
        }

        protected UserUnlockReceiver(Parcel parcel) {
            this.IconCompatParcelizer = parcel.readString();
            if (parcel.readByte() == 0) {
                this.write = null;
            } else {
                this.write = Double.valueOf(parcel.readDouble());
            }
            if (parcel.readByte() == 0) {
                this.MediaBrowserCompat$SearchResultReceiver = null;
            } else {
                this.MediaBrowserCompat$SearchResultReceiver = Double.valueOf(parcel.readDouble());
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
            this.MediaMetadataCompat = parcel.readString();
            this.MediaBrowserCompat$MediaItem = parcel.readString();
            this.RatingCompat = parcel.readString();
            this.read = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.IconCompatParcelizer);
            if (this.write == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                parcel.writeDouble(this.write.doubleValue());
            }
            if (this.MediaBrowserCompat$SearchResultReceiver == null) {
                parcel.writeByte((byte) 0);
            } else {
                parcel.writeByte((byte) 1);
                parcel.writeDouble(this.MediaBrowserCompat$SearchResultReceiver.doubleValue());
            }
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.MediaMetadataCompat);
            parcel.writeString(this.MediaBrowserCompat$MediaItem);
            parcel.writeString(this.RatingCompat);
            parcel.writeString(this.read);
        }
    }

    public FirebaseApp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaDescriptionCompat = str2;
        this.MediaMetadataCompat = str3;
        this.MediaBrowserCompat$MediaItem = str4;
        this.MediaSessionCompat$QueueItem = str5;
        this.MediaBrowserCompat$ItemReceiver = str6;
        this.read = str7;
        this.RatingCompat = str8;
        this.write = str9;
        this.MediaBrowserCompat$SearchResultReceiver = str10;
    }

    protected FirebaseApp(Parcel parcel) {
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.read = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.write = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FirebaseApp firebaseApp = (FirebaseApp) obj;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? firebaseApp.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(firebaseApp.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.MediaDescriptionCompat;
        if (str2 == null ? firebaseApp.MediaDescriptionCompat != null : !str2.equals(firebaseApp.MediaDescriptionCompat)) {
            return false;
        }
        String str3 = this.MediaMetadataCompat;
        if (str3 == null ? firebaseApp.MediaMetadataCompat != null : !str3.equals(firebaseApp.MediaMetadataCompat)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$MediaItem;
        if (str4 == null ? firebaseApp.MediaBrowserCompat$MediaItem != null : !str4.equals(firebaseApp.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str5 = this.MediaSessionCompat$QueueItem;
        if (str5 == null ? firebaseApp.MediaSessionCompat$QueueItem != null : !str5.equals(firebaseApp.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        if (str6 == null ? firebaseApp.MediaBrowserCompat$ItemReceiver != null : !str6.equals(firebaseApp.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str7 = this.read;
        if (str7 == null ? firebaseApp.read != null : !str7.equals(firebaseApp.read)) {
            return false;
        }
        String str8 = this.write;
        if (str8 == null ? firebaseApp.write != null : !str8.equals(firebaseApp.write)) {
            return false;
        }
        String str9 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str9 == null ? firebaseApp.MediaBrowserCompat$SearchResultReceiver != null : !str9.equals(firebaseApp.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str10 = this.RatingCompat;
        String str11 = firebaseApp.RatingCompat;
        if (str10 != null) {
            return str10.equals(str11);
        }
        if (str11 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaMetadataCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaSessionCompat$QueueItem;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.RatingCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.write;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }
}
