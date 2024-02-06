package com.scb.phone.view.adapter.ntb.selectaccount;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.DepositService;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.getSetupResult;
import p040o.onStart;
import p040o.setDisplayVersion;
import p040o.verifyEmail;

public final class SelectAccountAdapter extends RecyclerView.IconCompatParcelizer {
    public boolean MediaBrowserCompat$ItemReceiver;
    private List<setDisplayVersion> read;
    public write write;

    public interface write {
        void MediaBrowserCompat$CustomActionResultReceiver(int i);

        void MediaBrowserCompat$ItemReceiver(int i);

        void write(int i);
    }

    public class SelectAccountHolder_ViewBinding implements Unbinder {
        private SelectAccountHolder MediaBrowserCompat$ItemReceiver;

        public SelectAccountHolder_ViewBinding(SelectAccountHolder selectAccountHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = selectAccountHolder;
            selectAccountHolder.imageAccountType = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_account_type, "field 'imageAccountType'", ImageView.class);
            selectAccountHolder.textAccountType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_type, "field 'textAccountType'", TextView.class);
            selectAccountHolder.textAccountDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_description, "field 'textAccountDescription'", TextView.class);
            selectAccountHolder.buttonDetail = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btn_detail, "field 'buttonDetail'", Button.class);
            selectAccountHolder.buttonSelect = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btn_select, "field 'buttonSelect'", Button.class);
            selectAccountHolder.cardViewAccountType = (CardView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cv_account_type, "field 'cardViewAccountType'", CardView.class);
        }

        public final void read() {
            SelectAccountHolder selectAccountHolder = this.MediaBrowserCompat$ItemReceiver;
            if (selectAccountHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                selectAccountHolder.imageAccountType = null;
                selectAccountHolder.textAccountType = null;
                selectAccountHolder.textAccountDescription = null;
                selectAccountHolder.buttonDetail = null;
                selectAccountHolder.buttonSelect = null;
                selectAccountHolder.cardViewAccountType = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public SelectAccountAdapter(Context context, List<setDisplayVersion> list, write write2) {
        this.read = list;
        this.write = write2;
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new SelectAccountHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83732131493599, viewGroup, false));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof SelectAccountHolder) {
            setDisplayVersion setdisplayversion = this.read.get(i);
            SelectAccountHolder selectAccountHolder = (SelectAccountHolder) setcontentview;
            FragmentBuilder_BindDepositSelectorFragment.read(selectAccountHolder.imageAccountType, setdisplayversion.read);
            selectAccountHolder.textAccountType.setText(setdisplayversion.MediaBrowserCompat$SearchResultReceiver);
            selectAccountHolder.textAccountDescription.setText(setdisplayversion.MediaBrowserCompat$CustomActionResultReceiver);
            selectAccountHolder.buttonDetail.setOnClickListener(new verifyEmail(this, i));
            selectAccountHolder.buttonSelect.setOnClickListener(new getSetupResult(this, i));
            if (this.MediaBrowserCompat$ItemReceiver) {
                selectAccountHolder.cardViewAccountType.setOnClickListener(new DepositService(this, i));
                selectAccountHolder.buttonDetail.setVisibility(4);
                selectAccountHolder.buttonSelect.setVisibility(4);
            }
        }
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public class SelectAccountHolder extends RecyclerView.setContentView {
        @BindView
        Button buttonDetail;
        @BindView
        Button buttonSelect;
        @BindView
        CardView cardViewAccountType;
        @BindView
        ImageView imageAccountType;
        @BindView
        TextView textAccountDescription;
        @BindView
        TextView textAccountType;

        public SelectAccountHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
