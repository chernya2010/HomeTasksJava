package class_lesson.lesson8.object;

import java.util.Objects;

public class Man {
    private String eyesColor;
    private int dnaCode;

    public Man(String eyesColor, int dnaCode) {
        this.eyesColor = eyesColor;
        this.dnaCode = dnaCode;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(o == null || getClass()!=o.getClass()){
            return false;
        }
        Man man = (Man) o;

        return dnaCode == man.dnaCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eyesColor, dnaCode);
    }
}
