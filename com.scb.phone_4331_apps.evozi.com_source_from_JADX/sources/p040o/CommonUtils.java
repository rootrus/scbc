package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.CommonUtils */
public class CommonUtils extends getReportsEndpointFilename {
    public final String MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.CommonUtils$1 */
    public class C31811 implements Parcelable {
        public static final Parcelable.Creator<C31811> CREATOR = new Parcelable.Creator<C31811>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C31811(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C31811[i];
            }
        };
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaDescriptionCompat;

        public int describeContents() {
            return 0;
        }

        public C31811(read read2) {
            this.IconCompatParcelizer = read2.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = read2.IconCompatParcelizer;
            this.MediaBrowserCompat$ItemReceiver = read2.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaDescriptionCompat = read2.MediaBrowserCompat$SearchResultReceiver;
        }

        public C31811(Parcel parcel) {
            this.IconCompatParcelizer = parcel.readString();
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
            this.MediaBrowserCompat$ItemReceiver = parcel.readString();
            this.MediaDescriptionCompat = parcel.readString();
        }

        public static read IconCompatParcelizer() {
            return new IconCompatParcelizer();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
            parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
            parcel.writeString(this.MediaDescriptionCompat);
        }

        /* renamed from: o.CommonUtils$1$read */
        public static abstract class read<T extends C31811, B extends read<T, B>> {
            String IconCompatParcelizer;
            String MediaBrowserCompat$CustomActionResultReceiver;
            String MediaBrowserCompat$ItemReceiver;
            String MediaBrowserCompat$SearchResultReceiver;

            /* access modifiers changed from: protected */
            public abstract B IconCompatParcelizer();

            public abstract T MediaBrowserCompat$CustomActionResultReceiver();

            public final B MediaBrowserCompat$ItemReceiver(String str) {
                this.MediaBrowserCompat$ItemReceiver = str;
                return IconCompatParcelizer();
            }

            public final B read(String str) {
                this.IconCompatParcelizer = str;
                return IconCompatParcelizer();
            }

            public final B write(String str) {
                this.MediaBrowserCompat$CustomActionResultReceiver = str;
                return IconCompatParcelizer();
            }

            public final B MediaBrowserCompat$CustomActionResultReceiver(String str) {
                this.MediaBrowserCompat$SearchResultReceiver = str;
                return IconCompatParcelizer();
            }
        }

        /* renamed from: o.CommonUtils$1$IconCompatParcelizer */
        public static class IconCompatParcelizer extends read<C31811, IconCompatParcelizer> {
            /* access modifiers changed from: protected */
            public final /* bridge */ /* synthetic */ read IconCompatParcelizer() {
                return this;
            }

            public final C31811 MediaBrowserCompat$CustomActionResultReceiver() {
                return new C31811((read) this);
            }
        }
    }

    /* renamed from: o.CommonUtils$Architecture */
    public final class Architecture extends isRunningOnThread {
        public final boolean IconCompatParcelizer;
        public final checkRunningOnThread MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String read;
        public final Integer write;

        public Architecture(String str, String str2, boolean z, Integer num, checkRunningOnThread checkrunningonthread) {
            onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
            onGetStartedClick.write((Object) checkrunningonthread, "iconDisplayKey");
            this.read = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.IconCompatParcelizer = z;
            this.write = num;
            this.MediaBrowserCompat$CustomActionResultReceiver = checkrunningonthread;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonUtils(Boolean bool, String str) {
        super(bool);
        onGetStartedClick.write((Object) str, "remark");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }
}
