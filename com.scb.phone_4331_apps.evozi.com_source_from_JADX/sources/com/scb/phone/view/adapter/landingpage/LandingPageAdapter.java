package com.scb.phone.view.adapter.landingpage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.RectangleRelativeLayout;
import java.util.Collections;
import p040o.ContentFrameLayout;
import p040o.FragmentBuilder_BindCurrentAddressFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.ScriptGroup;
import p040o.ScriptIntrinsic;
import p040o.deleteLogFile;
import p040o.discardOldLogFiles;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.getGeoDataClient;
import p040o.getRewards;
import p040o.onStart;
import p040o.parseChars;
import p040o.setLastBaselineToBottomHeight;
import p040o.setLocale;
import p040o.show;
import p040o.validateHER2K;

@Deprecated
public final class LandingPageAdapter extends RecyclerView.IconCompatParcelizer<MyViewHolder> implements ScriptGroup.C1272IO<MyViewHolder> {
    private boolean MediaBrowserCompat$ItemReceiver;
    private Drawable read;

    public static /* synthetic */ FragmentBuilder_BindCurrentAddressFragment MediaBrowserCompat$ItemReceiver() {
        return null;
    }

    public static /* synthetic */ discardOldLogFiles read() {
        return null;
    }

    public final int IconCompatParcelizer() {
        return 0;
    }

    public final void IconCompatParcelizer(int i) {
    }

    public final void read(int i) {
    }

    public final /* bridge */ /* synthetic */ ScriptIntrinsic write(int i) {
        return null;
    }

    public class MyViewHolder_ViewBinding implements Unbinder {
        private MyViewHolder write;

        public MyViewHolder_ViewBinding(MyViewHolder myViewHolder, View view) {
            this.write = myViewHolder;
            myViewHolder.backgroundImageView = (ImageView) onStart.IconCompatParcelizer(view, R.id.landing_tile_background, "field 'backgroundImageView'", ImageView.class);
            myViewHolder.descTextView = (TextView) onStart.IconCompatParcelizer(view, R.id.landing_tile_text, "field 'descTextView'", TextView.class);
            myViewHolder.predictiveLine1TextView = (TextView) onStart.IconCompatParcelizer(view, R.id.landing_predictive_line_1, "field 'predictiveLine1TextView'", TextView.class);
            myViewHolder.predictiveLine2TextView = (TextView) onStart.IconCompatParcelizer(view, R.id.landing_predictive_line_2, "field 'predictiveLine2TextView'", TextView.class);
            myViewHolder.iconImageView = (ImageView) onStart.IconCompatParcelizer(view, R.id.landing_tile_icon, "field 'iconImageView'", ImageView.class);
            myViewHolder.emptyCellHorizontal = (LinearLayout) onStart.IconCompatParcelizer(view, R.id.landing_empty_cell_h, "field 'emptyCellHorizontal'", LinearLayout.class);
            myViewHolder.emptyCellVertical = (RelativeLayout) onStart.IconCompatParcelizer(view, R.id.landing_empty_cell_v, "field 'emptyCellVertical'", RelativeLayout.class);
            myViewHolder.placeHolderView = view.findViewById(R.id.landing_icon_place_holder);
            myViewHolder.rectangleRelativeLayout = (RectangleRelativeLayout) onStart.IconCompatParcelizer(view, R.id.rectangle_relative_layout, "field 'rectangleRelativeLayout'", RectangleRelativeLayout.class);
            myViewHolder.predictiveTilesLoadingView = (LinearLayout) onStart.IconCompatParcelizer(view, R.id.view_predictive_tiles_group_progress, "field 'predictiveTilesLoadingView'", LinearLayout.class);
            myViewHolder.defaultLoadingView = (LinearLayout) onStart.IconCompatParcelizer(view, R.id.view_group_progress, "field 'defaultLoadingView'", LinearLayout.class);
        }

