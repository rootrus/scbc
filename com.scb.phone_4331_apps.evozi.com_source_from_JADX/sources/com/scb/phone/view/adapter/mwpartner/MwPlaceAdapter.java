package com.scb.phone.view.adapter.mwpartner;

import android.content.Context;
import android.text.style.CharacterStyle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.AutocompletePrediction;
import com.google.android.gms.location.places.AutocompletePredictionBuffer;
import com.google.android.gms.location.places.GeoDataApi;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.model.LatLngBounds;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.onStart;

public final class MwPlaceAdapter extends RecyclerView.IconCompatParcelizer<PredictionHolder> implements Filterable {
    public Context MediaBrowserCompat$ItemReceiver;
    private AutocompletePredictionBuffer MediaBrowserCompat$MediaItem;
    public AutocompleteFilter MediaDescriptionCompat;
    public GoogleApiClient MediaMetadataCompat;
    /* access modifiers changed from: private */
    public ArrayList<write> RatingCompat;
    public read read;
    public LatLngBounds write;

    public interface read {
        void ActionMenuView();

        void IconCompatParcelizer(String str);

        void setWindowTitle();
    }

    public final class PredictionHolder_ViewBinding implements Unbinder {
        private PredictionHolder IconCompatParcelizer;

        public PredictionHolder_ViewBinding(PredictionHolder predictionHolder, View view) {
            this.IconCompatParcelizer = predictionHolder;
            predictionHolder.tvPlace = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_place, "field 'tvPlace'", TextView.class);
            predictionHolder.tvAddress = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_address, "field 'tvAddress'", TextView.class);
        }

        public final void read() {
            PredictionHolder predictionHolder = this.IconCompatParcelizer;
            if (predictionHolder != null) {
                this.IconCompatParcelizer = null;
                predictionHolder.tvPlace = null;
                predictionHolder.tvAddress = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public static final /* synthetic */ read IconCompatParcelizer(MwPlaceAdapter mwPlaceAdapter) {
        read read2 = mwPlaceAdapter.read;
        if (read2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        return read2;
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        Context context = this.MediaBrowserCompat$ItemReceiver;
        if (context == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("context");
        }
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.f90722131494299, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, "convertView");
            return new PredictionHolder(this, inflate);
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        PredictionHolder predictionHolder = (PredictionHolder) setcontentview;
        onGetStartedClick.write((Object) predictionHolder, "holder");
        ArrayList<write> arrayList = this.RatingCompat;
        if (arrayList != null) {
            write write2 = arrayList.get(i);
            onGetStartedClick.IconCompatParcelizer((Object) write2, "it[position]");
            write write3 = write2;
            onGetStartedClick.write((Object) write3, "mPlaceAutoComplete");
            TextView textView = predictionHolder.tvPlace;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPlace");
            }
            textView.setText(write3.IconCompatParcelizer);
            CharSequence charSequence = write3.read;
            if (charSequence != null) {
                TextView textView2 = predictionHolder.tvAddress;
                if (textView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAddress");
                }
                textView2.setText(charSequence);
            }
            String str = write3.MediaBrowserCompat$ItemReceiver;
            if (str != null) {
                predictionHolder.write.setOnClickListener(new PredictionHolder.write(str, predictionHolder));
            }
        }
    }

    public final int IconCompatParcelizer() {
        ArrayList<write> arrayList = this.RatingCompat;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final Filter getFilter() {
        return new MwPlaceAdapter$MediaBrowserCompat$CustomActionResultReceiver(this);
    }

    public final class PredictionHolder extends RecyclerView.setContentView {
        final /* synthetic */ MwPlaceAdapter PlaybackStateCompat;
        @BindView
        public TextView tvAddress;
        @BindView
        public TextView tvPlace;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PredictionHolder(MwPlaceAdapter mwPlaceAdapter, View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            this.PlaybackStateCompat = mwPlaceAdapter;
            ButterKnife.IconCompatParcelizer(this, view);
        }

        static final class write implements View.OnClickListener {
            private /* synthetic */ PredictionHolder IconCompatParcelizer;
            private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

            write(String str, PredictionHolder predictionHolder) {
                this.MediaBrowserCompat$ItemReceiver = str;
                this.IconCompatParcelizer = predictionHolder;
            }

            public final void onClick(View view) {
                MwPlaceAdapter.IconCompatParcelizer(this.IconCompatParcelizer.PlaybackStateCompat).IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
            }
        }
    }

    public final class write {
        CharSequence IconCompatParcelizer;
        String MediaBrowserCompat$ItemReceiver;
        CharSequence read;

        public write(String str, CharSequence charSequence, CharSequence charSequence2) {
            onGetStartedClick.write((Object) charSequence, "name");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.IconCompatParcelizer = charSequence;
            this.read = charSequence2;
        }
    }

    public static final /* synthetic */ ArrayList IconCompatParcelizer(MwPlaceAdapter mwPlaceAdapter, CharSequence charSequence) {
        Iterator it;
        Status status;
        GoogleApiClient googleApiClient = mwPlaceAdapter.MediaMetadataCompat;
        if (googleApiClient == null) {
            return null;
        }
        GeoDataApi geoDataApi = Places.GeoDataApi;
        String obj = charSequence.toString();
        LatLngBounds latLngBounds = mwPlaceAdapter.write;
        if (latLngBounds == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mBounds");
        }
        AutocompleteFilter autocompleteFilter = mwPlaceAdapter.MediaDescriptionCompat;
        if (autocompleteFilter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPlaceFilter");
        }
        AutocompletePredictionBuffer await = geoDataApi.getAutocompletePredictions(googleApiClient, obj, latLngBounds, autocompleteFilter).await(60, TimeUnit.SECONDS);
        mwPlaceAdapter.MediaBrowserCompat$MediaItem = await;
        int i = 0;
        if (await == null || (status = await.getStatus()) == null || status.isSuccess()) {
            AutocompletePredictionBuffer autocompletePredictionBuffer = mwPlaceAdapter.MediaBrowserCompat$MediaItem;
            if (autocompletePredictionBuffer != null) {
                i = autocompletePredictionBuffer.getCount();
            }
            ArrayList arrayList = new ArrayList(i);
            AutocompletePredictionBuffer autocompletePredictionBuffer2 = mwPlaceAdapter.MediaBrowserCompat$MediaItem;
            if (!(autocompletePredictionBuffer2 == null || (it = autocompletePredictionBuffer2.iterator()) == null)) {
                while (it.hasNext()) {
                    AutocompletePrediction autocompletePrediction = (AutocompletePrediction) it.next();
                    onGetStartedClick.IconCompatParcelizer((Object) autocompletePrediction, "prediction");
                    String placeId = autocompletePrediction.getPlaceId();
                    CharSequence primaryText = autocompletePrediction.getPrimaryText((CharacterStyle) null);
                    onGetStartedClick.IconCompatParcelizer((Object) primaryText, "prediction.getPrimaryText(null)");
                    arrayList.add(new write(placeId, primaryText, autocompletePrediction.getSecondaryText((CharacterStyle) null)));
                }
            }
            AutocompletePredictionBuffer autocompletePredictionBuffer3 = mwPlaceAdapter.MediaBrowserCompat$MediaItem;
            if (autocompletePredictionBuffer3 != null) {
                autocompletePredictionBuffer3.release();
            }
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Error: ");
        sb.append(status.toString());
        onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver(sb.toString(), new Object[0]);
        AutocompletePredictionBuffer autocompletePredictionBuffer4 = mwPlaceAdapter.MediaBrowserCompat$MediaItem;
        if (autocompletePredictionBuffer4 != null) {
            autocompletePredictionBuffer4.release();
        }
        return null;
    }
}
