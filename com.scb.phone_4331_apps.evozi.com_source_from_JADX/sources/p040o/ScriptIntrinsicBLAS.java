package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.setContentView;

/* renamed from: o.ScriptIntrinsicBLAS */
public interface ScriptIntrinsicBLAS<GVH extends RecyclerView.setContentView, CVH extends RecyclerView.setContentView> {
    boolean IconCompatParcelizer();

    ScriptIntrinsic MediaBrowserCompat$CustomActionResultReceiver();

    boolean MediaBrowserCompat$ItemReceiver();

    ScriptIntrinsic RatingCompat();

    boolean read();

    boolean write();

    /* renamed from: o.ScriptIntrinsicBLAS$Uplo */
    public final class Uplo extends ZTBSV {
        public static final ScriptIntrinsicBLAS$Uplo$MediaBrowserCompat$ItemReceiver CREATOR = new ScriptIntrinsicBLAS$Uplo$MediaBrowserCompat$ItemReceiver((byte) 0);

        public Uplo() {
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Uplo(Parcel parcel) {
            this();
            onGetStartedClick.write((Object) parcel, "parcel");
            IconCompatParcelizer(parcel);
        }
    }

    /* renamed from: o.ScriptIntrinsicBLAS$Diag */
    public final class Diag extends ZTBSV {
        public static final Parcelable.Creator<Diag> CREATOR = new Parcelable.Creator<Diag>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Diag(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Diag[i];
            }
        };

        public Diag() {
        }

        public Diag(Parcel parcel) {
            super(parcel);
        }
    }

    /* renamed from: o.ScriptIntrinsicBLAS$Side */
    public final class Side extends ZTBSV {
        public static final Parcelable.Creator<Side> CREATOR = new Parcelable.Creator<Side>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Side(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Side[i];
            }
        };

        public Side() {
        }

        public Side(Parcel parcel) {
            super(parcel);
        }
    }

    /* renamed from: o.ScriptIntrinsicBLAS$Transpose */
    public final class Transpose extends ZTBSV {
        public static final Parcelable.Creator<Transpose> CREATOR = new Parcelable.Creator<Transpose>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Transpose(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Transpose[i];
            }
        };

        public static String MediaBrowserCompat$ItemReceiver(boolean z) {
            return z ? "yes" : "no";
        }

        public Transpose() {
        }

        public Transpose(Parcel parcel) {
            super(parcel);
        }
    }
}
