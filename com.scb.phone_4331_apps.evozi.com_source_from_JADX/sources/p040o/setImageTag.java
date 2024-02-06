package p040o;

import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsReport;
import p040o.GiftingBaseListAdapter$GiftViewHolder;
import p040o.Iterables;
import p040o.writeUInt64NoTag;

/* renamed from: o.setImageTag */
public final class setImageTag extends setImageFilePath<CheckExtractActivity_MembersInjector.MediaDescriptionCompat> {

    /* renamed from: o.setImageTag$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckExtractActivity_MembersInjector.MediaDescriptionCompat> {
        private /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
        final /* synthetic */ setImageTag read;

        read(setImageTag setimagetag, List list) {
            this.read = setimagetag;
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((CheckExtractActivity_MembersInjector.MediaDescriptionCompat) obj).IconCompatParcelizer(isStrictlyOrdered.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, new findFragmentByWho<QuickAccountSelectAdapter$FooterHolder, CrashlyticsReport.FilesPayload.File.Builder>(this) {
                private /* synthetic */ read write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ Object IconCompatParcelizer(Object obj) {
                    return isStrictlyOrdered.IconCompatParcelizer((QuickAccountSelectAdapter$FooterHolder) obj, this.write.read.write.MediaBrowserCompat$CustomActionResultReceiver.setItemInvoker());
                }
            }));
        }
    }

    /* renamed from: o.setImageTag$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckExtractActivity_MembersInjector.MediaDescriptionCompat> {
        private /* synthetic */ GiftingBaseListAdapter$GiftViewHolder.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

        write(GiftingBaseListAdapter$GiftViewHolder.IconCompatParcelizer iconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            CheckExtractActivity_MembersInjector.MediaDescriptionCompat mediaDescriptionCompat = (CheckExtractActivity_MembersInjector.MediaDescriptionCompat) obj;
            mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(true);
            mediaDescriptionCompat.write(this.MediaBrowserCompat$CustomActionResultReceiver.write);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setImageTag(RegularImmutableBiMap regularImmutableBiMap, isStrictlyOrdered isstrictlyordered, detectorIsOperational detectorisoperational, Iterables.ConsumingQueueIterator consumingQueueIterator) {
        super(regularImmutableBiMap, isstrictlyordered, detectorisoperational, consumingQueueIterator);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) isstrictlyordered, "receivingAccountSourceMapper");
        onGetStartedClick.write((Object) detectorisoperational, "easycashLoanOffersCase");
        onGetStartedClick.write((Object) consumingQueueIterator, "operativeAccountController");
    }

    public final void read(GiftingBaseListAdapter$GiftViewHolder.IconCompatParcelizer iconCompatParcelizer) {
        onGetStartedClick.write((Object) iconCompatParcelizer, "easycashOperativeAccount");
        super.read(iconCompatParcelizer);
        List<QuickAccountSelectAdapter$FooterHolder> MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer.read, "LENDING_TARGET");
        boolean z = true;
        if (!MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            writeUInt64NoTag.IconCompatParcelizer read2 = new read(this, MediaBrowserCompat$CustomActionResultReceiver);
            if (this.RatingCompat != null) {
                read2.IconCompatParcelizer(this.RatingCompat);
            }
        }
        writeUInt64NoTag.IconCompatParcelizer write2 = new write(iconCompatParcelizer);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            write2.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final clearValue write(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        onGetStartedClick.write((Object) str, "appId");
        String str8 = this.read;
        if (str8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productType");
        }
        CrashlyticsReport.FilesPayload.File.Builder builder = this.MediaDescriptionCompat;
        if (builder != null) {
            str2 = builder.f2695x50fd9e4a;
        } else {
            str2 = null;
        }
        CrashlyticsReport.FilesPayload.File.Builder builder2 = this.MediaDescriptionCompat;
        if (builder2 != null) {
            str3 = builder2.IconCompatParcelizer;
        } else {
            str3 = null;
        }
        CrashlyticsReport.FilesPayload.File.Builder builder3 = this.MediaDescriptionCompat;
        if (builder3 != null) {
            str4 = builder3.MediaMetadataCompat;
        } else {
            str4 = null;
        }
        CrashlyticsReport.FilesPayload.File.Builder builder4 = this.MediaDescriptionCompat;
        if (builder4 != null) {
            str5 = builder4.f2695x50fd9e4a;
        } else {
            str5 = null;
        }
        CrashlyticsReport.FilesPayload.File.Builder builder5 = this.MediaDescriptionCompat;
        if (builder5 != null) {
            str6 = builder5.IconCompatParcelizer;
        } else {
            str6 = null;
        }
        CrashlyticsReport.FilesPayload.File.Builder builder6 = this.MediaDescriptionCompat;
        if (builder6 != null) {
            str7 = builder6.MediaMetadataCompat;
        } else {
            str7 = null;
        }
        return new clearValue(str8, str, str2, str4, str3, str5, str7, str6, (String) null, (String) null, "DIRECT_DEBIT", (String) null, (String) null, (String) null, 15104);
    }
}
