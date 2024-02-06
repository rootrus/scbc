package com.scb.phone.view.adapter.etb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.squareup.picasso.Picasso;
import java.util.List;
import p040o.getBondAccountSummary;
import p040o.getBondDltTermsAndConditions;
import p040o.onStart;

public final class ETBSelectionAdapter extends RecyclerView.IconCompatParcelizer<OneButtonHolder> {

    public interface IconCompatParcelizer {
        String IconCompatParcelizer();

        int MediaBrowserCompat$CustomActionResultReceiver();

        String read();

        String write();
    }

    public class TwoButtonHolder_ViewBinding extends OneButtonHolder_ViewBinding {
        private TwoButtonHolder MediaBrowserCompat$ItemReceiver;

        public TwoButtonHolder_ViewBinding(TwoButtonHolder twoButtonHolder, View view) {
            super(twoButtonHolder, view);
            this.MediaBrowserCompat$ItemReceiver = twoButtonHolder;
            twoButtonHolder.buttonSelect = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btn_select, "field 'buttonSelect'", Button.class);
        }

        public final void read() {
            TwoButtonHolder twoButtonHolder = this.MediaBrowserCompat$ItemReceiver;
            if (twoButtonHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                twoButtonHolder.buttonSelect = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class OneButtonHolder_ViewBinding implements Unbinder {
        private OneButtonHolder MediaBrowserCompat$CustomActionResultReceiver;

        public OneButtonHolder_ViewBinding(OneButtonHolder oneButtonHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = oneButtonHolder;
            oneButtonHolder.imageAccountType = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_account_type, "field 'imageAccountType'", ImageView.class);
            oneButtonHolder.textAccountType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_type, "field 'textAccountType'", TextView.class);
            oneButtonHolder.textAccountDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_description, "field 'textAccountDescription'", TextView.class);
            oneButtonHolder.buttonDetail = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btn_detail, "field 'buttonDetail'", Button.class);
        }

        public void read() {
            OneButtonHolder oneButtonHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (oneButtonHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                oneButtonHolder.imageAccountType = null;
                oneButtonHolder.textAccountType = null;
                oneButtonHolder.textAccountDescription = null;
                oneButtonHolder.buttonDetail = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List, o.FragmentBuilder_BindEkycFragment] */
    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        OneButtonHolder oneButtonHolder = (OneButtonHolder) setcontentview;
        ? r0 = 0;
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) r0.get(i);
        Picasso.read().write(iconCompatParcelizer.write()).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.donations_place_holder).read(oneButtonHolder.imageAccountType, r0);
        oneButtonHolder.textAccountType.setText(iconCompatParcelizer.read());
        oneButtonHolder.textAccountDescription.setText(iconCompatParcelizer.IconCompatParcelizer());
        oneButtonHolder.buttonDetail.setOnClickListener(new getBondAccountSummary(this, iconCompatParcelizer));
        if (oneButtonHolder instanceof TwoButtonHolder) {
            ((TwoButtonHolder) oneButtonHolder).buttonSelect.setOnClickListener(new getBondDltTermsAndConditions(this, iconCompatParcelizer));
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        List list = null;
        return ((IconCompatParcelizer) list.get(i)).MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final int IconCompatParcelizer() {
        List list = null;
        return list.size();
    }

    static class OneButtonHolder extends RecyclerView.setContentView {
        @BindView
        Button buttonDetail;
        @BindView
        ImageView imageAccountType;
        @BindView
        TextView textAccountDescription;
        @BindView
        TextView textAccountType;

        OneButtonHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    static class TwoButtonHolder extends OneButtonHolder {
        @BindView
        Button buttonSelect;

        TwoButtonHolder(View view) {
            super(view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new OneButtonHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82742131493500, viewGroup, false));
        }
        return new TwoButtonHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82732131493499, viewGroup, false));
    }
}
