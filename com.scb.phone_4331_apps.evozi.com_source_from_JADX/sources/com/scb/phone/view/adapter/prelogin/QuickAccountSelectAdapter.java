package com.scb.phone.view.adapter.prelogin;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import java.util.NoSuchElementException;
import p040o.FragmentBuilder_BindCloseAccountSelectionFragment;
import p040o.getCasaTxnList;
import p040o.getDepositProductInfo;
import p040o.getFixedDetailV2;
import p040o.getFragmentManager;
import p040o.immediateCheckedFuture;
import p040o.instantiate;
import p040o.onStart;
import p040o.showNow;

public final class QuickAccountSelectAdapter extends RecyclerView.IconCompatParcelizer {
    public int MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem = true;
    public FragmentBuilder_BindCloseAccountSelectionFragment MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaDescriptionCompat = false;
    public int MediaMetadataCompat = -1;
    private String MediaSessionCompat$Token;
    private String RatingCompat;
    public List<immediateCheckedFuture> read;
    public long write;

    public class SelectedHolder_ViewBinding extends UnselectedHolder_ViewBinding {
        private SelectedHolder MediaBrowserCompat$ItemReceiver;

        public SelectedHolder_ViewBinding(SelectedHolder selectedHolder, View view) {
            super(selectedHolder, view);
            this.MediaBrowserCompat$ItemReceiver = selectedHolder;
            selectedHolder.checked = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.checked_image_view, "field 'checked'", ImageView.class);
        }

