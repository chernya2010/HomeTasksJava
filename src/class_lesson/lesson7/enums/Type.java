package class_lesson.lesson7.enums;

import class_lesson.lesson5.Book1;

public enum Type {
    INT(true){
        @Override
        public Object parse(String value) {
            return Integer.valueOf(value);
        }
    },
    INTEGER(false){
        @Override
        public Object parse(String value) {
            return Integer.valueOf(value);
        }
    },
    STRING(false){
        @Override
        public Object parse(String value) {
            return value;
        }
    };

    boolean primitive;

    Type(boolean primitive) {
        this.primitive = primitive;
    }

    public boolean isPrimitive(){
        return primitive;
    }

    public abstract Object parse(String value);
}
