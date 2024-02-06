package p040o;

import java.util.ArrayList;
import p040o.CrashlyticsReport;
import p040o.Longs;
import p040o.writeUInt64NoTag;

/* renamed from: o.hY */
public final /* synthetic */ class C4738hY implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ showTextMessage read;

    public /* synthetic */ C4738hY(showTextMessage showtextmessage) {
        this.read = showtextmessage;
    }

    public final void IconCompatParcelizer(Object obj) {
        Longs.LexicographicalComparator lexicographicalComparator = this.read.read;
        ArrayList arrayList = new ArrayList();
        CrashlyticsReport.CustomAttribute MediaBrowserCompat$CustomActionResultReceiver = CrashlyticsReport.CustomAttribute.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = lexicographicalComparator.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.gift_tutorial_header_step_1);
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = lexicographicalComparator.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.gift_tutorial_message_step_1);
        MediaBrowserCompat$CustomActionResultReceiver.read = Iterables$3$MediaBrowserCompat$ItemReceiver.gift_tutorial_one;
        arrayList.add(MediaBrowserCompat$CustomActionResultReceiver);
        CrashlyticsReport.CustomAttribute MediaBrowserCompat$CustomActionResultReceiver2 = CrashlyticsReport.CustomAttribute.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = lexicographicalComparator.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.gift_tutorial_header_step_2);
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = lexicographicalComparator.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.gift_tutorial_message_step_2);
        MediaBrowserCompat$CustomActionResultReceiver2.read = Iterables$3$MediaBrowserCompat$ItemReceiver.gift_tutorial_two;
        arrayList.add(MediaBrowserCompat$CustomActionResultReceiver2);
        CrashlyticsReport.CustomAttribute MediaBrowserCompat$CustomActionResultReceiver3 = CrashlyticsReport.CustomAttribute.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$ItemReceiver = lexicographicalComparator.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.gift_tutorial_header_step_3);
        MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver = lexicographicalComparator.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.gift_tutorial_message_step_3);
        MediaBrowserCompat$CustomActionResultReceiver3.read = Iterables$3$MediaBrowserCompat$ItemReceiver.gift_tutorial_three;
        arrayList.add(MediaBrowserCompat$CustomActionResultReceiver3);
        ((C6398x266504ee) obj).write(arrayList);
    }
}
