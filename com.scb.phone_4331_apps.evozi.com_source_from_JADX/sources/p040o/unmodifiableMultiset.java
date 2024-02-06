package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import p040o.CrashlyticsBackgroundWorker;

/* renamed from: o.unmodifiableMultiset */
public final class unmodifiableMultiset extends constrainedSetMultimap<sha1, CrashlyticsBackgroundWorker.C32164> {
    @HmlPinActivity
    public unmodifiableMultiset(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* renamed from: MediaBrowserCompat$CustomActionResultReceiver */
    public final CrashlyticsBackgroundWorker.C32164 MediaBrowserCompat$ItemReceiver(sha1 sha1) {
        if (sha1.MediaBrowserCompat$ItemReceiver == null || sha1.MediaBrowserCompat$ItemReceiver.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new RestrictedComponentContainer(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.loan_monthly_payment_label).toUpperCase(), write(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(sha1.MediaBrowserCompat$CustomActionResultReceiver))));
            arrayList.add(new RestrictedComponentContainer(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.loan_interest_rate_label).toUpperCase(), sha1.IconCompatParcelizer));
            if (!getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(sha1.read)) {
                arrayList.add(new RestrictedComponentContainer(MessageFormat.format("{0} {1}", new Object[]{this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.loan_duty_stamp_fee_label).toUpperCase(), sha1.write}), sha1.read));
            }
            if (!getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(sha1.RatingCompat)) {
                arrayList.add(new RestrictedComponentContainer(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.loan_transer_fee_label).toUpperCase(), sha1.RatingCompat));
            }
            arrayList.add(new RestrictedComponentContainer(this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.loan_net_transfer_amount_label).toUpperCase(), write(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(sha1.MediaBrowserCompat$MediaItem))));
            CrashlyticsBackgroundWorker.C32164.read read = new CrashlyticsBackgroundWorker.C32164.read();
            read.MediaBrowserCompat$CustomActionResultReceiver = arrayList;
            read.write = true;
            return read.MediaBrowserCompat$CustomActionResultReceiver();
        }
        List<RestrictedComponentContainer> MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(sha1.MediaBrowserCompat$ItemReceiver, new elementSetImpl(this));
        CrashlyticsBackgroundWorker.C32164.read read2 = new CrashlyticsBackgroundWorker.C32164.read();
        read2.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver;
        read2.write = true;
        return read2.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
