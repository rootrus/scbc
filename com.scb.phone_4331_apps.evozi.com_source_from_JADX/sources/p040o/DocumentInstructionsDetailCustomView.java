package p040o;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.DocumentInstructionsDetailCustomView */
public final class DocumentInstructionsDetailCustomView {
    private static final DocumentInstructionsDetailCustomView MediaBrowserCompat$CustomActionResultReceiver = new DocumentInstructionsDetailCustomView();
    private static ImageAdBannerView_ViewBinding write = new ImageAdBannerView_ViewBinding() {
    };
    private final AtomicReference<ImageAndTextAdBannerView_ViewBinding> IconCompatParcelizer;
    private final AtomicReference<setDetailText> MediaBrowserCompat$ItemReceiver = new AtomicReference<>();
    private final AtomicReference<ImageAdBannerView_ViewBinding> read = new AtomicReference<>();

    public static DocumentInstructionsDetailCustomView MediaBrowserCompat$ItemReceiver() {
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    DocumentInstructionsDetailCustomView() {
        new AtomicReference();
        new AtomicReference();
        this.IconCompatParcelizer = new AtomicReference<>();
    }

    public final ImageAdBannerView_ViewBinding MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.read.get() == null) {
            Object write2 = write(ImageAdBannerView_ViewBinding.class, System.getProperties());
            if (write2 == null) {
                this.read.compareAndSet((Object) null, write);
            } else {
                this.read.compareAndSet((Object) null, (ImageAdBannerView_ViewBinding) write2);
            }
        }
        return this.read.get();
    }

    public final setDetailText IconCompatParcelizer() {
        if (this.MediaBrowserCompat$ItemReceiver.get() == null) {
            Object write2 = write(setDetailText.class, System.getProperties());
            if (write2 == null) {
                this.MediaBrowserCompat$ItemReceiver.compareAndSet((Object) null, setTitleText.write());
            } else {
                this.MediaBrowserCompat$ItemReceiver.compareAndSet((Object) null, (setDetailText) write2);
            }
        }
        return this.MediaBrowserCompat$ItemReceiver.get();
    }

    private static Object write(Class<?> cls, Properties properties) {
        Properties properties2 = (Properties) properties.clone();
        String simpleName = cls.getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append("rxjava.plugin.");
        sb.append(simpleName);
        sb.append(".implementation");
        String property = properties2.getProperty(sb.toString());
        if (property == null) {
            Iterator it = properties2.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String obj = entry.getKey().toString();
                if (obj.startsWith("rxjava.plugin.") && obj.endsWith(".class") && simpleName.equals(entry.getValue().toString())) {
                    String substring = obj.substring(0, obj.length() - 6).substring(14);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("rxjava.plugin.");
                    sb2.append(substring);
                    sb2.append(".impl");
                    String obj2 = sb2.toString();
                    String property2 = properties2.getProperty(obj2);
                    if (property2 != null) {
                        property = property2;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Implementing class declaration for ");
                        sb3.append(simpleName);
                        sb3.append(" missing: ");
                        sb3.append(obj2);
                        throw new RuntimeException(sb3.toString());
                    }
                }
            }
        }
        if (property == null) {
            return null;
        }
        try {
            return Class.forName(property).asSubclass(cls).newInstance();
        } catch (ClassCastException unused) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(simpleName);
            sb4.append(" implementation is not an instance of ");
            sb4.append(simpleName);
            sb4.append(": ");
            sb4.append(property);
            throw new RuntimeException(sb4.toString());
        } catch (ClassNotFoundException e) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(simpleName);
            sb5.append(" implementation class not found: ");
            sb5.append(property);
            throw new RuntimeException(sb5.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(simpleName);
            sb6.append(" implementation not able to be instantiated: ");
            sb6.append(property);
            throw new RuntimeException(sb6.toString(), e2);
        } catch (IllegalAccessException e3) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(simpleName);
            sb7.append(" implementation not able to be accessed: ");
            sb7.append(property);
            throw new RuntimeException(sb7.toString(), e3);
        }
    }

    public final ImageAndTextAdBannerView_ViewBinding write() {
        if (this.IconCompatParcelizer.get() == null) {
            Object write2 = write(ImageAndTextAdBannerView_ViewBinding.class, System.getProperties());
            if (write2 == null) {
                this.IconCompatParcelizer.compareAndSet((Object) null, ImageAndTextAdBannerView_ViewBinding.read());
            } else {
                this.IconCompatParcelizer.compareAndSet((Object) null, (ImageAndTextAdBannerView_ViewBinding) write2);
            }
        }
        return this.IconCompatParcelizer.get();
    }
}
