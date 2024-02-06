package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.forEachSrcOver */
public final class forEachSrcOver extends ZTBSV {
    public static final read CREATOR = new read((byte) 0);
    public static final read.IconCompatParcelizer IconCompatParcelizer = new read.IconCompatParcelizer();
    public static final read.C10570read read = new read.C10570read();

    public forEachSrcOver() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public forEachSrcOver(Parcel parcel) {
        this();
        onGetStartedClick.write((Object) parcel, "parcel");
        IconCompatParcelizer(parcel);
    }

    /* renamed from: o.forEachSrcOver$read */
    public static final class read implements Parcelable.Creator<forEachSrcOver> {

        /* renamed from: o.forEachSrcOver$read$IconCompatParcelizer */
        public static final class IconCompatParcelizer {
            public final String IconCompatParcelizer = "nsip_payment_success";
            public final String MediaBrowserCompat$CustomActionResultReceiver = "nsip_paymentshare_slip_action";
            public final String MediaBrowserCompat$ItemReceiver = "nsip_payment_review";
            public final String read = "nsip_payment_input";
        }

        /* renamed from: o.forEachSrcOver$read$read  reason: collision with other inner class name */
        public static final class C10570read {
            public final String IconCompatParcelizer = "input";
            public final String write = "scan";
        }

        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new forEachSrcOver(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new forEachSrcOver[i];
        }
    }
}
