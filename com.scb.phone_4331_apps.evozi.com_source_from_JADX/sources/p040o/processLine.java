package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p040o.standardStartAndWait;

/* renamed from: o.processLine */
public final class processLine extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public processLine(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    public final standardStartAndWait MediaBrowserCompat$ItemReceiver(List<? extends ForwardingFuture> list, onCameraChange oncamerachange) {
        onGetStartedClick.write((Object) list, "itemList");
        onGetStartedClick.write((Object) oncamerachange, "confirmation");
        ArrayList arrayList = new ArrayList();
        capSessionCount$MediaBrowserCompat$CustomActionResultReceiver read = capSessionCount.read();
        read.MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_success_title);
        read.write = Iterables$3$MediaBrowserCompat$ItemReceiver.ic_check_circle_black_48dp;
        read.read = IconCompatParcelizer("dd MMM yyyy - HH:mm", oncamerachange.MediaBrowserCompat$CustomActionResultReceiver);
        read.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.reference_id, new Object[]{oncamerachange.write});
        arrayList.add(new capSessionCount(read, (byte) 0));
        arrayList.add(new callTask());
        arrayList.addAll(list);
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidCard_request_");
        sb.append(oncamerachange.write);
        standardStartAndWait.IconCompatParcelizer write = standardStartAndWait.write(arrayList, sb.toString());
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_remaining_text);
        onGetStartedClick.IconCompatParcelizer((Object) string, "resources.getString(R.st…d_request_remaining_text)");
        String format = String.format(string, Arrays.copyOf(new Object[]{write(Double.valueOf(Double.parseDouble(oncamerachange.MediaBrowserCompat$ItemReceiver)))}, 1));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
        write.MediaDescriptionCompat = format;
        standardStartAndWait read2 = write.read();
        onGetStartedClick.IconCompatParcelizer((Object) read2, "SuccessfulDisplay.newBui…\n                .build()");
        return read2;
    }
}
