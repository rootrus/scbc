package p040o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.TypeCastException;

/* renamed from: o.NdidIdpShareSuccessActivity */
public class NdidIdpShareSuccessActivity {
    private static final AtomicReferenceFieldUpdater MediaBrowserCompat$CustomActionResultReceiver;
    static final AtomicReferenceFieldUpdater MediaBrowserCompat$ItemReceiver;
    private static AtomicReferenceFieldUpdater read;
    public volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef = null;

    static {
        Class<NdidIdpShareSuccessActivity> cls = NdidIdpShareSuccessActivity.class;
        MediaBrowserCompat$ItemReceiver = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        read = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_prev");
        MediaBrowserCompat$CustomActionResultReceiver = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_removedRef");
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity) {
        onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "node");
        read.lazySet(ndidIdpShareSuccessActivity, this);
        MediaBrowserCompat$ItemReceiver.lazySet(ndidIdpShareSuccessActivity, this);
        while (true) {
            Object obj = this._next;
            if (obj instanceof BaseNtbInstructionActivity) {
                ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
            } else if (obj != this) {
                return false;
            } else {
                if (MediaBrowserCompat$ItemReceiver.compareAndSet(this, this, ndidIdpShareSuccessActivity)) {
                    ndidIdpShareSuccessActivity.MediaBrowserCompat$ItemReceiver(this);
                    return true;
                }
            }
        }
    }

    public final void IconCompatParcelizer(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity) {
        Object MediaMetadataCompat;
        onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "node");
        do {
            MediaMetadataCompat = MediaMetadataCompat();
            if (MediaMetadataCompat == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!((NdidIdpShareSuccessActivity) MediaMetadataCompat).read(ndidIdpShareSuccessActivity, this));
    }

    public final boolean read(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity, NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity2) {
        onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "node");
        onGetStartedClick.write((Object) ndidIdpShareSuccessActivity2, "next");
        read.lazySet(ndidIdpShareSuccessActivity, this);
        MediaBrowserCompat$ItemReceiver.lazySet(ndidIdpShareSuccessActivity, ndidIdpShareSuccessActivity2);
        if (!MediaBrowserCompat$ItemReceiver.compareAndSet(this, ndidIdpShareSuccessActivity2, ndidIdpShareSuccessActivity)) {
            return false;
        }
        ndidIdpShareSuccessActivity.MediaBrowserCompat$ItemReceiver(ndidIdpShareSuccessActivity2);
        return true;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity, NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity2, C6963xa3443844 ndidIdpShareSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver) {
        onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "node");
        onGetStartedClick.write((Object) ndidIdpShareSuccessActivity2, "next");
        onGetStartedClick.write((Object) ndidIdpShareSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver, "condAdd");
        read.lazySet(ndidIdpShareSuccessActivity, this);
        MediaBrowserCompat$ItemReceiver.lazySet(ndidIdpShareSuccessActivity, ndidIdpShareSuccessActivity2);
        ndidIdpShareSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = ndidIdpShareSuccessActivity2;
        if (!MediaBrowserCompat$ItemReceiver.compareAndSet(this, ndidIdpShareSuccessActivity2, ndidIdpShareSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver)) {
            return 0;
        }
        Object obj = ndidIdpShareSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver._consensus;
        if (obj == onButtonStartClick.MediaBrowserCompat$CustomActionResultReceiver) {
            obj = ndidIdpShareSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.write(ndidIdpShareSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this));
        }
        ndidIdpShareSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.read(this, obj);
        return obj == null ? 1 : 2;
    }

    /* renamed from: o.NdidIdpShareSuccessActivity$IconCompatParcelizer */
    public static class IconCompatParcelizer<T> extends read {
        private static final AtomicReferenceFieldUpdater MediaBrowserCompat$ItemReceiver;
        private static final AtomicReferenceFieldUpdater read;
        private NdidIdpShareSuccessActivity IconCompatParcelizer;
        public volatile Object _affectedNode = null;
        private volatile Object _originalNext = null;

        static {
            Class<IconCompatParcelizer> cls = IconCompatParcelizer.class;
            read = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_affectedNode");
            MediaBrowserCompat$ItemReceiver = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_originalNext");
        }

        public IconCompatParcelizer(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity) {
            onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "queue");
            this.IconCompatParcelizer = ndidIdpShareSuccessActivity;
        }

        /* access modifiers changed from: protected */
        public final NdidIdpShareSuccessActivity read(BaseNtbInstructionActivity baseNtbInstructionActivity) {
            onGetStartedClick.write((Object) baseNtbInstructionActivity, "op");
            NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = this.IconCompatParcelizer;
            while (true) {
                Object obj = ndidIdpShareSuccessActivity._next;
                if (obj instanceof BaseNtbInstructionActivity) {
                    BaseNtbInstructionActivity baseNtbInstructionActivity2 = (BaseNtbInstructionActivity) obj;
                    if (baseNtbInstructionActivity.MediaBrowserCompat$CustomActionResultReceiver(baseNtbInstructionActivity2)) {
                        return null;
                    }
                    baseNtbInstructionActivity2.MediaBrowserCompat$CustomActionResultReceiver((Object) this.IconCompatParcelizer);
                } else if (obj != null) {
                    return (NdidIdpShareSuccessActivity) obj;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                }
            }
        }

        /* access modifiers changed from: protected */
        public final NdidIdpShareSuccessActivity MediaBrowserCompat$CustomActionResultReceiver() {
            return (NdidIdpShareSuccessActivity) this._affectedNode;
        }

        /* access modifiers changed from: protected */
        public final NdidIdpShareSuccessActivity write() {
            return (NdidIdpShareSuccessActivity) this._originalNext;
        }

        /* access modifiers changed from: protected */
        public Object IconCompatParcelizer(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity) {
            onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "affected");
            if (ndidIdpShareSuccessActivity == this.IconCompatParcelizer) {
                return NationalIdCameraActivity_ViewBinding.IconCompatParcelizer();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public final boolean IconCompatParcelizer(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity, Object obj) {
            onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "affected");
            onGetStartedClick.write(obj, "next");
            if (!(obj instanceof RpLivenessCheckActivity)) {
                return false;
            }
            ndidIdpShareSuccessActivity.RatingCompat();
            return true;
        }

        public final void read(write write) {
            onGetStartedClick.write((Object) write, "prepareOp");
            read.compareAndSet(this, (Object) null, write.MediaBrowserCompat$ItemReceiver);
            MediaBrowserCompat$ItemReceiver.compareAndSet(this, (Object) null, write.IconCompatParcelizer);
        }

        /* access modifiers changed from: protected */
        public final Object read(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity, NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity2) {
            onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "affected");
            onGetStartedClick.write((Object) ndidIdpShareSuccessActivity2, "next");
            return NdidIdpShareSuccessActivity.read(ndidIdpShareSuccessActivity2);
        }

        /* access modifiers changed from: protected */
        public final void write(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity, NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity2) {
            onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "affected");
            onGetStartedClick.write((Object) ndidIdpShareSuccessActivity2, "next");
            NdidIdpShareSuccessActivity.write(ndidIdpShareSuccessActivity, ndidIdpShareSuccessActivity2);
        }
    }

    /* renamed from: o.NdidIdpShareSuccessActivity$write */
    public static final class write extends BaseNtbInstructionActivity {
        public final NdidIdpShareSuccessActivity IconCompatParcelizer;
        public final read MediaBrowserCompat$CustomActionResultReceiver;
        public final NdidIdpShareSuccessActivity MediaBrowserCompat$ItemReceiver;

        public write(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity, NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity2, read read) {
            onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "affected");
            onGetStartedClick.write((Object) ndidIdpShareSuccessActivity2, "next");
            onGetStartedClick.write((Object) read, "desc");
            this.MediaBrowserCompat$ItemReceiver = ndidIdpShareSuccessActivity;
            this.IconCompatParcelizer = ndidIdpShareSuccessActivity2;
            this.MediaBrowserCompat$CustomActionResultReceiver = read;
        }

        public final IdpShareInformationActivity<?> MediaBrowserCompat$CustomActionResultReceiver() {
            IdpShareInformationActivity<?> idpShareInformationActivity = this.MediaBrowserCompat$CustomActionResultReceiver.write;
            if (idpShareInformationActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("atomicOp");
            }
            return idpShareInformationActivity;
        }

        public final Object MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
            Object obj2;
            boolean z = false;
            boolean z2 = true;
            if (MwChangeCasaSuccessActivity.write()) {
                if (!(obj == this.MediaBrowserCompat$ItemReceiver)) {
                    throw new AssertionError();
                }
            }
            if (obj != null) {
                NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = (NdidIdpShareSuccessActivity) obj;
                Object MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this);
                if (MediaBrowserCompat$CustomActionResultReceiver2 == NdidLandingActivity.write) {
                    if (NdidIdpShareSuccessActivity.MediaBrowserCompat$ItemReceiver.compareAndSet(ndidIdpShareSuccessActivity, this, NdidIdpShareSuccessActivity.read(this.IconCompatParcelizer))) {
                        ndidIdpShareSuccessActivity.RatingCompat();
                    }
                    return NdidLandingActivity.write;
                }
                if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                    IdpShareInformationActivity<?> idpShareInformationActivity = this.MediaBrowserCompat$CustomActionResultReceiver.write;
                    if (idpShareInformationActivity == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("atomicOp");
                    }
                    idpShareInformationActivity.write(MediaBrowserCompat$CustomActionResultReceiver2);
                } else {
                    IdpShareInformationActivity<?> idpShareInformationActivity2 = this.MediaBrowserCompat$CustomActionResultReceiver.write;
                    if (idpShareInformationActivity2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("atomicOp");
                    }
                    if (idpShareInformationActivity2._consensus != onButtonStartClick.MediaBrowserCompat$CustomActionResultReceiver) {
                        z = true;
                    }
                    z2 = z;
                }
                if (z2) {
                    obj2 = this.IconCompatParcelizer;
                } else {
                    obj2 = this.MediaBrowserCompat$CustomActionResultReceiver.write;
                    if (obj2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("atomicOp");
                    }
                }
                NdidIdpShareSuccessActivity.MediaBrowserCompat$ItemReceiver.compareAndSet(ndidIdpShareSuccessActivity, this, obj2);
                return null;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PrepareOp(op=");
            IdpShareInformationActivity<?> idpShareInformationActivity = this.MediaBrowserCompat$CustomActionResultReceiver.write;
            if (idpShareInformationActivity == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("atomicOp");
            }
            sb.append(idpShareInformationActivity);
            sb.append(')');
            return sb.toString();
        }
    }

    /* renamed from: o.NdidIdpShareSuccessActivity$read */
    public static abstract class read extends WalletAdapter$WalletHolder_ViewBinding {
        /* access modifiers changed from: protected */
        public Object IconCompatParcelizer(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity) {
            onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "affected");
            return null;
        }

        /* access modifiers changed from: protected */
        public boolean IconCompatParcelizer(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity, Object obj) {
            onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "affected");
            onGetStartedClick.write(obj, "next");
            return false;
        }

        /* access modifiers changed from: protected */
        public abstract NdidIdpShareSuccessActivity MediaBrowserCompat$CustomActionResultReceiver();

        /* access modifiers changed from: protected */
        public abstract Object read(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity, NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity2);

        public abstract void read(write write);

        /* access modifiers changed from: protected */
        public abstract NdidIdpShareSuccessActivity write();

        /* access modifiers changed from: protected */
        public abstract void write(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity, NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity2);

        /* access modifiers changed from: protected */
        public NdidIdpShareSuccessActivity read(BaseNtbInstructionActivity baseNtbInstructionActivity) {
            onGetStartedClick.write((Object) baseNtbInstructionActivity, "op");
            NdidIdpShareSuccessActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            return MediaBrowserCompat$CustomActionResultReceiver;
        }

        public Object MediaBrowserCompat$CustomActionResultReceiver(write write) {
            onGetStartedClick.write((Object) write, "prepareOp");
            read(write);
            return null;
        }

        public final Object IconCompatParcelizer(IdpShareInformationActivity<?> idpShareInformationActivity) {
            onGetStartedClick.write((Object) idpShareInformationActivity, "op");
            while (true) {
                NdidIdpShareSuccessActivity read = read((BaseNtbInstructionActivity) idpShareInformationActivity);
                if (read == null) {
                    return onButtonStartClick.write;
                }
                Object obj = read._next;
                if (obj == idpShareInformationActivity) {
                    return null;
                }
                boolean z = true;
                if (idpShareInformationActivity._consensus != onButtonStartClick.MediaBrowserCompat$CustomActionResultReceiver) {
                    return null;
                }
                if (obj instanceof BaseNtbInstructionActivity) {
                    BaseNtbInstructionActivity baseNtbInstructionActivity = (BaseNtbInstructionActivity) obj;
                    if (idpShareInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(baseNtbInstructionActivity)) {
                        return onButtonStartClick.write;
                    }
                    baseNtbInstructionActivity.MediaBrowserCompat$CustomActionResultReceiver((Object) read);
                } else {
                    Object IconCompatParcelizer = IconCompatParcelizer(read);
                    if (IconCompatParcelizer != null) {
                        return IconCompatParcelizer;
                    }
                    if (IconCompatParcelizer(read, obj)) {
                        continue;
                    } else if (obj != null) {
                        write write = new write(read, (NdidIdpShareSuccessActivity) obj, this);
                        if (NdidIdpShareSuccessActivity.MediaBrowserCompat$ItemReceiver.compareAndSet(read, obj, write)) {
                            try {
                                Object MediaBrowserCompat$CustomActionResultReceiver = write.MediaBrowserCompat$CustomActionResultReceiver((Object) read);
                                if (MediaBrowserCompat$CustomActionResultReceiver != NdidLandingActivity.write) {
                                    if (MwChangeCasaSuccessActivity.write()) {
                                        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                                            z = false;
                                        }
                                        if (!z) {
                                            throw new AssertionError();
                                        }
                                    }
                                    return null;
                                }
                            } catch (Throwable th) {
                                NdidIdpShareSuccessActivity.MediaBrowserCompat$ItemReceiver.compareAndSet(read, write, obj);
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                    }
                }
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(IdpShareInformationActivity<?> idpShareInformationActivity, Object obj) {
            onGetStartedClick.write((Object) idpShareInformationActivity, "op");
            boolean z = obj == null;
            NdidIdpShareSuccessActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                NdidIdpShareSuccessActivity write = write();
                if (write != null) {
                    if (NdidIdpShareSuccessActivity.MediaBrowserCompat$ItemReceiver.compareAndSet(MediaBrowserCompat$CustomActionResultReceiver, idpShareInformationActivity, z ? read(MediaBrowserCompat$CustomActionResultReceiver, write) : write) && z) {
                        write(MediaBrowserCompat$CustomActionResultReceiver, write);
                    }
                } else if (MwChangeCasaSuccessActivity.write() && !(!z)) {
                    throw new AssertionError();
                }
            } else if (MwChangeCasaSuccessActivity.write() && !(!z)) {
                throw new AssertionError();
            }
        }
    }

    private final NdidIdpShareSuccessActivity write() {
        Object obj;
        NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = this;
        NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity2 = ndidIdpShareSuccessActivity;
        while (!(ndidIdpShareSuccessActivity2 instanceof onReturnHomeButtonClick)) {
            while (true) {
                obj = ndidIdpShareSuccessActivity2._next;
                if (!(obj instanceof BaseNtbInstructionActivity)) {
                    break;
                }
                ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) ndidIdpShareSuccessActivity2);
            }
            ndidIdpShareSuccessActivity2 = NationalIdCameraActivity_ViewBinding.write(obj);
            if (MwChangeCasaSuccessActivity.write()) {
                if (!(ndidIdpShareSuccessActivity2 != ndidIdpShareSuccessActivity)) {
                    throw new AssertionError();
                }
            }
        }
        return ndidIdpShareSuccessActivity2;
    }

    public final void RatingCompat() {
        Object obj;
        NdidIdpShareSuccessActivity MediaSessionCompat$Token = MediaSessionCompat$Token();
        Object obj2 = this._next;
        if (obj2 != null) {
            NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = ((RpLivenessCheckActivity) obj2).MediaBrowserCompat$ItemReceiver;
            while (true) {
                NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity2 = null;
                while (true) {
                    Object obj3 = ndidIdpShareSuccessActivity._next;
                    if (obj3 instanceof BaseNtbInstructionActivity) {
                        ((BaseNtbInstructionActivity) obj3).MediaBrowserCompat$CustomActionResultReceiver((Object) ndidIdpShareSuccessActivity);
                    } else if (obj3 instanceof RpLivenessCheckActivity) {
                        ndidIdpShareSuccessActivity.MediaSessionCompat$Token();
                        ndidIdpShareSuccessActivity = ((RpLivenessCheckActivity) obj3).MediaBrowserCompat$ItemReceiver;
                    } else {
                        while (true) {
                            obj = MediaSessionCompat$Token._next;
                            if (!(obj instanceof BaseNtbInstructionActivity)) {
                                break;
                            }
                            ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) MediaSessionCompat$Token);
                        }
                        if (obj instanceof RpLivenessCheckActivity) {
                            if (ndidIdpShareSuccessActivity2 != null) {
                                break;
                            }
                            MediaSessionCompat$Token = NationalIdCameraActivity_ViewBinding.write(MediaSessionCompat$Token._prev);
                        } else if (obj != this) {
                            if (obj != null) {
                                NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity3 = (NdidIdpShareSuccessActivity) obj;
                                if (ndidIdpShareSuccessActivity3 != ndidIdpShareSuccessActivity) {
                                    NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity4 = ndidIdpShareSuccessActivity3;
                                    ndidIdpShareSuccessActivity2 = MediaSessionCompat$Token;
                                    MediaSessionCompat$Token = ndidIdpShareSuccessActivity4;
                                } else {
                                    return;
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                            }
                        } else if (MediaBrowserCompat$ItemReceiver.compareAndSet(MediaSessionCompat$Token, this, ndidIdpShareSuccessActivity)) {
                            return;
                        }
                    }
                }
                MediaSessionCompat$Token.MediaSessionCompat$Token();
                MediaBrowserCompat$ItemReceiver.compareAndSet(ndidIdpShareSuccessActivity2, MediaSessionCompat$Token, ((RpLivenessCheckActivity) obj).MediaBrowserCompat$ItemReceiver);
                MediaSessionCompat$Token = ndidIdpShareSuccessActivity2;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
        }
    }

    private final NdidIdpShareSuccessActivity write(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity) {
        Object obj;
        while (true) {
            NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity2 = null;
            while (true) {
                obj = ndidIdpShareSuccessActivity._next;
                if (obj == null) {
                    return ndidIdpShareSuccessActivity;
                }
                if (obj instanceof BaseNtbInstructionActivity) {
                    ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) ndidIdpShareSuccessActivity);
                } else if (!(obj instanceof RpLivenessCheckActivity)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof RpLivenessCheckActivity) {
                        return null;
                    }
                    if (obj != this) {
                        if (obj != null) {
                            ndidIdpShareSuccessActivity2 = ndidIdpShareSuccessActivity;
                            ndidIdpShareSuccessActivity = (NdidIdpShareSuccessActivity) obj;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                    } else if (obj2 == ndidIdpShareSuccessActivity) {
                        return null;
                    } else {
                        if (read.compareAndSet(this, obj2, ndidIdpShareSuccessActivity) && !(ndidIdpShareSuccessActivity._prev instanceof RpLivenessCheckActivity)) {
                            return null;
                        }
                    }
                } else if (ndidIdpShareSuccessActivity2 != null) {
                    break;
                } else {
                    ndidIdpShareSuccessActivity = NationalIdCameraActivity_ViewBinding.write(ndidIdpShareSuccessActivity._prev);
                }
            }
            ndidIdpShareSuccessActivity.MediaSessionCompat$Token();
            MediaBrowserCompat$ItemReceiver.compareAndSet(ndidIdpShareSuccessActivity2, ndidIdpShareSuccessActivity, ((RpLivenessCheckActivity) obj).MediaBrowserCompat$ItemReceiver);
            ndidIdpShareSuccessActivity = ndidIdpShareSuccessActivity2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    public final Object MediaBrowserCompat$SearchResultReceiver() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof BaseNtbInstructionActivity)) {
                return obj;
            }
            ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
        }
    }

    public final Object MediaMetadataCompat() {
        Object obj;
        while (true) {
            Object obj2 = this._prev;
            if (obj2 instanceof RpLivenessCheckActivity) {
                return obj2;
            }
            if (obj2 != null) {
                NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = (NdidIdpShareSuccessActivity) obj2;
                while (true) {
                    obj = ndidIdpShareSuccessActivity._next;
                    if (!(obj instanceof BaseNtbInstructionActivity)) {
                        break;
                    }
                    ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) ndidIdpShareSuccessActivity);
                }
                if (obj == this) {
                    return obj2;
                }
                write(ndidIdpShareSuccessActivity);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    /* access modifiers changed from: private */
    public final void MediaBrowserCompat$ItemReceiver(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity) {
        Object obj;
        Object obj2;
        Object obj3;
        do {
            obj = ndidIdpShareSuccessActivity._prev;
            if (!(obj instanceof RpLivenessCheckActivity)) {
                while (true) {
                    obj2 = this._next;
                    if (!(obj2 instanceof BaseNtbInstructionActivity)) {
                        break;
                    }
                    ((BaseNtbInstructionActivity) obj2).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
                }
                if (obj2 != ndidIdpShareSuccessActivity) {
                    return;
                }
            } else {
                return;
            }
        } while (!read.compareAndSet(ndidIdpShareSuccessActivity, obj, this));
        while (true) {
            obj3 = this._next;
            if (!(obj3 instanceof BaseNtbInstructionActivity)) {
                break;
            }
            ((BaseNtbInstructionActivity) obj3).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
        }
        if (!(obj3 instanceof RpLivenessCheckActivity)) {
            return;
        }
        if (obj != null) {
            ndidIdpShareSuccessActivity.write((NdidIdpShareSuccessActivity) obj);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    private final NdidIdpShareSuccessActivity MediaSessionCompat$Token() {
        Object obj;
        NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity;
        RpLivenessCheckActivity rpLivenessCheckActivity;
        do {
            obj = this._prev;
            if (obj instanceof RpLivenessCheckActivity) {
                return ((RpLivenessCheckActivity) obj).MediaBrowserCompat$ItemReceiver;
            }
            if (obj == this) {
                ndidIdpShareSuccessActivity = write();
            } else if (obj != null) {
                ndidIdpShareSuccessActivity = (NdidIdpShareSuccessActivity) obj;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            rpLivenessCheckActivity = (RpLivenessCheckActivity) ndidIdpShareSuccessActivity._removedRef;
            if (rpLivenessCheckActivity == null) {
                rpLivenessCheckActivity = new RpLivenessCheckActivity(ndidIdpShareSuccessActivity);
                MediaBrowserCompat$CustomActionResultReceiver.lazySet(ndidIdpShareSuccessActivity, rpLivenessCheckActivity);
            }
        } while (!read.compareAndSet(this, obj, rpLivenessCheckActivity));
        return (NdidIdpShareSuccessActivity) obj;
    }

    public static final /* synthetic */ void write(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity, NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity2) {
        ndidIdpShareSuccessActivity.RatingCompat();
        ndidIdpShareSuccessActivity2.write(NationalIdCameraActivity_ViewBinding.write(ndidIdpShareSuccessActivity._prev));
    }

    public static final /* synthetic */ RpLivenessCheckActivity read(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity) {
        RpLivenessCheckActivity rpLivenessCheckActivity = (RpLivenessCheckActivity) ndidIdpShareSuccessActivity._removedRef;
        if (rpLivenessCheckActivity != null) {
            return rpLivenessCheckActivity;
        }
        RpLivenessCheckActivity rpLivenessCheckActivity2 = new RpLivenessCheckActivity(ndidIdpShareSuccessActivity);
        MediaBrowserCompat$CustomActionResultReceiver.lazySet(ndidIdpShareSuccessActivity, rpLivenessCheckActivity2);
        return rpLivenessCheckActivity2;
    }

    public final NdidIdpShareSuccessActivity MediaBrowserCompat$MediaItem() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof BaseNtbInstructionActivity)) {
                return NationalIdCameraActivity_ViewBinding.write(obj);
            }
            ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
        }
    }

    public final void MediaDescriptionCompat() {
        Object obj;
        while (true) {
            obj = this._next;
            if (!(obj instanceof BaseNtbInstructionActivity)) {
                break;
            }
            ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
        }
        if (!(obj instanceof RpLivenessCheckActivity)) {
            obj = null;
        }
        RpLivenessCheckActivity rpLivenessCheckActivity = (RpLivenessCheckActivity) obj;
        if (rpLivenessCheckActivity != null) {
            NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = rpLivenessCheckActivity.MediaBrowserCompat$ItemReceiver;
            RatingCompat();
            ndidIdpShareSuccessActivity.write(NationalIdCameraActivity_ViewBinding.write(this._prev));
            return;
        }
        throw new IllegalStateException("Must be invoked on a removed node".toString());
    }

    public boolean aU_() {
        while (true) {
            Object obj = this._next;
            if (obj instanceof BaseNtbInstructionActivity) {
                ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
            } else if ((obj instanceof RpLivenessCheckActivity) || obj == this) {
                return false;
            } else {
                if (obj != null) {
                    NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = (NdidIdpShareSuccessActivity) obj;
                    RpLivenessCheckActivity rpLivenessCheckActivity = (RpLivenessCheckActivity) ndidIdpShareSuccessActivity._removedRef;
                    if (rpLivenessCheckActivity == null) {
                        rpLivenessCheckActivity = new RpLivenessCheckActivity(ndidIdpShareSuccessActivity);
                        MediaBrowserCompat$CustomActionResultReceiver.lazySet(ndidIdpShareSuccessActivity, rpLivenessCheckActivity);
                    }
                    if (MediaBrowserCompat$ItemReceiver.compareAndSet(this, obj, rpLivenessCheckActivity)) {
                        RatingCompat();
                        ndidIdpShareSuccessActivity.write(NationalIdCameraActivity_ViewBinding.write(this._prev));
                        return true;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                }
            }
        }
    }
}
