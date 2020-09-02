package hw3.task2;

public class ClassRoom {
    Pupil pupil1;
    Pupil pupil2;
    Pupil pupil3;
    Pupil pupil4;

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this(pupil1, pupil2);
        this.pupil3 = pupil3;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this(pupil1, pupil2, pupil3);
        this.pupil4 = pupil4;
    }

    void study() {
        pupil1.study();
        pupil2.study();
        pupil3.study();
        pupil4.study();
    }

    void read() {
        pupil1.read();
        pupil2.read();
        pupil3.read();
        pupil4.read();
    }

    void relax() {
        pupil1.relax();
        pupil2.relax();
        pupil3.relax();
        pupil4.relax();
    }
}
