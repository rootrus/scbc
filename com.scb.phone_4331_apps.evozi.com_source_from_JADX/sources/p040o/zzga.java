package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.BScanCService;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import java.util.Arrays;
import java.util.List;
import p040o.ComputingConcurrentHashMap;

/* renamed from: o.zzga */
public final class zzga implements classification {
    final setVariable MediaBrowserCompat$CustomActionResultReceiver;
    final BScanCService MediaBrowserCompat$ItemReceiver;
    final setLogLevel write;

    /* renamed from: o.zzga$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements DebitCardMarketConductDeepLinkActivity<zzxn> {
        private /* synthetic */ zzga write;

        IconCompatParcelizer(zzga zzga) {
            this.write = zzga;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            zzxn zzxn = (zzxn) obj;
            if (zzxn == null) {
                throw new EntityMappingException("QrBScanC must not be null");
            } else if (zzxn.MediaBrowserCompat$MediaItem == null) {
                throw new EntityMappingException("QrBScanC.minAmount must not be null or empty");
            } else if (zzxn.MediaBrowserCompat$CustomActionResultReceiver == null) {
                throw new EntityMappingException("QrBScanC.maxAmount must not be null or empty");
            } else if (zzxn.read == null) {
                throw new EntityMappingException("QrBScanC.limitStepSize must not be null or empty");
            }
        }
    }

    /* renamed from: o.zzga$read */
    static final class read<T> implements DebitCardMarketConductDeepLinkActivity<zzxh> {
        private /* synthetic */ zzga write;

        read(zzga zzga) {
            this.write = zzga;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            zzxh zzxh = (zzxh) obj;
            onGetStartedClick.IconCompatParcelizer((Object) zzxh, "entity");
            onGetStartedClick.write((Object) zzxh, "bScanCEntryPoint");
            CharSequence charSequence = zzxh.MediaBrowserCompat$CustomActionResultReceiver;
            boolean z = false;
            if (!(charSequence == null || charSequence.length() == 0)) {
                String[] strArr = {"LANDING", "ONBOARDING"};
                onGetStartedClick.write((Object) strArr, "elements");
                onGetStartedClick.write((Object) strArr, "$this$asList");
                List asList = Arrays.asList(strArr);
                onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
                String str = zzxh.MediaBrowserCompat$CustomActionResultReceiver;
                if (str == null) {
                    str = "";
                }
                if (!asList.contains(str)) {
                    throw new EntityMappingException("BScanCEntryPoint.function must not be null or empty");
                } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) zzxh.MediaBrowserCompat$CustomActionResultReceiver, (Object) "LANDING")) {
                    CharSequence charSequence2 = zzxh.read;
                    if (!(charSequence2 == null || charSequence2.length() == 0)) {
                        CharSequence charSequence3 = zzxh.MediaBrowserCompat$ItemReceiver;
                        if (!(charSequence3 == null || charSequence3.length() == 0)) {
                            CharSequence charSequence4 = zzxh.write;
                            if (charSequence4 == null || charSequence4.length() == 0) {
                                z = true;
                            }
                            if (z) {
                                throw new EntityMappingException("BScanCEntryPoint.qrCode must not be null or empty");
                            } else if (zzxh.IconCompatParcelizer == null) {
                                throw new EntityMappingException("BScanCEntryPoint.remainingLimit must not be null");
                            }
                        } else {
                            throw new EntityMappingException("BScanCEntryPoint.validDuration must not be null or empty");
                        }
                    } else {
                        throw new EntityMappingException("BScanCEntryPoint.expiryDateTime must not be null or empty");
                    }
                }
            } else {
                throw new EntityMappingException("BScanCEntryPoint.function must not be null or empty");
            }
        }
    }

    /* renamed from: o.zzga$write */
    static final class write<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzga MediaBrowserCompat$CustomActionResultReceiver;

        write(zzga zzga) {
            this.MediaBrowserCompat$CustomActionResultReceiver = zzga;
        }

        public final /* bridge */ /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "entity");
            return setLogLevel.write(singleDataEntity);
        }
    }

    /* renamed from: o.zzga$MediaMetadataCompat */
    static final class MediaMetadataCompat<T, R> implements DirectDebitDeepLinkActivity<D, DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> {
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ ComputingConcurrentHashMap.ComputationExceptionReference read;
        private /* synthetic */ zzga write;

        MediaMetadataCompat(zzga zzga, String str, String str2, ComputingConcurrentHashMap.ComputationExceptionReference computationExceptionReference) {
            this.write = zzga;
            this.MediaBrowserCompat$ItemReceiver = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.read = computationExceptionReference;
        }

        public final /* synthetic */ Object write(Object obj) {
            onGetStartedClick.write((Object) (HmlVerifyPhoneValidateOtpActivity) obj, "it");
            return this.write.MediaBrowserCompat$ItemReceiver.putQrToPay(this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.read);
        }
    }

    /* renamed from: o.zzga$RatingCompat */
    static final class RatingCompat<T, R> implements DirectDebitDeepLinkActivity<T, R> {
        private /* synthetic */ zzga MediaBrowserCompat$CustomActionResultReceiver;

        RatingCompat(zzga zzga) {
            this.MediaBrowserCompat$CustomActionResultReceiver = zzga;
        }

        public final /* synthetic */ Object write(Object obj) {
            SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
            onGetStartedClick.write((Object) singleDataEntity, "it");
            if (((encodedPath) singleDataEntity.getData()) == null) {
                return new zzxn((String) null, (Double) null, (Double) null, (Double) null, (Double) null);
            }
            return setLogLevel.write(singleDataEntity);
        }
    }

    @HmlPinActivity
    public zzga(setVariable setvariable, BScanCService bScanCService, setLogLevel setloglevel) {
        onGetStartedClick.write((Object) setvariable, "bScanCEntityMapper");
        onGetStartedClick.write((Object) bScanCService, "service");
        onGetStartedClick.write((Object) setloglevel, "qrBScanCMapper");
        this.MediaBrowserCompat$CustomActionResultReceiver = setvariable;
        this.MediaBrowserCompat$ItemReceiver = bScanCService;
        this.write = setloglevel;
    }

    public final DebitCardResetOtpActivity<zzxh> MediaBrowserCompat$CustomActionResultReceiver() {
        DebitCardResetOtpActivity<R> doOnNext = this.MediaBrowserCompat$ItemReceiver.checkEntryPoint().map(new zzga$MediaBrowserCompat$CustomActionResultReceiver(this)).doOnNext(new read(this));
        onGetStartedClick.IconCompatParcelizer((Object) doOnNext, "service.checkEntryPoint(…lidateIntegrity(entity) }");
        return doOnNext;
    }

    public final DebitCardResetOtpActivity<zzxn> IconCompatParcelizer() {
        DebitCardResetOtpActivity<R> doOnNext = this.MediaBrowserCompat$ItemReceiver.getQrToPay().map(new write(this)).doOnNext(new IconCompatParcelizer(this));
        onGetStartedClick.IconCompatParcelizer((Object) doOnNext, "service.getQrToPay()\n   …Mapper.validate(entity) }");
        return doOnNext;
    }

    public final DebitCardResetOtpActivity<zzxn> write(String str, String str2, ComputingConcurrentHashMap.ComputationExceptionReference computationExceptionReference) {
        onGetStartedClick.write((Object) computationExceptionReference, "request");
        DebitCardResetOtpActivity<zzxn> map = DebitCardResetOtpActivity.using(zzga$MediaBrowserCompat$MediaItem.read, new MediaMetadataCompat(this, str, str2, computationExceptionReference), MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver).map(new RatingCompat(this));
        onGetStartedClick.IconCompatParcelizer((Object) map, "Observable.using(\n      …)\n            }\n        }");
        return map;
    }

    /* renamed from: o.zzga$MediaDescriptionCompat */
    static final class MediaDescriptionCompat<T> implements DebitCardMarketConductDeepLinkActivity<D> {
        public static final MediaDescriptionCompat MediaBrowserCompat$ItemReceiver = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            zabr.IconCompatParcelizer();
        }
    }
}
