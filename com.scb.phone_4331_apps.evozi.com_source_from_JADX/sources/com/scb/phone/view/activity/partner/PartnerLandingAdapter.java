package com.scb.phone.view.activity.partner;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.Unbinder;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.p032rd.PageIndicatorView;
import com.scb.phone.R;
import com.scb.phone.data.network.service.registration.RegistrationService;
import com.scb.phone.data.network.service.registration.RegistrationWithApiAuthService;
import com.scb.phone.view.adapter.BaseHighlightAdapter;
import com.scb.phone.view.custom.InfiniteRecyclerView;
import java.util.ArrayList;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_Session;
import p040o.C6489x271d6c26;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindCreditCardFragment;
import p040o.HmlNationalIdActivity;
import p040o.HmlPinActivity;
import p040o.isCrashed;
import p040o.isReset;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.setApp;
import p040o.setCrashed;
import p040o.setGenerator;
import p040o.setIdentifier;

public final class PartnerLandingAdapter extends RecyclerView.IconCompatParcelizer<write> {
    private PartnerLandingAdapter$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    public List<? extends setGenerator> read = HmlNationalIdActivity.IconCompatParcelizer;

    public final class PartnerGroupTitleHolder_ViewBinding implements Unbinder {
        private PartnerGroupTitleHolder IconCompatParcelizer;

        public PartnerGroupTitleHolder_ViewBinding(PartnerGroupTitleHolder partnerGroupTitleHolder, View view) {
            this.IconCompatParcelizer = partnerGroupTitleHolder;
            partnerGroupTitleHolder.tvGroupTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'tvGroupTitle'", TextView.class);
        }

