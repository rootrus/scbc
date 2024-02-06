package p040o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.prepaid.DetailsTabHolder;
import com.scb.phone.view.activity.prepaid.PointTabHolder;
import com.scb.phone.view.adapter.prepaid.PrepaidTransactionAdapter;
import java.util.List;

/* renamed from: o.newState */
public final class newState extends onActivityCreated {
    public isSimulator IconCompatParcelizer;
    public List<setSimulator> MediaBrowserCompat$CustomActionResultReceiver;
    public PointTabHolder MediaBrowserCompat$ItemReceiver;
    private final DetailsTabHolder.IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver;
    private final IconCompatParcelizer MediaDescriptionCompat;
    private final Context RatingCompat;
    public final getModelClass read;
    public DetailsTabHolder write;

    /* renamed from: o.newState$IconCompatParcelizer */
    public interface IconCompatParcelizer {
        void MediaSessionCompat$Token();
    }

    public final int getCount() {
        return 2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public newState(getModelClass getmodelclass, Context context, DetailsTabHolder.IconCompatParcelizer iconCompatParcelizer, IconCompatParcelizer iconCompatParcelizer2) {
        this.read = getmodelclass;
        this.RatingCompat = context;
        this.MediaBrowserCompat$SearchResultReceiver = iconCompatParcelizer;
        this.MediaDescriptionCompat = iconCompatParcelizer2;
    }

    public final CharSequence getPageTitle(int i) {
        if (i == 0) {
            return this.RatingCompat.getString(R.string.prepaid_tab_details);
        }
        if (i != 1) {
            return super.getPageTitle(i);
        }
        return this.RatingCompat.getString(R.string.prepaid_tab_points);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            DetailsTabHolder detailsTabHolder = new DetailsTabHolder(this.MediaBrowserCompat$SearchResultReceiver);
            this.write = detailsTabHolder;
            detailsTabHolder.MediaBrowserCompat$CustomActionResultReceiver = viewGroup.getContext();
            view = from.inflate(R.layout.f91602131494387, viewGroup, false);
            ButterKnife.IconCompatParcelizer(detailsTabHolder, view);
            Drawable mutate = setLastBaselineToBottomHeight.write(detailsTabHolder.MediaBrowserCompat$CustomActionResultReceiver, R.drawable.ic_filter_list_black_24dp).mutate();
            setBaselineAligned.MediaBrowserCompat$ItemReceiver(mutate, setLastBaselineToBottomHeight.read(detailsTabHolder.MediaBrowserCompat$CustomActionResultReceiver, R.color.f67252131099881));
            detailsTabHolder.mToolbarTxnPrepaid.setOverflowIcon(mutate);
            detailsTabHolder.mTextTxnPrepaid.setText(R.string.prepaid_details_transactions);
            detailsTabHolder.write = new LinearLayoutManager(1, false);
            validateGER validateger = new validateGER((Parcelable) null);
            detailsTabHolder.IconCompatParcelizer = validateger;
            getSelectionMode getselectionmode = getSelectionMode.MediaBrowserCompat$ItemReceiver;
            validateHERK validateherk = validateger.MediaDescriptionCompat;
            if (validateherk != null) {
                validateherk.RatingCompat = getselectionmode;
            } else {
                validateger.MediaBrowserCompat$ItemReceiver = getselectionmode;
            }
            validateGER validateger2 = detailsTabHolder.IconCompatParcelizer;
            getTileSize gettilesize = new getTileSize(detailsTabHolder);
            validateHERK validateherk2 = validateger2.MediaDescriptionCompat;
            if (validateherk2 != null) {
                validateherk2.MediaMetadataCompat = gettilesize;
            } else {
                validateger2.MediaBrowserCompat$CustomActionResultReceiver = gettilesize;
            }
            PrepaidTransactionAdapter prepaidTransactionAdapter = new PrepaidTransactionAdapter(detailsTabHolder.MediaBrowserCompat$CustomActionResultReceiver);
            detailsTabHolder.MediaBrowserCompat$MediaItem = prepaidTransactionAdapter;
            detailsTabHolder.MediaBrowserCompat$SearchResultReceiver = detailsTabHolder.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) prepaidTransactionAdapter);
            addInput addinput = new addInput();
            addinput.MediaSessionCompat$ResultReceiverWrapper = false;
            detailsTabHolder.mRecyclerViewPrepaid.setLayoutManager(detailsTabHolder.write);
            detailsTabHolder.mRecyclerViewPrepaid.setAdapter(detailsTabHolder.MediaBrowserCompat$SearchResultReceiver);
            detailsTabHolder.mRecyclerViewPrepaid.setItemAnimator(addinput);
            detailsTabHolder.mRecyclerViewPrepaid.setHasFixedSize(false);
            detailsTabHolder.mRecyclerViewPrepaid.setNestedScrollingEnabled(false);
            detailsTabHolder.IconCompatParcelizer.IconCompatParcelizer(detailsTabHolder.mRecyclerViewPrepaid);
            this.write.read(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.MediaDescriptionCompat.MediaSessionCompat$Token();
        } else {
            PointTabHolder pointTabHolder = new PointTabHolder(viewGroup);
            this.MediaBrowserCompat$ItemReceiver = pointTabHolder;
            view = pointTabHolder.MediaBrowserCompat$CustomActionResultReceiver;
        }
        viewGroup.addView(view);
        return view;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        View view = (View) obj;
        if (view == this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$ItemReceiver = null;
            viewGroup.removeView(view);
            return;
        }
        this.write = null;
        viewGroup.removeView(view);
    }
}
