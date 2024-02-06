package p040o;

import android.view.View;
import com.scb.phone.view.adapter.limit.PersonalLimitAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.getApplicationsLatest */
public final /* synthetic */ class getApplicationsLatest implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ PersonalLimitAdapter.LimitCustomViewHolder MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ expandIfNecessary read;

    public /* synthetic */ getApplicationsLatest(PersonalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder, expandIfNecessary expandifnecessary, int i) {
        this.MediaBrowserCompat$ItemReceiver = limitCustomViewHolder;
        this.read = expandifnecessary;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(View view) {
        PersonalLimitAdapter.LimitCustomViewHolder limitCustomViewHolder = this.MediaBrowserCompat$ItemReceiver;
        expandIfNecessary expandifnecessary = this.read;
        expandifnecessary.IconCompatParcelizer = false;
        limitCustomViewHolder.IconCompatParcelizer(false);
        limitCustomViewHolder.limitAccountValue.setText(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(limitCustomViewHolder.limitInput.IconCompatParcelizer));
        if (limitCustomViewHolder.limitInput.IconCompatParcelizer != expandifnecessary.MediaBrowserCompat$ItemReceiver.doubleValue()) {
            List unused = PersonalLimitAdapter.this.write = new ArrayList(1);
            List MediaBrowserCompat$CustomActionResultReceiver2 = PersonalLimitAdapter.this.write;
            standardAdd standardadd = new standardAdd();
            standardadd.IconCompatParcelizer = expandifnecessary.RatingCompat;
            standardadd.write = expandifnecessary.write;
            standardadd.read = expandifnecessary.MediaBrowserCompat$MediaItem;
            standardadd.MediaBrowserCompat$CustomActionResultReceiver = (int) limitCustomViewHolder.limitInput.IconCompatParcelizer;
            MediaBrowserCompat$CustomActionResultReceiver2.add(standardadd);
            PersonalLimitAdapter.this.MediaBrowserCompat$ItemReceiver.read(PersonalLimitAdapter.this.write);
            return;
        }
        PersonalLimitAdapter.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver();
    }
}
