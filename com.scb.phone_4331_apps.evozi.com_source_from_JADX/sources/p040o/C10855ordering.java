package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.text.NumberFormat;
import java.util.Locale;
import p040o.CycleDetector;

/* renamed from: o.ordering  reason: case insensitive filesystem */
public final class C10855ordering extends pollLast {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C10855ordering(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    public static CycleDetector.ComponentNode read(requestActivityUpdates requestactivityupdates, zzvo zzvo, boolean z, String str) {
        requestActivityUpdates requestactivityupdates2 = requestactivityupdates;
        zzvo zzvo2 = zzvo;
        String str2 = str;
        onGetStartedClick.write((Object) requestactivityupdates2, "data");
        onGetStartedClick.write((Object) zzvo2, "closeAccount");
        onGetStartedClick.write((Object) str2, "fragmentType");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        currencyInstance.setMinimumFractionDigits(2);
        currencyInstance.setMaximumFractionDigits(2);
        NumberFormat MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance);
        boolean z2 = z;
        String MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(requestactivityupdates2.read.RatingCompat, z2);
        String str3 = requestactivityupdates2.read.MediaBrowserCompat$MediaItem;
        StringBuilder sb = new StringBuilder();
        sb.append(MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(10);
        sb.append(requestactivityupdates2.read.MediaBrowserCompat$ItemReceiver);
        MissingDependencyException missingDependencyException = new MissingDependencyException(str3, sb.toString(), getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(Iterables$3$MediaBrowserCompat$ItemReceiver.bankicon_scb).toString());
        MissingDependencyException missingDependencyException2 = new MissingDependencyException(MediaBrowserCompat$ItemReceiver(requestactivityupdates2.read.MediaSessionCompat$Token, zzvo2.MediaSessionCompat$QueueItem), requestactivityupdates2.read.MediaMetadataCompat, 4);
        MissingDependencyException missingDependencyException3 = new MissingDependencyException(requestactivityupdates2.MediaBrowserCompat$ItemReceiver.write, getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(requestactivityupdates2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str2, (Object) "CLOSE_ACCOUNT_OTHERS_FRAGMENT") ? false : z2), getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(Iterables$3$MediaBrowserCompat$ItemReceiver.bankicon_scb).toString());
        String format = MediaBrowserCompat$ItemReceiver.format(requestactivityupdates2.read.write);
        onGetStartedClick.IconCompatParcelizer((Object) format, "formatter.format(data.closingAccount.balance)");
        String format2 = MediaBrowserCompat$ItemReceiver.format(requestactivityupdates2.read.IconCompatParcelizer);
        onGetStartedClick.IconCompatParcelizer((Object) format2, "formatter.format(data.closingAccount.interest)");
        double d = requestactivityupdates2.read.MediaBrowserCompat$SearchResultReceiver;
        if (d > 0.0d) {
            d = -d;
        }
        String format3 = MediaBrowserCompat$ItemReceiver.format(d);
        onGetStartedClick.IconCompatParcelizer((Object) format3, "formatter.format(data.cl…                       })");
        double d2 = requestactivityupdates2.read.MediaBrowserCompat$CustomActionResultReceiver;
        if (d2 > 0.0d) {
            d2 = -d2;
        }
        String format4 = MediaBrowserCompat$ItemReceiver.format(d2);
        onGetStartedClick.IconCompatParcelizer((Object) format4, "formatter.format(data.cl…                       })");
        double d3 = requestactivityupdates2.read.read;
        if (d3 > 0.0d) {
            d3 = -d3;
        }
        String format5 = MediaBrowserCompat$ItemReceiver.format(d3);
        onGetStartedClick.IconCompatParcelizer((Object) format5, "formatter.format(data.cl…                       })");
        String format6 = MediaBrowserCompat$ItemReceiver.format(requestactivityupdates2.read.MediaDescriptionCompat);
        onGetStartedClick.IconCompatParcelizer((Object) format6, "formatter.format(data.closingAccount.netAmount)");
        return new CycleDetector.ComponentNode(missingDependencyException, missingDependencyException2, missingDependencyException3, new addDependency(format, format2, format3, format4, format5, format6), requestactivityupdates2.MediaBrowserCompat$CustomActionResultReceiver, HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(requestactivityupdates2.write, "\n\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (FundFactSheetActivity) null, 62));
    }
}
