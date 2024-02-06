package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.api.mailingaddress.MailingAddressApi;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.Api;
import p040o.C7506tP;
import p040o.GoogleMap;
import p040o.createElementSet;
import p040o.zzm;

/* renamed from: o.zzkf */
public final class zzkf implements validateIterator {
    private final MailingAddressApi IconCompatParcelizer;
    Api.AnyClient MediaBrowserCompat$ItemReceiver;
    private final createElementSet.IconCompatParcelizer read;
    private final String write;

    /* renamed from: o.zzkf$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* bridge */ /* synthetic */ Object write(Object obj) {
            onGetStartedClick.write((Object) (setCurrentItemInternal) obj, "it");
            return Boolean.TRUE;
        }
    }

    /* renamed from: o.zzkf$MediaDescriptionCompat */
    static final class MediaDescriptionCompat<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final MediaDescriptionCompat MediaBrowserCompat$ItemReceiver = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* bridge */ /* synthetic */ Object write(Object obj) {
            onGetStartedClick.write((Object) (setCurrentItemInternal) obj, "it");
            return Boolean.TRUE;
        }
    }

    /* renamed from: o.zzkf$MediaMetadataCompat */
    static final class MediaMetadataCompat<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final MediaMetadataCompat IconCompatParcelizer = new MediaMetadataCompat();

        MediaMetadataCompat() {
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            Object data = singleDataEntity.getData();
            onGetStartedClick.IconCompatParcelizer(data, "it.data");
            hasNext hasnext = (hasNext) data;
            onGetStartedClick.write((Object) hasnext, "$this$toDomain");
            new Api();
            onGetStartedClick.write((Object) hasnext, "entity");
            OffsetDateTime write = FragmentBuilder_BindSummaryFragment.write(hasnext.MediaBrowserCompat$ItemReceiver, (OffsetDateTime) null);
            if (write != null) {
                String str = hasnext.write;
                if (str != null) {
                    return new setOnPlaceSelectedListener(write, str);
                }
                throw new EntityMappingException("Some mandatory is missing.");
            }
            throw new EntityMappingException("Some mandatory is missing.");
        }
    }

    /* renamed from: o.zzkf$RatingCompat */
    static final class RatingCompat<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final RatingCompat IconCompatParcelizer = new RatingCompat();

        RatingCompat() {
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            String str = ((pushScope) singleDataEntity.getData()).MediaBrowserCompat$ItemReceiver;
            if (str != null) {
                return new PlaceSelectionListener(str);
            }
            throw new EntityMappingException((String) null);
        }
    }

    /* renamed from: o.zzkf$read */
    static final class read<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.util.Collection} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.util.List} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object write(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r23
                com.scb.phone.data.entity.transfer.SingleDataEntity r0 = (com.scb.phone.data.entity.transfer.SingleDataEntity) r0
                java.lang.String r1 = "it"
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.lang.Object r0 = r0.getData()
                java.lang.String r1 = "it.data"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
                o.nextBoolean r0 = (p040o.nextBoolean) r0
                java.lang.String r1 = "$this$toDomain"
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
                java.util.List<o.endObject> r2 = r0.IconCompatParcelizer
                java.lang.String r3 = "$this$collectionSizeOrDefault"
                r4 = 10
                r5 = 0
                if (r2 == 0) goto L_0x0057
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.ArrayList r6 = new java.util.ArrayList
                p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r3)
                boolean r7 = r2 instanceof java.util.Collection
                if (r7 == 0) goto L_0x0035
                r7 = r2
                java.util.Collection r7 = (java.util.Collection) r7
                int r7 = r7.size()
                goto L_0x0036
            L_0x0035:
                r7 = r4
            L_0x0036:
                r6.<init>(r7)
                java.util.Collection r6 = (java.util.Collection) r6
                java.util.Iterator r2 = r2.iterator()
            L_0x003f:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L_0x0053
                java.lang.Object r7 = r2.next()
                o.endObject r7 = (p040o.endObject) r7
                o.setHint r7 = p040o.AlertController$RecycleListView.read.write((p040o.endObject) r7)
                r6.add(r7)
                goto L_0x003f
            L_0x0053:
                java.util.List r6 = (java.util.List) r6
                r8 = r6
                goto L_0x0058
            L_0x0057:
                r8 = r5
            L_0x0058:
                java.util.List<o.nextInt> r2 = r0.MediaBrowserCompat$CustomActionResultReceiver
                if (r2 == 0) goto L_0x0091
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.ArrayList r6 = new java.util.ArrayList
                p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r3)
                boolean r7 = r2 instanceof java.util.Collection
                if (r7 == 0) goto L_0x006f
                r7 = r2
                java.util.Collection r7 = (java.util.Collection) r7
                int r7 = r7.size()
                goto L_0x0070
            L_0x006f:
                r7 = r4
            L_0x0070:
                r6.<init>(r7)
                java.util.Collection r6 = (java.util.Collection) r6
                java.util.Iterator r2 = r2.iterator()
            L_0x0079:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L_0x008d
                java.lang.Object r7 = r2.next()
                o.nextInt r7 = (p040o.nextInt) r7
                o.setHint r7 = p040o.AlertController$RecycleListView.read.MediaBrowserCompat$CustomActionResultReceiver((p040o.nextInt) r7)
                r6.add(r7)
                goto L_0x0079
            L_0x008d:
                java.util.List r6 = (java.util.List) r6
                r9 = r6
                goto L_0x0092
            L_0x0091:
                r9 = r5
            L_0x0092:
                java.util.List<o.endObject> r2 = r0.MediaBrowserCompat$ItemReceiver
                if (r2 == 0) goto L_0x00cb
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.ArrayList r6 = new java.util.ArrayList
                p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r3)
                boolean r7 = r2 instanceof java.util.Collection
                if (r7 == 0) goto L_0x00a9
                r7 = r2
                java.util.Collection r7 = (java.util.Collection) r7
                int r7 = r7.size()
                goto L_0x00aa
            L_0x00a9:
                r7 = r4
            L_0x00aa:
                r6.<init>(r7)
                java.util.Collection r6 = (java.util.Collection) r6
                java.util.Iterator r2 = r2.iterator()
            L_0x00b3:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L_0x00c7
                java.lang.Object r7 = r2.next()
                o.endObject r7 = (p040o.endObject) r7
                o.setHint r7 = p040o.AlertController$RecycleListView.read.write((p040o.endObject) r7)
                r6.add(r7)
                goto L_0x00b3
            L_0x00c7:
                java.util.List r6 = (java.util.List) r6
                r10 = r6
                goto L_0x00cc
            L_0x00cb:
                r10 = r5
            L_0x00cc:
                java.util.List<o.endArray> r2 = r0.write
                if (r2 == 0) goto L_0x0158
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.ArrayList r6 = new java.util.ArrayList
                p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r3)
                boolean r7 = r2 instanceof java.util.Collection
                if (r7 == 0) goto L_0x00e3
                r7 = r2
                java.util.Collection r7 = (java.util.Collection) r7
                int r7 = r7.size()
                goto L_0x00e4
            L_0x00e3:
                r7 = r4
            L_0x00e4:
                r6.<init>(r7)
                java.util.Collection r6 = (java.util.Collection) r6
                java.util.Iterator r2 = r2.iterator()
            L_0x00ed:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L_0x0154
                java.lang.Object r7 = r2.next()
                o.endArray r7 = (p040o.endArray) r7
                p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r1)
                java.lang.Integer r11 = r7.read
                java.lang.String r12 = "Some mandatory is missing."
                if (r11 == 0) goto L_0x014c
                int r14 = r11.intValue()
                java.lang.String r15 = r7.MediaBrowserCompat$CustomActionResultReceiver
                if (r15 == 0) goto L_0x0144
                java.lang.String r11 = r7.MediaBrowserCompat$ItemReceiver
                if (r11 == 0) goto L_0x013c
                java.lang.String r13 = r7.IconCompatParcelizer
                if (r13 == 0) goto L_0x0134
                java.lang.String r7 = r7.write
                if (r7 == 0) goto L_0x012c
                o.setHint r12 = new o.setHint
                r16 = 0
                r20 = 0
                r21 = 68
                r18 = r13
                r13 = r12
                r17 = r11
                r19 = r7
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
                r6.add(r12)
                goto L_0x00ed
            L_0x012c:
                com.scb.phone.domain.entity.mwpartner.EntityMappingException r0 = new com.scb.phone.domain.entity.mwpartner.EntityMappingException
                r0.<init>(r12)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            L_0x0134:
                com.scb.phone.domain.entity.mwpartner.EntityMappingException r0 = new com.scb.phone.domain.entity.mwpartner.EntityMappingException
                r0.<init>(r12)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            L_0x013c:
                com.scb.phone.domain.entity.mwpartner.EntityMappingException r0 = new com.scb.phone.domain.entity.mwpartner.EntityMappingException
                r0.<init>(r12)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            L_0x0144:
                com.scb.phone.domain.entity.mwpartner.EntityMappingException r0 = new com.scb.phone.domain.entity.mwpartner.EntityMappingException
                r0.<init>(r12)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            L_0x014c:
                com.scb.phone.domain.entity.mwpartner.EntityMappingException r0 = new com.scb.phone.domain.entity.mwpartner.EntityMappingException
                r0.<init>(r12)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            L_0x0154:
                java.util.List r6 = (java.util.List) r6
                r11 = r6
                goto L_0x0159
            L_0x0158:
                r11 = r5
            L_0x0159:
                java.util.List<o.nextInt> r0 = r0.read
                if (r0 == 0) goto L_0x018f
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r3)
                boolean r2 = r0 instanceof java.util.Collection
                if (r2 == 0) goto L_0x016f
                r2 = r0
                java.util.Collection r2 = (java.util.Collection) r2
                int r4 = r2.size()
            L_0x016f:
                r1.<init>(r4)
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r0 = r0.iterator()
            L_0x0178:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x018c
                java.lang.Object r2 = r0.next()
                o.nextInt r2 = (p040o.nextInt) r2
                o.setHint r2 = p040o.AlertController$RecycleListView.read.MediaBrowserCompat$CustomActionResultReceiver((p040o.nextInt) r2)
                r1.add(r2)
                goto L_0x0178
            L_0x018c:
                r5 = r1
                java.util.List r5 = (java.util.List) r5
            L_0x018f:
                r12 = r5
                o.onError r0 = new o.onError
                r7 = r0
                r7.<init>(r8, r9, r10, r11, r12)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.zzkf.read.write(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: o.zzkf$write */
    static final class write<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzkf MediaBrowserCompat$CustomActionResultReceiver;

        write(zzkf zzkf) {
            this.MediaBrowserCompat$CustomActionResultReceiver = zzkf;
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            Object data = singleDataEntity.getData();
            onGetStartedClick.IconCompatParcelizer(data, "it.data");
            nextString nextstring = (nextString) data;
            onGetStartedClick.write((Object) nextstring, "entity");
            Collection collection = nextstring.IconCompatParcelizer;
            if (!(collection == null || collection.isEmpty())) {
                Iterable<nextName> iterable = nextstring.IconCompatParcelizer;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (nextName nextname : iterable) {
                    String str = nextname.IconCompatParcelizer;
                    if (str != null) {
                        String str2 = nextname.MediaBrowserCompat$CustomActionResultReceiver;
                        if (str2 != null) {
                            arrayList.add(new setFilter(str, str2));
                        } else {
                            throw new EntityMappingException("Some mandatory is missing.");
                        }
                    } else {
                        throw new EntityMappingException("Some mandatory is missing.");
                    }
                }
                return new getLatLngBounds((List) arrayList);
            }
            throw new EntityMappingException("Some mandatory is missing.");
        }
    }

    @HmlPinActivity
    public zzkf(MailingAddressApi mailingAddressApi, Api.AnyClient anyClient, createElementSet.IconCompatParcelizer iconCompatParcelizer, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        onGetStartedClick.write((Object) mailingAddressApi, "mailingAddressApi");
        onGetStartedClick.write((Object) anyClient, "mailingAddressGoodToKnowResponseEntityMapper");
        onGetStartedClick.write((Object) iconCompatParcelizer, "profileCache");
        onGetStartedClick.write((Object) str, "tileVersion");
        this.IconCompatParcelizer = mailingAddressApi;
        this.MediaBrowserCompat$ItemReceiver = anyClient;
        this.read = iconCompatParcelizer;
        this.write = str;
    }

    /* renamed from: o.zzkf$zza */
    public final class zza {
        public final Boolean MediaBrowserCompat$CustomActionResultReceiver;
        public final Boolean MediaBrowserCompat$ItemReceiver;
        public final Boolean read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zza.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zza.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zza.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            Boolean bool = this.read;
            int i = 0;
            int hashCode = bool != null ? bool.hashCode() : 0;
            Boolean bool2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = bool2 != null ? bool2.hashCode() : 0;
            Boolean bool3 = this.MediaBrowserCompat$ItemReceiver;
            if (bool3 != null) {
                i = bool3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HmlStoreType(brickAndMortar=");
            sb.append(this.read);
            sb.append(", onlineViaWeb=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", onlineViaMarket=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public zza(Boolean bool, Boolean bool2, Boolean bool3) {
            this.read = bool;
            this.MediaBrowserCompat$CustomActionResultReceiver = bool2;
            this.MediaBrowserCompat$ItemReceiver = bool3;
        }
    }

    public final DebitCardResetOtpActivity<getLatLngBounds> IconCompatParcelizer() {
        DebitCardResetOtpActivity<R> map = this.IconCompatParcelizer.postMailingAddressGoodToKnow(new selectName(this.write)).map(new write(this));
        onGetStartedClick.IconCompatParcelizer((Object) map, "mailingAddressApi\n      …pper.transform(it.data) }");
        return map;
    }

    public final BScanCNotificationDeepLinkActivity<onError> read() {
        BScanCNotificationDeepLinkActivity<SingleDataEntity<nextBoolean>> mailingAddressLanding = this.IconCompatParcelizer.mailingAddressLanding(new standardListIterator(this.write));
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = read.MediaBrowserCompat$ItemReceiver;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(mailingAddressLanding, directDebitDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "mailingAddressApi.mailin…ap { it.data.toDomain() }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<zzm.zzd> IconCompatParcelizer(standardKeySet standardkeyset) {
        onGetStartedClick.write((Object) standardkeyset, "request");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<peek>> productAddress = this.IconCompatParcelizer.productAddress(standardkeyset);
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = zzkf$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(productAddress, directDebitDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "mailingAddressApi.produc…ap { it.data.toDomain() }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<PlaceSelectionListener> IconCompatParcelizer(standardPutAll standardputall) {
        onGetStartedClick.write((Object) standardputall, "request");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<pushScope>> postProductList = this.IconCompatParcelizer.postProductList(standardputall);
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = RatingCompat.IconCompatParcelizer;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(postProductList, directDebitDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "mailingAddressApi.postPr…ap { it.data.toDomain() }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<Boolean> read(standardContainsValue standardcontainsvalue) {
        onGetStartedClick.write((Object) standardcontainsvalue, "request");
        BScanCNotificationDeepLinkActivity<setCurrentItemInternal> postMailingAddress = this.IconCompatParcelizer.postMailingAddress(standardcontainsvalue);
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(postMailingAddress, directDebitDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "mailingAddressApi.postMa…            .map { true }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<Boolean> write() {
        GoogleMap.OnMarkerDragListener onMarkerDragListener = this.read.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) onMarkerDragListener, "profileCache.userProfile");
        CharSequence charSequence = onMarkerDragListener.MediaDescriptionCompat;
        BScanCNotificationDeepLinkActivity<Boolean> read2 = BScanCNotificationDeepLinkActivity.read(Boolean.valueOf(!(charSequence == null || charSequence.length() == 0)));
        onGetStartedClick.IconCompatParcelizer((Object) read2, "Single.just(!profileCach…le.email.isNullOrEmpty())");
        return read2;
    }

    public final BScanCNotificationDeepLinkActivity<setOnPlaceSelectedListener> read(String str, String str2, ForwardingMap forwardingMap) {
        onGetStartedClick.write((Object) forwardingMap, "request");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<hasNext>> postMailingAddressConfirmation = this.IconCompatParcelizer.postMailingAddressConfirmation(str, str2, forwardingMap);
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = MediaMetadataCompat.IconCompatParcelizer;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(postMailingAddressConfirmation, directDebitDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "mailingAddressApi\n      …ap { it.data.toDomain() }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<PlacePicker> MediaBrowserCompat$CustomActionResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "tokenId");
        BScanCNotificationDeepLinkActivity<SingleDataEntity<beginArray>> mailingAddressConfirmation = this.IconCompatParcelizer.getMailingAddressConfirmation(str);
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = zzkf$MediaBrowserCompat$CustomActionResultReceiver.write;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(mailingAddressConfirmation, directDebitDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "mailingAddressApi.getMai…ap { it.data.toDomain() }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<C7506tP.read> MediaBrowserCompat$ItemReceiver() {
        BScanCNotificationDeepLinkActivity<SingleDataEntity<nextDouble>> addressDetails = this.IconCompatParcelizer.getAddressDetails();
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = zzkf$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(addressDetails, directDebitDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "mailingAddressApi.getAdd…ap { it.data.toDomain() }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<Boolean> MediaBrowserCompat$ItemReceiver(standardSubList standardsublist) {
        onGetStartedClick.write((Object) standardsublist, "request");
        BScanCNotificationDeepLinkActivity<setCurrentItemInternal> postMailingAddressDetails = this.IconCompatParcelizer.postMailingAddressDetails(standardsublist);
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(postMailingAddressDetails, directDebitDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "mailingAddressApi.postMa…            .map { true }");
        return oncopy;
    }

    public final BScanCNotificationDeepLinkActivity<Boolean> MediaBrowserCompat$CustomActionResultReceiver(standardEntrySet standardentryset) {
        onGetStartedClick.write((Object) standardentryset, "request");
        BScanCNotificationDeepLinkActivity<setCurrentItemInternal> postAddressesValidation = this.IconCompatParcelizer.postAddressesValidation(standardentryset);
        DirectDebitDeepLinkActivity directDebitDeepLinkActivity = zzkf$MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver;
        HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
        onCopy oncopy = new onCopy(postAddressesValidation, directDebitDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "mailingAddressApi.postAd…            .map { true }");
        return oncopy;
    }
}
