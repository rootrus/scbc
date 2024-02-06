package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.scb.phone.view.activity.bscanc.MyQRMenuActivity$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.activity.cardmanagement.StatementChannelLandingActivity;
import com.scb.phone.view.activity.juristic.C5653x8f5d302a;
import com.scb.phone.view.activity.juristic.JuristicRequestFormActivity;
import com.scb.phone.view.activity.mailingaddress.GoodToKnowActivity$MediaBrowserCompat$ItemReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.AppendableWriter */
public final class AppendableWriter extends constrainedListMultimap {
    @HmlPinActivity
    public AppendableWriter(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    private final AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder MediaBrowserCompat$CustomActionResultReceiver(StatementChannelLandingActivity.IconCompatParcelizer iconCompatParcelizer) {
        String str = iconCompatParcelizer.IconCompatParcelizer;
        String str2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        String str3 = iconCompatParcelizer.read;
        String str4 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) str3, "$this$or");
        onGetStartedClick.write((Object) str4, "en");
        String read = read(str4, str3);
        onGetStartedClick.IconCompatParcelizer((Object) read, "getLocalizedName(en, this)");
        Iterable<GoodToKnowActivity$MediaBrowserCompat$ItemReceiver> iterable = iconCompatParcelizer.RatingCompat;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (GoodToKnowActivity$MediaBrowserCompat$ItemReceiver goodToKnowActivity$MediaBrowserCompat$ItemReceiver : iterable) {
            String str5 = goodToKnowActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
            String str6 = goodToKnowActivity$MediaBrowserCompat$ItemReceiver.read;
            String str7 = goodToKnowActivity$MediaBrowserCompat$ItemReceiver.write;
            String str8 = goodToKnowActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            onGetStartedClick.write((Object) str7, "$this$or");
            onGetStartedClick.write((Object) str8, "en");
            String read2 = read(str8, str7);
            onGetStartedClick.IconCompatParcelizer((Object) read2, "getLocalizedName(en, this)");
            arrayList.add(new getNdkPayload(str5, str6, read2, goodToKnowActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver));
        }
        return new AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder(str, str2, read, (List) arrayList);
    }

    public final AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder write(C5653x8f5d302a juristicOnboardingLandingActivity$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) juristicOnboardingLandingActivity$MediaBrowserCompat$ItemReceiver, "entity");
        Iterable<StatementChannelLandingActivity.IconCompatParcelizer> iterable = juristicOnboardingLandingActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        int i = 10;
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (StatementChannelLandingActivity.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver : iterable) {
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver));
        }
        List list = (List) arrayList;
        Iterable<JuristicRequestFormActivity.read> iterable2 = juristicOnboardingLandingActivity$MediaBrowserCompat$ItemReceiver.write;
        onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
        Collection arrayList2 = new ArrayList(iterable2 instanceof Collection ? ((Collection) iterable2).size() : 10);
        for (JuristicRequestFormActivity.read write : iterable2) {
            arrayList2.add(write(write));
        }
        List list2 = (List) arrayList2;
        Iterable<MyQRMenuActivity$MediaBrowserCompat$CustomActionResultReceiver> iterable3 = juristicOnboardingLandingActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) iterable3, "$this$collectionSizeOrDefault");
        if (iterable3 instanceof Collection) {
            i = ((Collection) iterable3).size();
        }
        Collection arrayList3 = new ArrayList(i);
        for (MyQRMenuActivity$MediaBrowserCompat$CustomActionResultReceiver myQRMenuActivity$MediaBrowserCompat$CustomActionResultReceiver : iterable3) {
            String str = myQRMenuActivity$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
            String str2 = myQRMenuActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            String str3 = myQRMenuActivity$MediaBrowserCompat$CustomActionResultReceiver.read;
            onGetStartedClick.write((Object) str2, "$this$or");
            onGetStartedClick.write((Object) str3, "en");
            String read = read(str3, str2);
            onGetStartedClick.IconCompatParcelizer((Object) read, "getLocalizedName(en, this)");
            arrayList3.add(new AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder(str, read, myQRMenuActivity$MediaBrowserCompat$CustomActionResultReceiver.write));
        }
        return new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder(list, list2, (List) arrayList3);
    }

    public final AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder write(JuristicRequestFormActivity.read read) {
        onGetStartedClick.write((Object) read, "entity");
        String str = read.IconCompatParcelizer;
        String str2 = read.MediaBrowserCompat$ItemReceiver;
        String str3 = read.read;
        onGetStartedClick.write((Object) str2, "$this$or");
        onGetStartedClick.write((Object) str3, "en");
        String read2 = read(str3, str2);
        onGetStartedClick.IconCompatParcelizer((Object) read2, "getLocalizedName(en, this)");
        String str4 = read.write;
        String str5 = read.MediaBrowserCompat$SearchResultReceiver;
        String str6 = read.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) str5, "$this$or");
        onGetStartedClick.write((Object) str6, "en");
        String read3 = read(str6, str5);
        onGetStartedClick.IconCompatParcelizer((Object) read3, "getLocalizedName(en, this)");
        return new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionUserEncoder(str, read2, str4, read3);
    }
}
