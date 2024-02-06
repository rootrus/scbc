package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getKernelIDSrcAtop */
public final class getKernelIDSrcAtop extends ZTBSV {
    public static final read CREATOR = new read((byte) 0);

    /* renamed from: o.getKernelIDSrcAtop$read */
    public static final class read implements Parcelable.Creator<ZTPMV> {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "parcel");
            return new ZTPMV(parcel);
        }

        public static HmlVerifyEmailSuccessfulActivity<String, getKernelIDSrcAtop> read(String str, String str2, getKernelIDSrcAtop$read$MediaBrowserCompat$ItemReceiver getkernelidsrcatop_read_mediabrowsercompat_itemreceiver) {
            getKernelIDSrcAtop getkernelidsrcatop = new getKernelIDSrcAtop();
            getkernelidsrcatop.read(C10571read.ACTION.parameterName, getkernelidsrcatop_read_mediabrowsercompat_itemreceiver.parameterName);
            getkernelidsrcatop.read(C10571read.ID.parameterName, str);
            getkernelidsrcatop.read(C10571read.NAME.parameterName, str2);
            getkernelidsrcatop.read(C10571read.TYPE.parameterName, "contextual_banner");
            return new HmlVerifyEmailSuccessfulActivity<>("contextual_banner", getkernelidsrcatop);
        }

        /* renamed from: o.getKernelIDSrcAtop$read$read  reason: collision with other inner class name */
        enum C10571read {
            ACTION("user_action"),
            ID("ads_id"),
            NAME("ads_name"),
            TYPE("ads_type");
            
            final String parameterName;

            private C10571read(String str) {
                this.parameterName = str;
            }
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ZTPMV[i];
        }
    }
}
