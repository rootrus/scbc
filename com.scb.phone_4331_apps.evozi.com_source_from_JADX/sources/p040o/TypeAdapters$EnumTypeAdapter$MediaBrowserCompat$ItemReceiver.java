package p040o;

import p040o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.TypeAdapters;
import p040o.writeUInt64NoTag;

/* renamed from: o.TypeAdapters$EnumTypeAdapter$MediaBrowserCompat$ItemReceiver */
final class TypeAdapters$EnumTypeAdapter$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<isGeodesic> {
    private /* synthetic */ TypeAdapters.EnumTypeAdapter IconCompatParcelizer;
    String write;

    public final /* synthetic */ void onNext(Object obj) {
        isGeodesic isgeodesic = (isGeodesic) obj;
        boolean z = true;
        if (this.IconCompatParcelizer.RatingCompat != null) {
            getLeftChildIndex unused = this.IconCompatParcelizer.write;
            isRequired write2 = getLeftChildIndex.write(isgeodesic);
            if (!write(write2.MediaBrowserCompat$ItemReceiver)) {
                TypeAdapters.EnumTypeAdapter enumTypeAdapter = this.IconCompatParcelizer;
                TypeAdapters.C388919 r3 = new writeUInt64NoTag.IconCompatParcelizer() {
                    public final void IconCompatParcelizer(Object obj) {
                        ((CheckCaptureModule_GetIJsonExactionHelperRttiFactory.read) obj).MediaBrowserCompat$ItemReceiver(isRequired.this);
                    }
                };
                if (enumTypeAdapter.RatingCompat != null) {
                    r3.IconCompatParcelizer(enumTypeAdapter.RatingCompat);
                }
            }
            TypeAdapters.EnumTypeAdapter enumTypeAdapter2 = this.IconCompatParcelizer;
            TypeAdapters.C388818 r32 = new writeUInt64NoTag.IconCompatParcelizer() {
                public final void IconCompatParcelizer(Object obj) {
                    ((CheckCaptureModule_GetIJsonExactionHelperRttiFactory.read) obj).MediaBrowserCompat$CustomActionResultReceiver(isRequired.this);
                }
            };
            if (enumTypeAdapter2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r32.IconCompatParcelizer(enumTypeAdapter2.RatingCompat);
            }
        }
    }

    public TypeAdapters$EnumTypeAdapter$MediaBrowserCompat$ItemReceiver(TypeAdapters.EnumTypeAdapter enumTypeAdapter, String str) {
        this.IconCompatParcelizer = enumTypeAdapter;
        this.write = str;
    }

    public final void onComplete() {
        TypeAdapters.EnumTypeAdapter.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
    }

    public final void onError(Throwable th) {
        boolean unused = this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th);
        boolean z = true;
        if (!write(this.write)) {
            TypeAdapters.EnumTypeAdapter enumTypeAdapter = this.IconCompatParcelizer;
            TypeAdapters.C388212 r2 = new writeUInt64NoTag.IconCompatParcelizer() {
                public final void IconCompatParcelizer(Object obj) {
                    ((CheckCaptureModule_GetIJsonExactionHelperRttiFactory.read) obj).read(TypeAdapters$EnumTypeAdapter$MediaBrowserCompat$ItemReceiver.this.write);
                }
            };
            if (enumTypeAdapter.RatingCompat != null) {
                r2.IconCompatParcelizer(enumTypeAdapter.RatingCompat);
            }
        }
        TypeAdapters.EnumTypeAdapter enumTypeAdapter2 = this.IconCompatParcelizer;
        TypeAdapters.C388616 r22 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(Object obj) {
                ((CheckCaptureModule_GetIJsonExactionHelperRttiFactory.read) obj).IconCompatParcelizer(TypeAdapters$EnumTypeAdapter$MediaBrowserCompat$ItemReceiver.this.write);
            }
        };
        if (enumTypeAdapter2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            r22.IconCompatParcelizer(enumTypeAdapter2.RatingCompat);
        }
    }

    private boolean write(String str) {
        for (chain chain : this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver) {
            if (str.equalsIgnoreCase(chain.MediaDescriptionCompat) && TypeAdapters.EnumTypeAdapter.MediaBrowserCompat$ItemReceiver(chain)) {
                return true;
            }
        }
        return false;
    }
}