        public final void read() {
            MyViewHolder myViewHolder = this.write;
            if (myViewHolder != null) {
                this.write = null;
                myViewHolder.backgroundImageView = null;
                myViewHolder.descTextView = null;
                myViewHolder.predictiveLine1TextView = null;
                myViewHolder.predictiveLine2TextView = null;
                myViewHolder.iconImageView = null;
                myViewHolder.emptyCellHorizontal = null;
                myViewHolder.emptyCellVertical = null;
                myViewHolder.placeHolderView = null;
                myViewHolder.rectangleRelativeLayout = null;
                myViewHolder.predictiveTilesLoadingView = null;
                myViewHolder.defaultLoadingView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.content.Context, o.discardOldLogFiles] */
    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        final MyViewHolder myViewHolder = (MyViewHolder) setcontentview;
        myViewHolder.Keep = i;
        ? r0 = 0;
        final discardOldLogFiles$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver2 = r0.MediaBrowserCompat$ItemReceiver(i);
        if (myViewHolder.iconImageView != null) {
            if (MediaBrowserCompat$ItemReceiver2.ExpandedMenuView == setLocale.GROUP || !(MediaBrowserCompat$ItemReceiver2.setTitle == getGeoDataClient.FAVOURITE || MediaBrowserCompat$ItemReceiver2.setTitle == getGeoDataClient.BILLERTOPUP || MediaBrowserCompat$ItemReceiver2.setTitle == getGeoDataClient.TRANSFER || MediaBrowserCompat$ItemReceiver2.setTitle == getGeoDataClient.BILLERPAYMENT)) {
                FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(myViewHolder.iconImageView, MediaBrowserCompat$ItemReceiver2.AppCompatActivity, (int) r0.getResources().getDimension(R.dimen.f72062131165283), (FragmentBuilder_BindEkycFragment) new FragmentBuilder_BindEkycFragment() {
                    public final void MediaBrowserCompat$CustomActionResultReceiver(Exception exc) {
                    }

                    public final void MediaBrowserCompat$ItemReceiver() {
                        if (MyViewHolder.this.placeHolderView != null && MediaBrowserCompat$ItemReceiver2.ExpandedMenuView != setLocale.GROUP) {
                            MyViewHolder.this.placeHolderView.setVisibility(8);
                        }
                    }
                });
            } else {
                int i2 = C89222.write[MediaBrowserCompat$ItemReceiver2.setTitle.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        this.read = setLastBaselineToBottomHeight.write(r0, R.drawable.biller_place_holder);
                    } else {
                        this.read = setLastBaselineToBottomHeight.write(r0, R.drawable.bankicon_place_holder);
                    }
                } else if (MediaBrowserCompat$ItemReceiver2.setHasDecor != null) {
                    String str = MediaBrowserCompat$ItemReceiver2.setHasDecor.PlaybackStateCompat;
                    char c = 65535;
                    int hashCode = str.hashCode();
                    if (hashCode != -486974465) {
                        if (hashCode == 80008848 && str.equals("TOPUP")) {
                            c = 0;
                        }
                    } else if (str.equals("BILLPAYMENT")) {
                        c = 1;
                    }
                    if (c == 0 || c == 1) {
                        this.read = setLastBaselineToBottomHeight.write(r0, R.drawable.biller_place_holder);
                    } else {
                        this.read = setLastBaselineToBottomHeight.write(r0, R.drawable.bankicon_place_holder);
                    }
                }
                FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver((Context) null, this.read, myViewHolder.iconImageView, MediaBrowserCompat$ItemReceiver2.AppCompatActivity, r0.getResources().getDimensionPixelOffset(R.dimen.f72062131165283), setLastBaselineToBottomHeight.read(r0, R.color.f66402131099796));
            }
        }
        if (myViewHolder.descTextView != null && !TextUtils.isEmpty(MediaBrowserCompat$ItemReceiver2.ListMenuItemView)) {
            myViewHolder.descTextView.setText(MediaBrowserCompat$ItemReceiver2.ListMenuItemView);
        }
        if (myViewHolder.predictiveLine1TextView != null && !TextUtils.isEmpty(MediaBrowserCompat$ItemReceiver2.ListMenuItemView) && myViewHolder.predictiveLine2TextView != null && !TextUtils.isEmpty(MediaBrowserCompat$ItemReceiver2.setForceShowIcon)) {
            myViewHolder.predictiveLine1TextView.setText(MediaBrowserCompat$ItemReceiver2.ListMenuItemView);
            myViewHolder.predictiveLine2TextView.setText(MediaBrowserCompat$ItemReceiver2.setForceShowIcon);
        } else if (myViewHolder.predictiveLine1TextView != null && !TextUtils.isEmpty(MediaBrowserCompat$ItemReceiver2.ListMenuItemView)) {
            myViewHolder.predictiveLine1TextView.setText(MediaBrowserCompat$ItemReceiver2.ListMenuItemView);
            myViewHolder.predictiveLine1TextView.setGravity(17);
            myViewHolder.predictiveLine1TextView.setMaxLines(2);
            myViewHolder.predictiveLine1TextView.setLines(2);
            myViewHolder.predictiveLine2TextView.setVisibility(8);
        }
        if (!(myViewHolder.predictiveTilesLoadingView == null || myViewHolder.defaultLoadingView == null || MediaBrowserCompat$ItemReceiver2.ExpandedMenuView != setLocale.PREDICTIVE_TILE_LOADING)) {
            myViewHolder.predictiveTilesLoadingView.setVisibility(0);
            myViewHolder.defaultLoadingView.setVisibility(8);
        }
        if (myViewHolder.backgroundImageView != null && !TextUtils.isEmpty(MediaBrowserCompat$ItemReceiver2.RatingCompat)) {
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(myViewHolder.backgroundImageView, MediaBrowserCompat$ItemReceiver2.RatingCompat, (FragmentBuilder_BindEkycFragment) new FragmentBuilder_BindEkycFragment() {
                public final void MediaBrowserCompat$CustomActionResultReceiver(Exception exc) {
                }

                public final void MediaBrowserCompat$ItemReceiver() {
                    if (MyViewHolder.this.placeHolderView == null) {
                        return;
                    }
                    if (MediaBrowserCompat$ItemReceiver2.ExpandedMenuView == setLocale.GROUP || MediaBrowserCompat$ItemReceiver2.setTitle == getGeoDataClient.QUICKBALANCE || MediaBrowserCompat$ItemReceiver2.setTitle == getGeoDataClient.QUICKPROMPTPAY) {
                        MyViewHolder.this.placeHolderView.setVisibility(8);
                    }
                }
            });
        }
        if (!(MediaBrowserCompat$ItemReceiver2.AppCompatViewInflater == 0 || myViewHolder.backgroundImageView == null)) {
            myViewHolder.backgroundImageView.setBackgroundResource(MediaBrowserCompat$ItemReceiver2.AppCompatViewInflater);
        }
        if (!(MediaBrowserCompat$ItemReceiver2.setItemInvoker == 0 || myViewHolder.descTextView == null)) {
            myViewHolder.descTextView.setTextColor(ContentFrameLayout.write(r0.getResources(), MediaBrowserCompat$ItemReceiver2.setItemInvoker, r0.getTheme()));
        }
        if (!(MediaBrowserCompat$ItemReceiver2.ExpandedMenuView != setLocale.ADD_SHORTCUT || myViewHolder.emptyCellVertical == null || myViewHolder.emptyCellHorizontal == null)) {
            if (MediaBrowserCompat$ItemReceiver2.setPadding == 1) {
                myViewHolder.emptyCellVertical.setVisibility(0);
                myViewHolder.emptyCellHorizontal.setVisibility(8);
            } else {
                myViewHolder.emptyCellVertical.setVisibility(8);
                myViewHolder.emptyCellHorizontal.setVisibility(0);
            }
        }
        if (myViewHolder.rectangleRelativeLayout != null) {
            myViewHolder.rectangleRelativeLayout.setSpanSize(MediaBrowserCompat$ItemReceiver2.setPadding);
        }
    }

