package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.PreJava9ReflectionAccessor$MediaBrowserCompat$ItemReceiver */
final class PreJava9ReflectionAccessor$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<IdCaptureModule_GetIIdDeserializerRttiFactory> {
    private /* synthetic */ EventBus read;

    PreJava9ReflectionAccessor$MediaBrowserCompat$ItemReceiver(EventBus eventBus) {
        this.read = eventBus;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((IdCaptureModule_GetIIdDeserializerRttiFactory) obj).write(this.read.write);
    }
}
