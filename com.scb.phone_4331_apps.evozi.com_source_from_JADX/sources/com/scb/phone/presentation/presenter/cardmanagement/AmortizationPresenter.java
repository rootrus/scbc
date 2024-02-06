package com.scb.phone.presentation.presenter.cardmanagement;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.C10827Iterators;
import p040o.Constraints;
import p040o.CrashlyticsReport;
import p040o.CreditCardCaptureModule_GetProcessingParametersFactory;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.ILocationSourceDelegate;
import p040o.Maps;
import p040o.RegularImmutableBiMap;
import p040o.access$2200;
import p040o.access$2300;
import p040o.chain;
import p040o.constrainedList;
import p040o.constrainedMultiset;
import p040o.constrainedSet;
import p040o.constrainedTypePreservingCollection;
import p040o.ensureReceiverRegistered;
import p040o.entryRemoved;
import p040o.evictAll;
import p040o.getICheckDeserializerRtti;
import p040o.normalize;
import p040o.onGetStartedClick;
import p040o.put;
import p040o.registerAnalyticsConnectorListener;
import p040o.writeUInt64NoTag;

public final class AmortizationPresenter extends writeUInt64NoTag<CreditCardCaptureModule_GetProcessingParametersFactory> implements evictAll {
    private final C10827Iterators.C353914 MediaBrowserCompat$ItemReceiver;
    private final Maps.EntrySetImpl read;
    /* access modifiers changed from: private */
    public final Maps.AbstractFilteredMap.Values.C36441 write;

    static final class IconCompatParcelizer<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        final /* synthetic */ AmortizationPresenter write;

