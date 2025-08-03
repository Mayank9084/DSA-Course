import java.util.ArrayList;

class Floor_ceil {

    // Function to compute and return both floor and ceil of a / b
    public static ArrayList<Integer> divFloorCeil(int a, int b) {

        // Use built-in Math.floor and
        // Math.ceil after casting to double
        int floorVal = (int) Math.floor((double) a / b);
        int ceilVal = (int) Math.ceil((double) a / b);

        // Store results in a list
        ArrayList<Integer> res = new ArrayList<>();
        res.add(floorVal);
        res.add(ceilVal);

        return res;
    }

    public static void main(String[] args) {
        int a = -7, b = 2;

        ArrayList<Integer> res = divFloorCeil(a, b);
        System.out.println(res.get(0) + " " + res.get(1));

    }
}