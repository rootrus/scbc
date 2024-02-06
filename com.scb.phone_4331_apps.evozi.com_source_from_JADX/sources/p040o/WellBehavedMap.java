package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.scb.phone.view.activity.ErrorPageActivity;
import com.scb.phone.view.activity.mwpartner.MwPinShopLocationActivity;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.TreeBasedTable;

/* renamed from: o.WellBehavedMap */
public final class WellBehavedMap extends constrainedListMultimap {
    @HmlPinActivity
    public WellBehavedMap(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* renamed from: o.WellBehavedMap$KeyToEntryConverter */
    public final class KeyToEntryConverter extends constrainedListMultimap {
        private final append read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public KeyToEntryConverter(Resources resources, SharedPreferences sharedPreferences, append append, rowComparator rowcomparator, TreeBasedTable.C38721 r6) {
            super(resources, sharedPreferences);
            onGetStartedClick.write((Object) append, "shopDisplayMapper");
            onGetStartedClick.write((Object) rowcomparator, "addressDisplayMapper");
            onGetStartedClick.write((Object) r6, "bankAccountDisplayMapper");
            this.read = append;
        }

        public final getBuildVersion read(MwPinShopLocationActivity.IconCompatParcelizer iconCompatParcelizer) {
            onGetStartedClick.write((Object) iconCompatParcelizer, "wallet");
            String str = iconCompatParcelizer.read;
            String str2 = iconCompatParcelizer.MediaBrowserCompat$MediaItem;
            AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder write = this.read.write(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
            ErrorPageActivity.read read2 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            if (read2 != null) {
                onGetStartedClick.write((Object) read2, "address");
                new AutoCrashlyticsReportEncoder.CrashlyticsReportCustomAttributeEncoder();
            }
            return new getBuildVersion(str, str2, write, TreeBasedTable.C38721.IconCompatParcelizer(iconCompatParcelizer.write));
        }
    }
}
