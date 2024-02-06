package com.scb.phone.view.adapter.landingpage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.asksira.loopingviewpager.LoopingViewPager;
import com.p032rd.PageIndicatorView;
import com.scb.phone.R;
import com.scb.phone.view.custom.RectangleRelativeLayout;
import com.scb.phone.view.custom.common.DefaultButton;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import p040o.C7112xb25efb72;
import p040o.DealsService;
import p040o.DebitCardATMService;
import p040o.DebitCardService;
import p040o.FragmentBuilder_BindCurrentAddressFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.ScriptGroup;
import p040o.ScriptIntrinsic;
import p040o.activateDebitCard;
import p040o.closeAccount;
import p040o.confirmDealsBuy;
import p040o.debitCardBlockStatus;
import p040o.debitCardLimit;
import p040o.debitCardResetPin;
import p040o.debitCardsSummary;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.downloadPDF;
import p040o.ensureAnimationInfo;
import p040o.entryRemoved;
import p040o.evictAll;
import p040o.getArguments;
import p040o.getCreditCardStatement;
import p040o.getDebitCardActivationLandingData;
import p040o.getDebitCardLandingData;
import p040o.getGeoDataClient;
import p040o.getIntroductions;
import p040o.getNextTransition;
import p040o.getText;
import p040o.getUnbilled;
import p040o.isSupportFragmentClass;
import p040o.onCheckBoxClick;
import p040o.onStart;
import p040o.parseChars;
import p040o.postUserProfile;
import p040o.put;
import p040o.putDebitCardLimit;
import p040o.setLastBaselineToBottomHeight;
import p040o.setLocale;
import p040o.setupDialog;
import p040o.show;
import p040o.validateHER2K;
import p040o.verifyDebitCard;

public class TileAdapter extends RecyclerView.IconCompatParcelizer<BaseHolder> implements ScriptGroup.C1272IO<BaseHolder>, getDebitCardLandingData, evictAll {
    public final FragmentBuilder_BindCurrentAddressFragment MediaBrowserCompat$ItemReceiver;
    private boolean MediaBrowserCompat$MediaItem = false;
    private View MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final TileAdapter$MediaBrowserCompat$MediaItem f3066x50fd9e4a;
    public final List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> MediaDescriptionCompat = new ArrayList();
    private RecyclerView MediaMetadataCompat;
    private boolean MediaSessionCompat$QueueItem = false;
    private final TileAdapter$MediaSessionCompat$QueueItem MediaSessionCompat$ResultReceiverWrapper;
    private final TileAdapter$MediaSessionCompat$QueueItem MediaSessionCompat$Token;
    private View ParcelableVolumeInfo;
    private View RatingCompat;
    public entryRemoved read;
    public getDebitCardActivationLandingData write = new getDebitCardActivationLandingData();

    public final /* bridge */ /* synthetic */ ScriptIntrinsic write(int i) {
        return null;
    }

    public class LearnMoreHolder_ViewBinding extends BaseHolder_ViewBinding {
        private LearnMoreHolder write;

        public LearnMoreHolder_ViewBinding(LearnMoreHolder learnMoreHolder, View view) {
            super(learnMoreHolder, view);
            this.write = learnMoreHolder;
            learnMoreHolder.backgroundImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_tile_background, "field 'backgroundImageView'", ImageView.class);
        }