        public final void read() {
            PartnerGroupTitleHolder partnerGroupTitleHolder = this.IconCompatParcelizer;
            if (partnerGroupTitleHolder != null) {
                this.IconCompatParcelizer = null;
                partnerGroupTitleHolder.tvGroupTitle = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class PartnerHorizontalGroup_ViewBinding implements Unbinder {
        private PartnerHorizontalGroup write;

        public PartnerHorizontalGroup_ViewBinding(PartnerHorizontalGroup partnerHorizontalGroup, View view) {
            this.write = partnerHorizontalGroup;
            partnerHorizontalGroup.rvPartnerHorizontal = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_partner_horizontal, "field 'rvPartnerHorizontal'", RecyclerView.class);
        }

        public final void read() {
            PartnerHorizontalGroup partnerHorizontalGroup = this.write;
            if (partnerHorizontalGroup != null) {
                this.write = null;
                partnerHorizontalGroup.rvPartnerHorizontal = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class PartnerHighlightHolder_ViewBinding implements Unbinder {
        private PartnerHighlightHolder IconCompatParcelizer;

        public PartnerHighlightHolder_ViewBinding(PartnerHighlightHolder partnerHighlightHolder, View view) {
            this.IconCompatParcelizer = partnerHighlightHolder;
            partnerHighlightHolder.rvHighlightBanner = (InfiniteRecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_highlight_banner, "field 'rvHighlightBanner'", InfiniteRecyclerView.class);
            partnerHighlightHolder.pivHighlightBanner = (PageIndicatorView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.piv_highlight_banner, "field 'pivHighlightBanner'", PageIndicatorView.class);
        }

        public final void read() {
            PartnerHighlightHolder partnerHighlightHolder = this.IconCompatParcelizer;
            if (partnerHighlightHolder != null) {
                this.IconCompatParcelizer = null;
                partnerHighlightHolder.rvHighlightBanner = null;
                partnerHighlightHolder.pivHighlightBanner = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class PartnerTileHolder_ViewBinding implements Unbinder {
        private PartnerTileHolder MediaBrowserCompat$CustomActionResultReceiver;

        public PartnerTileHolder_ViewBinding(PartnerTileHolder partnerTileHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = partnerTileHolder;
            partnerTileHolder.fmLayoutNewContainer = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fl_new_container, "field 'fmLayoutNewContainer'", FrameLayout.class);
            partnerTileHolder.ivPartner = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_partner, "field 'ivPartner'", ImageView.class);
            partnerTileHolder.tvPartnerName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_partner_name, "field 'tvPartnerName'", TextView.class);
            partnerTileHolder.tvPartnerDesc = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_partner_desc, "field 'tvPartnerDesc'", TextView.class);
        }

        public final void read() {
            PartnerTileHolder partnerTileHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (partnerTileHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                partnerTileHolder.fmLayoutNewContainer = null;
                partnerTileHolder.ivPartner = null;
                partnerTileHolder.tvPartnerName = null;
                partnerTileHolder.tvPartnerDesc = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        write write2;
        onGetStartedClick.write((Object) viewGroup, "parent");
        if (i == 1) {
            write2 = new PartnerTileHolder(viewGroup, R.layout.f90822131494309, this.MediaBrowserCompat$ItemReceiver);
        } else if (i == 2) {
            write2 = new PartnerTileHolder(viewGroup, R.layout.f90812131494308, this.MediaBrowserCompat$ItemReceiver);
        } else if (i == 3) {
            write2 = new PartnerHighlightHolder(viewGroup, this.MediaBrowserCompat$ItemReceiver);
        } else if (i != 4) {
            write2 = new PartnerGroupTitleHolder(viewGroup, this.MediaBrowserCompat$ItemReceiver);
        } else {
            write2 = new PartnerHorizontalGroup(viewGroup, this.MediaBrowserCompat$ItemReceiver);
        }
        return write2;
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        write write2 = (write) setcontentview;
        onGetStartedClick.write((Object) write2, "holder");
        write2.MediaBrowserCompat$ItemReceiver((setGenerator) this.read.get(i));
    }

    public PartnerLandingAdapter(PartnerLandingAdapter$MediaBrowserCompat$ItemReceiver partnerLandingAdapter$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) partnerLandingAdapter$MediaBrowserCompat$ItemReceiver, "onTileClickedListener");
        this.MediaBrowserCompat$ItemReceiver = partnerLandingAdapter$MediaBrowserCompat$ItemReceiver;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public static class write extends RecyclerView.setContentView {
        public setGenerator AlertController$RecycleListView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
        }

        public void MediaBrowserCompat$ItemReceiver(setGenerator setgenerator) {
            onGetStartedClick.write((Object) setgenerator, "display");
            this.AlertController$RecycleListView = setgenerator;
        }
    }

    public static final class IconCompatParcelizer {
        public final RegistrationService MediaBrowserCompat$CustomActionResultReceiver;
        public final RegistrationWithApiAuthService write;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(RegistrationService registrationService, RegistrationWithApiAuthService registrationWithApiAuthService) {
            this.MediaBrowserCompat$CustomActionResultReceiver = registrationService;
            this.write = registrationWithApiAuthService;
        }
    }

    public static final class PartnerGroupTitleHolder extends write {
        @BindView
        public TextView tvGroupTitle;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public PartnerGroupTitleHolder(android.view.ViewGroup r4, final com.scb.phone.view.activity.partner.PartnerLandingAdapter$MediaBrowserCompat$ItemReceiver r5) {
            /*
                r3 = this;
                java.lang.String r0 = "parent"
                p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
                java.lang.String r0 = "onClickListener"
                p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
                android.content.Context r0 = r4.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r1 = 2131494305(0x7f0c05a1, float:1.8612115E38)
                r2 = 0
                android.view.View r4 = r0.inflate(r1, r4, r2)
                java.lang.String r0 = "LayoutInflater.from(pare…oup_title, parent, false)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r0)
                r3.<init>(r4)
                android.view.View r4 = r3.write
                butterknife.ButterKnife.IconCompatParcelizer(r3, r4)
                android.view.View r4 = r3.write
                com.scb.phone.view.activity.partner.PartnerLandingAdapter$PartnerGroupTitleHolder$4 r0 = new com.scb.phone.view.activity.partner.PartnerLandingAdapter$PartnerGroupTitleHolder$4
                r0.<init>(r3, r5)
                android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
                r4.setOnClickListener(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.partner.PartnerLandingAdapter.PartnerGroupTitleHolder.<init>(android.view.ViewGroup, com.scb.phone.view.activity.partner.PartnerLandingAdapter$MediaBrowserCompat$ItemReceiver):void");
        }

        public final void MediaBrowserCompat$ItemReceiver(setGenerator setgenerator) {
            onGetStartedClick.write((Object) setgenerator, "display");
            super.MediaBrowserCompat$ItemReceiver(setgenerator);
            AutoValue_CrashlyticsReport_Session.C30631 r3 = (AutoValue_CrashlyticsReport_Session.C30631) setgenerator;
            TextView textView = this.tvGroupTitle;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvGroupTitle");
            }
            textView.setText(r3.IconCompatParcelizer);
        }
    }

    public static final class PartnerTileHolder extends write {
        @BindView
        public FrameLayout fmLayoutNewContainer;
        @BindView
        public ImageView ivPartner;
        @BindView
        public TextView tvPartnerDesc;
        @BindView
        public TextView tvPartnerName;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public PartnerTileHolder(android.view.ViewGroup r3, int r4, final com.scb.phone.view.activity.partner.PartnerLandingAdapter$MediaBrowserCompat$ItemReceiver r5) {
            /*
                r2 = this;
                java.lang.String r0 = "parent"
                p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
                java.lang.String r0 = "onClickListener"
                p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
                android.content.Context r0 = r3.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r1 = 0
                android.view.View r3 = r0.inflate(r4, r3, r1)
                java.lang.String r4 = "LayoutInflater.from(pare…(layoutID, parent, false)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r3, (java.lang.String) r4)
                r2.<init>(r3)
                android.view.View r3 = r2.write
                butterknife.ButterKnife.IconCompatParcelizer(r2, r3)
                android.view.View r3 = r2.write
                com.scb.phone.view.activity.partner.PartnerLandingAdapter$PartnerTileHolder$3 r4 = new com.scb.phone.view.activity.partner.PartnerLandingAdapter$PartnerTileHolder$3
                r4.<init>(r2, r5)
                android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
                r3.setOnClickListener(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.partner.PartnerLandingAdapter.PartnerTileHolder.<init>(android.view.ViewGroup, int, com.scb.phone.view.activity.partner.PartnerLandingAdapter$MediaBrowserCompat$ItemReceiver):void");
        }

        public final void MediaBrowserCompat$ItemReceiver(setGenerator setgenerator) {
            onGetStartedClick.write((Object) setgenerator, "display");
            super.MediaBrowserCompat$ItemReceiver(setgenerator);
            setCrashed setcrashed = (setCrashed) setgenerator;
            TextView textView = this.tvPartnerName;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPartnerName");
            }
            textView.setText(setcrashed.IconCompatParcelizer);
            if (setcrashed.read == setIdentifier.ETB) {
                textView.post(new write(textView, this));
            }
            TextView textView2 = this.tvPartnerDesc;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPartnerDesc");
            }
            textView2.setText(setcrashed.MediaBrowserCompat$CustomActionResultReceiver);
            FrameLayout frameLayout = this.fmLayoutNewContainer;
            if (frameLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("fmLayoutNewContainer");
            }
            frameLayout.setVisibility(setcrashed.write ? 0 : 8);
            String str = setcrashed.MediaBrowserCompat$ItemReceiver;
            if (str != null) {
                ImageView imageView = this.ivPartner;
                if (imageView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivPartner");
                }
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(imageView, str, (isReset) null);
            }
        }

        static final class write implements Runnable {
            private /* synthetic */ PartnerTileHolder IconCompatParcelizer;
            private /* synthetic */ TextView MediaBrowserCompat$CustomActionResultReceiver;

            write(TextView textView, PartnerTileHolder partnerTileHolder) {
                this.MediaBrowserCompat$CustomActionResultReceiver = textView;
                this.IconCompatParcelizer = partnerTileHolder;
            }

            public final void run() {
                TextView textView = this.IconCompatParcelizer.tvPartnerDesc;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPartnerDesc");
                }
                int i = 1;
                if (this.MediaBrowserCompat$CustomActionResultReceiver.getLineCount() <= 1) {
                    i = 2;
                }
                textView.setMaxLines(i);
            }
        }
    }

    public static final class PartnerHorizontalGroup extends write {
        private PartnerLandingAdapter PlaybackStateCompat;
        @BindView
        public RecyclerView rvPartnerHorizontal;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public PartnerHorizontalGroup(android.view.ViewGroup r5, com.scb.phone.view.activity.partner.PartnerLandingAdapter$MediaBrowserCompat$ItemReceiver r6) {
            /*
                r4 = this;
                java.lang.String r0 = "parent"
                p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
                java.lang.String r0 = "onClickListener"
                p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
                android.content.Context r0 = r5.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r1 = 0
                r2 = 2131494307(0x7f0c05a3, float:1.8612119E38)
                android.view.View r5 = r0.inflate(r2, r5, r1)
                java.lang.String r0 = "LayoutInflater.from(pare…arent,\n            false)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r0)
                r4.<init>(r5)
                android.view.View r5 = r4.write
                butterknife.ButterKnife.IconCompatParcelizer(r4, r5)
                androidx.recyclerview.widget.RecyclerView r5 = r4.rvPartnerHorizontal
                java.lang.String r0 = "rvPartnerHorizontal"
                if (r5 != 0) goto L_0x0030
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
            L_0x0030:
                android.view.View r2 = r4.write
                java.lang.String r3 = "itemView"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r2, (java.lang.String) r3)
                r2.getContext()
                androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
                r2.<init>(r1, r1)
                androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver r2 = (androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver) r2
                r5.setLayoutManager(r2)
                com.scb.phone.view.activity.partner.PartnerLandingAdapter r5 = new com.scb.phone.view.activity.partner.PartnerLandingAdapter
                r5.<init>(r6)
                r4.PlaybackStateCompat = r5
                androidx.recyclerview.widget.RecyclerView r5 = r4.rvPartnerHorizontal
                if (r5 != 0) goto L_0x0052
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
            L_0x0052:
                com.scb.phone.view.activity.partner.PartnerLandingAdapter r6 = r4.PlaybackStateCompat
                androidx.recyclerview.widget.RecyclerView$IconCompatParcelizer r6 = (androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer) r6
                r5.setAdapter(r6)
                o.setGuidelineEnd r5 = new o.setGuidelineEnd
                r5.<init>()
                androidx.recyclerview.widget.RecyclerView r6 = r4.rvPartnerHorizontal
                if (r6 != 0) goto L_0x0065
                p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
            L_0x0065:
                r5.MediaBrowserCompat$CustomActionResultReceiver(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.partner.PartnerLandingAdapter.PartnerHorizontalGroup.<init>(android.view.ViewGroup, com.scb.phone.view.activity.partner.PartnerLandingAdapter$MediaBrowserCompat$ItemReceiver):void");
        }

        public final void MediaBrowserCompat$ItemReceiver(setGenerator setgenerator) {
            onGetStartedClick.write((Object) setgenerator, "display");
            super.MediaBrowserCompat$ItemReceiver(setgenerator);
            if (setgenerator instanceof setApp) {
                PartnerLandingAdapter partnerLandingAdapter = this.PlaybackStateCompat;
                List<setGenerator> list = ((setApp) setgenerator).write;
                onGetStartedClick.write((Object) list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                partnerLandingAdapter.read = list;
                partnerLandingAdapter.IconCompatParcelizer.write();
            }
        }
    }

    public static final class PartnerHighlightHolder extends write implements BaseHighlightAdapter.write<isCrashed>, FragmentBuilder_BindCreditCardFragment.IconCompatParcelizer {
        private BaseHighlightAdapter<isCrashed, ArrayList<isCrashed>> Keep;
        private final PartnerLandingAdapter$MediaBrowserCompat$ItemReceiver PlaybackStateCompat;
        @BindView
        public PageIndicatorView pivHighlightBanner;
        @BindView
        public InfiniteRecyclerView rvHighlightBanner;

        public final /* synthetic */ void IconCompatParcelizer(ForwardingListenableFuture forwardingListenableFuture) {
            isCrashed iscrashed = (isCrashed) forwardingListenableFuture;
            onGetStartedClick.write((Object) iscrashed, "display");
            this.PlaybackStateCompat.read(iscrashed);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public PartnerHighlightHolder(android.view.ViewGroup r4, com.scb.phone.view.activity.partner.PartnerLandingAdapter$MediaBrowserCompat$ItemReceiver r5) {
            /*
                r3 = this;
                java.lang.String r0 = "parent"
                p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r0)
                java.lang.String r0 = "onClick"
                p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
                android.content.Context r0 = r4.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r1 = 2131494306(0x7f0c05a2, float:1.8612117E38)
                r2 = 0
                android.view.View r4 = r0.inflate(r1, r4, r2)
                java.lang.String r0 = "LayoutInflater.from(pare…arent,\n            false)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r0)
                r3.<init>(r4)
                r3.PlaybackStateCompat = r5
                android.view.View r4 = r3.write
                butterknife.ButterKnife.IconCompatParcelizer(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.partner.PartnerLandingAdapter.PartnerHighlightHolder.<init>(android.view.ViewGroup, com.scb.phone.view.activity.partner.PartnerLandingAdapter$MediaBrowserCompat$ItemReceiver):void");
        }

        public final void MediaBrowserCompat$ItemReceiver(setGenerator setgenerator) {
            int i;
            onGetStartedClick.write((Object) setgenerator, "display");
            super.MediaBrowserCompat$ItemReceiver(setgenerator);
            List<isCrashed> list = ((AutoValue_CrashlyticsReport_Session.Builder) setgenerator).MediaBrowserCompat$CustomActionResultReceiver;
            this.Keep = new BaseHighlightAdapter<>(new ArrayList(list), this);
            InfiniteRecyclerView infiniteRecyclerView = this.rvHighlightBanner;
            if (infiniteRecyclerView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvHighlightBanner");
            }
            View view = this.write;
            onGetStartedClick.IconCompatParcelizer((Object) view, "itemView");
            view.getContext();
            infiniteRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            BaseHighlightAdapter<isCrashed, ArrayList<isCrashed>> baseHighlightAdapter = this.Keep;
            if (baseHighlightAdapter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("highlightAdapter");
            }
            infiniteRecyclerView.setAdapter(baseHighlightAdapter);
            InfiniteRecyclerView.setOnSnapPositionChangeListener$default(infiniteRecyclerView, (C6489x271d6c26) null, this, 1, (Object) null);
            View view2 = this.write;
            onGetStartedClick.IconCompatParcelizer((Object) view2, "itemView");
            view2.getResources();
            infiniteRecyclerView.MediaMetadataCompat();
            boolean z = list.size() == 1;
            if (z) {
                i = MediaBrowserCompat$ItemReceiver(true);
            } else {
                View view3 = this.write;
                onGetStartedClick.IconCompatParcelizer((Object) view3, "itemView");
                Resources resources = view3.getResources();
                onGetStartedClick.IconCompatParcelizer((Object) resources, "itemView.resources");
                i = resources.getDimensionPixelOffset(R.dimen.f72562131165462);
            }
            int MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(z);
            InfiniteRecyclerView infiniteRecyclerView2 = this.rvHighlightBanner;
            if (infiniteRecyclerView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvHighlightBanner");
            }
            infiniteRecyclerView2.setPadding(i, 0, MediaBrowserCompat$ItemReceiver, 0);
            int size = list.size();
            PageIndicatorView pageIndicatorView = this.pivHighlightBanner;
            if (pageIndicatorView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("pivHighlightBanner");
            }
            pageIndicatorView.setCount(size);
            PageIndicatorView pageIndicatorView2 = this.pivHighlightBanner;
            if (pageIndicatorView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("pivHighlightBanner");
            }
            pageIndicatorView2.setAnimationDuration(0);
            PageIndicatorView pageIndicatorView3 = this.pivHighlightBanner;
            if (pageIndicatorView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("pivHighlightBanner");
            }
            pageIndicatorView3.setVisibility(0);
        }

        public final void read(int i) {
            PageIndicatorView pageIndicatorView = this.pivHighlightBanner;
            if (pageIndicatorView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("pivHighlightBanner");
            }
            BaseHighlightAdapter<isCrashed, ArrayList<isCrashed>> baseHighlightAdapter = this.Keep;
            if (baseHighlightAdapter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("highlightAdapter");
            }
            pageIndicatorView.setSelection(baseHighlightAdapter.read(i));
        }

        private final int MediaBrowserCompat$ItemReceiver(boolean z) {
            View view = this.write;
            onGetStartedClick.IconCompatParcelizer((Object) view, "itemView");
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            }
            int i = displayMetrics.widthPixels;
            View view2 = this.write;
            onGetStartedClick.IconCompatParcelizer((Object) view2, "itemView");
            Resources resources = view2.getResources();
            onGetStartedClick.IconCompatParcelizer((Object) resources, "itemView.resources");
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.f73072131165533);
            return z ? (i - dimensionPixelOffset) / 2 : i - dimensionPixelOffset;
        }
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        setGenerator setgenerator = (setGenerator) this.read.get(i);
        boolean z = setgenerator instanceof setCrashed;
        if (z && ((setCrashed) setgenerator).read == setIdentifier.NTB) {
            return 1;
        }
        if (z && ((setCrashed) setgenerator).read == setIdentifier.ETB) {
            return 2;
        }
        if (setgenerator instanceof AutoValue_CrashlyticsReport_Session.Builder) {
            return 3;
        }
        return setgenerator instanceof setApp ? 4 : 0;
    }
}
