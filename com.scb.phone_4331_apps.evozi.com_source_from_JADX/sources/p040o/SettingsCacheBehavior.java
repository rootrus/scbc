package p040o;

import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CharMatcher;
import p040o.CheckCaptureModule;
import p040o.TransformedImmutableList;

/* renamed from: o.SettingsCacheBehavior */
public class SettingsCacheBehavior extends writeUInt64NoTag<CheckCaptureModule.C6375a.MediaMetadataCompat> {
    public final CharMatcher.C315410 IconCompatParcelizer;
    private GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder MediaBrowserCompat$ItemReceiver = GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ofPattern("yyyy-MM-dd");
    /* access modifiers changed from: private */
    public List<doWriteToLog> MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public boolean read;
    public final TransformedImmutableList.C38711 write;

    @HmlPinActivity
    public SettingsCacheBehavior(CharMatcher.C315410 r1, TransformedImmutableList.C38711 r2, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = r1;
        this.write = r2;
    }

    public void onDestroy() {
        CharMatcher.C315410 r0 = this.IconCompatParcelizer;
        if (!r0.MediaBrowserCompat$MediaItem.isDisposed()) {
            r0.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public final void IconCompatParcelizer() {
        if (!this.read) {
            this.read = true;
            if (this.RatingCompat != null) {
                this.RatingCompat.Keep();
            }
            OffsetDateTime now = OffsetDateTime.now();
            this.IconCompatParcelizer.read((Integer) null, now.withDayOfMonth(1).format(this.MediaBrowserCompat$ItemReceiver), now.format(this.MediaBrowserCompat$ItemReceiver));
            this.IconCompatParcelizer.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<onPlaceSelected>>() {
                public final /* synthetic */ void onNext(Object obj) {
                    List list = (List) obj;
                    boolean unused = SettingsCacheBehavior.this.read = false;
                    boolean z = true;
                    onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNext -> merchantWalletSummaryList: %d items", Integer.valueOf(list.size()));
                    SettingsCacheBehavior settingsCacheBehavior = SettingsCacheBehavior.this;
                    TransformedImmutableList.C38711 MediaMetadataCompat = settingsCacheBehavior.write;
                    boolean itemInvoker = SettingsCacheBehavior.this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker();
                    onGetStartedClick.write((Object) list, "list");
                    List MediaBrowserCompat$ItemReceiver = TransformedImmutableList.C38711.MediaBrowserCompat$ItemReceiver(list, new TransformedImmutableList$1$MediaBrowserCompat$ItemReceiver(MediaMetadataCompat, itemInvoker, true));
                    onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "transformList(list) { tr…t, isMasked, isSummary) }");
                    List unused2 = settingsCacheBehavior.MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$ItemReceiver;
                    SettingsCacheBehavior settingsCacheBehavior2 = SettingsCacheBehavior.this;
                    CreateReportRequest createReportRequest = new CreateReportRequest(this);
                    if (settingsCacheBehavior2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        createReportRequest.IconCompatParcelizer(settingsCacheBehavior2.RatingCompat);
                    }
                }

                public final void onComplete() {
                    SettingsCacheBehavior.read(SettingsCacheBehavior.this);
                    SettingsCacheBehavior.IconCompatParcelizer(SettingsCacheBehavior.this);
                }

                public final void onError(Throwable th) {
                    boolean unused = SettingsCacheBehavior.this.read = false;
                    boolean z = true;
                    if ((SettingsCacheBehavior.this.RatingCompat != null) && !SettingsCacheBehavior.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                        SettingsCacheBehavior.write(SettingsCacheBehavior.this);
                        SettingsCacheBehavior settingsCacheBehavior = SettingsCacheBehavior.this;
                        DefaultCreateReportSpiCall defaultCreateReportSpiCall = DefaultCreateReportSpiCall.MediaBrowserCompat$CustomActionResultReceiver;
                        if (settingsCacheBehavior.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            defaultCreateReportSpiCall.IconCompatParcelizer(settingsCacheBehavior.RatingCompat);
                        }
                    }
                }
            });
        }
    }

    public final boolean write() {
        List<zzur> list;
        zzvf RatingCompat = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat();
        if (RatingCompat != null) {
            list = RatingCompat.MediaDescriptionCompat;
        } else {
            list = null;
        }
        List<doWriteToLog> list2 = this.MediaBrowserCompat$SearchResultReceiver;
        return (list2 == null || list == null || list2.size() == list.size()) ? false : true;
    }

    static /* synthetic */ void read(SettingsCacheBehavior settingsCacheBehavior) {
        if (settingsCacheBehavior.RatingCompat != null) {
            settingsCacheBehavior.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(SettingsCacheBehavior settingsCacheBehavior) {
        if (settingsCacheBehavior.RatingCompat != null) {
            settingsCacheBehavior.RatingCompat.az_();
        }
    }

    static /* synthetic */ void write(SettingsCacheBehavior settingsCacheBehavior) {
        if (settingsCacheBehavior.RatingCompat != null) {
            settingsCacheBehavior.RatingCompat.az_();
        }
    }
}
