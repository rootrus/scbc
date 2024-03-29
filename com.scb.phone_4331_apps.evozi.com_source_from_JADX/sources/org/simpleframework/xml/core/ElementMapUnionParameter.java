package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.ElementMapUnion;
import org.simpleframework.xml.stream.Format;

class ElementMapUnionParameter extends TemplateParameter {
    private final Contact contact;
    private final Expression expression;
    private final int index;
    private final Object key = this.label.getKey();
    private final Label label;
    private final String name = this.label.getName();
    private final String path = this.label.getPath();
    private final Class type = this.label.getType();

    public ElementMapUnionParameter(Constructor constructor, ElementMapUnion elementMapUnion, ElementMap elementMap, Format format, int i) throws Exception {
        Contact contact2 = new Contact(elementMap, constructor, i);
        this.contact = contact2;
        ElementMapUnionLabel elementMapUnionLabel = new ElementMapUnionLabel(contact2, elementMapUnion, elementMap, format);
        this.label = elementMapUnionLabel;
        this.expression = elementMapUnionLabel.getExpression();
        this.index = i;
    }

    public Object getKey() {
        return this.key;
    }

    public String getPath() {
        return this.path;
    }

    public String getName() {
        return this.name;
    }

    public Expression getExpression() {
        return this.expression;
    }

    public Class getType() {
        return this.type;
    }

    public Annotation getAnnotation() {
        return this.contact.getAnnotation();
    }

    public int getIndex() {
        return this.index;
    }

    public boolean isRequired() {
        return this.label.isRequired();
    }

    public boolean isPrimitive() {
        return this.type.isPrimitive();
    }

    public String toString() {
        return this.contact.toString();
    }

    static class Contact extends ParameterContact<ElementMap> {
        public Contact(ElementMap elementMap, Constructor constructor, int i) {
            super(elementMap, constructor, i);
        }

        public String getName() {
            return ((ElementMap) this.label).name();
        }
    }
}