        public final void read() {
            SelectedHolder selectedHolder = this.MediaBrowserCompat$ItemReceiver;
            if (selectedHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                selectedHolder.checked = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class HeaderHolder_ViewBinding implements Unbinder {
        private HeaderHolder IconCompatParcelizer;

        public HeaderHolder_ViewBinding(HeaderHolder headerHolder, View view) {
            this.IconCompatParcelizer = headerHolder;
            headerHolder.mTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_description_text_view, "field 'mTitle'", TextView.class);
        }

        public final void read() {
            HeaderHolder headerHolder = this.IconCompatParcelizer;
            if (headerHolder != null) {
                this.IconCompatParcelizer = null;
                headerHolder.mTitle = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class UnselectedHolder_ViewBinding implements Unbinder {
        private UnselectedHolder IconCompatParcelizer;

        public UnselectedHolder_ViewBinding(UnselectedHolder unselectedHolder, View view) {
            this.IconCompatParcelizer = unselectedHolder;
            unselectedHolder.unchecked = view.findViewById(R.id.unchecked_view);
            unselectedHolder.accountName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_text_view, "field 'accountName'", TextView.class);
            unselectedHolder.accountType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_type_text_view, "field 'accountType'", TextView.class);
            unselectedHolder.container = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_container_linear_layout, "field 'container'", LinearLayout.class);
            unselectedHolder.bottomSeparatorView = onStart.IconCompatParcelizer(view, R.id.bottom_separator, "field 'bottomSeparatorView'");
        }

        public void read() {
            UnselectedHolder unselectedHolder = this.IconCompatParcelizer;
            if (unselectedHolder != null) {
                this.IconCompatParcelizer = null;
                unselectedHolder.unchecked = null;
                unselectedHolder.accountName = null;
                unselectedHolder.accountType = null;
                unselectedHolder.container = null;
                unselectedHolder.bottomSeparatorView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class FooterHolder_ViewBinding implements Unbinder {
        private FooterHolder MediaBrowserCompat$ItemReceiver;

        public FooterHolder_ViewBinding(FooterHolder footerHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = footerHolder;
            footerHolder.mSwitchCompat = (SwitchCompat) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.quick_top_up_switch, "field 'mSwitchCompat'", SwitchCompat.class);
            footerHolder.mSwitchRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.switch_relative_layout, "field 'mSwitchRelativeLayout'", RelativeLayout.class);
            footerHolder.mSwitchTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.switch_text_view, "field 'mSwitchTextView'", TextView.class);
        }

        public final void read() {
            FooterHolder footerHolder = this.MediaBrowserCompat$ItemReceiver;
            if (footerHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                footerHolder.mSwitchCompat = null;
                footerHolder.mSwitchRelativeLayout = null;
                footerHolder.mSwitchTextView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public QuickAccountSelectAdapter(List<immediateCheckedFuture> list, String str, FragmentBuilder_BindCloseAccountSelectionFragment fragmentBuilder_BindCloseAccountSelectionFragment, boolean z, String str2) {
        this.read = list;
        this.MediaSessionCompat$Token = str;
        this.MediaBrowserCompat$SearchResultReceiver = fragmentBuilder_BindCloseAccountSelectionFragment;
        this.MediaDescriptionCompat = z;
        this.RatingCompat = str2;
        this.MediaBrowserCompat$ItemReceiver = list.size() + 2;
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new HeaderHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83812131493607, viewGroup, false));
        }
        if (i == 1) {
            return new SelectedHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83822131493608, viewGroup, false));
        }
        if (i != 2) {
            return new FooterHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83802131493606, viewGroup, false));
        }
        return new UnselectedHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83832131493609, viewGroup, false));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        String str;
        if (setcontentview instanceof HeaderHolder) {
            ((HeaderHolder) setcontentview).mTitle.setText(this.MediaSessionCompat$Token);
        }
        if (setcontentview instanceof FooterHolder) {
            FooterHolder footerHolder = (FooterHolder) setcontentview;
            if (this.MediaDescriptionCompat) {
                footerHolder.mSwitchRelativeLayout.setVisibility(0);
                footerHolder.mSwitchTextView.setText(this.RatingCompat);
                footerHolder.mSwitchRelativeLayout.setOnClickListener(new getCasaTxnList(this, footerHolder));
            } else {
                footerHolder.mSwitchRelativeLayout.setVisibility(8);
            }
        }
        if (setcontentview instanceof UnselectedHolder) {
            UnselectedHolder unselectedHolder = (UnselectedHolder) setcontentview;
            int i2 = i - 1;
            unselectedHolder.accountName.setText(this.read.get(i2).MediaBrowserCompat$ItemReceiver);
            if (TextUtils.isEmpty(this.read.get(i2).PlaybackStateCompat)) {
                str = this.read.get(i2).AppCompatDialogFragment;
            } else {
                str = this.read.get(i2).PlaybackStateCompat;
            }
            unselectedHolder.accountType.setText(str);
            if (!(setcontentview instanceof SelectedHolder)) {
                unselectedHolder.container.setOnClickListener(new getFixedDetailV2(this, i2));
            }
            if (this.MediaBrowserCompat$ItemReceiver - 2 == i) {
                unselectedHolder.bottomSeparatorView.setVisibility(0);
            } else {
                unselectedHolder.bottomSeparatorView.setVisibility(8);
            }
        }
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    class SelectedHolder extends UnselectedHolder {
        @BindView
        ImageView checked;

        SelectedHolder(QuickAccountSelectAdapter quickAccountSelectAdapter, View view) {
            super(view);
        }
    }

    class UnselectedHolder extends RecyclerView.setContentView {
        @BindView
        TextView accountName;
        @BindView
        TextView accountType;
        @BindView
        View bottomSeparatorView;
        @BindView
        LinearLayout container;
        @BindView
        View unchecked;

        UnselectedHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public class FooterHolder extends RecyclerView.setContentView {
        @BindView
        public SwitchCompat mSwitchCompat;
        @BindView
        RelativeLayout mSwitchRelativeLayout;
        @BindView
        TextView mSwitchTextView;

        FooterHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    class HeaderHolder extends RecyclerView.setContentView {
        @BindView
        TextView mTitle;

        HeaderHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final void write(String str) {
        instantiate instantiate;
        if (str != null) {
            int i = 0;
            showNow MediaBrowserCompat$ItemReceiver2 = showNow.MediaBrowserCompat$ItemReceiver(0, this.read.size());
            showNow shownow = new showNow(MediaBrowserCompat$ItemReceiver2.read, new getFragmentManager(MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer, new getDepositProductInfo(this, str)));
            if (shownow.IconCompatParcelizer.hasNext()) {
                instantiate = instantiate.write(shownow.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver());
            } else {
                instantiate = instantiate.write();
            }
            if (instantiate.MediaBrowserCompat$CustomActionResultReceiver) {
                if (instantiate.MediaBrowserCompat$CustomActionResultReceiver) {
                    i = instantiate.write;
                } else {
                    throw new NoSuchElementException("No value present");
                }
            }
            this.MediaMetadataCompat = i;
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (this.MediaBrowserCompat$ItemReceiver - 1 == i) {
            return 3;
        }
        if (i == 0) {
            return 0;
        }
        return i != this.MediaMetadataCompat + 1 ? 2 : 1;
    }
}