        public final void read() {
            LearnMoreHolder learnMoreHolder = this.write;
            if (learnMoreHolder != null) {
                this.write = null;
                learnMoreHolder.backgroundImageView = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class BaseHolder_ViewBinding implements Unbinder {
        private BaseHolder MediaBrowserCompat$CustomActionResultReceiver;

        public BaseHolder_ViewBinding(BaseHolder baseHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = baseHolder;
            baseHolder.rectangleRelativeLayout = (RectangleRelativeLayout) onStart.IconCompatParcelizer(view, R.id.rectangle_relative_layout, "field 'rectangleRelativeLayout'", RectangleRelativeLayout.class);
        }

        public void read() {
            BaseHolder baseHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (baseHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                baseHolder.rectangleRelativeLayout = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class DemoHolder_ViewBinding extends BaseHolder_ViewBinding {
        private DemoHolder IconCompatParcelizer;

        public DemoHolder_ViewBinding(DemoHolder demoHolder, View view) {
            super(demoHolder, view);
            this.IconCompatParcelizer = demoHolder;
            demoHolder.backgroundImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_tile_background, "field 'backgroundImageView'", ImageView.class);
            demoHolder.descTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_tile_text, "field 'descTextView'", TextView.class);
            demoHolder.iconImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_tile_icon, "field 'iconImageView'", ImageView.class);
        }

        public final void read() {
            DemoHolder demoHolder = this.IconCompatParcelizer;
            if (demoHolder != null) {
                this.IconCompatParcelizer = null;
                demoHolder.backgroundImageView = null;
                demoHolder.descTextView = null;
                demoHolder.iconImageView = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class GroupHolder_ViewBinding extends BaseHolder_ViewBinding {
        private GroupHolder write;

        public GroupHolder_ViewBinding(GroupHolder groupHolder, View view) {
            super(groupHolder, view);
            this.write = groupHolder;
            groupHolder.backgroundImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_tile_background, "field 'backgroundImageView'", ImageView.class);
            groupHolder.placeHolderView = onStart.IconCompatParcelizer(view, R.id.landing_icon_place_holder, "field 'placeHolderView'");
            groupHolder.iconImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_tile_icon, "field 'iconImageView'", ImageView.class);
            groupHolder.descTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_tile_text, "field 'descTextView'", TextView.class);
        }

        public final void read() {
            GroupHolder groupHolder = this.write;
            if (groupHolder != null) {
                this.write = null;
                groupHolder.backgroundImageView = null;
                groupHolder.placeHolderView = null;
                groupHolder.iconImageView = null;
                groupHolder.descTextView = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class NtbScbCustomerHolder_ViewBinding extends BaseHolder_ViewBinding {
        private NtbScbCustomerHolder MediaBrowserCompat$CustomActionResultReceiver;

        public NtbScbCustomerHolder_ViewBinding(NtbScbCustomerHolder ntbScbCustomerHolder, View view) {
            super(ntbScbCustomerHolder, view);
            this.MediaBrowserCompat$CustomActionResultReceiver = ntbScbCustomerHolder;
            ntbScbCustomerHolder.nonScbCustomer = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.non_scb_customer, "field 'nonScbCustomer'", DefaultButton.class);
        }

        public final void read() {
            NtbScbCustomerHolder ntbScbCustomerHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (ntbScbCustomerHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                ntbScbCustomerHolder.nonScbCustomer = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ShortcutHolder_ViewBinding extends BaseHolder_ViewBinding {
        private ShortcutHolder IconCompatParcelizer;

        public ShortcutHolder_ViewBinding(ShortcutHolder shortcutHolder, View view) {
            super(shortcutHolder, view);
            this.IconCompatParcelizer = shortcutHolder;
            shortcutHolder.backgroundImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_tile_background, "field 'backgroundImageView'", ImageView.class);
            shortcutHolder.descTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_tile_text, "field 'descTextView'", TextView.class);
            shortcutHolder.iconImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_tile_icon, "field 'iconImageView'", ImageView.class);
        }

        public final void read() {
            ShortcutHolder shortcutHolder = this.IconCompatParcelizer;
            if (shortcutHolder != null) {
                this.IconCompatParcelizer = null;
                shortcutHolder.backgroundImageView = null;
                shortcutHolder.descTextView = null;
                shortcutHolder.iconImageView = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class PredictiveHolder_ViewBinding extends BaseHolder_ViewBinding {
        private PredictiveHolder IconCompatParcelizer;

        public PredictiveHolder_ViewBinding(PredictiveHolder predictiveHolder, View view) {
            super(predictiveHolder, view);
            this.IconCompatParcelizer = predictiveHolder;
            predictiveHolder.backgroundImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_tile_background, "field 'backgroundImageView'", ImageView.class);
            predictiveHolder.predictiveLine1TextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_predictive_line_1, "field 'predictiveLine1TextView'", TextView.class);
            predictiveHolder.predictiveLine2TextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_predictive_line_2, "field 'predictiveLine2TextView'", TextView.class);
            predictiveHolder.iconImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_tile_icon, "field 'iconImageView'", ImageView.class);
        }

        public final void read() {
            PredictiveHolder predictiveHolder = this.IconCompatParcelizer;
            if (predictiveHolder != null) {
                this.IconCompatParcelizer = null;
                predictiveHolder.backgroundImageView = null;
                predictiveHolder.predictiveLine1TextView = null;
                predictiveHolder.predictiveLine2TextView = null;
                predictiveHolder.iconImageView = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class AddShortcutHolder_ViewBinding extends BaseHolder_ViewBinding {
        private AddShortcutHolder IconCompatParcelizer;

        public AddShortcutHolder_ViewBinding(AddShortcutHolder addShortcutHolder, View view) {
            super(addShortcutHolder, view);
            this.IconCompatParcelizer = addShortcutHolder;
            addShortcutHolder.emptyCellHorizontal = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_empty_cell_h, "field 'emptyCellHorizontal'", LinearLayout.class);
            addShortcutHolder.emptyCellVertical = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_empty_cell_v, "field 'emptyCellVertical'", RelativeLayout.class);
            addShortcutHolder.labelTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_label, "field 'labelTextView'", TextView.class);
        }

        public final void read() {
            AddShortcutHolder addShortcutHolder = this.IconCompatParcelizer;
            if (addShortcutHolder != null) {
                this.IconCompatParcelizer = null;
                addShortcutHolder.emptyCellHorizontal = null;
                addShortcutHolder.emptyCellVertical = null;
                addShortcutHolder.labelTextView = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class BannerViewHolder_ViewBinding extends BaseHolder_ViewBinding {
        private BannerViewHolder MediaBrowserCompat$ItemReceiver;

        public BannerViewHolder_ViewBinding(BannerViewHolder bannerViewHolder, View view) {
            super(bannerViewHolder, view);
            this.MediaBrowserCompat$ItemReceiver = bannerViewHolder;
            bannerViewHolder.viewPagerBanners = (LoopingViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_banners, "field 'viewPagerBanners'", LoopingViewPager.class);
            bannerViewHolder.layoutIndicator = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_indicator, "field 'layoutIndicator'", ViewGroup.class);
            bannerViewHolder.indicator = (PageIndicatorView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'indicator'", PageIndicatorView.class);
        }

        public final void read() {
            BannerViewHolder bannerViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (bannerViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                bannerViewHolder.viewPagerBanners = null;
                bannerViewHolder.layoutIndicator = null;
                bannerViewHolder.indicator = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class StaticShortcutHolder_ViewBinding extends BaseHolder_ViewBinding {
        private StaticShortcutHolder write;

        public StaticShortcutHolder_ViewBinding(StaticShortcutHolder staticShortcutHolder, View view) {
            super(staticShortcutHolder, view);
            this.write = staticShortcutHolder;
            staticShortcutHolder.newFlagContainer = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fl_new_container, "field 'newFlagContainer'", FrameLayout.class);
            staticShortcutHolder.backgroundImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_tile_background, "field 'backgroundImageView'", ImageView.class);
            staticShortcutHolder.descTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.landing_tile_text, "field 'descTextView'", TextView.class);
        }

        public final void read() {
            StaticShortcutHolder staticShortcutHolder = this.write;
            if (staticShortcutHolder != null) {
                this.write = null;
                staticShortcutHolder.newFlagContainer = null;
                staticShortcutHolder.backgroundImageView = null;
                staticShortcutHolder.descTextView = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer(RecyclerView.setContentView setcontentview, int i) {
        BaseHolder baseHolder = (BaseHolder) setcontentview;
        if (!(this.MediaSessionCompat$Token == null || this.MediaSessionCompat$ResultReceiverWrapper == null)) {
            if (baseHolder.PlaybackStateCompat.ExpandedMenuView == setLocale.STATIC_SHORTCUT) {
                this.MediaSessionCompat$Token.IconCompatParcelizer();
            } else {
                this.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer();
            }
        }
        return baseHolder.PlaybackStateCompat.setContentView;
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ((BaseHolder) setcontentview).MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat.get(i));
    }

    public TileAdapter(View view, TileAdapter$MediaBrowserCompat$MediaItem tileAdapter$MediaBrowserCompat$MediaItem, FragmentBuilder_BindCurrentAddressFragment fragmentBuilder_BindCurrentAddressFragment, TileAdapter$MediaSessionCompat$QueueItem tileAdapter$MediaSessionCompat$QueueItem, TileAdapter$MediaSessionCompat$QueueItem tileAdapter$MediaSessionCompat$QueueItem2) {
        this.ParcelableVolumeInfo = view;
        this.f3066x50fd9e4a = tileAdapter$MediaBrowserCompat$MediaItem;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindCurrentAddressFragment;
        this.MediaSessionCompat$ResultReceiverWrapper = tileAdapter$MediaSessionCompat$QueueItem;
        this.MediaSessionCompat$Token = tileAdapter$MediaSessionCompat$QueueItem2;
        MediaBrowserCompat$ItemReceiver(true);
    }

    public final void MediaBrowserCompat$ItemReceiver(List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list) {
        this.MediaDescriptionCompat.clear();
        this.MediaDescriptionCompat.addAll(list);
        if (this.MediaSessionCompat$QueueItem) {
            this.MediaDescriptionCompat.add(new write());
        }
        this.IconCompatParcelizer.write();
    }

    public final void write(boolean z) {
        isSupportFragmentClass issupportfragmentclass;
        this.MediaSessionCompat$QueueItem = z;
        show show = new show(this.MediaDescriptionCompat);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, putDebitCardLimit.MediaBrowserCompat$CustomActionResultReceiver));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        boolean z2 = true;
        if (z) {
            if (!(issupportfragmentclass.IconCompatParcelizer != null)) {
                this.MediaDescriptionCompat.add(new write());
                this.IconCompatParcelizer.write();
                return;
            }
        }
        if (!z) {
            if (issupportfragmentclass.IconCompatParcelizer == null) {
                z2 = false;
            }
            if (z2) {
                List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list = this.MediaDescriptionCompat;
                T t = issupportfragmentclass.IconCompatParcelizer;
                if (t != null) {
                    list.remove(t);
                    this.IconCompatParcelizer.write();
                    return;
                }
                throw new NoSuchElementException("No value present");
            }
        }
    }

    public static /* synthetic */ boolean IconCompatParcelizer(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        return discardoldlogfiles_mediabrowsercompat_itemreceiver instanceof write;
    }

    public final void write(RecyclerView recyclerView) {
        super.write(recyclerView);
        this.MediaMetadataCompat = recyclerView;
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView) {
        super.MediaBrowserCompat$ItemReceiver(recyclerView);
        this.MediaMetadataCompat = null;
    }

    public final int IconCompatParcelizer() {
        return this.MediaDescriptionCompat.size();
    }

    public final long MediaBrowserCompat$ItemReceiver(int i) {
        return (long) this.MediaDescriptionCompat.get(i).hashCode();
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (this.MediaDescriptionCompat.get(i) instanceof write) {
            return -2;
        }
        return this.MediaDescriptionCompat.get(i).ExpandedMenuView.ordinal();
    }

    public final void write(int i, int i2) {
        if (i != i2 && !this.MediaBrowserCompat$MediaItem) {
            discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver = this.MediaDescriptionCompat.get(i);
            discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver2 = this.MediaDescriptionCompat.get(i2);
            if (discardoldlogfiles_mediabrowsercompat_itemreceiver.ExpandedMenuView == setLocale.STATIC_SHORTCUT && discardoldlogfiles_mediabrowsercompat_itemreceiver2.ExpandedMenuView == setLocale.STATIC_SHORTCUT) {
                this.MediaDescriptionCompat.add(i2, this.MediaDescriptionCompat.remove(i));
                show show = new show(this.MediaDescriptionCompat);
                downloadPDF downloadpdf = downloadPDF.write;
                this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat((List) new show(show.write, new getNextTransition(show.IconCompatParcelizer, downloadpdf)).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
                    /*  JADX ERROR: Method generation error
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    /*  JADX ERROR: Method generation error: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    /*  JADX ERROR: Method generation error: null
                        java.util.ConcurrentModificationException
                        	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1660)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.insertDecompilationProblems(ClassGen.java:327)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:301)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    public final /* synthetic */ java.lang.Object read(
/*
Method generation error in method: o.setupDialog.1.read():java.lang.Object, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                }, new ensureAnimationInfo<List<T>, T>() {
                    /*  JADX ERROR: Method generation error
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    /*  JADX ERROR: Method generation error: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    /*  JADX ERROR: Method generation error: null
                        java.util.ConcurrentModificationException
                        	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1660)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.insertDecompilationProblems(ClassGen.java:327)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:301)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(
/*
Method generation error in method: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                })));
                return;
            }
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver.setBackgroundResource, discardoldlogfiles_mediabrowsercompat_itemreceiver2.setBackgroundResource);
            ArrayList arrayList = new ArrayList(this.MediaDescriptionCompat);
            Collections.swap(arrayList, i, i2);
            MediaBrowserCompat$ItemReceiver((List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver>) arrayList);
            getDebitCardActivationLandingData getdebitcardactivationlandingdata = this.write;
            getdebitcardactivationlandingdata.read.add(new C7112xb25efb72(i, i2));
        }
    }

    public final boolean read(int i, int i2) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.RatingCompat.getLocationOnScreen(iArr);
        this.ParcelableVolumeInfo.getLocationOnScreen(iArr2);
        boolean z = iArr[1] + this.RatingCompat.getHeight() >= iArr2[1] && iArr[0] + (this.RatingCompat.getWidth() / 2) > this.ParcelableVolumeInfo.getWidth() / 4 && iArr[0] + (this.RatingCompat.getWidth() / 2) < (this.ParcelableVolumeInfo.getWidth() / 4) * 3;
        this.MediaBrowserCompat$MediaItem = z;
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(z);
        if (this.MediaDescriptionCompat.get(i).ExpandedMenuView == setLocale.STATIC_SHORTCUT) {
            this.f3066x50fd9e4a.MediaBrowserCompat$CustomActionResultReceiver(!this.MediaBrowserCompat$MediaItem);
        }
        if (this.MediaBrowserCompat$MediaItem) {
            return false;
        }
        if (this.MediaDescriptionCompat.get(i).ExpandedMenuView == setLocale.STATIC_SHORTCUT) {
            if (this.MediaDescriptionCompat.get(i2).ExpandedMenuView != setLocale.STATIC_SHORTCUT || !this.MediaDescriptionCompat.get(i2).setContentView) {
                return false;
            }
            return true;
        } else if (this.MediaDescriptionCompat.get(i2).ExpandedMenuView == setLocale.STATIC_SHORTCUT || !this.MediaDescriptionCompat.get(i2).setContentView) {
            return false;
        } else {
            return true;
        }
    }

    public final void IconCompatParcelizer(int i) {
        this.RatingCompat = this.MediaMetadataCompat.AppCompatActivity.MediaBrowserCompat$CustomActionResultReceiver(i);
        View view = this.ParcelableVolumeInfo;
        if (view != null) {
            view.setVisibility(0);
        }
        if (this.MediaDescriptionCompat.get(i).ExpandedMenuView != setLocale.STATIC_SHORTCUT) {
            this.f3066x50fd9e4a.MediaBrowserCompat$CustomActionResultReceiver(false);
        }
        int height = this.MediaMetadataCompat.getHeight();
        View view2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = height;
            this.MediaBrowserCompat$SearchResultReceiver.setLayoutParams(layoutParams);
        }
    }

    public final void read(int i) {
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver = this.MediaDescriptionCompat.get(i);
        if (this.MediaBrowserCompat$MediaItem) {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(false);
            if (discardoldlogfiles_mediabrowsercompat_itemreceiver.ExpandedMenuView != setLocale.STATIC_SHORTCUT || !discardoldlogfiles_mediabrowsercompat_itemreceiver.AppCompatDelegateImpl$ListMenuDecorView) {
                this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat(discardoldlogfiles_mediabrowsercompat_itemreceiver);
            } else {
                ArrayList arrayList = new ArrayList(this.MediaDescriptionCompat);
                arrayList.remove(discardoldlogfiles_mediabrowsercompat_itemreceiver);
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem((List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver>) arrayList);
            }
        }
        this.MediaBrowserCompat$MediaItem = false;
        this.RatingCompat = null;
        this.f3066x50fd9e4a.MediaBrowserCompat$CustomActionResultReceiver(true);
        View view = this.ParcelableVolumeInfo;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = 0;
            this.MediaBrowserCompat$SearchResultReceiver.setLayoutParams(layoutParams);
        }
    }

    public final int MediaBrowserCompat$SearchResultReceiver(int i) {
        return this.MediaDescriptionCompat.get(i).setPadding;
    }

    public static abstract class BaseHolder extends validateHER2K {
        public TileAdapter$MediaBrowserCompat$SearchResultReceiver<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> AlertController$RecycleListView;
        public discardOldLogFiles$MediaBrowserCompat$ItemReceiver PlaybackStateCompat;
        @BindView
        RectangleRelativeLayout rectangleRelativeLayout;

        BaseHolder(ViewGroup viewGroup, int i, TileAdapter$MediaBrowserCompat$SearchResultReceiver<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> tileAdapter$MediaBrowserCompat$SearchResultReceiver) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
            ButterKnife.IconCompatParcelizer(this, this.write);
            this.AlertController$RecycleListView = tileAdapter$MediaBrowserCompat$SearchResultReceiver;
            this.write.setOnClickListener(new debitCardBlockStatus(this));
        }

        /* access modifiers changed from: package-private */
        public void MediaBrowserCompat$CustomActionResultReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
            this.PlaybackStateCompat = discardoldlogfiles_mediabrowsercompat_itemreceiver;
            RectangleRelativeLayout rectangleRelativeLayout2 = this.rectangleRelativeLayout;
            if (rectangleRelativeLayout2 != null) {
                rectangleRelativeLayout2.setSpanSize(discardoldlogfiles_mediabrowsercompat_itemreceiver.setPadding);
            }
        }
    }

    static class RatingCompat extends BaseHolder {
        RatingCompat(ViewGroup viewGroup) {
            super(viewGroup, R.layout.f83172131493543, (TileAdapter$MediaBrowserCompat$SearchResultReceiver<discardOldLogFiles$MediaBrowserCompat$ItemReceiver>) null);
            this.write.setOnClickListener((View.OnClickListener) null);
        }
    }

    static class LearnMoreHolder extends BaseHolder {
        @BindView
        ImageView backgroundImageView;

        LearnMoreHolder(ViewGroup viewGroup, TileAdapter$MediaBrowserCompat$SearchResultReceiver<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> tileAdapter$MediaBrowserCompat$SearchResultReceiver) {
            super(viewGroup, R.layout.f83162131493542, tileAdapter$MediaBrowserCompat$SearchResultReceiver);
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
            super.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
        }
    }

    static class PredictiveHolder extends BaseHolder {
        private IconCompatParcelizer Keep = new IconCompatParcelizer(this.backgroundImageView, (View) null);
        @BindView
        ImageView backgroundImageView;
        @BindView
        ImageView iconImageView;
        @BindView
        TextView predictiveLine1TextView;
        @BindView
        TextView predictiveLine2TextView;
        private MediaDescriptionCompat setHasDecor = new MediaDescriptionCompat(this.iconImageView);

        PredictiveHolder(ViewGroup viewGroup, TileAdapter$MediaBrowserCompat$SearchResultReceiver<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> tileAdapter$MediaBrowserCompat$SearchResultReceiver) {
            super(viewGroup, R.layout.f83182131493544, tileAdapter$MediaBrowserCompat$SearchResultReceiver);
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
            super.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
            this.setHasDecor.write(discardoldlogfiles_mediabrowsercompat_itemreceiver);
            this.predictiveLine1TextView.setMaxLines(1);
            this.predictiveLine1TextView.setLines(1);
            if (!TextUtils.isEmpty(this.PlaybackStateCompat.ListMenuItemView) && !TextUtils.isEmpty(this.PlaybackStateCompat.setForceShowIcon)) {
                this.predictiveLine1TextView.setText(this.PlaybackStateCompat.ListMenuItemView);
                this.predictiveLine2TextView.setText(this.PlaybackStateCompat.setForceShowIcon);
                this.predictiveLine2TextView.setVisibility(0);
            } else if (!TextUtils.isEmpty(this.PlaybackStateCompat.ListMenuItemView)) {
                this.predictiveLine1TextView.setText(this.PlaybackStateCompat.ListMenuItemView);
                this.predictiveLine1TextView.setGravity(17);
                this.predictiveLine1TextView.setMaxLines(2);
                this.predictiveLine1TextView.setLines(2);
                this.predictiveLine2TextView.setVisibility(8);
            }
            this.Keep.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
        }
    }

    static class MediaMetadataCompat extends BaseHolder {
        MediaMetadataCompat(ViewGroup viewGroup, TileAdapter$MediaBrowserCompat$SearchResultReceiver<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> tileAdapter$MediaBrowserCompat$SearchResultReceiver) {
            super(viewGroup, R.layout.f83192131493545, tileAdapter$MediaBrowserCompat$SearchResultReceiver);
        }
    }

    static class StaticShortcutHolder extends BaseHolder {
        private read Keep = new read(this.descTextView);
        @BindView
        ImageView backgroundImageView;
        @BindView
        TextView descTextView;
        @BindView
        FrameLayout newFlagContainer;
        private IconCompatParcelizer setHasDecor = new IconCompatParcelizer(this.backgroundImageView, (View) null);

        StaticShortcutHolder(ViewGroup viewGroup, TileAdapter$MediaBrowserCompat$SearchResultReceiver<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> tileAdapter$MediaBrowserCompat$SearchResultReceiver) {
            super(viewGroup, R.layout.f83222131493548, tileAdapter$MediaBrowserCompat$SearchResultReceiver);
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
            super.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
            this.Keep.write(discardoldlogfiles_mediabrowsercompat_itemreceiver);
            this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
            this.newFlagContainer.setVisibility(discardoldlogfiles_mediabrowsercompat_itemreceiver.setExpandedFormat ? 0 : 8);
        }
    }

    static class GroupHolder extends BaseHolder {
        private IconCompatParcelizer Keep = new IconCompatParcelizer(this.backgroundImageView, this.placeHolderView);
        @BindView
        ImageView backgroundImageView;
        @BindView
        TextView descTextView;
        @BindView
        ImageView iconImageView;
        @BindView
        View placeHolderView;
        private read setHasDecor = new read(this.descTextView);

        GroupHolder(ViewGroup viewGroup, TileAdapter$MediaBrowserCompat$SearchResultReceiver<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> tileAdapter$MediaBrowserCompat$SearchResultReceiver) {
            super(viewGroup, R.layout.f83142131493540, tileAdapter$MediaBrowserCompat$SearchResultReceiver);
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
            super.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
            this.iconImageView.getContext();
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.iconImageView, discardoldlogfiles_mediabrowsercompat_itemreceiver.AppCompatActivity, (int) this.iconImageView.getResources().getDimension(R.dimen.f72062131165283));
            this.setHasDecor.write(discardoldlogfiles_mediabrowsercompat_itemreceiver);
            this.Keep.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
        }
    }

    static class ShortcutHolder extends BaseHolder {
        private MediaDescriptionCompat AppCompatDialogFragment = new MediaDescriptionCompat(this.iconImageView);
        private read Keep = new read(this.descTextView);
        @BindView
        ImageView backgroundImageView;
        @BindView
        TextView descTextView;
        @BindView
        ImageView iconImageView;
        private IconCompatParcelizer setHasDecor = new IconCompatParcelizer(this.backgroundImageView, (View) null);

        ShortcutHolder(ViewGroup viewGroup, TileAdapter$MediaBrowserCompat$SearchResultReceiver<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> tileAdapter$MediaBrowserCompat$SearchResultReceiver) {
            super(viewGroup, R.layout.f83202131493546, tileAdapter$MediaBrowserCompat$SearchResultReceiver);
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
            super.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
            this.AppCompatDialogFragment.write(discardoldlogfiles_mediabrowsercompat_itemreceiver);
            this.Keep.write(discardoldlogfiles_mediabrowsercompat_itemreceiver);
            this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
        }
    }

    static class DemoHolder extends BaseHolder {
        private read Keep = new read(this.descTextView);
        @BindView
        ImageView backgroundImageView;
        @BindView
        TextView descTextView;
        @BindView
        ImageView iconImageView;
        private MediaDescriptionCompat setContentView = new MediaDescriptionCompat(this.iconImageView);
        private IconCompatParcelizer setHasDecor = new IconCompatParcelizer(this.backgroundImageView, (View) null);

        DemoHolder(ViewGroup viewGroup, TileAdapter$MediaBrowserCompat$SearchResultReceiver<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> tileAdapter$MediaBrowserCompat$SearchResultReceiver) {
            super(viewGroup, R.layout.f83202131493546, tileAdapter$MediaBrowserCompat$SearchResultReceiver);
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
            super.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
            if (discardoldlogfiles_mediabrowsercompat_itemreceiver != null) {
                String str = discardoldlogfiles_mediabrowsercompat_itemreceiver.AppCompatActivity;
                if (!(str == null || str.length() == 0)) {
                    this.setContentView.write(discardoldlogfiles_mediabrowsercompat_itemreceiver);
                }
            }
            this.Keep.write(discardoldlogfiles_mediabrowsercompat_itemreceiver);
            this.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
        }
    }

    static class NtbScbCustomerHolder extends BaseHolder {
        @BindView
        DefaultButton nonScbCustomer;

        NtbScbCustomerHolder(ViewGroup viewGroup, TileAdapter$MediaBrowserCompat$SearchResultReceiver<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> tileAdapter$MediaBrowserCompat$SearchResultReceiver) {
            super(viewGroup, R.layout.f92232131494450, tileAdapter$MediaBrowserCompat$SearchResultReceiver);
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
            super.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
        }
    }

    static class AddShortcutHolder extends BaseHolder {
        @BindView
        LinearLayout emptyCellHorizontal;
        @BindView
        RelativeLayout emptyCellVertical;
        @BindView
        TextView labelTextView;

        AddShortcutHolder(ViewGroup viewGroup, TileAdapter$MediaBrowserCompat$SearchResultReceiver<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> tileAdapter$MediaBrowserCompat$SearchResultReceiver) {
            super(viewGroup, R.layout.f83122131493538, tileAdapter$MediaBrowserCompat$SearchResultReceiver);
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
            super.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
            if (this.PlaybackStateCompat instanceof write) {
                read(0);
                this.labelTextView.setText(R.string.landing_page_static_customize_label);
                return;
            }
            this.labelTextView.setText(R.string.landing_page_personalize);
            if (this.PlaybackStateCompat.setPadding == 1) {
                read(0);
            } else {
                read(1);
            }
        }

        private void read(int i) {
            if (i == 0) {
                this.emptyCellVertical.setVisibility(0);
                this.emptyCellHorizontal.setVisibility(8);
            } else if (i == 1) {
                this.emptyCellVertical.setVisibility(8);
                this.emptyCellHorizontal.setVisibility(0);
            }
        }
    }

    static class MediaDescriptionCompat {
        private ImageView MediaBrowserCompat$ItemReceiver;

        MediaDescriptionCompat(ImageView imageView) {
            this.MediaBrowserCompat$ItemReceiver = imageView;
        }

        public final void write(final discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
            Context context = this.MediaBrowserCompat$ItemReceiver.getContext();
            if (context != null) {
                Drawable drawable = null;
                int i = C57714.read[discardoldlogfiles_mediabrowsercompat_itemreceiver.setTitle.ordinal()];
                if (i == 1) {
                    String str = discardoldlogfiles_mediabrowsercompat_itemreceiver.setHasDecor.PlaybackStateCompat;
                    char c = 65535;
                    int hashCode = str.hashCode();
                    if (hashCode != -486974465) {
                        if (hashCode != 80008848) {
                            if (hashCode == 510594974 && str.equals("REMITTANCE")) {
                                c = 2;
                            }
                        } else if (str.equals("TOPUP")) {
                            c = 0;
                        }
                    } else if (str.equals("BILLPAYMENT")) {
                        c = 1;
                    }
                    if (c == 0 || c == 1) {
                        drawable = setLastBaselineToBottomHeight.write(context, R.drawable.biller_place_holder);
                    } else if (c != 2) {
                        drawable = setLastBaselineToBottomHeight.write(context, R.drawable.bankicon_place_holder);
                    } else {
                        drawable = setLastBaselineToBottomHeight.write(context, R.drawable.bankicon_remittance);
                    }
                } else if (i == 2 || i == 3) {
                    drawable = setLastBaselineToBottomHeight.write(context, R.drawable.biller_place_holder);
                } else if (i == 4) {
                    drawable = setLastBaselineToBottomHeight.write(context, R.drawable.bankicon_place_holder);
                }
                Drawable drawable2 = drawable;
                if (drawable2 != null) {
                    FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, drawable2, this.MediaBrowserCompat$ItemReceiver, discardoldlogfiles_mediabrowsercompat_itemreceiver.AppCompatActivity, context.getResources().getDimensionPixelOffset(R.dimen.f72062131165283), setLastBaselineToBottomHeight.read(context, R.color.f66402131099796));
                } else {
                    FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, discardoldlogfiles_mediabrowsercompat_itemreceiver.AppCompatActivity, (int) context.getResources().getDimension(R.dimen.f72062131165283), (FragmentBuilder_BindEkycFragment) new FragmentBuilder_BindEkycFragment() {
                        public final void MediaBrowserCompat$ItemReceiver() {
                        }

                        public final void MediaBrowserCompat$CustomActionResultReceiver(Exception exc) {
                            Uri parse;
                            Picasso read = Picasso.read();
                            String str = discardOldLogFiles$MediaBrowserCompat$ItemReceiver.this.RatingCompat;
                            if (str != null && (parse = Uri.parse(str)) != null) {
                                read.read.MediaBrowserCompat$ItemReceiver(parse.toString());
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.scb.phone.view.adapter.landingpage.TileAdapter$4 */
    static /* synthetic */ class C57714 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00bf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00cb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00d7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00e3 */
        static {
            /*
                o.getGeoDataClient[] r0 = p040o.getGeoDataClient.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                r1 = 1
                o.getGeoDataClient r2 = p040o.getGeoDataClient.FAVOURITE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.getGeoDataClient r3 = p040o.getGeoDataClient.BILLERPAYMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.getGeoDataClient r4 = p040o.getGeoDataClient.BILLERTOPUP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = read     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.getGeoDataClient r5 = p040o.getGeoDataClient.TRANSFER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                o.parseChars[] r4 = p040o.parseChars.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                MediaBrowserCompat$ItemReceiver = r4
                o.parseChars r5 = p040o.parseChars.ADD_SHORTCUT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x004e }
                o.parseChars r4 = p040o.parseChars.SHORTCUT     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0058 }
                o.parseChars r1 = p040o.parseChars.GROUP     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0062 }
                o.parseChars r1 = p040o.parseChars.STATIC_SHORTCUT     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x006d }
                o.parseChars r1 = p040o.parseChars.SCB     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.parseChars r1 = p040o.parseChars.PREDICTIVE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0083 }
                o.parseChars r1 = p040o.parseChars.LEARN_MORE     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x008f }
                o.parseChars r1 = p040o.parseChars.ERROR     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x009b }
                o.parseChars r1 = p040o.parseChars.EMPTY     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00a7 }
                o.parseChars r1 = p040o.parseChars.PREDICTIVE_TILE_LOADING     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00b3 }
                o.parseChars r1 = p040o.parseChars.STATIC_ERROR     // Catch:{ NoSuchFieldError -> 0x00b3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b3 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b3 }
            L_0x00b3:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00bf }
                o.parseChars r1 = p040o.parseChars.SPLASH     // Catch:{ NoSuchFieldError -> 0x00bf }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bf }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00bf }
            L_0x00bf:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00cb }
                o.parseChars r1 = p040o.parseChars.NTB_SCB_CUSTOMER     // Catch:{ NoSuchFieldError -> 0x00cb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cb }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cb }
            L_0x00cb:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00d7 }
                o.parseChars r1 = p040o.parseChars.NTB_PREDICTIVE     // Catch:{ NoSuchFieldError -> 0x00d7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d7 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d7 }
            L_0x00d7:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00e3 }
                o.parseChars r1 = p040o.parseChars.BANNER     // Catch:{ NoSuchFieldError -> 0x00e3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e3 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e3 }
            L_0x00e3:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00ef }
                o.parseChars r1 = p040o.parseChars.LOADING     // Catch:{ NoSuchFieldError -> 0x00ef }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ef }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ef }
            L_0x00ef:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.adapter.landingpage.TileAdapter.C57714.<clinit>():void");
        }
    }

    static class IconCompatParcelizer {
        View MediaBrowserCompat$CustomActionResultReceiver;
        private ImageView write;

        IconCompatParcelizer(ImageView imageView, View view) {
            this.write = imageView;
            this.MediaBrowserCompat$CustomActionResultReceiver = view;
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(final discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
            if (this.write.getContext() != null) {
                FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(this.write, discardoldlogfiles_mediabrowsercompat_itemreceiver.RatingCompat, (FragmentBuilder_BindEkycFragment) new FragmentBuilder_BindEkycFragment() {
                    public final void MediaBrowserCompat$ItemReceiver() {
                        if (IconCompatParcelizer.this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                            return;
                        }
                        if (discardoldlogfiles_mediabrowsercompat_itemreceiver.ExpandedMenuView == setLocale.GROUP || discardoldlogfiles_mediabrowsercompat_itemreceiver.setTitle == getGeoDataClient.QUICKBALANCE || discardoldlogfiles_mediabrowsercompat_itemreceiver.setTitle == getGeoDataClient.QUICKPROMPTPAY) {
                            IconCompatParcelizer.this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(8);
                        }
                    }

                    public final void MediaBrowserCompat$CustomActionResultReceiver(Exception exc) {
                        Uri parse;
                        Picasso read2 = Picasso.read();
                        String str = discardoldlogfiles_mediabrowsercompat_itemreceiver.RatingCompat;
                        if (str != null && (parse = Uri.parse(str)) != null) {
                            read2.read.MediaBrowserCompat$ItemReceiver(parse.toString());
                        }
                    }
                });
                if (discardoldlogfiles_mediabrowsercompat_itemreceiver.AppCompatViewInflater != 0) {
                    this.write.setBackgroundResource(discardoldlogfiles_mediabrowsercompat_itemreceiver.AppCompatViewInflater);
                }
            }
        }
    }

    static class read {
        private TextView MediaBrowserCompat$CustomActionResultReceiver;

        public read(TextView textView) {
            this.MediaBrowserCompat$CustomActionResultReceiver = textView;
        }

        /* access modifiers changed from: package-private */
        public final void write(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver.setText(discardoldlogfiles_mediabrowsercompat_itemreceiver.ListMenuItemView);
            if (discardoldlogfiles_mediabrowsercompat_itemreceiver.setItemInvoker != 0) {
                TextView textView = this.MediaBrowserCompat$CustomActionResultReceiver;
                textView.setTextColor(setLastBaselineToBottomHeight.read(textView.getContext(), discardoldlogfiles_mediabrowsercompat_itemreceiver.setItemInvoker));
            }
        }
    }

    static class write extends discardOldLogFiles$MediaBrowserCompat$ItemReceiver {
        write() {
            this.setBackgroundResource = -2;
            this.setPadding = 3;
            this.setContentView = false;
            this.AppCompatDelegateImpl$ListMenuDecorView = false;
        }
    }

    static class BannerViewHolder extends BaseHolder implements evictAll {
        @BindView
        PageIndicatorView indicator;
        @BindView
        ViewGroup layoutIndicator;
        @BindView
        LoopingViewPager viewPagerBanners;

        BannerViewHolder(ViewGroup viewGroup, TileAdapter$MediaBrowserCompat$SearchResultReceiver<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> tileAdapter$MediaBrowserCompat$SearchResultReceiver) {
            super(viewGroup, R.layout.f83092131493535, tileAdapter$MediaBrowserCompat$SearchResultReceiver);
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
            final int i;
            super.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
            this.viewPagerBanners.setAdapter(new IconCompatParcelizer(this.write.getContext(), this.PlaybackStateCompat.setGroupDividerEnabled, this.AlertController$RecycleListView));
            LoopingViewPager loopingViewPager = this.viewPagerBanners;
            if (loopingViewPager.getAdapter() instanceof getText) {
                i = ((getText) loopingViewPager.getAdapter()).IconCompatParcelizer();
            } else {
                i = loopingViewPager.getAdapter().getCount();
            }
            int i2 = 8;
            if (i > 0) {
                this.write.setVisibility(0);
                this.indicator.setCount(i);
                this.indicator.setAnimationDuration(0);
                this.viewPagerBanners.addOnPageChangeListener(new ViewPager.MediaMetadataCompat() {
                    public final void onPageScrollStateChanged(int i) {
                    }

                    public final void onPageScrolled(int i, float f, int i2) {
                    }

                    public final void onPageSelected(int i) {
                        BannerViewHolder.this.indicator.setSelected((i - 1) % i);
                    }
                });
                ViewGroup viewGroup = this.layoutIndicator;
                if (i < 10) {
                    i2 = 0;
                }
                viewGroup.setVisibility(i2);
                return;
            }
            this.write.setVisibility(8);
        }

        @put(read = entryRemoved.write.ON_RESUME)
        public void onResume() {
            onCheckBoxClick.read("onResume", new Object[0]);
            LoopingViewPager loopingViewPager = this.viewPagerBanners;
            if (loopingViewPager != null) {
                loopingViewPager.write.postDelayed(loopingViewPager.IconCompatParcelizer, (long) loopingViewPager.MediaBrowserCompat$ItemReceiver);
            }
        }

        @put(read = entryRemoved.write.ON_PAUSE)
        public void onPause() {
            onCheckBoxClick.read("onPause", new Object[0]);
            LoopingViewPager loopingViewPager = this.viewPagerBanners;
            if (loopingViewPager != null) {
                loopingViewPager.write.removeCallbacks(loopingViewPager.IconCompatParcelizer);
            }
        }

        public static class IconCompatParcelizer extends getText<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> {
            public TileAdapter$MediaBrowserCompat$SearchResultReceiver<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$CustomActionResultReceiver;

            IconCompatParcelizer(Context context, List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list, TileAdapter$MediaBrowserCompat$SearchResultReceiver<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> tileAdapter$MediaBrowserCompat$SearchResultReceiver) {
                super(context, list);
                this.MediaBrowserCompat$CustomActionResultReceiver = tileAdapter$MediaBrowserCompat$SearchResultReceiver;
            }

            public final View MediaBrowserCompat$ItemReceiver() {
                ImageView imageView = new ImageView(this.IconCompatParcelizer);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                return imageView;
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(View view, int i) {
                discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver = (discardOldLogFiles$MediaBrowserCompat$ItemReceiver) this.read.get(i);
                if (view instanceof ImageView) {
                    new IconCompatParcelizer((ImageView) view, (View) null).MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
                }
                view.setOnClickListener(new postUserProfile(this, discardoldlogfiles_mediabrowsercompat_itemreceiver));
            }
        }
    }

    public static /* synthetic */ boolean read(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        return discardoldlogfiles_mediabrowsercompat_itemreceiver.ExpandedMenuView == setLocale.STATIC_SHORTCUT;
    }

    public static /* synthetic */ boolean read(long j, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        return discardoldlogfiles_mediabrowsercompat_itemreceiver.setBackgroundResource == j;
    }

    public static /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(long j, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        return discardoldlogfiles_mediabrowsercompat_itemreceiver.setBackgroundResource == j;
    }

    public static /* synthetic */ boolean write(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        return discardoldlogfiles_mediabrowsercompat_itemreceiver.ExpandedMenuView != setLocale.ADD_SHORTCUT;
    }

    public static /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        return discardoldlogfiles_mediabrowsercompat_itemreceiver.ExpandedMenuView == setLocale.ADD_SHORTCUT;
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        if (i == -2) {
            return new AddShortcutHolder(viewGroup, new confirmDealsBuy(this));
        }
        switch (C57714.MediaBrowserCompat$ItemReceiver[parseChars.read(i).ordinal()]) {
            case 1:
                return new AddShortcutHolder(viewGroup, new debitCardLimit(this));
            case 2:
                return new ShortcutHolder(viewGroup, new DebitCardService(this));
            case 3:
                return new GroupHolder(viewGroup, new verifyDebitCard(this.MediaBrowserCompat$ItemReceiver));
            case 4:
                return new StaticShortcutHolder(viewGroup, new getUnbilled(this.MediaBrowserCompat$ItemReceiver));
            case 5:
                return new MediaMetadataCompat(viewGroup, new DealsService(this));
            case 6:
                return new PredictiveHolder(viewGroup, new getCreditCardStatement(this));
            case 7:
                return new LearnMoreHolder(viewGroup, new debitCardsSummary(this));
            case 8:
                return new TileAdapter$MediaBrowserCompat$ItemReceiver(viewGroup, new DebitCardATMService(this));
            case 9:
                TileAdapter$MediaBrowserCompat$CustomActionResultReceiver tileAdapter$MediaBrowserCompat$CustomActionResultReceiver = new TileAdapter$MediaBrowserCompat$CustomActionResultReceiver(viewGroup);
                this.MediaBrowserCompat$SearchResultReceiver = tileAdapter$MediaBrowserCompat$CustomActionResultReceiver.write;
                return tileAdapter$MediaBrowserCompat$CustomActionResultReceiver;
            case 10:
                return new RatingCompat(viewGroup);
            case 11:
                return new C5775x55ebd847(viewGroup, new debitCardResetPin(this));
            case 12:
                return new DemoHolder(viewGroup, new getIntroductions(this.MediaBrowserCompat$ItemReceiver));
            case 13:
                return new NtbScbCustomerHolder(viewGroup, new activateDebitCard(this));
            case 14:
                return new PredictiveHolder(viewGroup, new getIntroductions(this.MediaBrowserCompat$ItemReceiver));
            case 15:
                BannerViewHolder bannerViewHolder = new BannerViewHolder(viewGroup, new closeAccount(this.MediaBrowserCompat$ItemReceiver));
                entryRemoved entryremoved = this.read;
                if (entryremoved != null) {
                    entryremoved.IconCompatParcelizer(bannerViewHolder);
                }
                return bannerViewHolder;
            default:
                return new RatingCompat(viewGroup);
        }
    }
}
