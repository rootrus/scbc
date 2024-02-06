package p040o;

import p040o.C4867jg;
import p040o.C9857aq;
import p040o.LargestFaceFocusingProcessor;
import p040o.QuickExtractor;
import p040o.Splitter;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.jg */
public class C4867jg extends KtaJsonExactionHelper<QuickExtractor.C70173> {
    private final Splitter.C38051.C38061 MediaBrowserCompat$MediaItem;

    @HmlPinActivity
    public C4867jg(RegularImmutableBiMap regularImmutableBiMap, LargestFaceFocusingProcessor.Builder builder, PersonalLimitAdapter$LimitCustomViewHolder_ViewBinding personalLimitAdapter$LimitCustomViewHolder_ViewBinding, Splitter.C38051.C38061 r4) {
        super(regularImmutableBiMap, builder, personalLimitAdapter$LimitCustomViewHolder_ViewBinding);
        this.MediaBrowserCompat$MediaItem = r4;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        super.MediaBrowserCompat$CustomActionResultReceiver(str);
        MediaBrowserCompat$CustomActionResultReceiver(str != null && (str.length() == 4 || str.length() == 6));
    }

    public final void read() {
        if (!this.MediaMetadataCompat) {
            C4865je jeVar = C4865je.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat != null) {
                jeVar.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4867jg jgVar) {
        if (jgVar.RatingCompat != null) {
            jgVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(C4867jg jgVar) {
        if (jgVar.RatingCompat != null) {
            jgVar.RatingCompat.aj_();
        }
    }

    public final void write() {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.equalsIgnoreCase("VALID_ATM_CARD"), this.read, this.MediaBrowserCompat$ItemReceiver);
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                super.onNext((Boolean) obj);
                C4867jg.IconCompatParcelizer(C4867jg.this);
                C4867jg jgVar = C4867jg.this;
                C4917kt ktVar = C4917kt.write;
                if (jgVar.RatingCompat != null) {
                    ktVar.IconCompatParcelizer(jgVar.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                super.onError(th);
                C4867jg.write(C4867jg.this);
                if (!C4867jg.this.MediaBrowserCompat$CustomActionResultReceiver(th, false)) {
                    C4867jg jgVar = C4867jg.this;
                    C9857aq.C40461 r1 = new writeUInt64NoTag.IconCompatParcelizer(th) {
                        private final /* synthetic */ Throwable write;

                        {
                            this.write = r2;
                        }

                        public final void IconCompatParcelizer(Object obj) {
                            C4867jg.C48684 r0 = C4867jg.C48684.this;
                            ((QuickExtractor.C70173) obj).read(C4867jg.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
                        }
                    };
                    if (jgVar.RatingCompat != null) {
                        r1.IconCompatParcelizer(jgVar.RatingCompat);
                        return;
                    }
                    return;
                }
                C4867jg.this.MediaBrowserCompat$ItemReceiver(C4867jg.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            }
        });
    }
}