    public final long MediaBrowserCompat$ItemReceiver(int i) {
        discardOldLogFiles discardoldlogfiles = null;
        return discardoldlogfiles.MediaBrowserCompat$ItemReceiver(i).MediaMetadataCompat;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        discardOldLogFiles discardoldlogfiles = null;
        return discardoldlogfiles.MediaBrowserCompat$ItemReceiver(i).ExpandedMenuView.ordinal();
    }

    public final boolean read(int i, int i2) {
        this.MediaBrowserCompat$ItemReceiver = false;
        discardOldLogFiles discardoldlogfiles = null;
        return discardoldlogfiles.MediaBrowserCompat$ItemReceiver(i2).setContentView;
    }

    public class MyViewHolder extends validateHER2K {
        public int Keep;
        @BindView
        ImageView backgroundImageView;
        @BindView
        LinearLayout defaultLoadingView;
        @BindView
        TextView descTextView;
        @BindView
        LinearLayout emptyCellHorizontal;
        @BindView
        RelativeLayout emptyCellVertical;
        @BindView
        ImageView iconImageView;
        @BindView
        View placeHolderView;
        @BindView
        TextView predictiveLine1TextView;
        @BindView
        TextView predictiveLine2TextView;
        @BindView
        LinearLayout predictiveTilesLoadingView;
        @BindView
        RectangleRelativeLayout rectangleRelativeLayout;

        MyViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, this.write);
            view.setOnClickListener(new getRewards(this));
        }
    }

    /* renamed from: com.scb.phone.view.adapter.landingpage.LandingPageAdapter$2 */
    public static /* synthetic */ class C89222 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;
        public static final /* synthetic */ int[] read;
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(51:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(3:67|68|70)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|29|30|31|(2:33|34)|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(3:67|68|70)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(53:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|(2:33|34)|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(3:67|68|70)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|(2:33|34)|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(3:67|68|70)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|(2:33|34)|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|70) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|(2:33|34)|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|70) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|70) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00a2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00ac */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00b6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00ca */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00d4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00de */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00e8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00f2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00fe */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x010a */
        static {
            /*
                o.setLocale[] r0 = p040o.setLocale.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                r1 = 1
                o.setLocale r2 = p040o.setLocale.ADD_SHORTCUT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.setLocale r3 = p040o.setLocale.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.setLocale r4 = p040o.setLocale.STATIC_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = read     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.setLocale r5 = p040o.setLocale.SCB     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = read     // Catch:{ NoSuchFieldError -> 0x003e }
                o.setLocale r6 = p040o.setLocale.SHORTCUT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = read     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.setLocale r7 = p040o.setLocale.PREDICTIVE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = read     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.setLocale r8 = p040o.setLocale.LEARN_MORE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = read     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.setLocale r9 = p040o.setLocale.GROUP     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = read     // Catch:{ NoSuchFieldError -> 0x006c }
                o.setLocale r10 = p040o.setLocale.STATIC_SHORTCUT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                o.getGeoDataClient[] r9 = p040o.getGeoDataClient.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                write = r9
                o.getGeoDataClient r10 = p040o.getGeoDataClient.FAVOURITE     // Catch:{ NoSuchFieldError -> 0x007d }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r9 = write     // Catch:{ NoSuchFieldError -> 0x0087 }
                o.getGeoDataClient r10 = p040o.getGeoDataClient.BILLERPAYMENT     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r9[r10] = r0     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r9 = write     // Catch:{ NoSuchFieldError -> 0x0091 }
                o.getGeoDataClient r10 = p040o.getGeoDataClient.BILLERTOPUP     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r9[r10] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                o.parseChars[] r9 = p040o.parseChars.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                MediaBrowserCompat$ItemReceiver = r9
                o.parseChars r10 = p040o.parseChars.ADD_SHORTCUT     // Catch:{ NoSuchFieldError -> 0x00a2 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a2 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00a2 }
            L_0x00a2:
                int[] r1 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00ac }
                o.parseChars r9 = p040o.parseChars.SHORTCUT     // Catch:{ NoSuchFieldError -> 0x00ac }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ac }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00ac }
            L_0x00ac:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00b6 }
                o.parseChars r1 = p040o.parseChars.GROUP     // Catch:{ NoSuchFieldError -> 0x00b6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b6 }
            L_0x00b6:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00c0 }
                o.parseChars r1 = p040o.parseChars.STATIC_SHORTCUT     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00ca }
                o.parseChars r1 = p040o.parseChars.SCB     // Catch:{ NoSuchFieldError -> 0x00ca }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ca }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00ca }
            L_0x00ca:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00d4 }
                o.parseChars r1 = p040o.parseChars.PREDICTIVE     // Catch:{ NoSuchFieldError -> 0x00d4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d4 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00d4 }
            L_0x00d4:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00de }
                o.parseChars r1 = p040o.parseChars.LEARN_MORE     // Catch:{ NoSuchFieldError -> 0x00de }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00de }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00de }
            L_0x00de:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00e8 }
                o.parseChars r1 = p040o.parseChars.ERROR     // Catch:{ NoSuchFieldError -> 0x00e8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e8 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00e8 }
            L_0x00e8:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00f2 }
                o.parseChars r1 = p040o.parseChars.EMPTY     // Catch:{ NoSuchFieldError -> 0x00f2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f2 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x00f2 }
            L_0x00f2:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00fe }
                o.parseChars r1 = p040o.parseChars.PREDICTIVE_TILE_LOADING     // Catch:{ NoSuchFieldError -> 0x00fe }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fe }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fe }
            L_0x00fe:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x010a }
                o.parseChars r1 = p040o.parseChars.STATIC_ERROR     // Catch:{ NoSuchFieldError -> 0x010a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010a }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010a }
            L_0x010a:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0116 }
                o.parseChars r1 = p040o.parseChars.LOADING     // Catch:{ NoSuchFieldError -> 0x0116 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0116 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0116 }
            L_0x0116:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.adapter.landingpage.LandingPageAdapter.C89222.<clinit>():void");
        }
    }

    public final /* synthetic */ boolean IconCompatParcelizer(RecyclerView.setContentView setcontentview, int i) {
        discardOldLogFiles discardoldlogfiles = null;
        return discardoldlogfiles.MediaBrowserCompat$ItemReceiver(i).setContentView;
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        switch (C89222.MediaBrowserCompat$ItemReceiver[parseChars.read(i).ordinal()]) {
            case 1:
                view = from.inflate(R.layout.f83122131493538, viewGroup, false);
                break;
            case 2:
                view = from.inflate(R.layout.f83202131493546, viewGroup, false);
                break;
            case 3:
                view = from.inflate(R.layout.f83142131493540, viewGroup, false);
                break;
            case 4:
                view = from.inflate(R.layout.f83222131493548, viewGroup, false);
                break;
            case 5:
                view = from.inflate(R.layout.f83192131493545, viewGroup, false);
                break;
            case 6:
                view = from.inflate(R.layout.f83182131493544, viewGroup, false);
                break;
            case 7:
                view = from.inflate(R.layout.f83162131493542, viewGroup, false);
                break;
            case 8:
                view = from.inflate(R.layout.f83132131493539, viewGroup, false);
                break;
            case 9:
                view = from.inflate(R.layout.f83112131493537, viewGroup, false);
                break;
            case 10:
                view = from.inflate(R.layout.f83172131493543, viewGroup, false);
                break;
            case 11:
                view = from.inflate(R.layout.f83212131493547, viewGroup, false);
                break;
            default:
                view = from.inflate(R.layout.f83172131493543, viewGroup, false);
                break;
        }
        return new MyViewHolder(view);
    }

    public final void write(int i, int i2) {
        if (i != i2) {
            if (i != i2) {
                discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver = null.read.get(i);
                discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver2 = null.read.get(i2);
                int i3 = discardoldlogfiles_mediabrowsercompat_itemreceiver.setIcon;
                int i4 = discardoldlogfiles_mediabrowsercompat_itemreceiver.Keep;
                int i5 = discardoldlogfiles_mediabrowsercompat_itemreceiver2.setIcon;
                int i6 = discardoldlogfiles_mediabrowsercompat_itemreceiver2.Keep;
                show show = new show(null.read);
                deleteLogFile deletelogfile = new deleteLogFile(discardoldlogfiles_mediabrowsercompat_itemreceiver2, i3, i4, discardoldlogfiles_mediabrowsercompat_itemreceiver, i5, i6);
                while (show.IconCompatParcelizer.hasNext()) {
                    deletelogfile.MediaBrowserCompat$ItemReceiver(show.IconCompatParcelizer.next());
                }
                Collections.swap(null.read, i2, i);
            }
            this.IconCompatParcelizer.write();
        }
    }
}
