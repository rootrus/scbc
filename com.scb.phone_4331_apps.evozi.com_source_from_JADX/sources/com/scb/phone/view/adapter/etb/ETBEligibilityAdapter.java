package com.scb.phone.view.adapter.etb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.squareup.picasso.Picasso;
import java.util.List;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.access$2400;
import p040o.onStart;

public final class ETBEligibilityAdapter extends RecyclerView.IconCompatParcelizer<EligibilityHolder> {
    private List<access$2400> MediaBrowserCompat$ItemReceiver;

    public class EligibilityHolder_ViewBinding implements Unbinder {
        private EligibilityHolder MediaBrowserCompat$ItemReceiver;

        public EligibilityHolder_ViewBinding(EligibilityHolder eligibilityHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = eligibilityHolder;
            eligibilityHolder.eligibilityIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.etb_eligibility_image, "field 'eligibilityIcon'", ImageView.class);
            eligibilityHolder.eligibilityDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.etb_eligibility_text, "field 'eligibilityDescription'", TextView.class);
        }

        public final void read() {
            EligibilityHolder eligibilityHolder = this.MediaBrowserCompat$ItemReceiver;
            if (eligibilityHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                eligibilityHolder.eligibilityIcon = null;
                eligibilityHolder.eligibilityDescription = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        EligibilityHolder eligibilityHolder = (EligibilityHolder) setcontentview;
        Picasso.read().write(this.MediaBrowserCompat$ItemReceiver.get(i).IconCompatParcelizer).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.donations_place_holder).IconCompatParcelizer((int) R.drawable.donations_place_holder).read(eligibilityHolder.eligibilityIcon, (FragmentBuilder_BindEkycFragment) null);
        eligibilityHolder.eligibilityDescription.setText(this.MediaBrowserCompat$ItemReceiver.get(i).write);
    }

    public ETBEligibilityAdapter(List<access$2400> list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    class EligibilityHolder extends RecyclerView.setContentView {
        @BindView
        TextView eligibilityDescription;
        @BindView
        ImageView eligibilityIcon;

        public EligibilityHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new EligibilityHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f81882131493414, viewGroup, false));
    }
}