        IconCompatParcelizer(AmortizationPresenter amortizationPresenter) {
            this.write = amortizationPresenter;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            final Throwable th = (Throwable) obj;
            AmortizationPresenter amortizationPresenter = this.write;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<CreditCardCaptureModule_GetProcessingParametersFactory>(this) {
                private /* synthetic */ IconCompatParcelizer read;

                {
                    this.read = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((CreditCardCaptureModule_GetProcessingParametersFactory) obj).aj_();
                    AmortizationPresenter amortizationPresenter = this.read.write;
                    Throwable th = th;
                    onGetStartedClick.IconCompatParcelizer((Object) th, "throwable");
                    onGetStartedClick.write((Object) th, "throwable");
                    writeUInt64NoTag.IconCompatParcelizer read2 = new read(amortizationPresenter, th);
                    if (amortizationPresenter.RatingCompat != null) {
                        read2.IconCompatParcelizer(amortizationPresenter.RatingCompat);
                    }
                }
            };
            if (amortizationPresenter.RatingCompat != null) {
                r1.IconCompatParcelizer(amortizationPresenter.RatingCompat);
            }
        }
    }

    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<CreditCardCaptureModule_GetProcessingParametersFactory> {
        private /* synthetic */ Throwable IconCompatParcelizer;
        private /* synthetic */ AmortizationPresenter MediaBrowserCompat$CustomActionResultReceiver;

        read(AmortizationPresenter amortizationPresenter, Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver = amortizationPresenter;
            this.IconCompatParcelizer = th;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ILocationSourceDelegate iLocationSourceDelegate;
            ILocationSourceDelegate.zza zza;
            CreditCardCaptureModule_GetProcessingParametersFactory creditCardCaptureModule_GetProcessingParametersFactory = (CreditCardCaptureModule_GetProcessingParametersFactory) obj;
            Throwable th = this.IconCompatParcelizer;
            String str = null;
            if (!(th instanceof RetrofitException)) {
                th = null;
            }
            RetrofitException retrofitException = (RetrofitException) th;
            if (!(retrofitException == null || (iLocationSourceDelegate = retrofitException.IconCompatParcelizer) == null || (zza = iLocationSourceDelegate.write) == null)) {
                str = zza.IconCompatParcelizer;
            }
            if (str == null) {
                str = "";
            }
            boolean MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "9003");
            access$2200 MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, access$2300.write.JUST_DISMISS);
            if (MediaBrowserCompat$ItemReceiver) {
                creditCardCaptureModule_GetProcessingParametersFactory.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
            }
            if (!MediaBrowserCompat$ItemReceiver && !this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver(this.IconCompatParcelizer)) {
                creditCardCaptureModule_GetProcessingParametersFactory.write(MediaBrowserCompat$ItemReceiver2);
            }
        }
    }

    static final class write<T> implements DebitCardMarketConductDeepLinkActivity<constrainedSet> {
        final /* synthetic */ CrashlyticsReport.FilesPayload.File.Builder IconCompatParcelizer;
        final /* synthetic */ ensureReceiverRegistered MediaBrowserCompat$CustomActionResultReceiver;
        final /* synthetic */ normalize MediaBrowserCompat$ItemReceiver;
        final /* synthetic */ chain read;
        final /* synthetic */ AmortizationPresenter write;

        write(AmortizationPresenter amortizationPresenter, normalize normalize, ensureReceiverRegistered ensurereceiverregistered, CrashlyticsReport.FilesPayload.File.Builder builder, chain chain) {
            this.write = amortizationPresenter;
            this.MediaBrowserCompat$ItemReceiver = normalize;
            this.MediaBrowserCompat$CustomActionResultReceiver = ensurereceiverregistered;
            this.IconCompatParcelizer = builder;
            this.read = chain;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            final constrainedSet constrainedset = (constrainedSet) obj;
            AmortizationPresenter amortizationPresenter = this.write;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<CreditCardCaptureModule_GetProcessingParametersFactory>(this) {
                private /* synthetic */ write MediaBrowserCompat$ItemReceiver;

                {
                    this.MediaBrowserCompat$ItemReceiver = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    CreditCardCaptureModule_GetProcessingParametersFactory creditCardCaptureModule_GetProcessingParametersFactory = (CreditCardCaptureModule_GetProcessingParametersFactory) obj;
                    Maps.AbstractFilteredMap.Values.C36441 MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.write.write;
                    String str = constrainedset.MediaBrowserCompat$ItemReceiver;
                    String str2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.write;
                    String str3 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
                    normalize normalize = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                    String str4 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
                    String str5 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.read;
                    constrainedSet constrainedset = constrainedset;
                    onGetStartedClick.IconCompatParcelizer((Object) constrainedset, "result");
                    String IconCompatParcelizer = AmortizationPresenter.IconCompatParcelizer(constrainedset, this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
                    if (IconCompatParcelizer == null) {
                        IconCompatParcelizer = "";
                    }
                    registerAnalyticsConnectorListener MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver(str, str2, str3, normalize, str4, str5, IconCompatParcelizer, constrainedset.IconCompatParcelizer, false, this.MediaBrowserCompat$ItemReceiver.read.setShortcut);
                    creditCardCaptureModule_GetProcessingParametersFactory.aj_();
                    onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver3, "displayModel");
                    creditCardCaptureModule_GetProcessingParametersFactory.read(MediaBrowserCompat$ItemReceiver3);
                }
            };
            if (amortizationPresenter.RatingCompat != null) {
                r1.IconCompatParcelizer(amortizationPresenter.RatingCompat);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public AmortizationPresenter(RegularImmutableBiMap regularImmutableBiMap, C10827Iterators.C353914 r3, Maps.EntrySetImpl entrySetImpl, Maps.AbstractFilteredMap.Values.C36441 r5) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) r3, "controller");
        onGetStartedClick.write((Object) entrySetImpl, "deejungTransferTokenRequestMapper");
        onGetStartedClick.write((Object) r5, "deejungTransferInstallmentsReviewDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = r3;
        this.read = entrySetImpl;
        this.write = r5;
    }

    @put(read = entryRemoved.write.ON_DESTROY)
    public final void onDestroy() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        super.onDestroy();
    }

    public static String IconCompatParcelizer(constrainedSet constrainedset, CrashlyticsReport.FilesPayload.File.Builder builder) {
        onGetStartedClick.write((Object) constrainedset, "response");
        if (builder == null) {
            return constrainedset.read;
        }
        CharSequence charSequence = builder.RatingCompat;
        boolean z = false;
        if (!(charSequence == null || charSequence.length() == 0)) {
            return builder.RatingCompat;
        }
        CharSequence charSequence2 = constrainedset.read;
        if (charSequence2 == null || charSequence2.length() == 0) {
            z = true;
        }
        if (!z) {
            return constrainedset.read;
        }
        return builder.ParcelableVolumeInfo;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(ensureReceiverRegistered ensurereceiverregistered, normalize normalize, CrashlyticsReport.FilesPayload.File.Builder builder, chain chain, boolean z) {
        onGetStartedClick.write((Object) chain, "creditCardDisplay");
        if (ensurereceiverregistered != null && normalize != null) {
            ensurereceiverregistered.IconCompatParcelizer = z;
            String str = ensurereceiverregistered.MediaBrowserCompat$CustomActionResultReceiver;
            if (str != null) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C8686xcc4a1096.MediaBrowserCompat$CustomActionResultReceiver;
                if (this.RatingCompat != null) {
                    iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
                }
                C10827Iterators.C353914 r0 = this.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.write((Object) normalize, "display");
                onGetStartedClick.write((Object) ensurereceiverregistered, "summaryDisplay");
                onGetStartedClick.write((Object) str, "cardRefNo");
                String str2 = normalize.setContentView;
                constrainedMultiset constrainedmultiset = constrainedMultiset.DEEJUNG_NEWTENOR;
                String str3 = ensurereceiverregistered.read;
                String str4 = ensurereceiverregistered.RatingCompat;
                if (str4 == null) {
                    str4 = "";
                }
                Double MediaBrowserCompat$ItemReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str4, ",", "", false));
                onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "Utilities.amountStringTo…rAmount.replace(\",\", \"\"))");
                constrainedList constrainedlist = new constrainedList(new constrainedTypePreservingCollection(constrainedmultiset, str3, MediaBrowserCompat$ItemReceiver2.doubleValue(), normalize.MediaMetadataCompat, new Constraints.ConstrainedMultiset(normalize.MediaSessionCompat$ResultReceiverWrapper, str2)), ensurereceiverregistered.IconCompatParcelizer, str);
                DebitCardMarketConductDeepLinkActivity write2 = new write(this, normalize, ensurereceiverregistered, builder, chain);
                DebitCardMarketConductDeepLinkActivity iconCompatParcelizer2 = new IconCompatParcelizer(this);
                onGetStartedClick.write((Object) constrainedlist, "tokenRequest");
                onGetStartedClick.write((Object) write2, "onSuccess");
                onGetStartedClick.write((Object) iconCompatParcelizer2, "onError");
                r0.read.read(r0.read.write(constrainedlist), write2, iconCompatParcelizer2);
            }
        }
    }
}
