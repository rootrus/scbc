package com.scb.phone.view.adapter.landingpage;

import android.content.Context;
import android.graphics.drawable.Drawable;
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
import com.scb.phone.view.custom.RectangleRelativeLayout;
import p040o.CustomerService;
import p040o.FragmentBuilder_BindCardlessCreditCardSelectorFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.discardOldLogFiles;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.onStart;
import p040o.parseChars;
import p040o.setLastBaselineToBottomHeight;
import p040o.validateHER2K;

public final class ShortcutAdapter extends RecyclerView.IconCompatParcelizer<MyViewHolder> {
    /* access modifiers changed from: private */
    public final FragmentBuilder_BindCardlessCreditCardSelectorFragment MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public discardOldLogFiles MediaMetadataCompat;
    private Drawable read;
    private final Context write;

    public class MyViewHolder_ViewBinding implements Unbinder {
        private MyViewHolder IconCompatParcelizer;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.IconCompatParcelizer = myViewHolder;
            myViewHolder.backgroundImageView = (ImageView) onStart.IconCompatParcelizer(view, R.id.landing_tile_background, "field 'backgroundImageView'", ImageView.class);
            myViewHolder.descTextView = (TextView) onStart.IconCompatParcelizer(view, R.id.landing_tile_text, "field 'descTextView'", TextView.class);
            myViewHolder.iconImageView = (ImageView) onStart.IconCompatParcelizer(view, R.id.landing_tile_icon, "field 'iconImageView'", ImageView.class);
            myViewHolder.rectangleRelativeLayout = (RectangleRelativeLayout) onStart.IconCompatParcelizer(view, R.id.rectangle_relative_layout, "field 'rectangleRelativeLayout'", RectangleRelativeLayout.class);
        }

        public final void read() {
            MyViewHolder myViewHolder = this.IconCompatParcelizer;
            if (myViewHolder != null) {
                this.IconCompatParcelizer = null;
                myViewHolder.backgroundImageView = null;
                myViewHolder.descTextView = null;
                myViewHolder.iconImageView = null;
                myViewHolder.rectangleRelativeLayout = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        MyViewHolder myViewHolder = (MyViewHolder) setcontentview;
        myViewHolder.setHasDecor = i;
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver2 = this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(i);
        if (myViewHolder.iconImageView != null) {
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.write, this.read, myViewHolder.iconImageView, MediaBrowserCompat$ItemReceiver2.AppCompatActivity, this.write.getResources().getDimensionPixelOffset(R.dimen.f72062131165283), setLastBaselineToBottomHeight.read(this.write, R.color.f66402131099796));
        }
        if (!(myViewHolder.descTextView == null || MediaBrowserCompat$ItemReceiver2.ListMenuItemView == null || MediaBrowserCompat$ItemReceiver2.ListMenuItemView.isEmpty())) {
            myViewHolder.descTextView.setText(MediaBrowserCompat$ItemReceiver2.ListMenuItemView);
        }
        if (myViewHolder.rectangleRelativeLayout != null) {
            myViewHolder.rectangleRelativeLayout.setSpanSize(MediaBrowserCompat$ItemReceiver2.setPadding);
        }
    }

    public ShortcutAdapter(Context context, discardOldLogFiles discardoldlogfiles, FragmentBuilder_BindCardlessCreditCardSelectorFragment fragmentBuilder_BindCardlessCreditCardSelectorFragment) {
        this.write = context;
        this.MediaMetadataCompat = discardoldlogfiles;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindCardlessCreditCardSelectorFragment;
        this.read = setLastBaselineToBottomHeight.write(context, R.drawable.biller_place_holder);
        MediaBrowserCompat$ItemReceiver(true);
    }

    public final long MediaBrowserCompat$ItemReceiver(int i) {
        return this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(i).MediaMetadataCompat;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(i).ExpandedMenuView.ordinal();
    }

    public final int IconCompatParcelizer() {
        return this.MediaMetadataCompat.read.size();
    }

    public class MyViewHolder extends validateHER2K {
        @BindView
        ImageView backgroundImageView;
        @BindView
        TextView descTextView;
        @BindView
        ImageView iconImageView;
        @BindView
        RectangleRelativeLayout rectangleRelativeLayout;
        public int setHasDecor;

        MyViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, this.write);
            view.setOnClickListener(new CustomerService(this));
        }
    }

    /* renamed from: com.scb.phone.view.adapter.landingpage.ShortcutAdapter$3 */
    public static /* synthetic */ class C57703 {
        public static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:1|2)|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0023 */
        static {
            /*
                o.setLocale[] r0 = p040o.setLocale.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                r1 = 1
                o.setLocale r2 = p040o.setLocale.SHORTCUT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                o.parseChars[] r0 = p040o.parseChars.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                o.parseChars r2 = p040o.parseChars.SHORTCUT     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x002e }
                o.parseChars r1 = p040o.parseChars.HEADER     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.adapter.landingpage.ShortcutAdapter.C57703.<clinit>():void");
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (C57703.write[parseChars.read(i).ordinal()] != 1) {
            view = from.inflate(R.layout.f82992131493525, viewGroup, false);
        } else {
            view = from.inflate(R.layout.f83102131493536, viewGroup, false);
        }
        return new MyViewHolder(view);
    }
}
