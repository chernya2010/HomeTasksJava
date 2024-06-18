package class_lesson.lesson9.Exception;

public class Dog {
    private String name;
    private boolean isCollarPutOn;
    private boolean isLeashPutOn;
    private boolean isMuzzlePutOn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCollarPutOn() {
        return isCollarPutOn;
    }

    public void setCollarPutOn(boolean collarPutOn) {
        isCollarPutOn = collarPutOn;
    }

    public boolean isLeashPutOn() {
        return isLeashPutOn;
    }

    public void setLeashPutOn(boolean leashPutOn) {
        isLeashPutOn = leashPutOn;
    }

    public boolean isMuzzlePutOn() {
        return isMuzzlePutOn;
    }

    public void setMuzzlePutOn(boolean muzzlePutOn) {
        isMuzzlePutOn = muzzlePutOn;
    }

    Dog(String name){
        this.name = name;
    }

    public void putCollar(){
        System.out.println("Ошейник надет");
        this.isCollarPutOn = true;
    }

    public void putLeash(){
        System.out.println("Поводок надет");
        this.isLeashPutOn = true;
    }

    public void putMuzzle(){
        System.out.println("Намордник надет");
        this.isMuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyException{
        if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn){
            System.out.println("Идём гулять! " + name + " доволен");
        } else {
            throw new DogIsNotReadyException("Собака " + name + " не готова к прогулке");
        }
    }
}
