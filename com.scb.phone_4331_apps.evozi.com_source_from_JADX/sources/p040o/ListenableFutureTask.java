package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.ListenableFutureTask */
public final class ListenableFutureTask implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IconCompatParcelizer();
    public final CrashlyticsReportJsonTransform$$Lambda$8 IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final List<addDelayedShutdownHook> write;

    /* renamed from: o.ListenableFutureTask$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            onGetStartedClick.write((Object) parcel, "in");
            CrashlyticsReportJsonTransform$$Lambda$8 crashlyticsReportJsonTransform$$Lambda$8 = (CrashlyticsReportJsonTransform$$Lambda$8) Enum.valueOf(CrashlyticsReportJsonTransform$$Lambda$8.class, parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((addDelayedShutdownHook) addDelayedShutdownHook.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new ListenableFutureTask(crashlyticsReportJsonTransform$$Lambda$8, readString, readString2, arrayList, parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new ListenableFutureTask[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer.name());
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        List<addDelayedShutdownHook> list = this.write;
        parcel.writeInt(list.size());
        for (addDelayedShutdownHook writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }

    public ListenableFutureTask(CrashlyticsReportJsonTransform$$Lambda$8 crashlyticsReportJsonTransform$$Lambda$8, String str, String str2, List<addDelayedShutdownHook> list, String str3) {
        onGetStartedClick.write((Object) crashlyticsReportJsonTransform$$Lambda$8, "districtType");
        onGetStartedClick.write((Object) str, "hint");
        onGetStartedClick.write((Object) str2, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) list, "list");
        this.IconCompatParcelizer = crashlyticsReportJsonTransform$$Lambda$8;
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = str3;
    }
}
