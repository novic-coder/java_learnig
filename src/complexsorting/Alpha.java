package complexsorting;

import java.util.Comparator;

public class Alpha  implements Comparator {
    public int compare(Object X, Object Y){
        if (((Student1 )(X)).age < ((Student1)(Y)).age){
            return 1;
        }
        else {
            return -1;
        }
    }

    // Next class StudentApp1
}
