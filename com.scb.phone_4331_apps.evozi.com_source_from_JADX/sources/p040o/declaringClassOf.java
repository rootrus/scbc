package p040o;

import java.text.NumberFormat;
import java.util.Locale;
import p040o.Maps;

/* renamed from: o.declaringClassOf */
public abstract class declaringClassOf extends writeUInt64NoTag<IdCaptureActivity_MembersInjector> {
    private int IconCompatParcelizer;
    int MediaBrowserCompat$ItemReceiver = 1;
    private final Maps.TransformedEntriesMap.EntrySet.C36501 read;

    /* access modifiers changed from: protected */
    public abstract Long MediaBrowserCompat$ItemReceiver();

    public declaringClassOf(RegularImmutableBiMap regularImmutableBiMap, Maps.TransformedEntriesMap.EntrySet.C36501 r2) {
        super(regularImmutableBiMap);
        this.read = r2;
    }

    /* access modifiers changed from: package-private */
    public final String read() {
        return NumberFormat.getInstance(Locale.getDefault()).format(Long.valueOf(MediaBrowserCompat$ItemReceiver().longValue() * ((long) this.MediaBrowserCompat$ItemReceiver)));
    }

    public final void MediaMetadataCompat() {
        boolean z = true;
        this.MediaBrowserCompat$ItemReceiver++;
        addProperty addproperty = new addProperty(this, NumberFormat.getInstance(Locale.getDefault()).format(MediaBrowserCompat$ItemReceiver()));
        if (this.RatingCompat != null) {
            addproperty.IconCompatParcelizer(this.RatingCompat);
        }
        isPrimitiveOrString isprimitiveorstring = isPrimitiveOrString.write;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            isprimitiveorstring.IconCompatParcelizer(this.RatingCompat);
        }
        MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
    }

    private void MediaBrowserCompat$ItemReceiver(int i) {
        Long valueOf = Long.valueOf(MediaBrowserCompat$ItemReceiver().longValue() * ((long) i));
        JsonPrimitive jsonPrimitive = JsonPrimitive.MediaBrowserCompat$ItemReceiver;
        boolean z = false;
        if (this.RatingCompat != null) {
            jsonPrimitive.IconCompatParcelizer(this.RatingCompat);
        }
        createJsonElement createjsonelement = createJsonElement.IconCompatParcelizer;
        if (this.RatingCompat != null) {
            createjsonelement.IconCompatParcelizer(this.RatingCompat);
        }
        TypeAdapterFactory typeAdapterFactory = TypeAdapterFactory.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.RatingCompat != null) {
            typeAdapterFactory.IconCompatParcelizer(this.RatingCompat);
        }
        JsonSerializationContext jsonSerializationContext = JsonSerializationContext.read;
        if (this.RatingCompat != null) {
            jsonSerializationContext.IconCompatParcelizer(this.RatingCompat);
        }
        if (((long) this.IconCompatParcelizer) >= valueOf.longValue() && i <= 9999 && i > 0) {
            JsonParser jsonParser = JsonParser.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat != null) {
                jsonParser.IconCompatParcelizer(this.RatingCompat);
            }
        }
        if (((long) this.IconCompatParcelizer) >= valueOf.longValue()) {
            JsonSerializer jsonSerializer = JsonSerializer.read;
            if (this.RatingCompat != null) {
                jsonSerializer.IconCompatParcelizer(this.RatingCompat);
            }
        }
        if (((long) this.IconCompatParcelizer) >= valueOf.longValue() && i < 9999) {
            isBoolean isboolean = isBoolean.IconCompatParcelizer;
            if (this.RatingCompat != null) {
                isboolean.IconCompatParcelizer(this.RatingCompat);
            }
        }
        if (i > 1) {
            isIntegral isintegral = isIntegral.write;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                isintegral.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public final void MediaDescriptionCompat() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        boolean z = true;
        if (i > 1) {
            this.MediaBrowserCompat$ItemReceiver = i - 1;
            addProperty addproperty = new addProperty(this, NumberFormat.getInstance(Locale.getDefault()).format(MediaBrowserCompat$ItemReceiver()));
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                addproperty.IconCompatParcelizer(this.RatingCompat);
            }
        }
        MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void IconCompatParcelizer(int i) {
        if (this.MediaBrowserCompat$ItemReceiver != i) {
            this.MediaBrowserCompat$ItemReceiver = i;
            addProperty addproperty = new addProperty(this, NumberFormat.getInstance(Locale.getDefault()).format(MediaBrowserCompat$ItemReceiver()));
            if (this.RatingCompat != null) {
                addproperty.IconCompatParcelizer(this.RatingCompat);
            }
            MediaBrowserCompat$ItemReceiver(i);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z, isEagerInDefaultApp iseagerindefaultapp) {
        serialize serialize = new serialize(this.read.write(this.MediaBrowserCompat$ItemReceiver, z, iseagerindefaultapp));
        if (this.RatingCompat != null) {
            serialize.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        addProperty addproperty = new addProperty(this, NumberFormat.getInstance(Locale.getDefault()).format(MediaBrowserCompat$ItemReceiver()));
        if (this.RatingCompat != null) {
            addproperty.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(isEagerInDefaultApp iseagerindefaultapp) {
        this.IconCompatParcelizer = Integer.parseInt(iseagerindefaultapp.MediaSessionCompat$Token.replaceAll(",", ""));
        MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}
