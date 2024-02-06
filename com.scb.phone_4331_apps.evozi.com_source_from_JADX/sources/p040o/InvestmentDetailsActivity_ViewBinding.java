package p040o;

import kotlin.TypeCastException;

/* renamed from: o.InvestmentDetailsActivity_ViewBinding */
public final class InvestmentDetailsActivity_ViewBinding {
    public static final HmlNTBDocumentSubmissionTutorialsActivity MediaBrowserCompat$ItemReceiver;

    static {
        HmlNTBDocumentSubmissionTutorialsActivity hmlNTBDocumentSubmissionTutorialsActivity;
        Object newInstance;
        Object newInstance2;
        int write = write();
        if (write >= 65544) {
            try {
                newInstance2 = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                onGetStartedClick.IconCompatParcelizer((Object) newInstance2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if (newInstance2 != null) {
                    hmlNTBDocumentSubmissionTutorialsActivity = (HmlNTBDocumentSubmissionTutorialsActivity) newInstance2;
                    MediaBrowserCompat$ItemReceiver = hmlNTBDocumentSubmissionTutorialsActivity;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = HmlNTBDocumentSubmissionTutorialsActivity.class.getClassLoader();
                StringBuilder sb = new StringBuilder();
                sb.append("Instance classloader: ");
                sb.append(classLoader);
                sb.append(", base type classloader: ");
                sb.append(classLoader2);
                Throwable initCause = new ClassCastException(sb.toString()).initCause(e);
                onGetStartedClick.IconCompatParcelizer((Object) initCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause;
            } catch (ClassNotFoundException unused) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    onGetStartedClick.IconCompatParcelizer((Object) newInstance3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            hmlNTBDocumentSubmissionTutorialsActivity = (HmlNTBDocumentSubmissionTutorialsActivity) newInstance3;
                        } catch (ClassCastException e2) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = HmlNTBDocumentSubmissionTutorialsActivity.class.getClassLoader();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Instance classloader: ");
                            sb2.append(classLoader3);
                            sb2.append(", base type classloader: ");
                            sb2.append(classLoader4);
                            Throwable initCause2 = new ClassCastException(sb2.toString()).initCause(e2);
                            onGetStartedClick.IconCompatParcelizer((Object) initCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                            throw initCause2;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        if (write >= 65543) {
            try {
                newInstance = Class.forName("o.RiskFormSheetActivity").newInstance();
                onGetStartedClick.IconCompatParcelizer(newInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if (newInstance != null) {
                    hmlNTBDocumentSubmissionTutorialsActivity = (HmlNTBDocumentSubmissionTutorialsActivity) newInstance;
                    MediaBrowserCompat$ItemReceiver = hmlNTBDocumentSubmissionTutorialsActivity;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = HmlNTBDocumentSubmissionTutorialsActivity.class.getClassLoader();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Instance classloader: ");
                sb3.append(classLoader5);
                sb3.append(", base type classloader: ");
                sb3.append(classLoader6);
                Throwable initCause3 = new ClassCastException(sb3.toString()).initCause(e3);
                onGetStartedClick.IconCompatParcelizer((Object) initCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause3;
            } catch (ClassNotFoundException unused3) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    onGetStartedClick.IconCompatParcelizer(newInstance4, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if (newInstance4 != null) {
                        try {
                            hmlNTBDocumentSubmissionTutorialsActivity = (HmlNTBDocumentSubmissionTutorialsActivity) newInstance4;
                        } catch (ClassCastException e4) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = HmlNTBDocumentSubmissionTutorialsActivity.class.getClassLoader();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Instance classloader: ");
                            sb4.append(classLoader7);
                            sb4.append(", base type classloader: ");
                            sb4.append(classLoader8);
                            Throwable initCause4 = new ClassCastException(sb4.toString()).initCause(e4);
                            onGetStartedClick.IconCompatParcelizer((Object) initCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                            throw initCause4;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            }
        }
        hmlNTBDocumentSubmissionTutorialsActivity = new HmlNTBDocumentSubmissionTutorialsActivity();
        MediaBrowserCompat$ItemReceiver = hmlNTBDocumentSubmissionTutorialsActivity;
    }

    private static final int write() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        CharSequence charSequence = property;
        int MediaBrowserCompat$CustomActionResultReceiver = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence, '.', 0, false);
        if (MediaBrowserCompat$CustomActionResultReceiver < 0) {
            try {
                return Integer.parseInt(property) << 16;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i = MediaBrowserCompat$CustomActionResultReceiver + 1;
            int MediaBrowserCompat$CustomActionResultReceiver2 = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence, '.', i, false);
            if (MediaBrowserCompat$CustomActionResultReceiver2 < 0) {
                MediaBrowserCompat$CustomActionResultReceiver2 = property.length();
            }
            if (property != null) {
                String substring = property.substring(0, MediaBrowserCompat$CustomActionResultReceiver);
                onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (property != null) {
                    String substring2 = property.substring(i, MediaBrowserCompat$CustomActionResultReceiver2);
                    onGetStartedClick.IconCompatParcelizer((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    try {
                        return (Integer.parseInt(substring) << 16) + Integer.parseInt(substring2);
                    } catch (NumberFormatException unused2) {
                        return 65542;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
    }
}
