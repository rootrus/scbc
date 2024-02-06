package com.scb.phone.view.adapter.profilemanagement.promptpay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.FragmentBuilder_BindCategoriesListFragment;
import p040o.getBaseAddress;
import p040o.getBillerInfo;
import p040o.getScanBillerInfo;
import p040o.onStart;

public final class DepositAccountsAdapter extends RecyclerView.IconCompatParcelizer<DepositAccountHolder> {
    public int MediaBrowserCompat$ItemReceiver = -1;
    private FragmentBuilder_BindCategoriesListFragment<Integer> MediaDescriptionCompat = new getBillerInfo(this);
    private Context MediaMetadataCompat;
    public FragmentBuilder_BindCategoriesListFragment<getBaseAddress> read;
    public List<getBaseAddress> write;

    public class DepositAccountHolder_ViewBinding implements Unbinder {
        private DepositAccountHolder write;

        public DepositAccountHolder_ViewBinding(DepositAccountHolder depositAccountHolder, View view) {
            this.write = depositAccountHolder;
            depositAccountHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deposit_number, "field 'title'", TextView.class);
            depositAccountHolder.nickname = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deposit_nickname, "field 'nickname'", TextView.class);
            depositAccountHolder.radioButton = (RadioButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.radio_button, "field 'radioButton'", RadioButton.class);
        }

        public final void read() {
            DepositAccountHolder depositAccountHolder = this.write;
            if (depositAccountHolder != null) {
                this.write = null;
                depositAccountHolder.title = null;
                depositAccountHolder.nickname = null;
                depositAccountHolder.radioButton = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        DepositAccountHolder depositAccountHolder = (DepositAccountHolder) setcontentview;
        getBaseAddress getbaseaddress = this.write.get(i);
        boolean z = i == this.MediaBrowserCompat$ItemReceiver;
        FragmentBuilder_BindCategoriesListFragment<Integer> fragmentBuilder_BindCategoriesListFragment = this.MediaDescriptionCompat;
        depositAccountHolder.title.setText(String.format("%s\n%s", new Object[]{getbaseaddress.IconCompatParcelizer, getbaseaddress.read}));
        String str = getbaseaddress.MediaBrowserCompat$CustomActionResultReceiver;
        depositAccountHolder.nickname.setText(str);
        depositAccountHolder.nickname.setVisibility((str == null || str.isEmpty()) ? 8 : 0);
        depositAccountHolder.radioButton.setChecked(z);
        depositAccountHolder.radioButton.setClickable(false);
        depositAccountHolder.Keep.setOnClickListener(new getScanBillerInfo(fragmentBuilder_BindCategoriesListFragment, i));
    }

    public DepositAccountsAdapter(Context context, List<getBaseAddress> list, FragmentBuilder_BindCategoriesListFragment<getBaseAddress> fragmentBuilder_BindCategoriesListFragment) {
        this.MediaMetadataCompat = context;
        this.write = list;
        this.read = fragmentBuilder_BindCategoriesListFragment;
        MediaBrowserCompat$ItemReceiver(true);
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public final long MediaBrowserCompat$ItemReceiver(int i) {
        return (long) this.write.get(i).write.hashCode();
    }

    public static class DepositAccountHolder extends RecyclerView.setContentView {
        View Keep;
        @BindView
        TextView nickname;
        @BindView
        RadioButton radioButton;
        @BindView
        TextView title;

        DepositAccountHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.Keep = view;
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new DepositAccountHolder(LayoutInflater.from(this.MediaMetadataCompat).inflate(R.layout.f82572131493483, viewGroup, false));
    }
}
