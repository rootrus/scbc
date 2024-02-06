package p040o;

import java.util.ArrayList;
import java.util.Calendar;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CustomConcurrentHashMap;

/* renamed from: o.PatternItem */
public final class PatternItem extends IndoorBuilding {
    private LocalProjectProvider IconCompatParcelizer;
    public OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver;
    public getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver write;

    @HmlPinActivity
    public PatternItem(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider localProjectProvider, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.IconCompatParcelizer = localProjectProvider;
        this.write = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
    }

    public final DebitCardResetOtpActivity<zzuk> read(CustomConcurrentHashMap.AbstractSerializationProxy abstractSerializationProxy) {
        return write(this.IconCompatParcelizer.read(abstractSerializationProxy));
    }

    public static void write(ArrayList arrayList, int i, int i2) {
        for (int i3 = 0; i3 <= i; i3++) {
            StringBuilder sb = new StringBuilder();
            sb.append("initMonthEnd");
            sb.append(i3);
            onCheckBoxClick.read(sb.toString(), new Object[0]);
            Calendar instance = Calendar.getInstance();
            instance.set(i2, i3, 1);
            arrayList.add(instance);
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.write.setCheckable().equalsIgnoreCase("th")) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.getYear() + 543;
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.getYear();
    }

    public static void read(ArrayList arrayList, int i) {
        for (int i2 = 0; i2 < 12; i2++) {
            Calendar instance = Calendar.getInstance();
            instance.set(i, i2, 1);
            arrayList.add(instance);
        }
    }

    public static void IconCompatParcelizer(ArrayList arrayList, int i, int i2, int i3) {
        while (i < i2) {
            Calendar instance = Calendar.getInstance();
            instance.set(i3, i, 1);
            arrayList.add(instance);
            i++;
        }
    }
}
