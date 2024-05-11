package Lesson13;

public interface D {
    int getUserId();
    default int getAdminId(){
        return 1;
    }
}
